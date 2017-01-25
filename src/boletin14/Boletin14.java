
package boletin14;

public class Boletin14 {

    
    public static void main(String[] args) {
        Conversor ct=new Conversor();
        try{
            ct.centigradosAFharenheit(79);
    
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.toString());
        }
        ct.centígradosAReamur(80);
        
    }
        
    }
    

