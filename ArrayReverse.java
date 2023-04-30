import java.util.Scanner;

/**
 * ArrayReverse
 */
public class ArrayReverse {

    public static void main(String[] args) {
        Scanner gzw = new Scanner(System.in);
        int shuzuzhishuliang = 6;
        int[] gzw001 = new int[shuzuzhishuliang];
        for(int i = 0 ;i<shuzuzhishuliang;i++){
            System.out.println("请输入第" + (i + 1) + "个数");
            gzw001[i] = gzw.nextInt();
            System.out.println("你输入的是" + gzw001[i]);
        }
        System.out.println("正序输出是");
        for(int i = 0;i < shuzuzhishuliang; i++){
            System.out.println(gzw001[i]);
        }
        System.out.println("反转输出是");
        for(int i = 0;i < (shuzuzhishuliang / 2); i++){
            int sum = gzw001[i] + gzw001[shuzuzhishuliang - 1 - i];
            gzw001[i] = sum - gzw001[i];
            gzw001[shuzuzhishuliang - 1 -i] = sum - gzw001[shuzuzhishuliang - 1 -i];
        }
        for(int i = 0;i < shuzuzhishuliang; i++){
            System.out.println(gzw001[i]);
        }
    }
}