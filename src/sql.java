import java.sql.*;
public class sql {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mysql";
        String user = "root";
        String password = "3120545880";
        try(Connection connection = DriverManager.getConnection(url, user, password)){
            Statement statement = connection.createStatement();
            //sql query to execute



            statement.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
