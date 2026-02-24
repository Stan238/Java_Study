import java.util.Scanner;


public class java_Programm {



    public static void main(String[] args) {
        System.out.println("Hello world!!");

       String sentence = "Java programming is fun and educational" ;
       String searchWord = "fun";
       boolean containsWord = sentence.contains(searchWord);
         System.out.println("Does the sentence contain the word '" + searchWord + "'? " + containsWord);
       String newSentence = sentence.replace("educational", "awesome");
         System.out.println("Modified sentence: " + newSentence);
         System.out.println("Length of the original sentence: " + sentence.length());
        System.out.println((" Cut sentece 17 characters: " + sentence.substring(0,17)));

        System.out.println(sentence.toUpperCase());
         System.out.println(sentence.toLowerCase());
         System.out.println(searchWord.equals("fun"));

     Scanner keyboard = new Scanner(System.in);


     boolean isNumber= false;
     int age =0;
      
     do {
            try {
                
                age = keyboard.nextInt();
                isNumber= false;
                System.out.println("You entered: " + age);

                if (age >= 18) {
                    System.out.println("You are an adult.");
                    if(age >=65) {
                        System.out.println("You are allowed to get offer 20% discount");
                    }
                } else {
                    System.out.println("You are a declined. you are not allowed to buy alcohol.");
                }
                
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for age.");
                isNumber = true;
                e = null;
            } finally {
                keyboard.close();
            }

     } while (isNumber);

int x = 2;
switch (x) {
    case 2:
        System.out.print("A ");
        break;
    case 4:
        System.out.print("B ");
    case 12:
        System.out.print("C ");
    default:
        System.out.print("D ");
}



    }

}