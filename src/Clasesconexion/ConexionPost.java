/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clasesconexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConexionPost {
    public static String URL="jdbc:postgresql://localhost:5432/adsi56";
    public static Connection connection=null;
    public static Connection GetConnection(){
        try {
            connection=DriverManager.getConnection(URL,"root", "1234");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR AL CONECTAR POSTGRESQL","ERROR",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        return connection;
    }
}
