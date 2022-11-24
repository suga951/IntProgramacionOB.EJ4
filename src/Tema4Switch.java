public class Tema4Switch {
    public static void main(String[] args) {
         String season = "Winter";

         switch (season){
             case "Summer":
                 System.out.println("The current season is: Summer.");
                 break;

             case "Autumn":
                 System.out.println("The current season is: Autumn.");
                 break;

             case "Winter":
                 System.out.println("The current season is: Winter.");
                 break;

             case "Spring":
                 System.out.println("The current season is: Spring");
                 break;

             default:
                 System.out.println("Incorrect value.");
         }
    }
}

