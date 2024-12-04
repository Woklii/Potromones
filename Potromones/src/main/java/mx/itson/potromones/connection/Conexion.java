
package mx.itson.potromones.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Genius Lab
 */
public class Conexion {
    
    //Codigo que conecta con la base de datos
    public static Connection connection() {
        
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/potrodex?user=root&password=admin");
        } catch (Exception ex) {
            System.err.println("Ocurrió un error: " + ex.getMessage());
        }
        return conexion;
    }
}
