import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaFichero {
  private String nombre;
  private int numeroFilas;
  private int numeroColumnas;
  private int probabilidades[][];
  private String nombreFichero;
  
  public LecturaFichero(String nombreFichero) throws FileNotFoundException {
    this.nombreFichero = nombreFichero;
    System.out.println(getNombreFichero());
    leerFichero();
  }
  
  private void leerFichero() throws FileNotFoundException {
    File fichero = new File(getNombreFichero());
    FileReader fr = new FileReader(fichero);
    BufferedReader buffer = new BufferedReader(fr);
    
    Scanner s = null;
    try {
      System.out.println("... Datos cargados: ...");
      nombre = getNombreFichero();
      setNumeroFilas(Integer.parseInt(buffer.readLine()));  //Debemos traducir a número el valor del fichero que es string
      setNumeroColumnas(Integer.parseInt(buffer.readLine())); //Lo mismo
      probabilidades = new int[getNumeroFilas()][getNumeroColumnas()];  //Inicializamos probabilidades[][] con fil y col

      for (int i = 0; i < getNumeroFilas(); i++) { //Para cada fila del fichero
        String linea = buffer.readLine(); //la guardamos en "linea"
        String palabra[] = linea.split(" ");  //y la separamos por "palabras" que equivalen a cada numero.
        for (int j = 0; j < getNumeroColumnas(); j++) { //Por cada columna (valor numérico) de la línea
          probabilidades[i][j] = Integer.parseInt(palabra[j]);  //lo guardamos en probabilidades[][] (transformado a int)
          System.out.print(probabilidades[i][j] + " "); // Con esto imprimimos los datos formateados y legibles
        }
        System.out.println();
      }
    } catch (Exception ex) {
      System.out.println("Mensaje: " + ex.getMessage());
    } finally {
      try {
        if (s != null)
          s.close();
      } catch (Exception ex2) {
        System.out.println("Mensaje 2: " + ex2.getMessage());
      }
    }
  }
  
  private String getNombre() {
    return nombre;
  }
  
  private void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  private int getNumeroFilas() {
    return numeroFilas;
  }
  
  private void setNumeroFilas(int numeroFilas) {
    this.numeroFilas = numeroFilas;
  }
  
  private int getNumeroColumnas() {
    return numeroColumnas;
  }
  
  private void setNumeroColumnas(int numeroColumnas) {
    this.numeroColumnas = numeroColumnas;
  }
  
  private int[][] getProbabilidades() {
    return probabilidades;
  }
  
  private void setProbabilidades(int[][] probabilidades) {
    this.probabilidades = probabilidades;
  }
  
  private String getNombreFichero() {
    return nombreFichero;
  }
  
  private void setNombreFichero(String nombreFichero) {
    this.nombreFichero = nombreFichero;
  }
  
}
