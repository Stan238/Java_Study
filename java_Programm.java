public class java_Programm {

    public static void main(String[] args) {
        System.out.println("Hello world!!");

        String make = "Ford";
        String model = "Mustang";
        int year = 2024;
        double mileage = 15002.5;
        Boolean isAutomatic = true;
        
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Car Mileage: " + mileage + " miles");
        System.out.println("Is the car automatic: " + isAutomatic);
         double amountInUSD = 100.0; 
double exchangeRateUSDToEUR = 0.85; 
System.out.println("Initial amount: "+ amountInUSD +" USD" );
double amountEUR = amountInUSD * exchangeRateUSDToEUR;
System.out.println("the amount in EUR after conversion " + amountEUR +" EUR" );
amountEUR -= 55;
System.out.println("the amount in EUR after deduct " + amountEUR +" EUR" );
amountInUSD = amountEUR / exchangeRateUSDToEUR;
 System.out.printf("Amount in USD after converting back: $%.2f", amountInUSD);
    }

}