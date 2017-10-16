package lab2_1;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewBook {
	
	private String ISBN;
	private String Title;
	private String Name;
	private String Publisher;
	private String Publisherdate;
	private double Price;
	
	public void setISBN(String ISBN){
		this.ISBN=new String(ISBN);
	}
	public String getISBN(){
		return ISBN;
	}
	
	public void setTitle(String Title){
		this.Title = new String(Title);
	}
	public String getTitle(){
		return Title;
	}
	
	public void setName(String Name){
		this.Name = new String(Name);
	}
	public String getName(){
		return Name;
	}
	
	public void setPublisher(String Publisher){
		this.Publisher=Publisher;
	}
	public String getPublisher(){
		return Publisher;
	}
	public void setPublisherdate(String Publisherdate){
		this.Publisherdate=Publisherdate;
	}
	public String getPublisherdate(){
		return Publisherdate;
	}
	public void setPrice(double Price)
	{
		this.Price=Price;
	}
	public double getPrice()
	{
		return Price;
	}
	public String execute()throws SQLException{
		MySQL mysql =new MySQL();
		String sql0="Select * from Author where Name='"+Name+"';";
		//System.out.println(sql0);
		ResultSet res=mysql.executeQuery(sql0);
		String myAuthorID = null;
		boolean find=false;
		while(res.next())
		{
			if(Name.equals(res.getString("Name")))
			{
				myAuthorID=res.getString("AuthorID");
				find=true;
				break;
			}
		}
		System.out.println("idÎª£º"+myAuthorID);
		String sql = "INSERT INTO Book(ISBN,Title,AuthorID,Publisher,PublishDate,Price)"+"VALUES("
		+"'"+ISBN+"','"+Title+"','"+myAuthorID+"','"+Publisher+"','"+Publisherdate+"','"+Price+"');";
		if(find==true)
		{
			int count = mysql.executeUpdate(sql);
			//System.out.println("count="+count);
			if(count==0)
				return "Success";
			else
				return "Failed";
		}
		else
			return "Failed";
	}

}
