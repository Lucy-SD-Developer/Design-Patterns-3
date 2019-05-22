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
public class WalkinCloset extends RoomDecorator{
    MyHome myhome;
    
    public WalkinCloset(MyHome myhome) {
        this.myhome = myhome;
    }
    
    public String describe() {
        return myhome.describe() + ", add one walk-in closet";
    }
    
    public int cost() {
        return 4000 + myhome.cost();
    }
    
    public int area() {
        return 56 + myhome.area();
    }    
}
