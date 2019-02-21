/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Esta clase contiene la informacion acerca las caracteristicas del inventario 
 * de libros Disponibles en la biblioteca
 * @author Edward Ramos
 * @version 1.0
 * @param codigoLibro // Variable la cual identifica el Libro
 * @param nombreLibro // Variable en la cual se digita el nombre comercial ddel libro
 * @param editorial // Variable la cual identifica la editorial la cual comercializo el libro
 * @param anioLibro // Año en el cual fue lanzado el libro
 * @param precioLibro // Valor comercial de venta del libro segun la biblioteca
 * @param categoriaLibro // Genero literario del libro (Drama, Accion, Suspenso etc)
 * 
 *
 * 
 */

public class Biblioteca {

    
  private int codigoLibro;
  private String nombreLibro;
  private String editorial;
  private short anio;
  private float  precioLibro;
  private String categoriaLibro;
  private short contador;
    
  
  public void cantidadLibros (){
  
      //  
  
  }
  
  
    public Biblioteca(int codigoLibro, String nombreLibro, String editorial, Short anio, float precioLibro, String categoriaLibro) {
        this.codigoLibro = codigoLibro;
        this.nombreLibro = nombreLibro;
        this.editorial = editorial;
        this.anio = anio;
        this.precioLibro = precioLibro;
        this.categoriaLibro = categoriaLibro;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getEditorial() {
        return editorial;
    }

    public Short getAnio() {
        return anio;
    }

    public float getPrecioLibro() {
        return precioLibro;
    }

    public String getCategoriaLibro() {
        return categoriaLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setAnio(Short anio) {
        this.anio = anio;
    }

    public void setPrecioLibro(float precioLibro) {
        this.precioLibro = precioLibro;
    }

    public void setCategoriaLibro(String categoriaLibro) {
        this.categoriaLibro = categoriaLibro;
    }
    

  
  
  
}
