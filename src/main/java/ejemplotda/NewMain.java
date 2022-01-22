
package ejemplotda;

/**
 *
 * @author Andrea Erazo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TDAesfera esfera= new TDAesfera(3);
        System.out.println("Radio: "+ esfera.getRadio());
        System.out.println("Diametro: "+ esfera.getDiametro());
        System.out.println("Circunferencia: "+ esfera.getCircunferencia());
        System.out.println("Area: "+ esfera.getArea());
        System.out.println("Volumen: "+ esfera.getVolumen());
    }
    
}
