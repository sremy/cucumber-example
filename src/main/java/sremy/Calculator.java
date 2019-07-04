package sremy;

import java.util.List;

public class Calculator {

    int current;
    
    public static int sum(int a, int b) {
        return a + b;
    }

    public void clear() {
        current = 0;
    }
    
    public int add(int number) {
        current += number;
        return current;
    }

    public int add(List<Integer> liste) {
        current += liste.stream().reduce((x, y) -> x + y).get();
        return current;
    }

    public int getTotal() {
        return current;
    }

}
