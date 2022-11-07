import java.awt.*;

/**
 * Created by chales on 11/6/2017.
 */
public class Astronaut {

    //VARIABLE DECLARATION SECTION
    //Here's where you state which variables you are going to use.
    public String name;               //name of the hero
    public int xpos;                  //the x position
    public int ypos;                  //the y position
    public int dx;                    //the speed of the hero in the x direction
    public int dy;                    //the speed of the hero in the y direction
    public int width;                 //the width of the hero image
    public int height;                //the height of the hero image
    public boolean isAlive;           //a boolean to denote if the hero is alive or dead


    //This is a constructor that takes 3 parameters.
    // This allows us to specify the hero's name and position when we build it.
    public Astronaut(String pName, int pXpos, int pYpos) { // Astronaut constructor
        name = pName;
        xpos = pXpos;
        ypos = pYpos;
        dx = 3;
        dy = 0;
        width = 90;
        height = 90;
        isAlive = true;

 
    } // end Astronaut constructor

    // how do i make it go in another direction because when you add another method it doesnt work

    //The move method.  Everytime this is run (or "called") the hero's x position and y position change by dx and dy
    public void move() { // move
        xpos = xpos + dx;
        ypos = ypos + dy;
 
    } // end move

    public void bounce(){
        xpos = xpos + dx;
        ypos = ypos + dy;

        // if alien hits the right side, reverse dx direction
        if (xpos >= 1000- width){// right wall

            dx = -dx;
        }

        if (xpos <= 0){ //left wall
            dy = -dy;
        }

        if (ypos <= 0){// top wall
            dy = -dy;
        }
//        if (xpos <=0){ // bottom wall
//            dx = -dx;
//        }
    }

    public void wrap(){
        xpos = xpos + dx;
        ypos = ypos + dy;

        if (xpos >= 1000 && dx > 0){// right wall
            xpos = - width;
        }

        if (xpos <= -width && dx < 0){// left wall
            xpos = 1000;
        }

        if(ypos <= -height && dy < 0){// top wall
            ypos = 600;
        }

        if (ypos >= 600 && dy > 0){// bottom wall
            ypos = -height;
        }
    }
}






