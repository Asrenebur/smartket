package model;

public class CuentaBanco {

    private String numCuenta;
    private String nomBanco;
    private String tipoCuenta;
    private String cuentaPayPal;

    public CuentaBanco(String numCuenta, String nomBanco, String tipoCuenta, String cuentaPayPal) {
        this.numCuenta = numCuenta;
        this.nomBanco = nomBanco;
        this.tipoCuenta = tipoCuenta;
        this.cuentaPayPal = cuentaPayPal;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getNomBanco() {
        return nomBanco;
    }

    public void setNomBanco(String nomBanco) {
        this.nomBanco = nomBanco;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getCuentaPayPal() {
        return cuentaPayPal;
    }

    public void setCuentaPayPal(String cuentaPayPal) {
        this.cuentaPayPal = cuentaPayPal;
    }
    /*METODOS*/
    public String actualizarDatos() {
        return null;
    }

    String obtenerInfoBanco(String nomUsuario) {
        return null;
    }
}
