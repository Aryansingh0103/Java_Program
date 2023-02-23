import java.io.*;

class Evenodd {
    public static void main(String ar[]) throws IOException {
        DataInputStream obj = new DataInputStream(System.in);
        System.out.println("enter number to check if it is odd or not");
        int x = Integer.parseInt(obj.readLine());
        if (x % 2 != 0)
            System.out.println("it is odd no");
        else
            System.out.println("its not odd");

    }
}