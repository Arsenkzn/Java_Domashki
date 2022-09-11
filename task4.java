// Написать программу, показывающую последовательность действий для игры “Ханойская башня”


public class task4 {
    public static void towerOfHanoi(String from_rod, String to_rod, String buf, int count)
        {
        if (count > 1)
            towerOfHanoi(from_rod, buf, to_rod, count - 1);
        System.out.printf("%s -> %s%n", from_rod, to_rod);
        if (count > 1)
        towerOfHanoi(buf, to_rod, from_rod, count - 1);
    }
    public static void main(String[] args)
    {
        towerOfHanoi("1", "3", "2", 5);
    }
}