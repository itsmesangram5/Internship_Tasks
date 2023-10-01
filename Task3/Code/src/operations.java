import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class operations {
	static int kis=1;
	static int insert(String a1,String a2,String a3, String a4,String a5){
		try
		{
			DAO db=new DAO();
			Connection conn=db.getConnection();
	
			 int id=Integer.parseInt(a1);
			 String name=a2;
			 String price=a3;
			 String quantity=a4;
			 String company=a5;
			 
			 String insertQuery="insert into p_tb values(?,?,?,?,?)";
			 PreparedStatement preparedStatement;
			 
			 preparedStatement=conn.prepareStatement(insertQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,name);
			 preparedStatement.setString(3,price);
			 preparedStatement.setString(4,quantity);
			 preparedStatement.setString(5,company);
			 
			 preparedStatement.executeUpdate();
			 return 1;
			 
			 
			 
		}
		catch(Exception e){
			 System.out.println(e);
			 return 0;
			
		}
		}
	static int update(String a1,String a2,String a3, String a4,String a5){
		try{
			DAO db=new DAO();
			Connection conn=db.getConnection();
			
			 int id=Integer.parseInt(a1);
			 String name=a2;
			 String price=a3;
			 String quantity=a4;
			 String company=a5;
			 
			 
			 String selectQuery="update p_tb set name=?,agg=?,mob=?,branch=? where id=?";
			 PreparedStatement preparedStatement=null;
			 
			 preparedStatement=conn.prepareStatement(selectQuery);
			 preparedStatement.setInt(1, id);
			 preparedStatement.setString(2,name);
			 preparedStatement.setString(3,price);
			 preparedStatement.setString(4,quantity);
			 preparedStatement.setString(5,company);
			 
			 int count=preparedStatement.executeUpdate();
			 if(count==0){
				 //System.out.println("No Record Found ");
				 return 0;
			 }
			 else{
			 //System.out.println("Data Succesfully Updated");
			    return 1;
			 }
		}
		catch(Exception e){
			System.out.println(e);
			return -1;
		}
	}
		static int delete(String p){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
		
				int pid=Integer.parseInt(p);
				
				String deleteQuery="delete from p_tb where id=?";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(deleteQuery);
				preparedStatement.setInt(1, pid);
				
				int count=preparedStatement.executeUpdate();
				if(count==0){
					//System.out.println("No record Found With Name ");
					return 0;
					}
				else
					{
					//System.out.println("Total "+count+"Record Deleted!!");
					return 1;}
				
				
			}
			catch(Exception e){
				System.out.println(e);	
				return -1;
				}
		}
		static String displayall(){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery="select * from p_tb";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				String table_label="      \tStudent ID\tName\tAggregate\tMobile\tBranch\n";
				String string_data="";
				while(result.next()){
					string_data=string_data+"   \t"+result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3)+"\t"+result.getString(4)+"\t"+result.getString(5)+"\n";
				}
				return table_label+string_data;
				}
				catch(Exception e){
					return e+"";
				}
		}
		static String display_one_by_one(int val,int p){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				/*String selectQuery="select * from product_table";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();*/
				
				String selectQuery="select * from p_tb";
				PreparedStatement preparedStatement;
				
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				String string_data="\n\n\n\n\n\n\t\t\tNo More Data Found!!!";
				if(val==1 ){
					/*result.next();
					string_data="\n\tProduct ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tPrice\t"+result.getInt(3)+"\n\tQuantity\t"+result.getInt(4)+"\n\tCompany\t"+result.getString(5)+"\n";
					return string_data;*/
					if(result.isLast()){
						string_data="This is Last Entry!!!";
						return string_data;
					}
					else{
					result.absolute(p);
					string_data="\n\tStudent ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tAggregate\t"+result.getString(3)+"\n\tMobile\t"+result.getString(4)+"\n\tBranch\t"+result.getString(5)+"\n";
					return string_data;}
				}
				if(val==2){
					/*result.previous();
					string_data="   \t"+result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getInt(3)+"\t"+result.getInt(4)+"\t"+result.getString(5)+"\n";
					return string_data;*/
					if(result.isFirst()){
						string_data="This is First Entry!!!";
						return string_data;
					}
					else{result.absolute(p);
					string_data="\n\tStudent ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tAggregate\t"+result.getString(3)+"\n\tMobile\t"+result.getString(4)+"\n\tBranch\t"+result.getString(5)+"\n";
					return string_data;}
				}
				if(val==3){
					result.first();
					string_data="\n\tStudent ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tAggregate\t"+result.getString(3)+"\n\tMobile\t"+result.getString(4)+"\n\tBranch\t"+result.getString(5)+"\n";
					return string_data;
				}
				if(val==4){
					result.last();
					string_data="\n\tStudent ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tAggregate\t"+result.getString(3)+"\n\tMobile\t"+result.getString(4)+"\n\tBranch\t"+result.getString(5)+"\n";
					return string_data;
				}
				else{
					return string_data;
				}
				}
				catch(Exception e){
					return e+"";
				}
		}
		static int search(int b1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery="select * from p_tb";
				PreparedStatement preparedStatement;
				
				int s1=b1;
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				int data=0;
				while(result.next()){
					if(result.getInt(1)==s1){
						data=1;
					}
				}
				return data;
				}
				catch(Exception e){
					return -1;
				}
		}
		
		static String search_by_ID(int b1){
			try{
				DAO db=new DAO();
				Connection conn=db.getConnection();
			
				String selectQuery="select * from p_tb";
				PreparedStatement preparedStatement;
				
				int s1=b1;
				preparedStatement=conn.prepareStatement(selectQuery);
				ResultSet result=preparedStatement.executeQuery();
				
				String data="Data Not Found!!";
				while(result.next()){
					if(result.getInt(1)==s1){
						data="\n\tStudent ID\t"+result.getInt(1)+"\n\tName\t"+result.getString(2)+"\n\tAggregate\t"+result.getString(3)+"\n\tMobile\t"+result.getString(4)+"\n\tBranch\t"+result.getString(5)+"\n";
						return data;
					}
				}
				return data;
				}
				catch(Exception e){
					return e+"";
				}
		}
		
      public static void main(String args[]){
    	  System.out.println(displayall());
      }

}
