package jdbc.prepreadstatementDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.JdbcPreparedStatement;

import jdbc.prepreadstatement.Entity.Employee;

public class EmployeeImpl implements EmployeeDao {
	
	
	static Connection con=null;
	static {
	 try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prestatement","root","root");
		
		System.out.println("connection done..........");
		//String s="create table preemp(id int primary key,name varchar(50),address varchar(50),saraly int)";
		//PreparedStatement sp=con.prepareStatement(s);
		
		//sp.execute();
		//sp.close();
		
		//System.out.println("table dane......");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	  
	 
	}

	@Override
	public void insertEmp(Employee e) {
//		try {
//			
//			String s="insert into preemp(id,name,address,saraly) values(?,?,?,?)";
//			PreparedStatement ps=con.prepareStatement(s);
//			
//			ps.setInt(1,e.getId());
//			ps.setString(2,e.getName());
//			ps.setString(3,e.getAddress());
//			ps.setInt(4,e.getSaraly());
//			
//			
//			ps.executeUpdate();
//			ps.close();
//			System.out.println("seccefully insert");
//			
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
				
	}

	@Override
	public void updateEmp(Employee e) {
	
//	try {
//		String update="update preemp set name=? where id=?";
//		PreparedStatement ps=con.prepareStatement(update);
//		ps.setString(1,e.getName());
//		ps.setInt(2,e.getId());
//		
//		ps.execute();	
//		ps.close();
//		
//	System.out.println("update seccesfully");
//			
//	} catch (SQLException e1) {
//		// TODO Auto-generated catch block
//		e1.printStackTrace();
//	}
			
	}

	@Override
	public void deleteEmp(Employee e) {
		
//		try {
//			
//			String delete="delete from preemp where id=? ";
//			PreparedStatement ps=con.prepareStatement(delete);
//			
//			ps.setInt(1,e.getId());		
//			ps.execute();
//		
//			System.out.println("delete seccefully");
//		
//		} catch (SQLException e1) {
//			e1.printStackTrace();
//		}
//		
	}

	@Override
	public void getAllEmp(Employee e) {
		
		try {
			 String  s="select * from preemp";
			
			PreparedStatement ps=con.prepareStatement(s);
			
			  ResultSet  rst = ps.executeQuery();
			
			while(rst.next())
			{
				System.out.println("id: "+rst.getInt(1)+"\t name: "+rst.getString(2)+"\t address: "+rst.getString(3)+"\t saraly: "+rst.getInt(4));
				
			}
			
			System.out.println("read all data dana..........");
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	}

	
}
