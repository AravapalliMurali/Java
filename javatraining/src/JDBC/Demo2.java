
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

// import java.sql.*;
// DAO -- data access object - we write all the sql quary steps here and database connection steps - please check in git repo 


public class Demo2 {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:msql://localhost:3306/worker";
        String username = "root";
        String password = "Murali@9088";
        int userid = 2;
        String name = "krishna";
        String quary = "insert into student values (?,?)";

        Class.forName("com.msql.jdbc.Driver"); // java.sql.DriverManager.registerDriver(new Driver()); both are same and it calling the Driver static block 
        // this method is used to load the driver or class without creating the obj for that class
        /*
         * whenever we load the class the static block will execute
         * if you you the Class.forName().newInstance(); it will execute the instance block
         * here it will load the static block of the driver class
         * 
         */
        Connection connect = DriverManager.getConnection(url, url, password);
        PreparedStatement st = connect.prepareStatement(quary);
        st.setInt(1, userid);
        st.setString(2, name);
        int count = st.executeUpdate();// ddL- for create , dml- for update, dql
        System.out.println(count);

        st.close();
        connect.close();

    }
}
