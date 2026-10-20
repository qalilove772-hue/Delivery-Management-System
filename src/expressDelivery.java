public class expressDelivery extends Delivery{

    expressDelivery(int distance, int weight){
        super(distance , weight);
    }
    public long CalculateFee(){
        long fee;
        fee = 25L + 4L * distance + 2L * weight;
        return fee;
    }
}
