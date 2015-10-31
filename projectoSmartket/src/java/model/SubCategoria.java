package model;

public class SubCategoria {

    private int codSub;
    private String nombre;
    private String estado;

    public SubCategoria(int codSub, String nombre, String estado) {
        this.codSub = codSub;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getCodSub() {
        return codSub;
    }

    public void setCodSub(int codSub) {
        this.codSub = codSub;
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

    public void agregarDatos() {
    }

    public void obtenerSubcategorias() {
    }

    public void bloquearSubCategoria() {
    }

    public void modificarSubcategoria() {
    }

}
