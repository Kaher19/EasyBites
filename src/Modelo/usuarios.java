/**
 *
 * @author Kevin
 */
package Modelo;

public class usuarios {
   //tipos de datos que se obtendran y se guardaran en la base de datos
    private int id;
    private String nombre;
    private String password;
    private String checkPassword;
    private String correo;
    private String username;
    private String last_session;
    private int id_tipo;

    //--------------------------------------------------------------------------
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //--------------------------------------------------------------------------
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //--------------------------------------------------------------------------
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //--------------------------------------------------------------------------
    
    public String getCheckPassword() {
        return checkPassword;
    }

    public void setCheckPassword(String checkPassword) {
        this.checkPassword = checkPassword;
    }

    //--------------------------------------------------------------------------
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //--------------------------------------------------------------------------
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    //--------------------------------------------------------------------------
    
    public String getLast_session() {
        return last_session;
    }

    public void setLast_session(String last_session) {
        this.last_session = last_session;
    }

    //--------------------------------------------------------------------------
    
    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }
    
}
