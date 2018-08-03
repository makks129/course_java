package database;

import java.sql.*;

public class Main {

    public static void main(String[] args) {

        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);  // set timeout to 30 sec.


            // DROP TABLES
            statement.executeUpdate("drop table if exists Course");


            // CREATE NEW TABLES
            statement.executeUpdate("create table Course ( " +
                    "courseId char(5), " +
                    "subjectId char(4) not null, " +
                    "courseNumber integer, " +
                    "title varchar(50) not null, " +
                    "numOfCredits integer, " +
                    "primary key (courseId));");


            // INSERT VALUES
            statement.executeUpdate("insert into Course values ('11113', 'CSCI', '3720', 'Database Systems', 3);");
            DBTablePrinter.printTable(connection, "Course");

            PreparedStatement ps = connection.prepareStatement("insert into Course values (?,?,?,?,?);");
            ps.setString(1, "11114");
            ps.setString(2, "CSCI");
            ps.setInt(3, 3720);
            ps.setString(4, "Database Systems");
            ps.setInt(5, 3);
            ps.execute();
            DBTablePrinter.printTable(connection, "Course");


            // QUERY
            ResultSet rs = statement.executeQuery("select * from Course");
//            database.DBTablePrinter.printResultSet(rs);
            while (rs.next()) {
                System.out.print("courseId = " + rs.getString("courseId"));
                System.out.println(", subjectId = " + rs.getString("subjectId"));
            }


        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed
                System.err.println(e);
            }
        }

    }

}
