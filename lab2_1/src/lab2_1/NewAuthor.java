package lab2_1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewAuthor {

	private String AuthorID;
	private String Name;
	private int Age;
	private String Country;
	
	public void setAuthorID(String AuthorID){
		this.AuthorID=new String(AuthorID);
	}
	public String getAuthorID(){
		return AuthorID;
	}
		
	public void setName(String Name){
		this.Name = new String(Name);
	}
	public String getName(){
		return Name;
	}
	
	public void setAge(int Age){
		this.Age=Age;
	}
	public int getAge(){
		return Age;
	}
	public void setCountry(String Country){
		this.Country=Country;
	}
	public String getCountry(){
		return Country;
	}
	
	public String execute()throws Exception{
		MySQL mysql =new MySQL();
		String sql = "INSERT INTO Author(AuthorID,Name,Age,Country)"+"VALUES("+"'"+AuthorID+"','"+Name+"','"+Age+"','"+Country+"')";
		int count = mysql.executeUpdate(sql);
		return "Success";

	}


}
