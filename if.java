import java.util.Scanner;

class ArithInt {
    public static void main(String[] args){
        int a = 1, b = 2;
        // 1
        if (a == 1)
            System.out.println("実験1-1");
            if (b == 1)
                System.out.println("実験1-2");
        else
            System.out.println("実験1-3");

        // この場合、実験1-1だけが表示されると思うが実際には実験1-1と実験1-3が表示される
        // elseは最も近いifと結びついている。正確には2のようになっている

        // 2
        if (a == 1)
            System.out.println("実験2-1");
            if (b == 1)
                System.out.println("実験2-2");
            else
                System.out.println("実験2-3");

        //もしelseを(a == 1)と結びつけるならば3のようになる
        
        // 3
        if (a == 1) {
            System.out.println("実験3-1");
            if (b == 1)
                System.out.println("実験3-2");
        }
        else
            System.out.println("実験3-3");

    }
}