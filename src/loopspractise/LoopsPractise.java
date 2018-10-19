/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package loopspractise;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class LoopsPractise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner keyedInput = new Scanner(System.in);
        int  choose = 0;
       
        System.out.println(" chose between");
        System.out.println("2 counting from 1-10 by 1");
        System.out.println("3 counting from 10-100 by 10");
        System.out.println("4 counting from 100-1000 by 100");
        System.out.println("plese enter your choise");
        
        choose = keyedInput.nextInt();
        
        if (choose == 1 ){
            for(int i = 0 ;i <=10; i=i +1){
                System.out.println(i);
            }
        }
        if (choose == 2 ){
            for(int n = 10 ;n <=100; n=n +10){
                System.out.println(n);
            }
        }
    if (choose == 3 ){
            for(int n = 100 ;n <=1000; n=n +100){
                System.out.println(n);
            }
        }
    }
    
    
}
