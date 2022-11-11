package juegodecartas;
/**
 *
 * @author Juan Orozco
 */
public class principal {

    
    public static void main(String[] args) {
        
        //cartas agua
        Carta carta1 = new Carta(25,50,"agua");
        Carta carta2 = new Carta(50,75,"agua");
        Carta carta3 = new Carta(90,75,"agua");
        //cartas fuego
        Carta carta4 = new Carta(25,50,"fuego");
        Carta carta5 = new Carta(50,75,"fuego");
        Carta carta6 = new Carta(90,75,"fuego");
        //cartas tierra
        Carta carta7 = new Carta(25,50,"tierra");
        Carta carta8 = new Carta(50,75,"tierra");
        Carta carta9 = new Carta(90,75,"tierra");
        //cartas aire
        Carta carta10 = new Carta(25,50,"aire");
        Carta carta11 = new Carta(50,75,"aira");
        Carta carta12 = new Carta(90,75,"aire");
        
        
        //reglas
        //enfrentamiento de agua con fuego(-)
        //enfrentamiento de tierra con agua(-)
        //enfrentamiento de aire con tierra(-)
        //enfrentamiento de fuego con aire(-)
        
        
        
        carta1.mostrar(carta2.enfrentar(carta6));
        carta2.mostrar(carta8.enfrentar(carta2));
        carta3.mostrar(carta6.enfrentar(carta12));
        carta4.mostrar(carta12.enfrentar(carta7));
        
        
       
        
        
        
    }
    
}
