/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addwordtotext;

/**
 *
 * @author Abdualrahman-AAE
 */
public class AddWordToText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(sayHiBye("ahmed",0));
    
    }
    public static String sayHiBye(String name, int num) {
	// write your code here
        String result;
        String hi="Hi ";
        String bye="Bye ";
        if(num==1){
          result=hi+name;
        }else 
            result=bye+name;
        
        
        return result;
}
}
