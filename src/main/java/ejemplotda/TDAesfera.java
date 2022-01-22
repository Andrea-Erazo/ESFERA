
package ejemplotda;

/**
 *
 * @author Andrea Erazo
 */
public class TDAesfera {
    private double radio;
    
    public TDAesfera(double radioInicial){
        if(radioInicial>0){
            this. radio=radioInicial;
            
        }else{
            this.radio=0.0;
        }
        
    }
    public double getRadio(){
        return this.radio;
    }
    public double getDiametro(){
        return (radio*2);
    }
    public double getCircunferencia(){
        return (Math.PI*getDiametro());
    }
    public double getArea(){
        return (4*Math.PI*radio*radio);
    }
    public double getVolumen(){
        return (4*Math.pow(radio,3))/3;
    }
}
