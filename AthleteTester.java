//Athlete Tester
//Harish Viswa
//09.16.20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class AthleteTester{
   public static void main(String[] args){

//setting environment for athlete
      Display.openWorld("");
      Display.setSize(10,10);
      Display.setSpeed(1);
//default athlete
      Athlete lebron = new Athlete();
      
      lebron.turnRight();
      for (int i=0; i<3; i++) {
         lebron.move();
      }
      lebron.turnRight();
//athlete created using 4 paramater constructor
      Athlete bronny = new Athlete(3,2,Display.NORTH,0);
      bronny.turnRight();
      for (int i=0; i<2; i++) {
         bronny.move();
      }
      bronny.turnAround();
      
      }
      
      
}