
package ejer2;

import javax.swing.JOptionPane;

//binomio 
public class Ejer2uno {

    
    public static void main(String[] args) {
        
        int n,aux=1;
        int m,aux_1=1;
        int p,aux_2=1;
        int x;
        
    m=Integer.parseInt(JOptionPane.showInputDialog("Digite el 1er numero convinatorio: "));
        for(int i=1;i<=m;i++){
            aux_1*=i;
        }
        
    n=Integer.parseInt(JOptionPane.showInputDialog("Digite el 2do numero convinatorio: "));
        for(int i=1;i<=n;i++){
            aux*=i;
        }
    
     p=m-n;
     for(int i=1;i<=p;i++){
         aux_2*=i;
     }
     x=(aux_1)/(aux*aux_2);
        JOptionPane.showMessageDialog(null, "El cobinatorio de "+m+" en "+n+" es: "+x);
        
          
    }
    
}
