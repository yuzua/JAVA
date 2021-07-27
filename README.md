# JAVA
# JAVAの特徴
* C言語やC++に似た構文
* 強い型付け
   信頼性の高いプログラムを作りやすい
* オブジェクト指向プログラミングのサポート
    品質の高いソフトウェアを効率よく開発できる
* ライブラリが豊富
* ガーベジコレクションによる記憶管理
    オブジェクトの開放処理が自動的に行われるため、オブジェクトの管理が楽
* 例外処理
    頑丈なプログラムの開発が容易
* 並行処理
# 実行コマンド
* $javac ファイル名 → コンパイル(拡張子の.javaは省略できない)
* $java クラス名(クラスファイル名) → 実行(拡張子の.classは省略する) ※JAVA11からjavaコマンドだけでコンパイル・実行ができるようになった(単一ファイルで構成されたソースコードプログラムでありクラスがpublicでなければならない)
# 基本構成
* クラスの宣言
```Java:クラスの宣言
public class クラス名 {
    public static void main(String[] args) {
    // System.out 標準出力ストリーム  println 表示して改行
    System.out.println("クラスの宣言");
    }
}
```
# 変数
* 変数の宣言 代入と初期化は異なる概念 ※var 変数名 = 値 で変数の方が自動的に値に対応した型になる(メソッドの中でのみ宣言可能)
```Java:変数の宣言
public class クラス名 {
    public static void main(String[] args) {
        // 型 変数名
        int x;
        // 代入
        x = 50;
        // 初期化
        int y = 40
        var z = 30;
    }
}
```
* final変数 一旦入れた値を変更できないようにする(初期化するのが原則)
```Java:final変数
public class クラス名 {
    public static void main(String[] args) {
        // 保守性,可読性の向上
        final double PI = 3.1416;
    }
}
```
* constant変数 基本型とString型のfinal変数に限り,constant変数と呼ばれる
# 入力受け付け
* キーボードからの入力を受け付ける
```Java:入力を受け付ける
import java.util.Scanner;
class ArithInt {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("xの値は:");
        int x = stdIn.nextInt();
        System.out.println("x = " + x)
    }
}
```
* 種類
```Java:入植受付
// nextInt() int型の整数値を読み込む
// next() String型の文字列を読み込む
// その他多数
```
# データ型
* 整数型(byte int) 1バイト整数(-128~127) 整数 (基本型)
* 浮動小数点型(flout double) (基本型)
* 文字列型(String)
# 乱数の生成
* 乱数 rand.nextInt(n) 0~n-1までの間で作成
```Java:乱数の生成
import java.util.Random;
class LuckyNo {
    public static void main(String[] args) {
        Random rand = new Random();
        int Lucky = rand.nextInt(10);
        System.out.println("今日のラッキナンバーは"+ Lucky + "です")
    }
}
```
# IF文
* if-then文 通常のIF文 特殊なものはif.javaを参照 ※if,else後の文は1つのみ
```Java:if-then文
// if (式) 文
if (n>0)
    System.out.println("正の値です");
```
* if-then-else文
```Java:if-then-else文
// if (式) 文 else 文
if (n>0)
    System.out.println("正の値です");
else
    System.out.println("負の値です");
```
* 入れ子となったif文
```Java:入れ子
if (n>0)
    System.out.println("正の値です");
else 
    if (n==0)
        System.out.println("値は0です")
    else
        System.out.println("負の値です");
```
# ブロック
* if文が制御する文は1つなためブロック構造にすることにより単一の文にすることができる
```Java:ブロック
if (a<b) {
    min = a;
    max = b;
} else {
    min = b;
    max = a;
}
```

# 演算子
* 条件演算子 x ? y:z xがtureであればyを評価した値を,falseであればzを評価した値を生成

# switch文
* break文　break文を囲んでいるswitch文の実行を中断,終了させる ※入力値評価+ラベル使用のbreak文はswtch.javaを参照
```Java:swtch-break文
swtch (sum / 10) {
    case 0 : System.out.println("割り切れている"); break;
    case 1 : System.out.println("1余る"); break;
    case 2, 3 : System.out.println("割り切れない"); break;
    default: System.out.println("当てはまらない"); break;
}
```
# キャスト演算子
* キャスト=型変換
```Java:キャスト演算子
// (型) 式
double ave = (double)(x + y) / 2
```
# 配列
* 配列は、同一型の変数である構成要素が連続して直線上に並んだ構造です ※個々の構成要素の型である構成要素型は任意
```Java:配列
public class クラス名 {
    public static void main(String[] args) {
    int[] a;
    a = new int[5];
    // 一括指定も可能
    int[] b = new int[5]
    // インデックスは0から
    a[0] = 10;
    // 要素数の確認
    System.out.println(a.length);
    }
}
```