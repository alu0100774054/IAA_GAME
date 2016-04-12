import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LecturaFichero {
  private String nombre;
  private int numeroFilas;
  private int numeroColumnas;
  private int[][] probabilidades;
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
      System.out.println("... Leemos el contenido del fichero ...");
      nombre = getNombreFichero();
      setNumeroFilas(buffer.read());
      setNumeroColumnas(buffer.read());
      for (int i = 0; i < getNumeroFilas(); i++) {
        for (int j = 0; j < getNumeroColumnas(); j++) {
          probabilidades[i][j] = buffer.read();
          System.out.println(probabilidades[i][j]);
        }
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
