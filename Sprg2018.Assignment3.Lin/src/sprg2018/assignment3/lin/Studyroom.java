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
public class Studyroom extends RoomDecorator{
    MyHome myhome;
    
    public Studyroom(MyHome myhome) {
        this.myhome = myhome;
    }
    
    public String describe() {
        return myhome.describe() + ", add one study room";
    }
    
    public int cost() {
        return 22000 + myhome.cost();
    }
    
    public int area() {
        return 210 + myhome.area();
    }    
}
