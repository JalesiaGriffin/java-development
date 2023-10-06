package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        //Question 1: Determine who has the greater salary
            //Variables
                int bobSalary = 65000;
                int garySalary = 350000;
            //Solution
                int highestSalary = Math.max(bobSalary, garySalary);
                System.out.println("The highest salary is " + highestSalary);

        //Question 2: Find and display the smallest of two variables
            //Variables
                int carPrice = 23000;
                int truckPrice = 45000;
            //Solution
                int smallestPrice = Math.min(carPrice, truckPrice);
                System.out.println("The smallest price is " + smallestPrice);

        //Question 3: Find and display the area of a circle whose radius is 7.25
            //Variables
                double radius = 7.25;
            //Solution
                double circleArea = Math.PI * Math.pow(radius, 3);
                System.out.println("The area is " + circleArea);

        //Question 4: Find and display the square root of a variable after is is set to 5.0
            //Variables
                double var1 = 5.0;
            //Solution
                double squareRoot = Math.sqrt(var1);
                System.out.println("The square root is " + squareRoot);

        //Question 5: Find and display the distance between the points (5,10) and (85,50)
            //Solution
                double distance = Math.hypot(5-85, 10-50); //Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1))
                System.out.println("The distance is " + distance);

        //Question 6: Find and display the absolute (positive) value of a variable after it is set to -3.8
            //Variable
                double var2 = -3.8;
            //Solution
                double absoluteVal = Math.abs(var2);
                System.out.println("The absolute value is " + absoluteVal);

        //Question 7: Find and display a random number between 0 and 1
            //Solution
                double ranNum = Math.random();
                System.out.println("The random number is " + ranNum);
    }
}
