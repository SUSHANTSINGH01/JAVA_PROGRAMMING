public class Main {
    public static void main(String[] args) {
        
        // String, StringBuffer and StringBuilder Example
         String str = "Hello";
        //StringBuffer str = new StringBuffer("Hello");
        //StringBuilder str = new StringBuilder("Hello");
        System.out.println("Original String: " + str);

        // Length
        System.out.println("Length: " + str.length());

        // Character at index
        System.out.println("Character at index 1: " + str.charAt(1));

        // Substring
        System.out.println("Substring (1, 3): " + str.substring(1, 3));

        // Index of character (works only for String)
        System.out.println("Index of 'l': " + str.indexOf('l'));

        // Concat (works only for String)
        String newStr = str.concat(" World");
        System.out.println("Concatenated String: " + newStr);

        // Replace ()  (works only for String)
        String replacedStr = str.replace('l', 'p');
        System.out.println("Replaced String: " + replacedStr);

        // StringBuffer Example
        StringBuffer sbf = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + sbf);

        // Length
        System.out.println("Length: " + sbf.length());

        // Character at index
        System.out.println("Character at index 1: " + sbf.charAt(1));

        // Substring
        System.out.println("Substring (1, 3): " + sbf.substring(1, 3));

        // Index of character
        System.out.println("Index of 'l': " + sbf.indexOf("l"));

        // Append
        sbf.append(" World");
        System.out.println("Appended StringBuffer: " + sbf);

        // Replace
        sbf.replace(1, 3, "xx");
        System.out.println("Replaced StringBuffer: " + sbf);

        // Insert
        sbf.insert(1, "ABC");
        System.out.println("Inserted StringBuffer: " + sbf);

        // Delete
        sbf.delete(1, 4);
        System.out.println("Deleted StringBuffer: " + sbf);

        // Reverse
        sbf.reverse();
        System.out.println("Reversed StringBuffer: " + sbf);

        // StringBuilder Example
        StringBuilder sbd = new StringBuilder("Hello");
        System.out.println("\nOriginal StringBuilder: " + sbd);

        // Length
        System.out.println("Length: " + sbd.length());

        // Character at index
        System.out.println("Character at index 1: " + sbd.charAt(1));

        // Substring
        System.out.println("Substring (1, 3): " + sbd.substring(1, 3));

        // Index of character
        System.out.println("Index of 'l': " + sbd.indexOf("l"));

        // Append
        sbd.append(" World");
        System.out.println("Appended StringBuilder: " + sbd);

        // Replace
        sbd.replace(1, 3, "xx");
        System.out.println("Replaced StringBuilder: " + sbd);

        // Insert
        sbd.insert(1, "ABC");
        System.out.println("Inserted StringBuilder: " + sbd);

        // Delete
        sbd.delete(1, 4);
        System.out.println("Deleted StringBuilder: " + sbd);

        // Reverse
        sbd.reverse();
        System.out.println("Reversed StringBuilder: " + sbd);
    }
}
