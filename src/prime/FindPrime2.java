/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author Boobee
 */
public class FindPrime2 {

    public int finish;
    public int prime[];

    public FindPrime2(int finish) {
        this.finish = finish;
        this.prime = new int[finish];
    }

    public void findAllPrime() {
        for (int i = 0; i < this.finish; i++) {
            prime[i] = i + 2;
        }
        int divide = 0;
        for (int j = 0; j < prime.length; j++) {
            if(prime[j] != 0){
                divide = prime[j];
            }else{
                continue;
            }
            for (int i = j + 1; i < prime.length; i++) {
                if (prime[i] != 0) {
                    if (prime[i] % divide == 0) {
                        prime[i] = 0;
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public void printAll() {
        for (int j = 0; j < prime.length; j++) {
                if (prime[j] != 0) {
                    System.out.println(prime[j]);
                } else {
                    continue;
                }
        }
    }
}
