
package models;
import java.sql.Timestamp;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;


public class EmployeesDao {
    //instanciamos la coneccion
    ConectorMySql cn = new ConectorMySql();
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    //variables para enviar comentarios entre interfaz
    
    public static int id_user=0;
    public static String full_name_user ="";
    public static String username_user = "";
    public static String addres_user="";
    public static String rol_user="";
    public static String email_user="";
    public static String thelephone_user= "";
    
    //metodo de login
    
    public Employees loginQuery(String user, String password){
        String query="SELEC * FROM emplyees WHERE Username=? AND Password=?";
        Employees employees = new Employees();
        try{
            conn= cn.getConnection();
            pst= conn.prepareStatement(query);
            //enviar parametros
            pst.setString(1, user);
            pst.setString(2, password);
            rs= pst.executeQuery();
            
            if(rs.next()){
                employees.setId(rs.getInt("id"));
                id_user=employees.getId();
                employees.setFull_name(rs.getString("Full_name"));
                full_name_user = employees.getFull_name();
                employees.setUsername(rs.getString("Username"));
                username_user=employees.getUsername();
                employees.setAddres(rs.getString("Addres"));
                addres_user=employees.getAddres();
                employees.setAddres(rs.getString("Thelephone"));
                thelephone_user=employees.getThelephone();
                employees.setEmail(rs.getString("Email"));
                email_user=employees.getEmail();
                employees.setRol(rs.getString("Rol"));
                rol_user=employees.getRol();
            }
            
        }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error al obtener al empleado "+ e);
        }
        return employees;
    }
    
    //Registrar empleados
    public boolean RegisterEmployeesQuery(Employees employee){
        String query="INSERT INTO employee (Id,Full_name,Username,Addres,Thelephone,Email,Password,Rol,create,updated) VALUES(?,?,?,?,?,?,?,?,?,?)";
        Timestamp datetime= new Timestamp(new Date().getTime());
        
        try{
            conn= cn.getConnection();
            pst = conn.prepareStatement(query);
            pst.setInt(1, employee.getId());
            pst.setString(2, employee.getFull_name());
            pst.setString(3, employee.getUsername());
            pst.setString(4, employee.getAddres());
            pst.setString(5, employee.getThelephone());
            pst.setString(6, employee.getEmail());
            pst.setString(7, employee.getPassword());
            pst.setString(8, employee.getRol());
            pst.setTimestamp(9, datetime);
            pst.setTimestamp(10, datetime);
            pst.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al registrar el empleado, "+ e);
            return false;
         }
    }
    
    public List listEmployeeQuery(String value){
        List<Employees> list_employee=new ArrayList();
        String query="SELEC * Employees ORDEN BY Rol ASC";
        String query_search_employee= "SELEC * FROM Employees WHERE Id LIKE '%" + value + "%'";
        try{
            conn= cn.getConnection();
            if (value.equalsIgnoreCase("")){
                pst=conn.prepareStatement(query);
                rs= pst.executeQuery();
            }else{
                pst=conn.prepareStatement(query_search_employee);
                rs= pst.executeQuery();
            }
        while(rs.next()){
            Employees employee= new Employees();
            employee.setId(rs.getInt("Id"));
            employee.setFull_name(rs.getString("Full_name"));
            employee.setUsername(rs.getString("Username"));
            employee.setAddres(rs.getString("Addres"));
            employee.setThelephone(rs.getString("Thelephone"));
            employee.setEmail(rs.getString("Email"));
            employee.setRol(rs.getString("Rol"));
            list_employee.add(employee);
        }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
        return list_employee;
    }
    
    //Modificar empleados
     public boolean UpdateEmployeesQuery(Employees employee){
        String query="UPDATE employee SET (Full_name= ? ,Username=?,Addres=?,Thelephone=?,Email=?,Rol=?,updated=?) WHERE Id=?";
        Timestamp datetime= new Timestamp(new Date().getTime());
        
        try{
            conn= cn.getConnection();
            pst = conn.prepareStatement(query);

            pst.setString(1, employee.getFull_name());
            pst.setString(2, employee.getUsername());
            pst.setString(3, employee.getAddres());
            pst.setString(4, employee.getThelephone());
            pst.setString(5, employee.getEmail());
            pst.setString(6, employee.getRol());
            pst.setTimestamp(7, datetime);
            pst.setInt(8, employee.getId());
            pst.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al modificar el empleado, "+ e);
            return false;
         }
    }
     
     //Eliminar empleados
     public boolean DeleteEmployeerQuery(int id){
         String query="DELETE FROM Employees WHERE id=" + id;
         try{
             conn = cn.getConnection();
             pst = conn.prepareStatement(query);
             pst.execute();
             return true;
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"No se puede eliminar un empleado con relacion en otra tabla");
             return false;
         }
         
     }
     
     //Cambiar la contraseña
     public boolean UpdateEmployeerPassword(Employees employee){
         String query="UPDATE Employees SET Password = ? WHERE username = '" +username_user +"' ";
         
         try{
             conn= cn.getConnection();
             pst= conn.prepareStatement(query);
             pst.setString(1, employee.getPassword());
             pst.execute();
             return true;
             
             
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null,"ocurrio un error al modificar la contraseña "+ e);
             return false;
         }
     } 
     
     //
    
}   
