// 抽象クラス・・・多相性を活用するために使用 ※抽象クラスのインスタンスは作成する事ができない
// abstractを付けて、本体{}の代わりに;をおいて宣言する。
abstract class Shape {
    abstract void draw(); //抽象メソッド
}
class Point extends Shape {
    Point() {}
    @Override void draw() {
        System.out.println('+');
    }
}
class Rectangle extends Shape {
    private int width;
    private int height;
}
@Override void draw() {
    for (int i=1; i<=height; i++) {
        for (int j=1; j<=wigth; j++) {
            System.out.println('*');
        }
        System.out.println();
    }
}