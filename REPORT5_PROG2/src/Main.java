public class Main {
    public static void main(String[] args) {
        // 条件1: String型の変数strに、文字列"壱百満"を代入する
        String str = "壱百満";

        // 条件2: Integer.parseInt(String s)メソッドを用いて、int型変数valueに代入する
        try {
            int value = Integer.parseInt(str);
            System.out.println("変換後の値: " + value);
        } catch (NumberFormatException e) {
            // 数字に変換できない場合の例外処理
            System.out.println("NumberFormatExceptionが発生しました: " + e.getMessage());
        }
    }
}
