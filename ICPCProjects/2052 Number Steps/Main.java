import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int numCoords = Integer.parseInt(scanner.nextLine());
      for(int i = 0; i < numCoords; ++i) {
          String[] coords = scanner.nextLine().split(" ");
          int x = Integer.parseInt(coords[0]), y = Integer.parseInt(coords[1]);
          if(x==y) {
              System.out.println((y / 2) * 4 + (y % 2));
          } else if (x == y + 2) {
              System.out.println((y / 2) * 4 + 2 + (y % 2));
          }
          else System.out.println("No Number");
      }
    }
}
