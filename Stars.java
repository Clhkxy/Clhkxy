/**
 * Stars
 */
public class Stars {

    public static void main(String[] args) {
        int ceng = 88;
        for(int i = 1;i <= ceng;i++){
            for(int j = 1;j <= ceng - i;j++ ){
                System.out.print(" ");
            }
            for(int j = 1;j <= (i * 2) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
    }
        for(int i = 1;i <= ceng - 1;i++){
            for(int j = 1;j <= i;j++ ){
                System.out.print(" ");
            }
            for(int j = 1;j <= (i * 2) - 1;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}