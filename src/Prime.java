
import Euler.Problem1;
import prime.FindPrime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Boobee
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FindPrime a  = new FindPrime(2000000);
        a.startfindPrime();
        a.printAll();
    }

}
