package sprint;


/*public class NumberPrinter {
    public int printNums(int n) {
       // StringBuilder numbers = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            int result = i;
            System.out.println(result);
        }
    }
}*/

public class NumberPrinter {
    public void printNums(int n) {
        if (n < 0) {
            System.out.println("Negative numbers are not allowed");
        }
        StringBuilder numbers = new StringBuilder();
            for (int i = 0; i <= n; i++) {
                numbers.append(i).append("\n");
            }
            System.out.print(numbers.toString());
    }
    
}
