import java.util.ArrayList;

public class Problema {
  ArrayList<TablaProbabilidades> tablas;
  int[] indicesColumnas;
  private int indiceFilasSt;
  
  public Problema(TablaProbabilidades[] tablas, int[] indicesColumnas, int indiceFilaSt) {
    this.tablas = new ArrayList<TablaProbabilidades>();
    System.out.println(this.tablas.size());
    for (int i = 0; i < tablas.length; i++) {
       this.tablas.add(tablas[i]);
    }
    this.indicesColumnas = indicesColumnas;
    this.indiceFilasSt = indiceFilaSt;
  }

  public TablaProbabilidades getTabla(String nombre) {
    for (int i = 0; i < getTablas().size(); i++) {
      if (getTablas().get(i).getNombre() == nombre) {
        return getTablas().get(i);
      }
    }
    return null;
  }
  private ArrayList<TablaProbabilidades> getTablas() {
    return tablas;
  }

  private void setTablas(ArrayList<TablaProbabilidades> tablas) {
    this.tablas = tablas;
  }
  
  public int tamanio() {
    return getTablas().size();
  }

  private int[] getIndicesColumnas() {
    return indicesColumnas;
  }

  private void setIndicesColumnas(int[] indicesColumnas) {
    this.indicesColumnas = indicesColumnas;
  }

  public int getIndiceFilasSt() {
    return indiceFilasSt;
  }

  private void setIndiceFilasSt(int indiceFilasSt) {
    this.indiceFilasSt = indiceFilasSt;
  }

}
