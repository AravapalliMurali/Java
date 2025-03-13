// java database connectivity - JDBC
/*
 * 1. import package -> java.sql.*;
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. create connections --> connection 
 * 4. create a statement --> statement 
 * 5. execute the query -> 
 * 6. process the result ->
 * 7. close 
 * 
 */
import java.sql.*;
public class Demo {
    public static void main(String[] args) throws Exception{

        String url = "jdbc:msql://localhost:3306/worker";
        String username = "root";
        String password = "Murali@9088";
        //String quary = "select DepartmentName from Department where DepartmentID = 3";
        //String quary = "select * from Department";
        int userid = 2;
        String name = "krishna";
        String quary = "insert into student values("+ userid + ", '" + username + "')";

        Class.forName("com.msql.jdbc.Driver"); // please watch the class forname
        try (var connect = DriverManager.getConnection(url, username, password); Statement st = connect.createStatement()) {
            //ResultSet rs = st.executeQuery(quary); // 
            int rs = st.executeUpdate(quary);
            
            System.out.println(rs);
        

            
            // rs.next(); // for next row in table
            // String name = rs.getString("DepartmentName");
            // System.out.println(name);

            // String userdata ="";
            // while(rs.next()){
            //     userdata = rs.getInt(1) + ":" + rs.getString(2);
            //     System.out.println(userdata);
            // }

            // here closing the connection

        }catch(Exception e){
            System.out.println("issue with connection----" + e);
        }
    }
    
}
