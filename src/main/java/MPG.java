
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 0778430
 */
public class MPG {

    public static void main(String[] args) {

        // get milles driven double
        // et gallons of gas double
        // set a MGP variable as double
        //MPG = milles/Gallons of gass used 
        //display the MPG variable to screen
        System.out.println("this is MPG program");
        Scanner keyboard = new Scanner(System.in);
        double gallonsOfGas = keyboard.nextDouble();
        double millesDriven = keyboard.nextDouble();
        double millesPerGallon = keyboard.nextDouble();
    }
}
