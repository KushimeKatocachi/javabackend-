import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Height manin engiz:");
        int height = scanner.nextInt();

        System.out.println("Width manin engiz:");
        int width = scanner.nextInt();

        System.out.println("hieght mani: " +height);
        System.out.println("width mani: " +width);

        int rectangleArea = height*width;
        System.out.println(rectangleArea);
    }

}
