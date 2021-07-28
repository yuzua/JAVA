import java.util.Scanner;

// メソッドの中で他のメソッドを呼び出し可能 = 極力処理はまとめる
// 仮引数を受け取らない場合 メソッド名() で()内を空で定義する
class IsoscelesTriangleLB {
    static int x = 700; // フィールド変数
    // voidメソッド returnで値を返却しなくて良いメソッド
    static void putStars(int n) { 
        while (n-- > 0)
            System.out.print('*');
    }

    public static void main(String[] args) {
    System.out.println(x); // ここでは出力結果が700になる
    int x = 800; // 局所変数
    System.out.println(x); // ここでは出力結果が800になる = 局所変数とフィールド変数の変数名が同じ時メソッド内では局所変数が優先される
    for (int i = 1; i <= n; i++) {
        putStars(i);
        System.out.println();
        }
    }
}

// メソッドの多重定義：類似した処理は同じ名前で多重定義する(必ず仮引数の個数や型は異なるものにする)
class Max{
    // maxメソッド1
    static int max(int a, int b) {
        return a > b ? a:b;
    }
    // maxメソッド2
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("xの値："); int x = stdIn.nextInt();
        System.out.print("yの値："); int y = stdIn.nextInt();
        System.out.print("zの値："); int z = stdIn.nextInt();

        System.out.println("x,yの最大値は" + max(x,y) + "です。"); // maxメソッド1に飛ぶ
        System.out.println("x,y,zの最大値は" + max(x,y,z) + "です。"); // maxメソッド2に飛ぶ
    }
}