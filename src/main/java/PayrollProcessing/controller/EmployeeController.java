package PayrollProcessing.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import PayrollProcessing.entity.Employee;
import PayrollProcessing.entity.Events;
import PayrollProcessing.service.EmployeeService;

public class EmployeeController {

	private EmployeeService employeeService = new EmployeeService();

	public void addEmp(String[] empinfo) {
		Employee emp = new Employee();
		Events ev = new Events();
		for (String part : empinfo) {
			String[] singlerecord = part.split(",");

			if (part.contains("ONBOARD")) {
				
				String date=singlerecord[6];
				
						try {
							Date date1=new SimpleDateFormat("dd-MM-yyyy").parse(date);
							emp.setEventDate(date1);

						System.out.println("Date1:"+date1);
						} catch (ParseException e) {
							e.printStackTrace();
						}
				
				emp.setSequenceNo(Integer.valueOf(singlerecord[0]));
				emp.setEmployeeId((singlerecord[1]));
				emp.setEmpFName(singlerecord[2]);
				emp.setEmpLName(singlerecord[3]);
				emp.setDesignation(singlerecord[4]);
				//emp.setEventDate(date1);
				ev.setEvent(singlerecord[5]);
				ev.setEventValue(singlerecord[6]);
				ev.setNotes((singlerecord[8]));
				ev.setEventEmpId(singlerecord[1]);
				List<Events> eventlist = List.of(ev);
				emp.setEvents(eventlist);
				employeeService.addEmployee(emp.getEmployeeId(), emp);
				//employeeService.findAllOnboarded();
			} 
			else if (part.contains("SALARY")) {
				Employee e = employeeService.findByEmpId(singlerecord[1]);
				e.setSalary(Integer.parseInt(singlerecord[3].trim()));
				employeeService.addEmployee(e.getEmployeeId(), e);
			}

		}

	}

	public void EmployeeWiseFinancialReport() {
		employeeService.printEmployeeFinancialReport();
	}

	public void totalemployees() {
		employeeService.TotalEmployees();

	}

	public List<Employee> findAllDeatils() {
		return employeeService.findAll();
	}
	
	public void findAllOnBoarded(){
		employeeService.findAllOnboarded();
	}
}
