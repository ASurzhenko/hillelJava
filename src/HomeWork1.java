/**
 * Created by Александр on 13.02.2016.
 */

/**
 * Найти минимальное из 3х чисел, причем,
 * если минимальных несколько вывести все такие числа
 */
public class HomeWork1 {
    public static void main(String[] args) {
        int v1 = 100;
        int v2 = 10;
        int v3 = 10;

        if (v1 <= v2 && v1 <= v3)
            System.out.println(v1);
        if (v2 <= v1 && v2 <= v3)
            System.out.println(v2);
        if (v3 <= v1 && v3 <= v2)
            System.out.println(v3);
    }
}

