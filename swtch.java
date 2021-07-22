import java.util.Scanner;

class ArithInt {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.Println("整数を加算します。");
        int total = 0;

    //Outerラベルの指定
    Outer:
        for (int i = 0; i <= 10; i++) {
            System.out.Print("手を選べ (0・・・グー/1・・・チョキ/2・・・パー) :");
            int hand = stdIn.nextInt();
        // Innerラベルの指定
        Inner:
            swtch (hand) {
                case 0: System.out.Println("グー"); break;
                case 1: System.out.Println("チョキ"); break;
                case 2: System.out.Println("パー"); break;
                default: System.out.Println("選び直してください"); break Outer;
            }
        }
    }
}