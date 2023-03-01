/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githutest;

/**
 *
 * @author ephraim
 */
public class GithuTest {

    static Student studi= new Student();
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name="Ephraim";
        String Surname="Nobela";
        
        
        studi.setName(name);
        studi.setSname(Surname);
        
        System.out.println(" Your name is " + studi.getName());
        System.out.println(" Your name is " + studi.getSname());
    }
    
}
