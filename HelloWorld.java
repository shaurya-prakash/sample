import java.util.Scanner;

   public class HelloWorld {
      public static void main(String[] args){
      
      Scanner scnr = new Scanner(System.in);
      
      double distRatio1, distRatio2, distance1, distance2, dist1, dist2, fdist1, fdist2, finalDist1, finalDist2 = 0; 
      
      System.out.println("Enter the mass of the larger celestial body (kg):"); 
      double Mass1 = scnr.nextDouble();
      System.out.println("Enter the mass of the smaller celestial body (kg):"); 
      double Mass2 = scnr.nextDouble();
      System.out.println("Enter the distance between the two celestial bodies (km):"); 
      double distBodies = scnr.nextDouble();
      distRatio1 = Mass1 / (Mass1 + Mass2);
      distRatio2 = Mass2 / (Mass1 + Mass2);
      distance1 = distRatio1 * distBodies;
      distance2 = distRatio2 * distBodies;
      dist1 = (Math.sqrt(distance1));
      dist2 = (Math.sqrt(distance2));
      fdist1 = (dist1) / (dist1 + dist2);
      fdist2 = (dist2) / (dist1 + dist2);
      finalDist1 = fdist1 * distBodies;
      finalDist2 = fdist2 * distBodies;
      System.out.println("A spaceship between the two celestial bodies will experience an equal ");
      System.out.println("gravitational pull from each body when it is " + finalDist1 + " km");
      System.out.println("from the larger body and " + finalDist2 + " km from the smaller body.");
      
      return;
   }
}