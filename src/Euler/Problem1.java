/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Euler;

/**
 *
 * @author Boobee
 */
public class Problem1 {
    
    
    public void solution(int finish){
        int sum = 0;
        for(int i =1 ;i<finish;i++){
            if(i%3 == 0|| i%5 == 0){
                sum = sum +i;
            }
        }
        System.out.println("total ="+sum);
    }
}
