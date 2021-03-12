//Athlete Class
//Harish Viswa
//09.16.20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Athlete extends Robot {

//Athlete's default constructor at (1,1) facing NORTH with 0 beepers
   public Athlete (){
      super(1,1,Display.NORTH, Display.INFINITY);
   }
//4 parameter constructor for Athlete
   public Athlete(int x, int y, int direction, int beepers) {
      super(x,y,direction,beepers);
   }
//Athlete turnRight method created using existing turnLeft method
   public void turnRight(){
      turnLeft();
      turnLeft();
      turnLeft();
   }
//Athlete turnAround method using existing turnLeft method
   public void turnAround(){
      turnLeft();
      turnLeft();
   }
}