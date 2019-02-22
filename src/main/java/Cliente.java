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
 * @param nombreCliente // Nombre con el cual se identificara el cliente
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
     
     public void insertarCliente (String nombreCliente,String direccionCliente, int telefonoCliente){
        
         /**
         * Aqui el administrador de la biblioteca podra insertar
         * los clientes
         */

     }
    
      
     public void editarCliente (int codigoCliente, String nombreCliente, String direccionCliente, int telefonoCliente){
        
         /**
        *Aquie el administrador podra editar los 
        * clientes introduciendo el codigo del cliente
        */

     }
       
     public void eliminarCliente (int codigoCliente){
       
         /**
         * Aquie el administrador podra eliminar los clientes
         * que ya no esten subscritos a la biblioteca insertando el codigo
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