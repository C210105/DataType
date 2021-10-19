import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 変数宣言・初期化
        int width, height;
        Scanner sc = new Scanner(System.in);

        // キーボードからの入力（width/横の長さ）
        System.out.print("width: ");
        width = sc.nextInt();

        // キーボードからの入力（height/縦の長さ）
        System.out.print("height: ");
        height = sc.nextInt();

        // 周囲の長さの計算・表示
        System.out.print("circumference: ");
        System.out.println(width + width + height + height);

        // 入力の終了
        sc.close();
    }
}