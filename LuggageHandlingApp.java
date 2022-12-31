import java.util.ArrayList;
import java.util.Stack;
import java.util.StringJoiner;

public class LuggageHandlingApp {
    public static void main(String[] args) {
        String inputLuggageQueue = "12,31,32,1,2,31,22,6,7,8"; // 7,8(22,11,6),(1,2,31),32,(31),(12)
        if(inputLuggageQueue.isEmpty()){
            System.out.println("No luggage found in the queue");
            return;
        }
        String[] lQueue = inputLuggageQueue.split(",");

        Stack<Container> containers = new Stack<Container>();
        ArrayList <Integer> luggageQueue = new ArrayList<Integer>();

        for(String capacity: lQueue){
            luggageQueue.add(Integer.parseInt(capacity));
        }
        Container tempContainer = new Container();
        containers.add(tempContainer);
        for (Integer luggageCapacity: luggageQueue){

            if(tempContainer.remainingSpace() < luggageCapacity){
                tempContainer = new Container();
                containers.add(tempContainer);
            }

            tempContainer.addLuggage(luggageCapacity);
        }
//        ArrayList <Integer> luggageUnloadOrder = new ArrayList<>();
        StringJoiner stringJoiner = new StringJoiner(",");

        while(!containers.isEmpty()){
            Container container = containers.pop();
            while (!container.getLuggage().isEmpty()){
                stringJoiner.add(container.getLuggage().poll() + "");

            }
        }
        System.out.println(stringJoiner);
    }
}
