// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
g.drawLine(150,125,150,225);
g.drawLine(150,225,200,275);
g.drawLine(200,275,200,175);
g.drawLine(200,175,150,125);
g.drawLine(150,125,250,125);
g.drawLine(250,125,250,225);
g.drawLine(250,225,150,225);
g.drawLine(250,125,300,175);
g.drawLine(300,175,200,175);
g.drawLine(300,175,300,275);
g.drawLine(300,275,200,275);
g.drawLine(250,225,300,275);

// DRAW SPHERE
g.drawOval(450,125,150,150);
g.drawOval(515,125,25,150);
g.drawOval(490,125,75,150);
g.drawOval(465,125,125,150);
g.drawOval(450,187,150,25);
g.drawOval(450,170,150,60);
g.drawOval(450,153,150,95);



        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER
g.fillArc(200,350,100,100,135,-270);
g.fillArc(400,500,100,100,45,270);
g.fillArc(250,275,100,100,45,-270);
g.fillArc()


    }

}


