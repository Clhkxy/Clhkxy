/**
 * Cash
 */
public class Cash {

    public static void main(String[] args) {
        int CashV = 100000 ,i = 0 ;;
        for(;CashV >= 1000;){
            if(CashV > 50000){
                CashV *= 0.95;
                i++;
            }
            else{
                CashV -= 1000;
                i++;
            }
        }
        System.out.print("共经过了" + i + "次路口");
    }
}