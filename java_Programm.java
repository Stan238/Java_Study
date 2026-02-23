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
         
      
    }

}