/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author MOKLET-1
 */
public class MountainTruck extends Truck{
     //the Mountaintruck subclass adds onr field
    public int seatHeight;
    //the Mountaintruck sublclass has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
    super (startCadence, startSpeed, startGear);
    seatHeight = startHeight;
}
    //the mountaintruck subclass adds one method
    public void setheight(int newValue){
        seatHeight = newValue;
    }
    public static void main (String[]aku){
        System.out.println("Mulai Berjalan");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+ MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        
        System.out.println("gear = "+MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
