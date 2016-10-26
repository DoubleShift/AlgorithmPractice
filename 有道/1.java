Google面试题，在[0, 10^n)范围内统计各个数位上的数字均不同的整数个数。
http://www.weibo.com/ttarticle/p/show?id=2309404025090076464319


import java.util.Scanner;
class NumbersPosition{
    public int count (int n){
        int result = 1;
        int multiple = 9;

        if ( n == 0){
            return result;
        } else if ( n > 10){
            n = 10;
        }

        for (int i= n-1;i>=0;i--){
            if(i == 0){
                result += multiple;
            }else{
                result +=(n-i+1) * multiple;
            }
            multiple *= (10-n+i-1);
        }

        return result;
    }
}
public class Main {

    public static void main(String args[]) {
        NumbersPosition np = new NumbersPosition();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            System.out.println(np.count(in.nextInt()));
        }
        in.close();
    }

}





