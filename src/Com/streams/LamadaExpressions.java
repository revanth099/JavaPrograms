package Com.streams;

import java.util.Arrays;
import java.util.List;

public class LamadaExpressions {

    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("revanth","nishanth","dinesh","uk");
        friends.stream()
                .filter(name->name.contains("th"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
