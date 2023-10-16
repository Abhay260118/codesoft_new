package Student_Management;

import java.sql.*;

class dbConnect {
    private static Connection mycon=null;

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String user = "root";
        String pass="12121212";
        String url = "jdbc:mysql://localhost:3306/firstdb";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url,user,pass);
        return conn;
    }
}