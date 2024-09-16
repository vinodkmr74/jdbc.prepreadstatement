package jdbc.prepreadstatement.MainClass;

import java.rmi.AccessException;

import jdbc.prepreadstatement.Entity.Employee;
import jdbc.prepreadstatementDao.EmployeeImpl;

public class JdbcMainClass {
	
	public static void main(String  args[]) throws Exception
	{
	
	
//	Employee e=new Employee(1,"vinod","noida","developer", 25000);
//	Employee e1=new Employee(2,"raj","noida","developer", 25000);
//	Employee e2=new Employee(3,"ram","noida","developer", 25000);
//	Employee e3=new Employee(4,"Avinash","noida","developer", 25000);
//	Employee e4=new Employee(5,"mehta","noida","developer", 25000);
//	Employee e5=new Employee(6,"singh","noida","developer", 25000);
//	Employee e6=new Employee(7,"kishor","noida","developer", 25000);
//	Employee e7=new Employee(8,"manoj","noida","developer", 25000);
//	Employee e8=new Employee(9,"shayam","noida","developer", 25000);
	//Employee e9=new Employee(10,"shayam","noida","developer", 25000);
	//Employee e10=new Employee(11,"navin","noida","developer", 25000);
		
		//update query
//		Employee e11=new Employee();
//		
//		e11.setName("vinod singh");
//		e11.setId(2);
		
		
		//delete
		//Employee e12=new Employee();
		//e12.setId(11);

		Employee e13=new Employee();

	
	EmployeeImpl dao=new EmployeeImpl();
	
//	dao.insertEmp(e);
//	dao.insertEmp(e1);
//	dao.insertEmp(e2);
//	dao.insertEmp(e3);
//	dao.insertEmp(e4);
//	dao.insertEmp(e5);
//	dao.insertEmp(e6);
//	dao.insertEmp(e7);
//	dao.insertEmp(e8);
	//dao.insertEmp(e9);
   //dao.insertEmp(e10);
	//dao.updateEmp(e11);
	
	//dao.deleteEmp(e12);
	
	dao.getAllEmp(e13);
	
	System.out.println("main dane.........");
	
	
	
	}

}
