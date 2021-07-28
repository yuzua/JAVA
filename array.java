import java.util.Arrays;

class ArithInt {
    public class クラス名 {
        public static void main(String[] args) {
            int[] a;
            a = new int[5];
            // 一括指定も可能
            int[] b = new int[5]
            // 配列に値の代入
            b[0] = 10
            // 配列に初期値の代入
            int[] c = {1, 2, 3, 4, 5};
            // 配列の長さ取得
            System.out.println(b);
            // 配列の全要素の表示
            System.out.println("b  = " + Arrays.toString(b));

            // 拡張for文(for-in文 or for-each文)
            // 配列dの先頭から末尾まで全要素を1つずつiに代入しsumに合計していく
            double[] d = {1.0, 2.0, 3.0, 4.0, 5.0};
            for (double i : d)
                sum += i;
            System.out.println("合計は" + sum)

            // 配列のコピー(コピーされるのは全要素の値ではなく参照先)
            a = b
            // 値をコピーしたい場合
            if (a.length != b.length) // 配列aとbの全要素の値が等しいかを判断するのではなく配列aとbが同じ配列本体を参照しているかどうかを調べている
                b = new int[a.length];
            for (int i=0; i < a.length; i++)
                b[i] = a[i];

            // 多次元配列
            int[][] x = new int[2][4];
            int[][] y = {new int[5], new double[2], new int[4]};
            int[][] z = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
            }
            // 多次元配列の全要素の表示
            System.out.println(Arrays.deepToString(x));
            // 多次元配列の拡張for文
            for (double i : x) {
                for (double j : i) {
                    System.out.printf("%5.1f", j);
                }
                System.out.println();
            }
        }
    }   
}