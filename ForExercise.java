/**
 * ForExercise
 */
public class ForExercise {

    public static void main(String[] args) {
        int i = 1, j = 0;
        for(;i<=100;i++){
            if(i % 9 == 0){
                System.out.println(i);
                j++;
            }
        }
        System.out.println("一共是" + j + "个");
        for( int qq = 0, p = 5;qq <= 5;qq++){
            int cc = qq +p;
            System.out.println(qq + " + " + p + " = " + cc);
            p -= 1;
        }
    }
}