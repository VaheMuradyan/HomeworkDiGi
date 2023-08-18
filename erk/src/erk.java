import java.util.*;

public class erk {
    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>(Arrays.asList(15, 8, 16, 25, 18));

        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            if(next % 2 == 0){
                iterator.remove();
            }
        }



        nums.stream().forEach(System.out::println);
    }
}
