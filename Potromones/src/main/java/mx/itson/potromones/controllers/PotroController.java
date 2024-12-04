package mx.itson.potromones.controllers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.potromones.connection.Conexion;
import mx.itson.potromones.modelos.Potromon;

/**
 *
 * @author Genius Lab
 */
public class PotroController {

    private ArrayList<Potromon> potromones;

    public PotroController() {
        potromones = new ArrayList<>();
    }

    // Crear un nuevo Potromon
    public void agregarPotromon(Potromon potromon) {
        Conexion c = new Conexion();

        /*
        hacemos una insersion a la base de datos
        en el qeury se crea una consulta para la inserccion 
        luego obtenemos la conexion
        preparamos la consulta para pasarle los valores
        empezamos a darle los valores
         */
        try {
            String query = "INSERT INTO potromon (Nombre, lista_habilidades, Descripcion, puntuaje, entrenador) VALUES (?, ?, ?, ?, ?);";
            Connection conexion = (Connection) c.connection();
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, potromon.getNombre());
            statement.setString(2, potromon.getPoder1() + potromon.getPoder2() + potromon.getPoder3() + potromon.getPoder4());
            statement.setString(3, potromon.getDesc());
            statement.setString(4, String.valueOf(potromon.getNivelPoder()));
            statement.setString(5, potromon.getEntrenador());
            statement.execute();
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    // Leer todos los Potromones
    public ArrayList<Potromon> obtenerPotromones() {
        try {
            String query = "SELECT * FROM potromon";
            Conexion c = new Conexion();
            Connection conexion = c.connection();
            Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(query);

            while (resultado.next()) {
                Potromon potromon = new Potromon();
                potromon.setNombre(resultado.getString("Nombre"));
                String habilidades = resultado.getString("lista_habilidades");
                String[] h = habilidades.split(",");
                potromon.setPoder1(h[0]);
                potromon.setPoder2(h[1]);
                potromon.setPoder3(h[2]);
                potromon.setPoder4(h[3]);
                potromon.setNivelPoder(Integer.parseInt(resultado.getString("puntuaje")));
                potromon.setEntrenador(resultado.getString("entrenador"));
                potromones.add(potromon);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return potromones;

    }

    // Actualizar un Potromon
    public void actualizarPotromon(int index, Potromon potromon) {
        if (index >= 0 && index < potromones.size()) {
            potromones.set(index, potromon);
        }
    }

    // Eliminar un Potromon
    public void eliminarPotromon(String nombre) {
        try {
            String query = "DELETE FROM potromon WHERE Nombre = ?";
            Conexion c = new Conexion();
            Connection conexion = c.connection();
            PreparedStatement statement = conexion.prepareStatement(query);
            statement.setString(1, nombre);
            statement.executeUpdate();
            
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
