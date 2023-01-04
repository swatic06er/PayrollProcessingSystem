package PayrollProcessing.PayrollProcessing;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import PayrollProcessing.controller.EmployeeController;
import PayrollProcessing.entity.Employee;
import PayrollProcessing.entity.Events;
import PayrollProcessing.service.EmployeeService;

public class Main 
{
    public static void main( String[] args ) {
    	
    	File inFile = null;
		if(args.length>0) {
			 inFile = new File(args[0]);
			 Employee emp=new Employee();
			 Events ev=new Events();
			 try {
		            BufferedReader br = new BufferedReader(new FileReader(inFile));
		            String read = null;
		            String[] data;
		             EmployeeController empcont=new EmployeeController();

		            while ((read = br.readLine()) != null) {
		                 data = read.split("\\.");
		            
		                 empcont.addEmp(data);
		            
		            } 
		            empcont.totalemployees();
		            empcont.findAllDeatils();
	                empcont.EmployeeWiseFinancialReport();
	               empcont.findAllOnBoarded();

		           
		        } catch (IOException e) {
		            System.out.println("There was a problem: " + e);
			
		}
    }
}
}
