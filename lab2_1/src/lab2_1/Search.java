package lab2_1;

import java.util.*;
import java.sql.*;

public class Search {

	private String author;
	private ArrayList<String> ABList = new ArrayList<String>();
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public ArrayList<String> getABList(){
		return ABList;
	}
	
	public String execute() throws SQLException {
		MySQL mysql=new MySQL();
		String sql="select * from Author";
		ResultSet res=mysql.executeQuery(sql);
		boolean flag=false;
		String myid = null;
		while(res.next()) {
			if(author.equals(res.getString("Name"))) {
				myid=new String(res.getString("AuthorID"));
				flag=true;
				break;
			}
		}
		if(flag) {
			String sql1="select * from Book";
			res=mysql.executeQuery(sql1);
			while(res.next())
				if(myid.equals(res.getString("AuthorID")))
					ABList.add(new String(res.getString("Title")));
			return "Success";
		}
		else {
			return "Failed";
		}
		
	}

}
