package Lesson_3;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class PhoneBook {

    private Map<String, Set<String>> values = new TreeMap<>();

    public void add(String name, String number) {

        if (values.containsKey(name)) {
            values.get(name).add(number);
        } else {
            Set<String> numbers = new TreeSet<>();
            numbers.add(number);
            values.put(name, numbers);
        }
    }

    public Set<String> get(String name) {
        return values.get(name);
    }

}
