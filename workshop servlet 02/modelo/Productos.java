package co.edu.sena.modelo;

import java.util.Date;

/**
 *
 * @author PMELENDEZ
 */
public class Productos {

private String cArt;
private String seccion;
private String nArt;
private double precio;
private Date fecha;
private int importado;
private String pOrg;
private String foto;

    public Productos(String cArt, String seccion, String nArt, double precio, Date fecha, int importado, String pOrg, String foto) {
        this.cArt = cArt;
        this.seccion = seccion;
        this.nArt = nArt;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pOrg = pOrg;
        this.foto = foto;
    }

    public Productos(String seccion, String nArt, double precio, Date fecha, int importado, String pOrg, String foto) {
        this.seccion = seccion;
        this.nArt = nArt;
        this.precio = precio;
        this.fecha = fecha;
        this.importado = importado;
        this.pOrg = pOrg;
        this.foto = foto;
    }

    public String getcArt() {
        return cArt;
    }

    public void setcArt(String cArt) {
        this.cArt = cArt;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getnArt() {
        return nArt;
    }

    public void setnArt(String nArt) {
        this.nArt = nArt;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getImportado() {
        return importado;
    }

    public void setImportado(int importado) {
        this.importado = importado;
    }

    public String getpOrg() {
        return pOrg;
    }

    public void setpOrg(String pOrg) {
        this.pOrg = pOrg;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String toString() {
        return "Productos{" + "cArt=" + cArt + ", seccion=" + seccion + ", nArt=" + nArt + ", precio=" + precio + ", fecha=" + fecha + ", importado=" + importado + ", pOrg=" + pOrg + ", foto=" + foto + '}';
    }






}
