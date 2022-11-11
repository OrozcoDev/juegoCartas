package juegoDeCartas;

import java.util.Arrays;

public class Principal {
	
	public static boolean validar(int num,int[] repartidas) {
		
		for(int i=0;i<12;i++) {
			 if(num == repartidas[i]) {
				 return false;
			 }
			
		}
		
		
		return true;
	}
	
	//hacemos un metodo para enfrentear
	public static Carta enfrentar2(Carta cartaj1,Carta cartaj2){
		if(cartaj1.getAtk()>cartaj2.getDef()) {
			return cartaj1;
		}
		if(cartaj1.getAtk()<cartaj2.getDef()) {
			return cartaj2;
		}
		if(cartaj1.atk==cartaj2.getDef()) {
			return cartaj1.enfrentar(cartaj2);
		}
		return null;
	}

	public static void main(String[] args) {

		
		Carta[] MasoCartas = new Carta[12];

		Carta[] masoj1 = new Carta[6];
		Carta[] masoj2 = new Carta[12];
		
		
		int[] cartasRepartidas = new int[12];
	
		MasoCartas[0]= new Carta(25,50,"agua");
		MasoCartas[1] = new Carta(50,75,"agua");
		MasoCartas[2] = new Carta(90,75,"agua");
		MasoCartas[3] = new Carta(25,25,"fuego");
		MasoCartas[4] = new Carta(50,75,"fuego");
		MasoCartas[5] = new Carta(90,75,"fuego");
		MasoCartas[6] = new Carta(25,50,"tierra");
		MasoCartas[7] = new Carta(50,75,"tierra");
		MasoCartas[8] = new Carta(90,75,"tierra");
		MasoCartas[9] = new Carta(25,50,"aire");
		MasoCartas[10] = new Carta(50,75,"aira");
		MasoCartas[11] = new Carta(90,75,"aire");
		
		
		/*for(int i=0;i<12;i++) {
			cartasRepartidas[i]=-1;
		}*/
		
		/*for(int i=0;i<12;i++) {
			System.out.println("valor de: "+cartasRepartidas[i]);
		}*/
		int cont=0,index=0;
		int random=(int)(Math.random()*11+1);
		boolean band=true;
		
		while(band) {
			random=(int)(Math.random()*11+1);
			
			
			if(validar(random,cartasRepartidas)) {
				cartasRepartidas[index]=random;
				index++;
			}
			if(index==11) {
				band=false;
			}
							

		}//fin while
		
		for(int i=0;i<12;i++) {
			if(i<6) {
				masoj1[i]=MasoCartas[cartasRepartidas[i]];
			}
			if(i>5){
				masoj2[i]=MasoCartas[cartasRepartidas[i]];
			}
		}
		
		
		System.out.println("---------cartas maso1-----------");
		for(int i=0;i<6;i++) {
			MasoCartas[0].mostrar(masoj1[i]);
		}
		System.out.println("---------cartas maso2-----------");
		for(int i=6;i<12;i++) {
			MasoCartas[0].mostrar(masoj2[i]);
		}
		
		
		
		
		//mostrar cartas Repartidas
		for(int i=0;i<12;i++) {
			System.out.println("cartasRepartidas "+i+" ="+cartasRepartidas[i]);
		}	
		
		//MasoCartas[0].mostrar(enfrentar2(masoj1[4],masoj2[7]));
		System.out.println("-----------------------------------");
		
		MasoCartas[0].mostrar(enfrentar2(MasoCartas[0],MasoCartas[3]));
		
		
		
	}//fin main 

}//fin principal
