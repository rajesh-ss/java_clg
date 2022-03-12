public class pyramid {

  public static void main(String[] args) {
    int rows = 5, tmp = 0, count = 0, count1 = 0;

    for (int i = 1; i <= rows; i++) {
      for (int sp = 1; sp <= rows - i; sp++) {
        System.out.print("  ");
        count++;
      }

      while (tmp != 2 * i - 1) {
        if (count <= rows - 1) {
          System.out.print((i + tmp) + " ");
          count++;
        } else {
          count1++;
          System.out.print((i + tmp - 2 * count1) + " ");
        }

        tmp++;
      }
      count1 = 0;
      count = 0; 
      tmp = 0;

      System.out.println();
    }
  }
}

