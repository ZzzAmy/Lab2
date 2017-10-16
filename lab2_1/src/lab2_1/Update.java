package lab2_1;

import java.util.*;
import java.sql.*;

public class Update {
	private String Name;
	private String Publisher;
	private String PublisherDate;
	private int Price;
	private String Title;
	
	public void setName(String Name){
		this.Name =new String(Name);
	}
	public void setPublisher(String Publisher){
		this.Publisher=new String(Publisher);
	}
	public void setPublisherDate(String PublisherDate){
		this.PublisherDate=new String(PublisherDate);
	}
	public void setPrice(int Price){
		this.Price=Price;
	}
	public void setTitle(String Title){
		this.Title=new String(Title);
	}
	public String execute()throws Exception{
		MySQL mysql = new MySQL();
		try{
			String sql1="update Book set Publisher='"+Publisher+"',PublishDate='"+PublisherDate+"',Price='"+Price+"' where Title='"+Title+"'";
			//System.out.println(sql1);
			int count = mysql.executeUpdate(sql1);
			String IDtemp = null;
			String sql2="select * from Book";
			ResultSet res = mysql.executeQuery(sql2);
			while(res.next()){
				if(Title.equals(res.getString("Title"))){
					IDtemp=new String(res.getString("AuthorID"));
					break;
				}
			}
			String sql3="update Author set Name='"+Name+"' where AuthorID='"+IDtemp+"'";
			int count2 = mysql.executeUpdate(sql3);
			//System.out.println("Update Successful.DataNum is:"+(count+count2));
			return "Success";
		}catch(SQLException e){
			//System.out.println("Update Failed.");
			return "Failed";
		}
	}
}
