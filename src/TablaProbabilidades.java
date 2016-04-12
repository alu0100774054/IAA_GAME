/**
 * Esta clase guarda las probabilidades de cada acción.
 * @author erikbarretodevera
 *
 */
public class TablaProbabilidades {
  private String nombre;
  private int numeroFilas;
  private int numeroColumnas;
  private int[][] probabilidades;
  
  public TablaProbabilidades(String nombre, int numeroFilas, int numeroColumnas, int[][] probabilidades) {
    this.nombre = nombre;
    this.numeroFilas = numeroFilas;
    this.numeroColumnas = numeroColumnas;
    this.probabilidades = probabilidades;
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

  private String getNombre() {
    return nombre;
  }

  private void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
}
