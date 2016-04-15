import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class TablaProbabilidades {
  private String nombre;
  private int numeroFilas;
  private int numeroColumnas;
  private Double probabilidades[][];
  private final int SI = 0;
  private final int NO = 1;
  //private final String[] NOMBRES = {"ATACAR", "BUSCAR_ARMA", "BUSCAR_VIDA", "EXPLORAR", "HUIR", "DETECTAR_PELIGRO"};
  private String nombreFichero;
  
  public TablaProbabilidades(String nombreFichero) throws FileNotFoundException {
    this.nombreFichero = nombreFichero;
//    System.out.println(getNombreFichero());
    leerFichero();
  }
  
  private void leerFichero() throws FileNotFoundException {
    File fichero = new File(getNombreFichero());
    FileReader fr = new FileReader(fichero);
    BufferedReader buffer = new BufferedReader(fr);
    
    Scanner s = null;
    try {
//      System.out.println("... Datos cargados: ...");
      nombre = getNombreFichero();
      setNumeroFilas(Integer.parseInt(buffer.readLine()));  //Debemos traducir a número el valor del fichero que es string
      setNumeroColumnas(Integer.parseInt(buffer.readLine())); //Lo mismo
      probabilidades = new Double[getNumeroFilas()][getNumeroColumnas()];  //Inicializamos probabilidades[][] con fil y col

      for (int i = 0; i < getNumeroFilas(); i++) { //Para cada fila del fichero
        String linea = buffer.readLine(); //la guardamos en "linea"
        String palabra[] = linea.split(" ");  //y la separamos por "palabras" que equivalen a cada numero.
        for (int j = 0; j < getNumeroColumnas(); j++) { //Por cada columna (valor numérico) de la línea
          probabilidades[i][j] = Double.parseDouble(palabra[j]);  //lo guardamos en probabilidades[][] (transformado a int)
//          System.out.print(probabilidades[i][j] + " "); // Con esto imprimimos los datos formateados y legibles
        }
//        System.out.println(); // Conseguimos que se impriman los datos por filas
      }
    } catch (Exception ex) {
      System.out.print("[" + nombre + "] -> ");
      System.out.println("Mensaje: " + ex.getMessage());
      System.out.println();
    } finally {
      try {
        if (s != null)
          s.close();
      } catch (Exception ex2) {
        System.out.println("Mensaje 2: " + ex2.getMessage());
      }
    }
  }
  
  public Double getValorProbabilidad(int accion, int eleccion) {
    return getProbabilidades()[accion][eleccion];
  }
  public String getNombre() {
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
  
  private Double[][] getProbabilidades() {
    return probabilidades;
  }
  public void printProbabilidades() {
    for (int i = 0; i < getNumeroFilas(); i++) { //Para cada fila del fichero
      for (int j = 0; j < getNumeroColumnas(); j++) { //Por cada columna (valor numérico) de la línea
        System.out.print(probabilidades[i][j] + " "); // Con esto imprimimos los datos formateados y legibles
      }
      System.out.println();
    }

  }
  
  private void setProbabilidades(Double[][] probabilidades) {
    this.probabilidades = probabilidades;
  }
  
  private String getNombreFichero() {
    return nombreFichero;
  }
  
  private void setNombreFichero(String nombreFichero) {
    this.nombreFichero = nombreFichero;
  }

  private int getSI() {
    return SI;
  }

  private int getNO() {
    return NO;
  }
  
  public Double getElemento(int i, int j){
    return probabilidades[i][j];
  }
}
