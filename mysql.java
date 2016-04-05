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
 	        sql = "select *from goods";//SQL语句  
 	        db1 = new sql(sql);//创建DBHelper对象  
 	  
 	        try {  
 	            ret = db1.pst.executeQuery();//执行语句，得到结果集  
 	            while (ret.next()) {  
 	                String uid = ret.getString(1);  
 	                String ufname = ret.getString(2);  
 	                String ulname = ret.getString(3);  
 	                String udate = ret.getString(4);  
 	                System.out.println(uid + "\t" + ufname + "\t" + ulname + "\t" + udate );  
 	            }//显示数据  
 	            ret.close();  
 	            db1.close();//关闭连接  
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
	            Class.forName(name);//指定连接类型  
	            conn = DriverManager.getConnection(url, user, password);//获取连接  
	            pst = conn.prepareStatement(sql);//准备执行语句  
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
