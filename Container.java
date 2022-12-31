import java.util.LinkedList;
import java.util.Queue;

public class Container {

    private int capacity;
    private final int maxCapacity = 40;
    private Queue<Integer> luggage =  new LinkedList<>();
    public int remainingSpace(){
        return maxCapacity - capacity;
    }

    public Queue<Integer> getLuggage(){
        return luggage;
    }
    public boolean addLuggage(int luggageWeight){
        if(luggageWeight > maxCapacity){
            throw new RuntimeException("Invalid luggage found, against airline policy");
        }
        if(remainingSpace() >= luggageWeight){
            luggage.add(luggageWeight);
            capacity += luggageWeight;
            return true;
        }
        else{
            return false;
        }
    }



}
