import java.util.Scanner;

/**
 * HackerRank Problem:
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem?isFullScreen=true
 */
public class HackerRankStaticBlock {
    static int breadth;
    static int height;

    static {
        Scanner scanner = new Scanner(System.in);
        breadth = scanner.nextInt();
        height = scanner.nextInt();

        if (breadth > 0 && height > 0) {
            System.out.println(breadth * height);
        } else {
            System.out.println("java.lang.Exception: " +
                    "Breadth and height must be positive");
        }
    }

    public static void main(String args[]) {
    }
}