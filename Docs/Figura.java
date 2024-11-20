
package co.edu.udec.s2.taller13.Docs;

/**
 *
 * @author JESUS DAVID
 */
public abstract class Figura {
    
   public abstract double calcularArea ();
    
    public void mostrarFigura(){
        
        System.out.println("Mostrar la figura");
        
    }
    
    public class Circulo  extends Figura{
        
        double radio;
        
        public Circulo(double radio){
            
            this.radio = radio;
            
        }
        
        
        @Override
        
        public double calcularArea(){
            
           return Math.PI * radio * radio radio;

           
            
        }
     
         public class Rectangulo extends Figura {
            
            double ancho;
            double alto;
            
            public Rectangulo (double ancho , double alto){

            }
            
              @Override
              
              public double calcularArea() {
                  
                  return ancho * alto;
                  
              }
            
              
              
              
              
        }
        
        
         
         public class ClasePrueba{
             
             public static void main(String[] args) {
                 
             }
             
         }
        
        
    }
    
    
    
}


