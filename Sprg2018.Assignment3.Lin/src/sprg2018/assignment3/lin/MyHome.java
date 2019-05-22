/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment3.lin;

/**
 *
 * @author Lu Lin
 */
public abstract class MyHome {
    String description = "";
    
    public String describe() {
        return description;
    }
    
    public abstract int cost();
    
    public abstract int area();
    
    public void display() {
            System.out.println(describe() + ", the area is " + area() + " square feet" +
                ", the cost is $" + cost());
    }
}
