package TemaDB;

import java.sql.*;

public class DBHomework {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        final String url = "jdbc:postgresql://localhost:5432/School?user=postgres&password=dragos";
        DriverManager.setLoginTimeout(60);  // wait 1 min; optional: DB may be busy, good to set a higher timeout

        try (final Connection conn = DriverManager.getConnection(url);
             final Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             final ResultSet rs = st.executeQuery("select * from classes");     //Display data for all classes.
             final Statement st1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             final ResultSet rs1 = st1.executeQuery("select * from classes where course_id = 'HFA4U1'"); //Display data for a course with specified id.
             final Statement st2 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             final ResultSet rs2 = st2.executeQuery("SELECT * FROM classes c RIGHT JOIN courses l ON c.course_id = l.course_id WHERE lower(title) like 'visual%'");
             final Statement st3 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             final ResultSet rs3 = st3.executeQuery("SELECT * FROM classes c RIGHT JOIN crosslistings l ON c.course_id = l.course_id WHERE lower(dept)='science' AND course_num=30")

             ) {

            /* Print all classes */

            System.out.println("Classed Schedule");
            System.out.println("Class ID \t|\t Course ID \t|\t\t Day \t\t|\t Start time \t|\t End time \t|\t Building \t|\t Room number\t|");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            while (rs.next()) {
                System.out.println("|\t"+ rs.getInt("class_id") + "\t\t|\t\t" + rs.getString("course_id") + "\t|\t\t"
                        + rs.getString("days") + "  \t|\t\t" + rs.getTime("start_time") + "\t|\t"
                        + rs.getTime("end_time") + "\t|\t\t" + rs.getString("bldg") + "\t\t|\t\t"
                        + rs.getInt("room_num") + "\t\t\t|");
            }

            /* Display data for a course with specified id */

            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            while (rs1.next()) {
                System.out.println("|\t" + rs1.getInt("class_id") + "\t\t|\t\t" + rs1.getString("course_id") + "\t|\t\t"
                        + rs1.getString("days") + "  \t|\t\t" + rs1.getTime("start_time") + "\t|\t"
                        + rs1.getTime("end_time") + "\t|\t\t" + rs1.getString("bldg") + "\t\t|\t\t"
                        + rs1.getInt("room_num") + "\t\t\t|");
            }
            /* Display data for all classes whose title (when converted to all lowercase letters) begins with "visual" */

            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------"
                            +  "------------------------------------------------------------------------------------------------------------------------------------------"
                            +  "------------------------------------------------------------------------------------------------------------------------------------------"
                            + "------------------------------------");
            String formatData = "%s %6s%6s %8s%5s %8s%3s %11s%4s %11s%4s %7s%6s %8s%8s %10s%4s %10s%4s %14s%5s %223s%5s %62s%5s\n";
            String formatHeader = "%s %9s%3s %10s%3s %6s%5s %12s%3s %11s%4s %10s%3s %13s%3s %11s%3s%9s%6s%12s%8s%120s%109s%39s%29s\n";
            System.out.printf(formatHeader, "|", "Class ID", "|", "Course ID", "|", "Day", "|", "Start time", "|", "End time", "|", "Building", "|", "Room number",
                    "|", "Course ID", "|", "Area", "|", "Title", "|", "Description", "|", "Prerequisite", "|");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------"
                    +  "------------------------------------------------------------------------------------------------------------------------------------------"
                    +  "------------------------------------------------------------------------------------------------------------------------------------------"
                    + "------------------------------------");

            while (rs2.next()) {

                System.out.printf(formatData, "|", rs2.getInt("class_id"), "|", rs2.getString("course_id"), "|", rs2.getString("days"), "|",
                        rs2.getTime("start_time"), "|", rs2.getTime("end_time"), "|", rs2.getString("bldg"), "|",
                        rs2.getInt("room_num"), "|" , rs2.getString("course_id") , "|" , rs2.getString("area") , "|" ,
                        rs2.getString("title") , "|" , rs2.getString("descrip") , "|" , rs2.getString("prereqs") , "|");
            }

            /* Display data for all classes whose dept (when converted to all lowercase letters) is "science" and whose course_num begins with "30" */
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            String formatData1 = "%s %6s%6s %8s%5s %8s%3s %11s%4s %11s%4s %7s%6s %8s%8s %11s%5s %8s%8s\n";
            String formatHeader1 = "%s %9s%3s %10s%3s %6s%5s %12s%3s %11s%4s %10s%3s %13s%3s %13s%3s %12s%4s\n";
            System.out.printf(formatHeader1, "|", "Class ID", "|", "Course ID", "|", "Day", "|", "Start time", "|", "End time", "|", "Building", "|", "Room number",
                    "|", "Departament", "|", "Course No.", "|");

            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
            while (rs3.next()) {
                System.out.printf(formatData1, "|", rs3.getInt("class_id"), "|", rs3.getString("course_id"), "|", rs3.getString("days"), "|",
                        rs3.getTime("start_time"), "|", rs3.getTime("end_time"), "|", rs3.getString("bldg"), "|",
                        rs3.getInt("room_num"), "|", rs3.getString("dept"), "|", rs3.getInt("course_num"), "|");
            }

        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
    }
}
