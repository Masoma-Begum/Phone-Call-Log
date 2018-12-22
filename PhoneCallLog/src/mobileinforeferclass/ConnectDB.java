/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobileinforeferclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class ConnectDB {

    public ConnectDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc.mysql.jdbc://localhost:3306/mydb", "root", "12345");
    }
    
   
}
