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
// クラスメソッド・・・全インスタンスで共有するメソッド ※クラスメソッドは、クラス変数とクラスメソッドしか呼び出せない
public class DayMethod {
    private int year=1;
    private int month=1;
    private int date=1;
    // クラスメソッド(static有)
    public static boolean isLeap(int y){
        return y%4 == 0%100!=0 || y%400==0;
    }
    // インスタンスメソッドからクラスメソッドの呼び出し
    public boolean isLeap() {return isLeap(year);}
}
// クラスの利用者に提供すべき場合は,publicかつfinalなクラス変数とする
public final class Math{
    public static final double E = 2.7182;
    public static final double PI = 3.1415;
}
// クラス初期化子・・・1番最初にクラスが呼び出された時のみ実行
class DateId {
    private static int counter;
    private int id;
    // クラス初期化子
    static {
        GregorianCalender today = new GregorianCalender();
        int y = today.get(YEAR);
        int m = today.get(MONTH);
        int d = today.get(DATE);
        System.out.println("今日は%04d年%02d月%02d日です。 \n", y, m, d);
        counter = y*1000000 + m*10000 + d*100;
    }
    public DateId() {
        id = ++counter;
    }
    public int getId() {
        return id;
    }
}
public class DateIdTester {
    public static void main(STaring[] args) {
        DateId a = new DateId();
        DateId b = new DateId();
        DateId c = new DateId();

        System.out.println("aの識別番号は:" + a.getId());
        System.out.println("bの識別番号は:" + b.getId());
        System.out.println("cの識別番号は:" + c.getId());
    }
}
// インスタンス初期化子
class XY {
    private static int counter = 0;
    private int id;

    private int x=0;
    private int y=0;
    // インスタンス初期化子
    {
        id = ++ counter
    }
    public XY() {}
    public XY(int x) {this.x = x;}
    public XY(int x, int y) {this(x); this.y = y;}
    public String toString() {
        return "No." + id + "・・・ (" + x + "," + y + ")";
    }
}
public class XYTester {
    public static void main(String[] args) {
        XY a = new XY();
        XY b = new XY(10);
        XY c = new XY(20, 30);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}