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
// 配列を作成後,中身を全て初期化
class DayArrayError {
    public.static.void.main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();

        Day[] a = new Day[n];
        for (int i=0; i<a.length; i++) {
            a[i] = new Day(2021, 10, 15);
        }
    }
}



// 教科書の内容

public class Day {
    private int year = 1;
    private int month = 1;
    private int date = 1;

    public Day()                                {} //コンストラクタ1
    public Day(int year)                        {this.year=year;} //コンストラクタ2
    public Day(int year, int month)             {this(year); this.month=month;} //コンストラクタ3・・・this(year)はコンストラクタ2を呼び出している
    public Day(int year, int month, int date)   {this(year,month);this.date=date;} //コンストラクタ4・・・this(year,month)はコンストラクタ3を呼び出している
    public Day(Day d)                           {this(d.year,d.month,d.date);} //コンストラクタ5・・・this(d.year,d.month,d.date)はコンストラクタ4を呼び出している

    public int getYear()    {return year;}
    public int getMonth()   {return month;}
    public int getDate()    {return date;}

    public void setYear(int year)   {this.year = year;}
    public void setMonth(int month) {this.month = month;}
    public void setDate(int date)   {this.date = date;}

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }
}

class DayTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("Day1を入力");
        System.out.println("年:"); int y = stdIn.nextInt();
        System.out.println("月:"); int m = stdIn.nextInt();
        System.out.println("日:"); int d = stdIn.nextInt();

        Day day1 = new Day(y, m ,d);
        System.out.println("day1 = " + day1);

        Day day2 = new Day(day1);
        System.out.println("day2をday1と同じ日付で作成");
        System.out.println("day2 = " + day2);

        if (day1.equalTo(day2))
            System.out.println("day1とday2は等しい");
        else
            System.out.println("day1とday2は等しくない");

        Day d1 = new Day();
        Day d2 = new Day(2027);
        Day d3 = new Day(2027, 10);
        Day d4 = new Day(2027, 10, 15);

        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);
        System.out.println("d4 = " + d4);

        Day[] a = new Day[3];
        for (int i=0; i<a.length; i++)
            a[i] = new Day();
        for (int i=0; i<a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}

// クラス変数・・・ユーザーIDなど個々のインスタンスではなく、全インスタンスで共有する場合,staticをつける
public class Account {
    private static int counter = 0;
    private String name;
    private String no;
    private long balance;
    private int id;

    public Account(String name, String no, long balance) {
        this.name = name;
        this.no = no;
        this.balance = balance;
        id = ++counter;
    }
    public getId() {
        return id;
    }
}