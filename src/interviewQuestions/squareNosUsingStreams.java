package interviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class squareNosUsingStreams {
    public static void main(String[] args) {
        List<Integer> nos = new ArrayList<>();
        nos.add(7);
        nos.add(5);
        nos.add(1);
        nos.add(6);
        nos.add(19);
        List<Integer> squares =
                nos.stream().map(i->i*i).filter(i->i<50).sorted().collect(Collectors.toList());
        System.out.println(squares);
    }
}
