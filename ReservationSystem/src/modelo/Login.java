package modelo;

/**
 *DTO
 * @author samuel
 */
public class Login {
    
    int       Id;
    String    Usuario;
    String    Clave;
    
    public Login(){
}
    public Login (int Id, String Usuario, String Clave){
        this.Id        = Id;
        this.Usuario   = Usuario;
        this.Clave     = Clave;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }
    
}
