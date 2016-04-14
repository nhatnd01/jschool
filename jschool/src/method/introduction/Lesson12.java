package method.introduction;

public class Lesson12 {
    public static void main(String[] args) {
        // 整数配列の受け取り
        int[] ints = createIntArray();
        // 配列の要素を表示（配列の大きさは length で取得できる）
        for (int i = 0; i < ints.length; i++) {
            System.out.println("" + ints[i]);
        }
    }

    // 整数配列を作成して返却
    public static int[] createIntArray() {
        // 大きさが3の配列を作成（ints[0]からints[2]まで利用可能で、ints[3]を使おうとするとエラーになる）
        int[] ints = new int[5];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 2;
        ints[3] = 3;
        ints[4] = 4;
        // 整数配列を返却
        return ints;
    }
}
