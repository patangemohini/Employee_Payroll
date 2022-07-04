import java.sql.*;

public class DBConnect {
    public static void main(String[] args) {

        try {
            String host = "jdbc:mysql://localhost:3306/emp_payroll";
            String uName = "root";
            String uPass = "MySql@123";
            Connection con = DriverManager.getConnection(host, uName, uPass);

            Statement stat = con.createStatement();
            String sql = "select * from employee_payroll";
            ResultSet rs = stat.executeQuery(sql);

           while(rs.next()){
               String name = rs.getString("name");
               String salary = rs.getString("salary");
               String start = rs.getString("start");

               String p = name + " " + salary + " " + start ;
               System.out.println(p);
           }

        }catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
