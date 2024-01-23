
package models;


public class Employees {
    private int id;
    private String full_name;
    private String username;
    private String addres;
    private String thelephone;
    private String email;
    private String password;
    private String rol;
    private String created;
    private String update;

    public Employees() {
    }

    public Employees(int id, String full_name, String username, String addres, String thelephone, String email, String password, String rol, String created, String update) {
        this.id = id;
        this.full_name = full_name;
        this.username = username;
        this.addres = addres;
        this.thelephone = thelephone;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.created = created;
        this.update = update;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getThelephone() {
        return thelephone;
    }

    public void setThelephone(String thelephone) {
        this.thelephone = thelephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }
    
    
    
    
}
