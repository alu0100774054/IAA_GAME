import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
  	Scanner reader = new Scanner(System.in);;
  	String[] nombres = {"Health.txt", "HealthNear.txt", "Noise.txt", "NumberEnemies.txt", "OpponentWeapon.txt", "St.txt", "St1.txt", "Weapon.txt", "WeaponNear.txt"};
  	
  	
  	int health = salud(reader);
  	int weapon = arma(reader);
  	int enemyWeapon = armaEnemigo(reader);
  	int hearNoise = ruidoCerca(reader);
  	int numberEnemies = numeroEnemigos(reader);
  	int weaponNear = armaCerca(reader);
  	int healthNear = saludCerca(reader);
  	
  }
  

	private static int salud(Scanner reader){
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("Salud del personaje: ");
  		System.out.println("1. Alta");
  		System.out.println("2. Baja");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		case 1:	return 0;
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
  }

  private static int arma(Scanner reader){
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("El presonaje tiene arma?:");
  		System.out.println("1. Si");
  		System.out.println("2. No");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
  }
  
  private static int armaEnemigo(Scanner reader){
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("El enemigo tiene arma?:");
  		System.out.println("1. Si");
  		System.out.println("2. No");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
  }
  
  private static int ruidoCerca(Scanner reader){
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("Se oye algun ruido cerca?:");
  		System.out.println("1. Si");
  		System.out.println("2. No");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
  }
  
  private static int numeroEnemigos(Scanner reader){
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("Numero de enemigos:");
  		System.out.println("1. Mucos");
  		System.out.println("2. Pocos");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
  }
  
  private static int saludCerca(Scanner reader) {
  	boolean opcion = false;
  	while(!opcion){
  		System.out.println("Hay salud cerca?:");
  		System.out.println("1. Si");
  		System.out.println("2. No");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
	}


	private static int armaCerca(Scanner reader) {
		boolean opcion = false;
  	while(!opcion){
  		System.out.println("Hay arma cerca?:");
  		System.out.println("1. Si");
  		System.out.println("2. No");
  		System.out.print("Introducir opcion: ");
  		int eleccion = reader.nextInt();
  		
  		switch(eleccion){
  		
  		case 1:	return 0;
  		
  		case 2:	return 1;
  			
  		default:	System.out.println("Opcion incorrecta");
      					System.out.println("La opcion " + opcion + " no existe");
      					System.out.println(" ");
      		break;
  		}
  	}
  	return 0;
	}
  
}
