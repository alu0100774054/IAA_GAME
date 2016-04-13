import java.util.ArrayList;

public class Solucion {
  private Problema p;
  public Solucion(Problema p) {
    this.p = p;
    resolver(p);
  }

  private void resolver(Problema p) {
    TablaProbabilidades tabla = null;
    int indice =  getP().getIndiceFilasSt();
    TablaProbabilidades tablaAEvaluar = getP().getTabla("St.txt");
    // Valor de St
    int valorSt = tablaAEvaluar.getValorProbabilidad(0 , indice) / 100;
    for (int i = 0; i < getP().indicesColumnas.length - 1; i++) {
        int aux = 0;
        int pHealth = obtenerProbabilidad("Health.txt",i, getP().indicesColumnas[aux]);
        aux++;
        //System.out.println(getP().indicesColumnas);
        int pHealthNear = obtenerProbabilidad("HealthNear.txt", i, getP().indicesColumnas[aux]);
        aux++;
        int pNoise = obtenerProbabilidad("Noise.txt", i, getP().indicesColumnas[aux]);
        aux++;
        int pNumberEnemies = obtenerProbabilidad("NumberEnemies.txt", i, getP().indicesColumnas[aux]);
        aux++;
        int pOpponentWeapon = obtenerProbabilidad("OpponentWeapon.txt", i, getP().indicesColumnas[aux]);
        aux++;
        int pWeapon = obtenerProbabilidad("Weapon.txt", i, getP().indicesColumnas[aux]);
        aux++;
        int pWeaponNear = obtenerProbabilidad("WeaponNear.txt", i, getP().indicesColumnas[aux]);
        
        System.out.println();
        int a = (pHealth * pHealthNear * pNoise * pNumberEnemies * pOpponentWeapon * pWeapon * pWeaponNear) / 1000000000;
        System.out.println(a);
        
    }
  }

  private int obtenerProbabilidad(String nombre, int i, int j) {
    return getP().getTabla(nombre).getElemento(i, j);
  }

  private Problema getP() {
    return p;
  }

  private void setP(Problema p) {
    this.p = p;
  }
  
}
