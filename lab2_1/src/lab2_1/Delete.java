//This is change
package lab2_1;

import java.sql.*;

public class Delete {
	private String ISBN;
	
	public void setISBN(String ISBN){
		this.ISBN = new String(ISBN);
	}
	public String getISBN(){
		return ISBN;
	}
	public String execute()throws SQLException{
		MySQL mysql = new MySQL();
		String sql = "delete from Book where ISBN="+"'"+ISBN+"'";
		//System.out.println(sql);
		int count = mysql.executeUpdate(sql);
		//System.out.println("Delete Successful.Delete DataNum:"+count);
		return "Success";
	}
}