import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

 public class mysql {
		static String sql = null;  
 	    static sql db1 = null;  
 	    static ResultSet ret = null;  
 	  
 	    public static void main(String[] args) {  
 	        sql = "select *from goods";//SQL���  
 	        db1 = new sql(sql);//����DBHelper����  
 	  
 	        try {  
 	            ret = db1.pst.executeQuery();//ִ����䣬�õ������  
 	            while (ret.next()) {  
 	                String uid = ret.getString(1);  
 	                String ufname = ret.getString(2);  
 	                String ulname = ret.getString(3);  
 	                String udate = ret.getString(4);  
 	                System.out.println(uid + "\t" + ufname + "\t" + ulname + "\t" + udate );  
 	            }//��ʾ����  
 	            ret.close();  
 	            db1.close();//�ر�����  
 	        } catch (SQLException e) {  
 	            e.printStackTrace();  
 	        }  
 	    }  
 }
 class sql{	 	
	 	public static final String url = "jdbc:mysql://127.0.0.1/manage";  
	    public static final String name = "com.mysql.jdbc.Driver";  
	    public static final String user = "root";  
	    public static final String password = "";  
	  
	    public Connection conn = null;  
	    public PreparedStatement pst = null;  
	  
	    public sql(String sql) {  
	        try {  
	            Class.forName(name);//ָ����������  
	            conn = DriverManager.getConnection(url, user, password);//��ȡ����  
	            pst = conn.prepareStatement(sql);//׼��ִ�����  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  
	  
	    public void close() {  
	        try {  
	            this.conn.close();  
	            this.pst.close();  
	        } catch (SQLException e) {  
	            e.printStackTrace();  
	        }  
	    }  
}
