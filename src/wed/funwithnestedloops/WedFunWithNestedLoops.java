package wed.funwithnestedloops;

/**
 *
 * @author john
 */
public class WedFunWithNestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int LENGTH = 4;
        for (int i = 0; i <= LENGTH; i++) {
            for (int j = 0; j <= LENGTH; j++) {
                if (i % LENGTH == 0 || j % LENGTH == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    /*
    
    *       *****   *           *****       *****     **      **  
    **      *   *   **         *****       *   *     ****    *  * 
    ***     *   *   * *       *****       *   *     ******  *    *
    ****    *   *   *  *     *****       *   *       ****    *  * 
    *****   *****   *****   *****       *****         **      **  
    
    */

}
