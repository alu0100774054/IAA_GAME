import java.lang.reflect.Array;
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
    Double valorSt = tablaAEvaluar.getValorProbabilidad(0 , indice) / 100;
    ArrayList<Double> resultados = new ArrayList<Double>();
    for (int i = 0; i < getP().indicesColumnas.length - 1; i++) {
        int aux = 0;
        Double pHealth = obtenerProbabilidad("Health.txt",i, getP().indicesColumnas[aux]) / 100;
        aux++;
        //System.out.println(getP().indicesColumnas);
        Double pHealthNear = obtenerProbabilidad("HealthNear.txt", i, getP().indicesColumnas[aux]) / 100;
        aux++;
        Double pNoise = obtenerProbabilidad("Noise.txt", i, getP().indicesColumnas[aux]) / 100;
        aux++;
        Double pNumberEnemies = obtenerProbabilidad("NumberEnemies.txt", i, getP().indicesColumnas[aux]) / 100;
        aux++;
        Double pOpponentWeapon = obtenerProbabilidad("OpponentWeapon.txt", i, getP().indicesColumnas[aux]) / 100;
        aux++;
        Double pWeapon = obtenerProbabilidad("Weapon.txt", i, getP().indicesColumnas[aux]) / 100;
        aux++;
        Double pWeaponNear = obtenerProbabilidad("WeaponNear.txt", i, getP().indicesColumnas[aux]) / 100;
        
        System.out.println();
        System.out.println(pHealth + "*" + pHealthNear + "*" + pNoise + "*" + pNumberEnemies + "*" + pOpponentWeapon + "*" + pWeapon + "*" + pWeaponNear);
        Double a = (pHealth * pHealthNear * pNoise * pNumberEnemies * pOpponentWeapon * pWeapon * pWeaponNear);
        Double pStTodas = valorSt * a;     
        Double valorSt1 = obtenerProbabilidad("St1.txt", i, indice) / 100;
        resultados.add((pStTodas * valorSt1));
        System.out.println(resultados.get(i));
    }
  }

  private Double obtenerProbabilidad(String nombre, int i, int j) {
    return getP().getTabla(nombre).getElemento(i, j);
  }

  private Problema getP() {
    return p;
  }

  private void setP(Problema p) {
    this.p = p;
  }
  
}
