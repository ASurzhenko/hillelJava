/**
 * Created by Александр on 13.02.2016.
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int v1 = 10;
        int v2 = 2;
        int v3 = 2;
        int min;

        if(v1 < v2 && v1 < v3){
            min = v1;
        }
        else if(v2 < v1 && v2 < v3){
            min = v2;
        }
        else{
            min = v3;
        }
        System.out.println(min);
    }
}
