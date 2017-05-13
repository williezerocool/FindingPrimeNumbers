/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findingprimenumbers;

/**
 *
 * @author kendrabooker
 */
public class FindingPrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 2; i <= 20; i++){
        
            if(isPrime(i)){
            
                System.out.println(i +"<");
            }else if(!isPrime(i)){
            
                System.out.println(i);
            }
            
        }
    }
    
    public static boolean isPrime( int n ){
    
        for(int i =2; i <= n; i++){
        
            if(n % 2 == 0){
            
                return false;
                
            }
        }
        return true;
    }
    
    
}
