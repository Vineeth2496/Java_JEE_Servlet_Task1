import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Dao
{
	
    public static Connection myconn()
    {
    	Connection con=null;	
  	try {
  	
    Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
    con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vine96");
  	}
  	catch(Exception e) {
  		e.printStackTrace();
  	}
  	return con;
    }
  	public int register(Data d)
  	{
  		  int r=0;
  Connection  con=Dao.myconn();
       try {
		PreparedStatement pst=con.prepareStatement("insert into job values(?,?,?)");
		         pst.setString(1,d.getName());
		         pst.setString(2, d.getEmail());
		         pst.setString(3, d.getPass());
		        r= pst.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return r; 
  
  	
	}
}