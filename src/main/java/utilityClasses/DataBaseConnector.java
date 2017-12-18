package utilityClasses;

import java.sql.*;
import java.util.ArrayList;

/**
 * use this class to open a Data Base Connection.
 */
public class DataBaseConnector extends Page{

    private static String dbUrl         = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.credentials,"dbURL");
    private static String dbUsername    = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.credentials,"dbUsername");
    private static String dbPassword    = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.credentials,"dbPassword");
    private static String someTest      = FrameworkPropertyConfigurator.getPropertiesByFileName(FrameworkPropertyConfigurator.propertyFileName.log4j,"someTest");


    /**
     *
     * @return the connection to DB.
     * Use this method to connect to the mySQL DataBase.
     */
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch (ClassNotFoundException e) {
            System.out.println("Could not load JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Could not connect to DB: " + e.getMessage());
        }
        return connection;
    }

    public void closeDataBaseConnection(){
        try {
            getConnection().close();
            info("Connection is closed.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void sendSqlQuery(String sqlQuery, String columnLabelName){
        Connection connection = getConnection();
        ArrayList<String> al = new ArrayList<String>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(sqlQuery);
            while(resultSet.next()){
                String lastName = resultSet.getString(columnLabelName);
                info(lastName);
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            info(e.getMessage());
        }
    }
}
