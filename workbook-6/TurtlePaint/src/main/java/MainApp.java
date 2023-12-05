import java.awt.*;

public class MainApp
{
    public static void main(String[] args)
    {
        // This starter code to get you familiar with how
        // the TurtleLogo application works

        // The world is your canvas
        World world = new World(200, 200);
        Turtle turtle = new Turtle(world,-50, -50);
        
        int width = 200;
        int height = 200;

        // calculate the hypotenuse (diagonal)
        // a2 + b2 = c2
        double widthSquared = Math.pow(width, 2);
        double heightSquared = Math.pow(height, 2);
        double hypotenuse = Math.sqrt(widthSquared + heightSquared);


        // X
/*        turtle.setPenWidth(3);
        turtle.setColor(Color.GREEN);

        turtle.turnRight(45);
        turtle.forward(hypotenuse);

        turtle.penUp();
        turtle.goTo(100, 100);
        turtle.turnRight(90);

        turtle.penDown();
        turtle.forward(hypotenuse);*/

        // First Initial (J)
/*        turtle.setPenWidth(5);
        turtle.setColor(Color.blue);

        turtle.forward(80);
        turtle.turnRight(90);

        turtle.forward(30);
        turtle.turnRight(90);
        turtle.forward(30);

        turtle.turnLeft(90);
        turtle.forward(100);

        turtle.turnRight(90);
        turtle.forward(45);

        turtle.turnRight(90);
        turtle.forward(30);

        turtle.turnRight(90);
        turtle.forward(20);

        turtle.turnLeft(90);
        turtle.forward(70);

        turtle.turnLeft(90);
        turtle.forward(30);

        turtle.turnRight(90);
        turtle.forward(30);*/

        // Square
        turtle.setPenWidth(3);
        turtle.setColor(Color.pink);
        for(int i = 0; i < 4; i++){
            turtle.forward(100);
            turtle.turnRight(90);
        }

        //world.saveAs("square.PNG");
    }
}
