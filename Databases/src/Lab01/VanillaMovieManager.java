package Lab01;

import java.sql.*;
import java.io.PrintWriter;

/**
 * Created by t00036478 on 01/02/2018.
 */
public class VanillaMovieManager {
    private  String driverClass;
    private  Connection connection = null;
    private  String url;
    private  String username; // your username
    private  String password; //your password
    private String insertSql = "INSERT INTO MOVIES VALUES (3, 'Michael Collins','Neil Jordan', 'Irish civil war')";
    private String selectSql = "SELECT * FROM MOVIES";
    private String insertSql2 = "insert into movies " + "(id, title, director, synopsis) " + "values " + "(?, ?, ?, ?)";
    private String selectSql3 = "SELECT count(*) FROM movies";
    private PrintWriter pw = null;


    public VanillaMovieManager(){
        driverClass = "oracle.jdbc.driver.OracleDriver";
        url = "jdbc:oracle:thin:@studentoracle.students.ittralee.ie:1521:orcl";
        username = ""; // your username
        password = ""; //your password


        setConnection();
        //persistMovie();
        queryMovies();
        getNumberRows();
        firstAndLast();
        printMetaData();
        useSavepoint();

    }

    private void setConnection() {
        try {
            Class.forName(driverClass).newInstance();
            pw = new PrintWriter("c:\\jdbc.log");
            DriverManager.setLogWriter(pw);
            connection = DriverManager.getConnection(url, username, password);
            System.out.println(connection);
        } catch (Exception ex) {
            System.err.println("Exception:"+ ex.getMessage());
        }

    }
    private void persistMovie() {
        try {
            PreparedStatement pst=connection.prepareStatement(insertSql2);
            pst.setInt(1, 4);
            pst.setString(2, "Lawrence of Arabia");
            pst.setString(3, "David Lean");
            pst.setString(4, "First World War");
// Execute the statement
            pst.execute();
            System.out.println("Movie persisted successfully!");
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
    }


    private void queryMovies() {
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectSql);
            while (rs.next()) {
                System.out.println("Movie Found: " + rs.getInt("ID") +
                        ", Title:" + rs.getString("TITLE"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    private void getNumberRows() {
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(selectSql3);
            int rowCount = 0;
            while(rs.next()) {
                rowCount = rs.getInt(1);
            }
            // Now, the rowCount variable contains the number of rows in rs
            System.out.println("Row Count: " + rowCount);
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    private void firstAndLast() {
        try {
            Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery(selectSql);
            rs.first();
            System.out.println("First Movie Found: " + rs.getInt("ID") +
                    ", Title:" + rs.getString("TITLE"));

            rs.last();
            System.out.println("Last Movie Found: " + rs.getInt("ID") +
                    ", Title:" + rs.getString("TITLE"));


        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }


    public  void printMetaData() {
        try {
            Statement stmt = connection.createStatement();

            ResultSet rs = stmt.executeQuery(selectSql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            System.out.println("Column Count:" + columnCount);

            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Index:" + i +
                        ", Name:" + rsmd.getColumnName(i) +
                        ", Label:" + rsmd.getColumnLabel(i) +
                        ", Type Name:" + rsmd.getColumnTypeName(i) +
                        ", Class Name:" + rsmd.getColumnClassName(i));
            }
            rs.close();
        }
        catch(SQLException e){
            System.out.println("error");
        }
    }

    public  void useSavepoint(){
        String SQL = "update movies " +"set synopsis = ? " +"where id = ?";
        PreparedStatement pstmt = null;
        try{
            connection.setAutoCommit(false);
            pstmt = connection.prepareStatement(SQL);
            pstmt.setString(1, "a bad movie"); // value for synopsis
            pstmt.setInt(2, 1); // value for movie id 1
            pstmt.execute();

            // Set a save point
            Savepoint sp1 = connection.setSavepoint();
            // Change the synopsis to ' a terrible movie' and execute SQL again
            pstmt.setString(1, "a terrible movie");
            pstmt.execute();
            // Set a save point
            Savepoint sp2 = connection.setSavepoint();

            // Roll back the transaction to the save point sp1,
            // so that the synopsis for movie id 1 will remain set
            // to ‘a bad movie’ and not ‘a terrible movie’
            connection.rollback(sp1);

            // Commit the transaction
            connection.commit();
            pstmt.close();
            connection.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());

        }
    }


    public static void main(String[] args){
        VanillaMovieManager manager = new VanillaMovieManager();


    }
}

