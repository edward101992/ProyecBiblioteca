/*
 * Esta clase contiene la informacion acerca del cliente que efectuara la compra
 * del libro
 */

/**
 * @author Edward Ramos
 * @version 1.0
 * @param codigoCliente // Codigo que identifica a cada cliente
 * @param nombreCliente // Nombre y Apelido del cliente
 * @param direccionCliente // Direccion a la cual se enviara el libro comprado
 * @param telefonoCliente // Telefono el cual el cliente dara por si se desea comunicar con el
 * @param nombreLibro // Nombre dle libro el cual el cliente desea buscar
 */
public class Cliente {

    private int codigoCliente;
    private String nombreCliente;
    private String direccionCliente;
    private int telefonoCliente;
    
    
    
     public void buscarLibro (String nombreLibro){
    /**
     *  En este metodo el cliente buscara si el libro que desea comprar esta
     *  en el inventario de la Biiblioteca 
     */
    
    }
    public Cliente(int codigoCliente, String nombreCliente, String direccionCliente, int telefonoCliente) {
        this.codigoCliente = codigoCliente;
        this.nombreCliente = nombreCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    
 
            
   
}
