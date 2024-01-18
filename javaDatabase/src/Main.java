import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Connection connect = null;
        //  employees tablosuna 5 employee kaydediyoruz
        String sql = "SELECT * FROM employees";
        String insert1 = "INSERT INTO employees (name, position, salary) VALUES ('Hakan Akpınar' , 'Front Office Manager', '5000')";
        String insert2 = "INSERT INTO employees (name, position, salary) VALUES ('Songul Cicek' , 'Supervisor', '2599')";
        String insert3 = "INSERT INTO employees (name, position, salary) VALUES ('Gulcin Gultekin' , 'Shift Leader', '2399')";
        String insert4 = "INSERT INTO employees (name, position, salary) VALUES ('Can Egemen Öztürk' , 'Nıght Auditor', '2000')";
        String insert5 = "INSERT INTO employees (name, position, salary) VALUES ('Anıl Kaya' , 'Receptionist', '1599')";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/odev", "root", "mysql");
            System.out.println("Database Connected");
            Statement statement = connect.createStatement();
            statement.executeUpdate(insert1);
            statement.executeUpdate(insert2);
            statement.executeUpdate(insert3);
            statement.executeUpdate(insert4);
            statement.executeUpdate(insert5);


            //statement update kullanımı
            statement.executeUpdate("UPDATE employees SET name = 'Sılanur Kotan' WHERE id = 47");
            statement.executeUpdate("DELETE FROM employees WHERE id = 35");


            ResultSet data = statement.executeQuery(sql);
            while (data.next()) {
                System.out.println(" ID: " + data.getInt("id") + " Name: " + data.getString("name") + " Position: " + data.getString("position") + " Salary: " + data.getInt("salary"));
            }
            statement.close();
            //preparedStatement.close();
            connect.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}