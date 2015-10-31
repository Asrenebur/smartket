package model;

public class Usuario {

    private String nomUsusario;
    private String tipo;
    private String password;
    private String nombres;
    private String apellidos;
    private String ciudad;
    private String telefono;
    private String email;
    private String estado;
    private String motivoBaja;

    public Usuario(String nomUsusario, String tipo, String password, String nombres, String apellidos, String ciudad, String telefono, String email, String estado, String motivoBaja) {
        this.nomUsusario = nomUsusario;
        this.tipo = tipo;
        this.password = password;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.email = email;
        this.estado = estado;
        this.motivoBaja = motivoBaja;
    }

    public String getNomUsusario() {
        return nomUsusario;
    }

    public void setNomUsusario(String nomUsusario) {
        this.nomUsusario = nomUsusario;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMotivoBaja() {
        return motivoBaja;
    }

    public void setMotivoBaja(String motivoBaja) {
        this.motivoBaja = motivoBaja;
    }

    /*METODOS*/
    public Usuario obtenerInfoUsr(String nomUsuario) {
        return null;
    }
}
