public class regularDelivery extends Delivery{

    regularDelivery(int distance, int weight){
        super(distance , weight);
    }
    public long CalculateFee(){
        long fee;
        fee = 10L + 2L * distance + weight;
        return fee;
    }
}
