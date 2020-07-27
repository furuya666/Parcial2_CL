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
import java.util.ArrayList;
import Model.persona;
public class personadao {
    Conexion conexion;
    
    
    public personadao(){
        conexion=new Conexion();
                
    }
    
    public ArrayList<persona> verifica() throws Exception{
      
        Connection accesoBD= conexion.getConexion();
        
            
            PreparedStatement ps =accesoBD.prepareStatement("select * from persona");
            
               ResultSet rs=ps.executeQuery();
               ArrayList<persona>listapersona=new  ArrayList<persona>();
               while(rs.next()) {
                persona persona= new persona();
                persona.setCi(rs.getString(1));
                 persona.setNombre(rs.getString(2));
                  persona.setApellido_paterno(rs.getString(3));
                   persona.setApellido_materno(rs.getString(4));
                   listapersona.add(persona); 
            
               }
        
        return listapersona;
    }
}
