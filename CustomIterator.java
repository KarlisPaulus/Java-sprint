package sprint;

import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CustomIterator implements Iterator<Integer>{   //iterates over list of integers
    private List<Integer> allNumbers;
    private int theCurrentIndex;

    public CustomIterator(List<Integer> numbers) {  // storing list
        allNumbers = numbers;
        theCurrentIndex = 0;
    }

    public boolean hasNext() {  // works as long as while lasts. 
        return theCurrentIndex < allNumbers.size();
    }

    public Integer next() {
        if (hasNext() == false) {   // if numbers run out then throws exception
            throw new NoSuchElementException();
        }
        return allNumbers.get(theCurrentIndex++);   // returns number at the specified position from list
    }
}

/*import sprint.CustomIterator;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        CustomIterator iterator = new CustomIterator(numbers);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
} */