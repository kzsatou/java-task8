public class ArgsLastPrinter {
    public static void main(String[] args) {
        /* コマンドライン引数の要素数を取得し,-1してarg[]に入れる要素数を取得 */
        int cmdLength = args.length - 1;
        /* コマンドライン引数がない場合、「なし」と表示 */
        if (cmdLength < 0) {
            System.out.println("なし");
        } else {
            System.out.println(args[cmdLength]);
        }
    }
}