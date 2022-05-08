import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner sn = new Scanner(System.in);
    int[] a = new int[5];
    System.out.print("กรอกตัวเลขมา 5 ตัว: ");
    for (int i=0; i<a.length; i++) {
      a[i] = sn.nextInt();
    }

    // Print สมาชิกแต่ละตัวออกมา
    for (int i=0; i<a.length; i++) {
      System.out.println(a[i]);
    }
  }
  
}
