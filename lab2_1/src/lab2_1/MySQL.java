//This is change
package lab2_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQL{
    public Connection con =null;
    Statement stat=null;
    ResultSet rs=null;
    
    public MySQL()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xhzdnpy","z43wwmk52y","izk3341mhhzzyw3hj35554k5k1lmkm4m5j5025ky");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","123456");
            stat=con.createStatement();
        }
        catch(Exception e)
        {
            con=null;
        }
    
    }
    
    public ResultSet executeQuery(String sql)
    {
        try
        {
            
            rs=stat.executeQuery(sql);
        
        }
        
        catch(Exception e)
        {
            rs=null;
        }
        return rs;
    }
    
    public int executeUpdate(String sql)
    {
        try
        {
            stat.executeUpdate(sql);
            return 0;
        }
        catch(Exception e)
        {
           // System.out.println("Connec fIALD"+e.getMessage()); 
        	return -1;
        }
    }
}