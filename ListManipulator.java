package sprint;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListManipulator {
    public List<String> manipulateList(List<String> list) {
        if (list.isEmpty()) {
            list.set(0, "1");
            return list;
        } else {
            list.removeLast(); // Arraylist size automatically extends. Array doesn't
            int last = list.size() - 1;
            list.set(last, "The size of the list is " + list.size());
            list.addLast("last");
            list.set(0, "first");

        }
        return list;
    }
}
