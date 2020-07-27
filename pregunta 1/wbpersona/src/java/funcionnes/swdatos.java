/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionnes;




import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.*;
import java.util.*;
import Model.*;
import Model.personadao;
/**
 *
 * @author FURUYA
 */
@WebService(serviceName = "swdatos")
public class swdatos {

    
   
    
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
   

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ingreso")
    public ArrayList<persona> ingreso()throws Exception{
        //TODO write your implementation code here:
     
      personadao per=new personadao();
     return per.verifica();
    }
}
