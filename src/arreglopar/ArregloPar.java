/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglopar;

/**
 *
 * @author ENTRAR
 */
public class ArregloPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrag1 = {1, 2, 30, 2};
        int[] arrag2 = {1, 2, 30, 1};
        int [] temp= comparArrg(arrag1, arrag2);
        int [] t=new int[3];
        for (int i = 0; i < 4; i++) {
            System.out.println(temp[i]);
            
        }
        
        // TODO code application logic here
    }
    
    private static int[] comparArrg(int[] arrag1, int[] arrag2) {
        int count = 0;
        int[] tem = new int[arrag1.length];
        aux(count, tem, arrag1, arrag2);
        return tem;
    }
    
    private static void aux(int count, int[] tem, int[] arrag1, int[] arrag2) {
        if (count == tem.length) {
            return;
        } else {
            int numero = arrag1[count] + arrag2[count];
            if (numero % 2 == 0) {
                tem[count] = numero;
                count++;
                 aux(count, tem, arrag1, arrag2);
            } else {
                tem[count] = 0;
                count++;
                 aux(count, tem, arrag1, arrag2);
            }
        }
    }
}
