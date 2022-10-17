import java.util.*;

public class End_of_file {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int index = 1;
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            System.out.println(index + " "+ s);  
            index += 1;

        }
        sc.close();


    }
}
