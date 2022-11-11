package juegodecartas;
/**
 *
 * @author Juan Orozco
 */
public class Carta {
    
    public int atk;
    public int def;
    public String elemento;
	
	//constructores de la clase
	
	//constructor parametrizado
    public Carta(int atk, int def, String elemento) {
	super();
	this.atk = atk;
	this.def = def;
	this.elemento = elemento;
    }

	//metodos get and set
    public int getAtk() {
            return atk;
    }

    public void setAtk(int atk) {
            this.atk = atk;
    }

    public int getDef() {
            return def;
    }

    public void setDef(int def) {
            this.def = def;
    }

    public String getElemento() {
            return elemento;
    }

    public void setElemento(String elemento) {
            this.elemento = elemento;
    }

    //metodos de la clase
    public void mostrar (){
            System.out.println(this.atk);
            System.out.println(this.def);
            System.out.println(this.elemento);
    }

    public void mostrar(Carta carta) {
            carta.mostrar();
            System.out.println("---------------------");
    }
    //metodo enfrentar
    public Carta enfrentar(Carta carta) {
        
        //enfrentamiento de agua con fuego(-)
        if((this.elemento=="agua" && carta.elemento=="fuego") || (carta.elemento=="agua" && this.elemento=="fuego")) {
            System.out.println("holi desde enfrentamiento 1");
            if(this.elemento=="agua") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("holi 2");
                    carta.setAtk(nuevoataque);
                    return carta;
            }
            else if(carta.elemento=="agua" ) {
                    System.out.println("holi 3");
                    int decremento=(int)(this.atk*0.2);
                    int nuevoataque = this.atk-decremento;
                    this.atk=nuevoataque;
                    return this;
            }
        }
        
        //enfrentamiento de  tierra con(-)agua
        else if((this.elemento=="tierra" && carta.elemento=="agua") || (carta.elemento=="tierra" && this.elemento=="agua")) {
            System.out.println("holi desde enfrentamiento 2");
            if(this.elemento=="tierra") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("holi 2");
                    carta.setAtk(nuevoataque);
                    return carta;
            }
            else if(carta.elemento=="tierra" ) {
                    System.out.println("holi 3");
                    int decremento=(int)(this.atk*0.2);
                    int nuevoataque = this.atk-decremento;
                    this.atk=nuevoataque;
                    return this;
            }
        }
        
        //enfrentamiento de fuego con aire(-)
        else if((this.elemento=="fuego" && carta.elemento=="aire") || (carta.elemento=="fuego" && this.elemento=="aire")) {
            System.out.println("holi desde enfrentamiento 3");
            if(this.elemento=="fuego") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("holi 2");
                    carta.setAtk(nuevoataque);
                    return carta;
            }
            else if(carta.elemento=="fuego" ) {
                    System.out.println("holi 3");
                    int decremento=(int)(this.atk*0.2);
                    int nuevoataque = this.atk-decremento;
                    this.atk=nuevoataque;
                    return this;
            }
        }
        
        //enfrentamiento de aire con tierra(-)
        else if((this.elemento=="aire" && carta.elemento=="tierra") || (carta.elemento=="aire" && this.elemento=="tierra")) {
            System.out.println("holi desde enfrentamiento 4");
            if(this.elemento=="aire") {
                    int decremento=(int)(carta.getAtk()*0.2);
                    int nuevoataque = carta.getAtk()-decremento;
                    System.out.println("holi 2");
                    carta.setAtk(nuevoataque);
                    return carta;
            }
            else if(carta.elemento=="aire" ) {
                    System.out.println("holi 3");
                    int decremento=(int)(this.atk*0.2);
                    int nuevoataque = this.atk-decremento;
                    this.atk=nuevoataque;
                    return this;
            }
        }
    return null;
    }
}//FIN CLASE
