package jdbc.prepreadstatementDao;

import jdbc.prepreadstatement.Entity.Employee;

public interface EmployeeDao {
	
	
 public void insertEmp(Employee e);
 
 public void updateEmp(Employee e);
 
 public void deleteEmp(Employee e);
 
 public void getAllEmp(Employee e);

	

}
