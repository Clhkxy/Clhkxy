import java.util.Scanner;
/**
 * 0429
 */
public class c0429 {

    public static void main(String[] args) {
        int all_count = 0,banjizuidashuliang = 2, meibanxueshengshuliang = 3, all_jige = 0,jigefenshuxian = 60;
        Scanner gzw = new Scanner(System.in);
        for(int banji_num = 1;banji_num <= banjizuidashuliang ;banji_num++ ){
            int ban_count = 0,ban_jige = 0;
            for(int xuesheng_num = 1;xuesheng_num <= meibanxueshengshuliang ;xuesheng_num++ ){
                System.out.println("请输入第" + banji_num + "班第" + xuesheng_num + "位学生的成绩");
                int socker = gzw.nextInt();
                System.out.println("你输入的第" + banji_num + "班第" + xuesheng_num + "位学生的成绩是" + socker);
                ban_count += socker;
                if(socker >= jigefenshuxian){
                    ban_jige++;
                }
            }
            all_jige += ban_jige;
            System.out.println("第" + banji_num + "班的及格人数为" + ban_jige + "人");
            System.out.println("第" + banji_num + "班的平均成绩为" + ban_count/meibanxueshengshuliang);
            all_count += ban_count;
        }
        System.out.println("总及格人数为" + all_jige + "人");
        System.out.println("所有学生平均成绩为" + all_count/meibanxueshengshuliang/banjizuidashuliang);
    }
}