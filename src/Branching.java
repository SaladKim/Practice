import java.util.Arrays;
import java.util.Scanner;

public class Branching {
    public static void main(String[] args) {
        //if문, if~else문, 비교연산자, 논리연산자, switch문

        Scanner fromUser = new Scanner(System.in);
        System.out.println("나이를 입력하세요: ");
        String theAge = fromUser.next();

        int age = Integer.parseInt(theAge);

        /*if (age >= 20) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }*/

        if (age >= 20 && age < 40) {
            System.out.println("청년");
        } else if (age >= 40 && age < 60) {
            System.out.println("장년");
        } else {
            System.out.println("기타");
        }

        Scanner in = new Scanner(System.in);
        String color = in.next();

        switch (color) {
            case "red":
                System.out.println("열정적이군요");
                break;
            case "blue":
                System.out.println("감성적이군요");
                break;
            case "green": case "yellow":
                System.out.println("잘 모르겠어요");
                break;
            default:
                System.out.println("알수없어요");

        }
    }
}
