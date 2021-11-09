package search;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {



    List<Integer> number = Arrays.asList(2, 3, 4, 6, 9);
    List<Integer> sq = number.stream().map(i -> i * i).collect(Collectors.toList());
    number.stream().map(i->i+i).forEach(y->System.out.print(y +" "));

        System.out.println(sq);

    List<String> names = Arrays.asList("Collections","Java 8","Abstract","Lambda");
    List<String>  filteredName = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(filteredName);

        List<String> sortedReuslt = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedReuslt);


    }

}
