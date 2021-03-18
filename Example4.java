package Task3;

public class Example4 {
    public static void main (String[] args) {
        String str = "Java is cool!";
        System.out.println(str.length());       // return int 13
        System.out.println(str.charAt(2));      // return char 'v'
        System.out.println(str.charAt(5));      // return char 'i'
        
        // Comparing two Strings
        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));           // return boolean false
        System.out.println(str.equalsIgnoreCase(anotherStr)); // return boolean true
        System.out.println(anotherStr.equals(str));           // return boolean false
        System.out.println(anotherStr.equalsIgnoreCase(str)); // return boolean true
        // (str == anotherStr) to compare two Strings is WRONG!!!
    }
}
