/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * @author klinton
 */
public class Arrays {

   
    public static void main(String[] args) {
       {
        int [] K = {3, 5, 4, 1};
        int N = K.length + 1;
        int sum = (N * (N + 1)) / 2;
        
    for (int i = 0; i < K.length; i++) {
        sum = sum - K[i];
    }     
    
    System.out.println("The missing number is "+ sum);
    }
       
    }
    
}
