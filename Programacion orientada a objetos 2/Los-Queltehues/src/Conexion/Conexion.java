package Conexion;

import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    private static Connection conn;
    private static final String driver = "org.mariadb.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "hsbc1235";
    private static final String url = "jdbc:mariadb://localhost:3306/queltehues";
    
    public Conexion(){
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("Conexion Establecida.");
            }
        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar"+ e);
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    public void closeConnection() {
        try {
            conn.close();
            System.out.println("Conexion cerrada.");
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexion: " + e.getMessage());
        }
    }
    
    public String getNombre(int id, Connection conn) {
        String nombre = "";
        String sql = "SELECT Nombre FROM User WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    nombre = rs.getString("Nombre");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return nombre;
    }
    
    public String getApellido(int id, Connection conn) {
        String apellido = "";
        String sql = "SELECT Apellido FROM User WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    apellido = rs.getString("Apellido");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return apellido;
    }
    
    public String getFoto(int id, Connection conn) {
        String foto = "";
        String sql = "SELECT Foto FROM User WHERE id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    foto = rs.getString("Foto");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return foto;
    }
    
    public boolean validarUsuario(String usuario, String password, int idUsuario) {
        String sql = "SELECT * FROM User WHERE id=? AND Rut=? AND Contraseña=?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.setString(2, usuario);
            stmt.setString(3, password);
            try (ResultSet rs = stmt.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public ResultSet getDatosParcela(int idParcela, Connection conn) {
        ResultSet rs = null;
        String sql = "SELECT p.*, pr.Nombre AS PropietarioNombre, pr.Apellido AS PropietarioApellido, pr.Correo AS PropietarioCorreo, pr.Numero AS PropietarioNumero, pr.RutPropietario, "
                   + "ar.Nombre AS ArrendatarioNombre, ar.Apellido AS ArrendatarioApellido, ar.Correo AS ArrendatarioCorreo, ar.Numero AS ArrendatarioNumero, ar.RutArrendatario AS RutArrendatario, "
                   + "v.Marca, v.Modelo, v.Color, v.Tipo "
                   + "FROM parcela p "
                   + "INNER JOIN propietario pr ON p.RutPropietario = pr.RutPropietario "
                   + "LEFT JOIN arrendatario ar ON p.RutArrendatario = ar.RutArrendatario "
                   + "LEFT JOIN vehiculos v ON p.Patente = v.Patente "
                   + "WHERE p.id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idParcela);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return rs;
    }
    
    public void llenarTabla(JTable tabla) {
        String sql = "SELECT * FROM Aportes";
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Parcela");
        modelo.addColumn("Monto");
        modelo.addColumn("Fecha");
        modelo.addColumn("Motivo");
        modelo.addColumn("Aporte Adicional");
        modelo.addColumn("Motivo Adicional");

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("parcela");
                fila[1] = rs.getString("Monto");
                fila[2] = rs.getString("Fecha");
                fila[3] = rs.getString("Motivo");
                fila[4] = rs.getString("aporteAdicional");
                fila[5] = rs.getString("motivoAdicional");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        tabla.setModel(modelo);
    }
    
    public void llenarGastos(JTable tabla) {
        String sql = "SELECT * FROM gastos";
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Valor");
        modelo.addColumn("Razon");
        modelo.addColumn("Fecha");
        modelo.addColumn("Tributario");
        modelo.addColumn("Autorizacion");

        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getString("Valor");
                fila[1] = rs.getString("Razon");
                fila[2] = rs.getString("Fecha");
                fila[3] = rs.getString("Tributario");
                fila[4] = rs.getString("Autorizacion");
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        tabla.setModel(modelo);
    }
}
