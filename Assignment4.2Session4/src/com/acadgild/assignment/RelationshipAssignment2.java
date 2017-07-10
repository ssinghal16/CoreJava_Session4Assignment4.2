/*Write a program in java to show the difference between is-a relationship and has-a relationship and also show which
one is better. 
*/

package com.acadgild.assignment; //package declaration 

class Car {  
    // Methods implementation and class/Instance members  
    private String color;  
    private int maxSpeed;   
    public void carInfo(){  
        System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);  
    }  
    public void setColor(String color) {  
        this.color = color;  
    }  
    public void setMaxSpeed(int maxSpeed) {  
        this.maxSpeed = maxSpeed;  
    }  
} 

class Maruti extends Car{  
    /*Maruti extends Car and thus inherits all methods from Car (except final and static)  
    Maruti can also define all its specific functionality  
	Means Maruti IS-A Car.
	*/
    public void MarutiStartDemo(){  
        Engine MarutiEngine = new Engine();  
        MarutiEngine.start();  
        }  
    }

/*Maruti class uses Engine object’s start() method via composition.
We can say that Maruti class HAS-A Engine.
*/
class Engine {  
    public void start(){  
        System.out.println("Engine Started");  
    }  
    public void stop(){  
        System.out.println("Engine Stopped");  
    }  
} 
public class RelationshipAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maruti myMaruti = new Maruti();  
        myMaruti.setColor("RED");  
        myMaruti.setMaxSpeed(180);  
        myMaruti.carInfo();  
        myMaruti.MarutiStartDemo();
	}

}
