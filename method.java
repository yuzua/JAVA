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

class Max{
    static int max(int a, int b) {

    }
}