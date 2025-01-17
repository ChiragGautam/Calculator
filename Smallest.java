public class Smallest {
    public static void main(String[] args) {
        // Parsing input arguments into integers
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        // Checking which number is the smallest
        if(num1 < num2 && num1 < num3) {
            System.out.println("num1 is the smallest");
        } 
        else if(num2 < num1 && num2 < num3) {
            System.out.println("num2 is the smallest");
        } 
        else {
            System.out.println("num3 is the smallest");
        }
    }
}
