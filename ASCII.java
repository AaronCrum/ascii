/*
* Description: A program that prints the value of a given ASCII character
*/

public class ASCII {

    public static void main(String[] args) {

        char ch = 'a';
        int ascii = ch;
        int castAscii = (int) ch;

        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
