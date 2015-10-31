package model;

import java.util.Date;

public class Publicacion {

    private int idPublicacion;
    private Date fechaPublicacion;
    private String tipoTransaccion;
    private Categoria nomCategoria;
    private SubCategoria subCategoria;
    private String descripcion;
    private String direccion;
    private String formaPago;
    private int cantidad;
    private double costo;

    public Publicacion(int idPublicacion, Date fechaPublicacion, String tipoTransaccion, Categoria nomCategoria, SubCategoria subCategoria, String descripcion, String direccion, String formaPago, int cantidad, double costo) {
        this.idPublicacion = idPublicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.tipoTransaccion = tipoTransaccion;
        this.nomCategoria = nomCategoria;
        this.subCategoria = subCategoria;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.formaPago = formaPago;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdPublicacion() {
        return idPublicacion;
    }

    public void setIdPublicacion(int idPublicacion) {
        this.idPublicacion = idPublicacion;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Categoria getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(Categoria nomCategoria) {
        this.nomCategoria = nomCategoria;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String agregarPublicacion() {
        return null;
    }

}
