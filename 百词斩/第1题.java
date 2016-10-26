/**
 * Created by dbche on 2016/9/21.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        List array = new ArrayList(); //不知道数组长度用了list
        int count = 0   ;           // 0 的个数

        while(scanner.hasNext()){
            array.add(scanner.nextInt());
        }

        // 1. 判断多少个0
        for (int i = 0; i < array.size(); i++) {
            int k = Integer.parseInt(array.get(i).toString());
            if(k == 0) count++;
        }
        // 2. 排序
        bubbleSort(array);

        // 3. n - (n-1)的差值为需要的0个数
        for(int i=0;i<array.size()-1;i++){

            int j = Integer.parseInt(array.get(i).toString());
            int k = Integer.parseInt(array.get(i+1).toString());
            if(j == 0 )continue;
            count = count -( k-j-1);

        }

        if(count <0)
            System.out.println("false");
        else
            System.out.println("true");

        scanner.close();

    }

    public static void bubbleSort(List numbers)
    {
        int temp = 0,temp2;
        int size = numbers.size();
        for(int i = 0 ; i < size-1; i ++) {
            for(int j = 0 ;j < size-1-i ; j++) {
                if( Integer.parseInt(numbers.get(j).toString()) > Integer.parseInt(numbers.get(j+1).toString())) {

                    temp = Integer.parseInt(numbers.get(j).toString());
                    temp2 = Integer.parseInt(numbers.get(j+1).toString());
                    numbers.set(j,temp2);
                    numbers.set(j+1,temp);
                }
            }
        }
    }
    }



