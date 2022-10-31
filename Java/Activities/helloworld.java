public class helloworld {
public static void main (String[] args) {
   // System.out.println("Hi bro");
String name = "Abishek";
    //System.out.println(name);

    name = "Chandra";
    System.out.println(name);
    String [] carMake = {"BMW","AUDI","TOYOTA","SUZUKI","HONDA"};

    // Calling Print_Array method and passing carMake as a parameter

    int iLength = carMake.length-1;
    System.out.println("Length of the Array is: " + iLength);
    String hi = carMake[iLength-1];
    System.out.println("Length of the Array is: " + hi);
}
}
