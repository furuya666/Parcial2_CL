/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author FURUYA
 */
import java.sql.*;
public class Conexion {
    public Conexion(){
        
    }
    public Connection getConexion(){
        Connection con=null;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/inf-328","postgres","123456");
            
        } catch (SQLException ex) {
        }
        catch (Exception e) {
        }
        return con;
    }
}
