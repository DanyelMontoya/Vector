

package vectorvv;
import javax.swing.*;

public class ClaseVectorVV {
    public void Hacer() {
        int longitud;
        int f=0;
        int g=0;
        int dato;
        longitud=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la longitud del vector"));
        int [] vector1 = new int[longitud];
        int [] vector2 = new int[longitud];
        
          while(f<longitud || g<longitud )
        {
        dato = Integer.parseInt(JOptionPane.showInputDialog("Señor usuario digite un numero por favor"));
        
        if(dato < 20 && f < longitud){
                   int numero = 0;
                    vector1[numero]= dato ;
                    f ++;
                
    		
                    System.out.println("El numero : " + vector1[numero] + " se almaceno en el vector 1 ," + " en la posicion " + f );
                    if(f == longitud){
                System.out.println("El vector 1 esta lleno");
                }
                    
              }
        else if(dato > 20 && g < longitud){
                    int numero2 = 0;
                    vector2[numero2]= dato ;
                    g ++;
                
    		System.out.println("El numero : " + vector2[numero2]+ " se almaceno en el vector 2 , " + " en la posicion " + g );
                   if(g == longitud){
                System.out.println("El vector 2 esta lleno");
                }
		}
        
    }
    }
}
