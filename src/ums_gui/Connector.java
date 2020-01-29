
package ums_gui;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Connector {
    private static String servername = "localhost";
    private static String username = "root";
    private static String dbname = "umsgui";
    private static Integer portnumber = 3306;
    private static String password = "Mohan@97";
    
    public static Connection getConnection(){
        Connection con = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setPassword(password);
        
        try {
            con = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger("Get Connection...." + Connector.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
