import java.time.Duration;
import java.time.Instant;
import java.util.Timer;
public class Main {
    static int count = 0;   //Count variable for number of moves
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)   //Recursive tower of hanoi method
    {
        if (n == 1)
        {
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod);
            count++;
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
        count++;
    }
    public static void main(String args[])
    {
        int n = 6; // Number of disks
        Instant start = Instant.now();  //Timer to calculate elapsed time for recursive method call
        towerOfHanoi(n, 'A', 'C', 'B');
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toMillis();
        System.out.println("Number of Moves = " +count+ "\nElapsed Time = " +timeElapsed+ "ms");
    }
}