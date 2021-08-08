import java.util.Scanner;

// d1とd2に入っている値が等しいか判定
class DayComparator {
    static boolean compDay(Day d1, Day d2) {
        return d1.getYear() == d2.getYear() &&
                d1.getMonth() == d2.getMonth() &&
                d1.getData() == d2.getData();
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        if (compDay(day1, day2))
            System.out.println("等しいです");
        else
            System.out.println("等しくありません");
    }
}
