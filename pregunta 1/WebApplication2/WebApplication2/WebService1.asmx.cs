using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using Npgsql;
using NpgsqlTypes;
using System.Data;
namespace WebApplication2
{
    /// <summary>
    /// Descripción breve de WebService1
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class WebService1 : System.Web.Services.WebService
    {

        [WebMethod]
       
        public DataSet listado()
        {
            NpgsqlConnection conexion = new NpgsqlConnection();
            conexion.ConnectionString = "Username= postgres;Password=123456;Host=localhost;Port=5432;Database=inf-328";
            string sentencia = "select * from persona";
            NpgsqlCommand cmd = new NpgsqlCommand(sentencia, conexion);
            NpgsqlDataAdapter datos = new NpgsqlDataAdapter(cmd);
            DataSet dtset = new DataSet();
            datos.Fill(dtset,"persona");
            return dtset;
        }
        
        
       
    }
}
