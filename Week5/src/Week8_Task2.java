import java.io.FileNotFoundException;
import java.io.FileReader;

public class Week8_Task2 {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e){
            System.out.println("lỗi null Pointer");
        }
        int []arr = {0};
        try {
            System.out.println(arr[2]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi Array Index Out of Bounds");
        }
        try {
            System.out.println(1/arr[0]);
        }catch (ArithmeticException e){
            System.out.println("Lỗi Arithmetic");
        }
        try {
            FileReader fr = new FileReader("D:/lear.txt");
        } catch (FileNotFoundException e){
            System.out.println("Lỗi File Not Found");
        }

    }
}
