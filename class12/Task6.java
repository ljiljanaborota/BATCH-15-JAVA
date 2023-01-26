package class12;

public class Task6 {
   /*
    Create 2D array of countries: north america countries, south america countries,
    europe countries, asian countries, african countries.
    Then print all values from that array using 2 different loops and calculate
    how many total countries been stored
    */
   public static void main(String[] args) {
       String[][] countries = {{"usa", "canada", "mexico"},
               {"brazil", "argentina", "peru", "columbia", "chile"},
               {"germany", "united", "kingdom", "france", "spain"},
               {"china", "india", "japan", "russia"},
               {"egypt", "nigeria", "south africa", "ethiopia"}
       };
       int counter=0; // using enhanced for loops
       for (String[] country : countries) {
           for (String s : country) {
               System.out.print(s + " ");
               counter++;

           }
           System.out.println();
       }

       System.out.println("total countries "+counter);
       }
   }






