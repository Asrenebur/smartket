package model;
public class Categoria {
    private int codCat;
    private String nombre;
    private String estado;

    public Categoria(int codCat, String nombre, String estado) {
        this.codCat = codCat;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getCodCat() {
        return codCat;
    }

    public void setCodCat(int codCat) {
        this.codCat = codCat;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /*METODOS*/
    Categoria obtenerCategoria(String nomCategoria) {
        return null;
    }

    String agregarDatos() {
        return null;
    }
}