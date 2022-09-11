// Написать программу вычисления n-ого треугольного числа

public class task3 {
    static boolean isTriangular(int num)
    {
        if (num < 0)
            return false;
        int sum = 0;
         
        for (int n = 1; sum <= num; n++)
        {
            sum = sum + n;
            if (sum == num)
                return true;
        }
     
        return false;
    }

    public static void main (String[] args)
    {
        int n = 9;
        if (isTriangular(n))
            System.out.print("The number " + n + " is a triangular number");
        else
            System.out.print("The number " + n + " is NOT a triangular number");
    }
}
