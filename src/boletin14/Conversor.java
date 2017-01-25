
package boletin14;


public class Conversor {
    final float Temperatura=80;
    float fahrenheit;
    
    
    
    public void centigradosAFharenheit(float centigrados) throws TemperaturaErradaExcepcion{
       fahrenheit= (float) (1.8 * centigrados + 32.4);
         if(centigrados<Temperatura)
             throw new TemperaturaErradaExcepcion();
         else
             System.out.println("Solución fahrenheit: "+fahrenheit);
                      
             
      
    } 
    public void centígradosAReamur(float centigrados){
        double reamur=(float) (4.0 / 5.0 * centigrados);
        System.out.println("Solucion reamur: "+reamur); 
        
    }

    void centígradosAReamur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    
    
    

