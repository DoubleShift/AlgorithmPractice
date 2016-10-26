Google面试题：给定平面上的n个点，问是否存在一条平行于y轴的直线，使得这n个点相对于这条直线对称。


http://chuansong.me/n/465211849627


import java.util.Scanner;

class Coordinate{
    public int x;
    public int y;
    Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Axis{
    public boolean findSymmetry (){
        boolean result = false;
        int multiple = 9;
        return result;
    }
}
public class Main {

    public static void main(String args[]) {
        Axis np = new Axis();
        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {
            System.out.println(np.count(in.nextInt()));
        }
        in.close();
    }

}





