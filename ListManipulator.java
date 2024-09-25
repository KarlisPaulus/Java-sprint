package sprint;

import java.util.List;

public class ListManipulator {
    public List<String> manipulateList(List<String> list) {
        if (list.size() == 1) {
            list.set(0, "first");
        } else if (list.isEmpty()) {
            list.add("1");
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
