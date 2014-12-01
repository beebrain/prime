/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Boobee
 */
public class FindPrime {

    public int finish;
    public LinkedList allprime;


    public FindPrime(int finish) {
        this.finish = finish;
        this.allprime = new LinkedList();
        allprime.add(new Integer(2));
    }

    public void startfindPrime() {
        for (int i = 2; i < this.finish; i++) {
            for (int j = 0; j < allprime.size(); j++) {
                Integer primenumber = (Integer) allprime.get(j);
                if (primenumber.intValue() >= Math.sqrt(i) && i % primenumber.intValue() != 0) {
                    /////////////// is prime //////////////
                    allprime.add(new Integer(i));
                    break;
                }else if(i % primenumber.intValue() == 0){
                    break;
                }
            }
        }
    }
    
    public void printAll(){
        int i = 1;
        long sum = 0;
        for (Iterator it = allprime.iterator(); it.hasNext();) {
            Integer object = (Integer)it.next();
            sum = sum + object.longValue();
            System.out.println(i+":"+sum);
            i++;
        }
    }

}
