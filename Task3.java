/**
 * Task3
 * Class name Task3:
 * Change the variables in the first section, so that each if statement resolves as true.
 */
public class Task3 {
    public static void main(String[] args) {
    
    String a = new String("Wow");
    String b = a;                       // changed the value "Wow" to a
    String c = a + "!";                 // add string value "!"
    String d = c;

    boolean b1 = a == b;                // == used to check if the two variable point the same memory / contaiiner address  
    boolean b2 = d.equals(b + "!");     // .equals used to check if the text contents match
    boolean b3 = !c.equals(a);          // ! used to revert the results. Ex. result is TRUE, with ! (NOT) operator, it will turn into FALSE as final Results.

      if (b1 && b2 && b3){
        System.out.println("Success!");
      }
    }
}