package PayrollProcessing.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeMap;

import PayrollProcessing.entity.Employee;
import PayrollProcessing.entity.Events;

public class EmployeeService {

	
	private TreeMap<String,Employee> hm=new TreeMap<>();
	private TreeMap<Date,Employee> md=new TreeMap<>(new Comparator<Date>() {
	    public int compare(Date date1, Date date2) {
	    	System.out.println("Date1" + date1+" Date2"+ date2);
	    	System.out.println(date1.compareTo(date2));
	        return date1.compareTo(date2);
	        
	    }
	});
	
	//private TreeMap<Date,Employee> md=new TreeMap<>(); 

	
	public void addEmployee(String empId,Employee e) {
		
		hm.put(empId, e);
		Date onBoard=e.getEventDate();
		md.put(onBoard, e);
		
	}
	
	
	
	
	public void TotalEmployees() {
		System.out.println("Total number of employees is:"+hm.size());
	}
	
	public List<Employee> findAll(){
		//List<Employee> listRecords=(List<Employee>) hm.values();
		List<Employee> listRecords = new ArrayList<>(hm.values());
		for(int i=0;i<listRecords.size();i++) {
			System.out.println(listRecords.get(i).getDesignation()+","+listRecords.get(i).getEmpFName());
			

			
		}
		return listRecords;
	}
	
	 public Employee findByEmpId(String id) {
	        return hm.get(id);
	    }


	    public void printEmployeeFinancialReport() {

	        System.out.println("Employee Id, Name, Surname, Total amount paid");
	        for (var entry : hm.entrySet()) {
	            int totalpaid = 0;
	            if(entry.getValue().getSalary() != null) {
	                totalpaid = entry.getValue().getSalary()*12;
	                
	            }

	            System.out.println(entry.getValue().getEmployeeId() + " " +entry.getValue().getEmpFName()
	                    + " " + entry.getValue().getEmpLName() + " " + totalpaid);

	        }
}


public void findAllOnboarded(){
//	HashMap<>
    for (var entry : md.entrySet()) {
    	Events event=entry.getValue().getEvents().get(0);
    	if(event.getEvent().trim().equals("ONBOARD")) {
    		String onBoarddate=event.getEventValue();
    		
//    		try {
//				Date date1=new SimpleDateFormat("dd-mm-yyyy").parse(onBoarddate);
//				System.out.println("Date1:"+date1);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
    		//String eventEmpId=entry.getValue().getEvents().get(2).toString();
    		String empid=entry.getValue().getEmployeeId();
    		String name=entry.getValue().getEmpFName();
    		String surname=entry.getValue().getEmpLName();
    		String designation=entry.getValue().getDesignation();
    		System.out.println("onBoarddate: "+ onBoarddate+ "empid "+empid+" name" +name+ "surname "+ surname+" designation"+designation);
    		
    
    }
}
		


}
}
