import java.util.Date;

/*
 * Esta clase contiene la informacion de la venta del libro al cliente
 *
 */

/**
 *
 * @author Edward Ramos
 * @version 1.0
 * @param codigoVenta // Codigo que diferencia cada venta
 * @param idCliente // Codigo que diferencia a cada cliente
 * @param idLibro // codigo que diferencia a cada libro
 * @param fechaCompra // Fecha en la cual el libro es vendido
 * @param fechaEntrega //Fecha en la cual le llegara el lirbo comprado al cliente
 */
public class Venta {

    private int codigoVenta;
    private int idLibro;
    private int idCliente;
    private Date fechaCompra;
    private Date fechaEntrega;
    
  
    
    public void comprarLibro(int codigoVenta,int idLibro,int idCliente, Date fechaCompra, Date fechaVenta){
    /**
     * Este metodo tendra 2 partes, la primera; el libro que el cliente busco
     * tiene unidades disponibles dentro de la biblioteca,
     * la segunda es en caso que si arroge algun tipo de busqueda el cliente podra realizar la compra
     * en caso que todo este correcto, se capturara la fecha de compra, se le sumara 3 dias
     * y se guardara en la variable fechaEntrega
     */
    
    }
    
    public void facturacion(){
    /**
     * Luego de realizar la venta - compra del libro 
     * se imprimira un recibo teniendo en cuenta los 
     * datos que tenga el codigo de la venta
     */
    
    }
    
    public Venta(int codigoVenta, int idLibro, int idCliente, Date fechaCompra, Date fechaEntrega) {
        this.codigoVenta = codigoVenta;
        this.idLibro = idLibro;
        this.idCliente = idCliente;
        this.fechaCompra = fechaCompra;
        this.fechaEntrega = fechaEntrega;
    }

    public int getCodigoVenta() {
        return codigoVenta;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    

    
    
    
}
