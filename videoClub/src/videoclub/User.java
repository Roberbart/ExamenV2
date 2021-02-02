/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

/**
 *
 * @author MSI
 */
public class User {
    private String name;
    private static long id = 0;
    
    public User(){
        this.name = "Default";
        this.id = id;
        id++;
    }

    public String getName() {
        return name;
    }
    
}
