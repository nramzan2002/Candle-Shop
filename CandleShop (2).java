import java.util.Scanner;

public class CandleShop {

    public static void main(String[] args) {

        System.out.println("*******************************");
        System.out.println("Project 3");
        System.out.println("*******************************");
        
        //declare new scanner and ask user for the name, type, price, and burn time of your first candle 
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the first candle please: ");
        String CandleName1 = scan.nextLine();
        System.out.println("Enter the type of the first candle please: ");
        int CandleType1 = scan.nextInt();
        System.out.println("Enter the price of the first candle please: " );
        double CandleCost1 = scan.nextDouble();
        System.out.println("Enter the burn time of this first candle please: ");
        int CandleburnTime1 = scan.nextInt();
        scan.nextLine();

        //Ask user for the name, type, price, and burn time of your second candle 
        System.out.println("Enter the name of the second candle please: ");
        String CandleName2 = scan.nextLine();
        System.out.println("Enter the type of the second candle please: ");
        int CandleType2 = scan.nextInt();
        System.out.println("Enter the price of the second candle please: " );
        double CandleCost2 = scan.nextDouble();
        System.out.println("Enter the burn time of this second candle please: ");
        int CandleburnTime2 = scan.nextInt();
        scan.nextLine();

        //Ask user for the name, type, price, and burn time of your third candle 
        System.out.println("Enter the name of the third candle please: ");
        String CandleName3 = scan.nextLine();
        System.out.println("Enter the type of the third candle please: ");
        int CandleType3 = scan.nextInt();
        System.out.println("Enter the price of the third candle please: " );
        double CandleCost3 = scan.nextDouble();
        System.out.println("Enter the burn time of this third candle please: ");
        int CandleburnTime3 = scan.nextInt();
        
        //create new candle object for each candle, inputted above 
        Candle candle1 = new Candle(CandleName1, CandleType1, CandleCost1, CandleburnTime1);
        Candle candle2 = new Candle(CandleName2, CandleType2, CandleCost2, CandleburnTime2);
        Candle candle3 = new Candle(CandleName3, CandleType3, CandleCost3, CandleburnTime3);

        //ask your user how many of each candle type they would like 
        System.out.println("How many of the first candle would you like to purchase?");
        int numberOfCandle1 = scan.nextInt();
        System.out.println("How many of the second candle would you like to purchase?");
        int numberOfCandle2 = scan.nextInt();
        System.out.println("How many of the third candle would you like to purchase?");
        int numberOfCandle3 = scan.nextInt();

        //print out the amount the user ordered and the explanation 
        System.out.println(candle1);
        System.out.println("You ordered " + numberOfCandle1 + " " + candle1.getName() + "s.");
        System.out.println(candle2);
        System.out.println("You ordered " + numberOfCandle2 + " " + candle2.getName() + "s.");
        System.out.println(candle3);
        System.out.println("You ordered " + numberOfCandle3 + " " + candle3.getName() + "s.");

        //calculate the total price for all candles purchased 
        double wholePrice = (numberOfCandle1)*(candle1.getCost()) + (numberOfCandle2)*(candle2.getCost())+ (numberOfCandle3)*(candle3.getCost());
        //print the total as a decimal 
        System.out.print("Your total for today is " + wholePrice + ".");
        System.out.println();

        //declare a variable for the discount 
        double discount = 0.0;
        //using if statements, calculate your price after the discount 
        if(wholePrice > 20.00 && wholePrice < 35.00){
            discount = wholePrice - (wholePrice * .05);
        }
        else if(wholePrice > 35.00 && wholePrice < 55.00){
            discount = wholePrice - (wholePrice * .07);
        }
        else if(wholePrice > 55.00 && wholePrice < 100.00){
            discount = wholePrice - (wholePrice * .10);
        }
        else if(wholePrice > 100.00){
            discount = wholePrice - (wholePrice * .20);
        }
        else{
            discount = wholePrice;
        }
        
        //print out the discount price 
        System.out.print("Your discount price is " + discount + ".");
        System.out.println();

        //calculate the total burn time in minutes 
        int totalBurnTime = (numberOfCandle1) * (candle1.getTime()) + (numberOfCandle2) * (candle2.getTime()) + (numberOfCandle3) * (candle3.getTime());
        System.out.println("The total burn time is " + totalBurnTime + " minutes.");

        //calculate the total cost per minute for that purchase with discounted price and burn time
        double costPerMin = discount / totalBurnTime;

        //print out the total cost per minute 
        System.out.println("The total cost per minute is " + costPerMin + ".");
        System.out.println();
        
        //declare histograms of number purchased 
        String candle1Histo = "";
        String candle2Histo = "";
        String candle3Histo = "";

        //declare for loops with each histogram of number of candles bought 
        for(int w = 1; w <= numberOfCandle1; w++){
            candle1Histo = candle1Histo + "#";
        }
        for(int w = 1; w <= numberOfCandle2; w++){
            candle2Histo = candle2Histo + "@";
        }
        for(int w = 1; w <= numberOfCandle3; w++){
            candle3Histo = candle3Histo + "+";
        }

        //print out your histograms for each candle and ending message 
        System.out.println("Histogram for number you purchased: ");
        System.out.println(numberOfCandle1 + " type 1 " + candle1.getName() + " candles: " + candle1Histo);
        System.out.println(numberOfCandle2 + " type 2 " + candle2.getName() + " candles: " + candle2Histo);
        System.out.println(numberOfCandle3 + " type 3 " + candle3.getName() + " candles: " + candle3Histo);
        System.out.println("Thank you for shopping with us today!");
        System.out.println("Have a great day!");

        
    }//end main
}// end class
