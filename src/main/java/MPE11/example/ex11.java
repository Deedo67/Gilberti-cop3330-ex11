package MPE11.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex11 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("How many euros are you exchanging? ");
        String streuro = in.nextLine();
        System.out.print("What is the exchange rate? ");
        String strrate = in.nextLine();

        //string conversion
        double euro = Double.parseDouble(streuro);
        double rate = Double.parseDouble(strrate);

        //math
        double dollar = rate * euro;

        //output string
        String outputString = String.format("%.2f", euro)+" euros at an exchange rate of "+String.format("%.4f", rate)+" is\n"+String.format("%.2f", dollar)+" U.S. dollars.";

        //Output
        System.out.println(outputString);
    }
}
