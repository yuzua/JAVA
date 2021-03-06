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
* $javac ファイル名 → コンパイル(拡張子の.javaは省略できない) ※public static void main(~) の処理が描いてるclassが一番上になっていないとerror
* $java クラス名(クラスファイル名) → 実行(拡張子の.classは省略する) ※JAVA11からjavaコマンドだけでコンパイル・実行ができるようになった(単一ファイルで構成されたソースコードプログラムでありクラスがpublicでなければならない)
# メモリーの領域確保について
* スタック領域とヒープ領域がある
* スタック領域・・・変数名や配列名を宣言した際に確保されるメモリー領域
* ヒープ領域・・・変数や配列に入れる値が宣言された際に確保されるメモリー領域
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
* break文　break文を囲んでいるswitch文の実行を中断,終了させる ※入力値評価+ラベル使用のbreak文はswitch.javaを参照
```Java:switch-break文
switch (sum / 10) {
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
    }
}
```
* 拡張for文などその他配列関係の細かな詳細は array.javaを参照
# メソッド
* ひとまとまりの手続きを、１つの部品としてまとめる ※処理はmainメソッドから行われ、MaxHwMethodが呼び出されたらmainメソッドを一時中断し、MaxHwMethodを実行
```Java:メソッド
// メソッドの宣言
class MaxHwMethod {
    // メソッド頭部 static 返却型 メソッド名(仮引数) ※仮引数は、与えられた実引数の値によって初期化
    static int max(int a, int b, int c) { // 仮引数は値渡しのため値を変更しても実引数に影響なし
        // メソッド本体 処理内容 ※メソッド名と同じ名前の変数の宣言が可能
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max; // メソッド内のreturn文は可能な限り1個又は少数に抑える
    }
}
public static void main(String[] args) {
    int maxHeight = max(11, 12, 13);
    int maxWeight = max(20, 50, 55);
}
```
* voidメソッドなどその他メソッド関係は method.java を参照
# クラス
* メソッドと処理対象のデータとの組み合わせ
* クラスはフィールド,コンストラクタ,メソッドからできている
* フィールド内の変数には、クラス変数(static有)とインスタンス変数(static無)がある
* メソッドには、クラスメソッド(static有)とインスタンスメソッド(static無)がある
* 単一のソースプログラムの中では、2個以上のpublicクラスは宣言できない
```Java:クラス
class Account {
    // フィールド ※クラス内の全てのフィールドは原則private(非公開)にしておく
    private String name;
    private String no;
    private long balance;
    // コンストラクタ ※クラスを宣言する時は,必ずコンストラクタを用意し,インスタンスを初期化する
    Account(String name, String no, long balance) {
        // this.フィールド変数名 = 仮引数名にすることで同じ変数名を使う事ができる
        this.name = name;
        this.no = no;
        this.balance = balance;
    }
    // メソッド ※staticを付けずに宣言されたインスタンスメソッドは,ここのインスタンスごとに作られ,そのインスタンスに所属する
    String getName() {
        return name;
    }
    String getNo() {
        return no;
    }
    String getBalance() {
        return balance;
    }
    void deposit(long k) {
        balance += k;
    }
    void withdraw(long k) {
        balance -= k;
    }
}
class AccountTest {
    public static void main(String[] args) {
        Account niigata = new Account("新潟太郎", "123456", 1000);
        Account tokyo = new Account("東京太郎", "987654", 300);
        niiigata.withdraw(200);
        tokyo.deposit(800);
    }
}
```
* publicクラス・・・他のパッケージからも利用可能にする
* 細かなものについてはclass.javaを参照 
# 識別子の命名規則
* クラス・・・内容を簡潔に表す名詞。先頭を大文字にしその後小文字にする
* インターフェース・・・内容を簡潔に表す名詞。
* メソッド・・・内容を簡潔に表す小文字の動詞。複数の単語を連続する場合,2個目以降の単語の先頭を大文字にする。
* フィールド・・・内容を簡潔に表す小文字の名詞。数の単語を連続する場合,2個目以降の単語の先頭を大文字にする。
* 定数・・・品詞を使用。全て大文字にする。複数の単語を連続する場合,_で区切る。
* パッケージ・・・先頭文字を小文字にする。
# パッケージ
* パッケージの主な役割・・・1.名前の衝突回避 2.カテゴリによる分類 3.カプセル化(アクセス制御)
```Java:パッケージのインポート
// パッケージpに所属するクラスTypeの場合、p.Type(完全名) Type(単純名)
// 単一型インポート宣言 = import 完全名;
import java.util.Scanner;
// オンデマンド型インポート宣言 = import パッケージ名.*;
import java.util.*; // util以下でプログラム内で使用されてるもののみインポート
```
* 静的インポート・・・クラス変数(静的フィールド)、クラスメソッド(静的メソッド)のインポート
```java:静的インポート
// 単一静的インポート宣言 = import static パッケージ名.型名.識別子名;
// オンデマンド静的インポート宣言 = import static パッケージ名.型名.*;
import static java.lang.Math.PI;
```
* パッケージの宣言・・・パッケージ事にフォルダを作り、まとめる
```Java:パッケージの宣言・・・インポート宣言やクラス宣言よりも前に置かなくてはならない
// pakege パッケージ名;
pakege sample;
```
# 継承
* 親クラスを継承することで、子クラスでもその資産(フィールド,メソッド)を使用できる。
* クラスの継承において、親クラスのコンストラクタは継承されない。子クラスのコンストラクタの先頭でsuper(~)で親クラスのコンストラクタを呼び出せる。※子クラスでコンストラクを定義しないのであれば親クラスは「引数を受け取らないコンストラクタ」を持っていなければならない。
```Java:継承
class Base {
    int a;
    int b;
    int getA() {}
    void setA(int a) {}
    int getB() {}
    void setB(int b) {}
}
// 継承・・・ class クラス名 extends 親クラス名
class Derived extends Base {
    int c;
    int getC() {}
    void setC(int c) {}
}
```
* オーバーライド(上書き)・・・親クラスと同じ名前でメソッドを定義した場合、上書きが可能
```Java:オーバーライド
class Pet {
    private String name;
    private String masterName;

    public Pet(String name, String masterName) {
        this.name = name;
        this.masterName = masterName;
    }
    public getName() {return name;}
    public getMasterName() {return masterName;}
    public void introduce() {
        System.out.println("Petは" + name);
    }
}
class RobotPet extends Pet {
    public RobotPet(String name, String masterName) {
        super(name, masterName);
    }
    // オーバーライド
    @Override public void introduce() {
        System.out.println("飼い主は" + masterName);
    }
    public void work(int sw) {
        ~;
    }
}
```
* 抽象クラスなどはextends.javaを参照
# インタフェース
* インタフェース・・・メソッドの設計図
```Java:インタフェース
// インタフェースの宣言
interface Player {
    void play();
    void stop();
}
// インタフェースの実装
class VideoPlayer implements Player {
    public void play() {}
    public void stop() {}
}
```
# 例外処理
* try文・・・try文は、tryブロック、catch節、finally節の3つのパーツで構成される。
```Java:例外処理
 class ExceptionSample {
     public static void main(String[] args) {
         Scanner stdIn = new Scanner(System.in);
         System.out.println("xとyを加減乗除します。");
         while (true) {
             // tryブロック
             try {
                 System.out.println("xの値："); int x = stdIn.nextInt();
                 System.out.println("yの値："); int y = stdIn.nextInt();

                 System.out.println("x+y=" + (x+y));
                 System.out.println("x-y=" + (x-y));
                 System.out.println("x*y=" + (x*y));
                 System.out.println("x/y=" + (x/y));
            // catch節 catch (エラー文)
             } catch (InputMismatchException e) {
                 System.out.println("入力エラー発生" + e);
                 String s = stdIn.next();
                 System.out.println(e + "は無視しました。");
             } catch (ArithmeticException e) {
                 System.out.println("算術エラー発生" + e);
                 System.out.println("エラーが出ないようにお願いします");
            // finally節・・・tryブロックの例外発生に関わらず、最後に必ず実行される
             } finally {
                 System.out.println("_____________________");
                 System.out.println("もう一度? (1・・・Yes/2・・・No)");
                 int retry = stdIn.nextInt();
                 if (retry == 0) break;
                 System.out.println("_____________________");
             }
         }
     }
 }
```