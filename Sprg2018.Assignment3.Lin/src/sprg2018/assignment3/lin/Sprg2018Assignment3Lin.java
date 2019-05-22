/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprg2018.assignment3.lin;

import java.util.Scanner;

/**
 *
 * @author Lu Lin
 */
public class Sprg2018Assignment3Lin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("The most basic home is one living room only.");
        MyHome home = new BasicHome();
        home.display();
 
        System.out.println("Enter what to add: ");
        while (sc.hasNext()) {
            String _input = sc.nextLine();
            if (_input.equalsIgnoreCase("bedroom")) {
                home = new Bedroom(home);
                home.display();
            }
            if (_input.equalsIgnoreCase("bathroom")) {
                home = new Bathroom(home);
                home.display();
            }
            if (_input.equalsIgnoreCase("livingroom")) {
                home = new Livingroom(home);
                home.display();
            }
            if (_input.equalsIgnoreCase("studyroom")) {
                home = new Studyroom(home);
                home.display();
            }
            if (_input.equalsIgnoreCase("kitchen")) {
                home = new Kitchen(home);
                home.display();
            }
            if (_input.equalsIgnoreCase("closet")) {
                home = new WalkinCloset(home);
                home.display();
            }
        }

    }
    
}
