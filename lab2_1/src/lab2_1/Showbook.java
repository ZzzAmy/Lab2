package lab2_1;

import java.sql.*;

public class Showbook {
	private String id,ISBN,Title,AuthorID,Publisher,PublisherDate;
	private double Price;
	private int Age;
	private String Country,Name;
	
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = new String(id);
	}
	public String getISBN()
	{
		return ISBN;
	}
	public String getTitle()
	{
		return Title;
	}
	public String getAuthorID()
	{
		return AuthorID;
	}
	public String getPublisher()
	{
		return Publisher;
	}
	public String getPublisherDate()
	{
		return PublisherDate;
	}
	public Double getPrice()
	{
		return Price;
	}
	public int getAge()
	{
		return Age;
	}
	public String getCountry()
	{
		return Country;
	}
	public String getName()
	{
		return Name;
	}
	Connection my1;
	Connection my2;
	Statement ym1;
	Statement ym2;
	public static Connection getConnection(){
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://w.rdc.sae.sina.com.cn:3307/app_xhzdnpy","z43wwmk52y","izk3341mhhzzyw3hj35554k5k1lmkm4m5j5025ky");
			//con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb","root","123456");
		}catch(Exception e){
			System.out.println("Connect Fail:"+e.getMessage());
		}
		return con;
	}
	
	public String execute()throws Exception{
		my1=getConnection();
		my2=getConnection();
		try{
			String sql1 = "select * from Book where Title='"+id+"';";
			ym1=(Statement)my1.createStatement();
			ResultSet res = ym1.executeQuery(sql1);
			while(res.next()){
				if(id.equals(res.getString("Title"))){
					ISBN = new String(res.getString("ISBN"));
					Title = new String(res.getString("Title"));
					AuthorID = new String(res.getString("AuthorID"));
					Publisher = new String(res.getString("Publisher"));
					PublisherDate = new String(res.getString("PublishDate"));
					Price = res.getDouble("Price");
				}
			}
			my1.close();
			String sql2 = "select * from Author where AuthorID='"+AuthorID+"';";
			ym2=(Statement)my2.createStatement();
			ResultSet res1 = ym2.executeQuery(sql2);
			while(res1.next()) {
				if(AuthorID.equals(res1.getString("AuthorID"))) {
					Name = new String(res1.getString("Name"));
					Age = res1.getInt("Age");
					Country = new String(res1.getString("Country"));
				}
			}

			my2.close();
			return "Success";
		}catch(SQLException e){
			//System.out.println("Connect Failed."+e.getMessage());
			return "Failed";
		}
	}

}
