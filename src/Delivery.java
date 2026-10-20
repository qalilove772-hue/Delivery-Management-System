abstract class Delivery {
    protected int distance , weight;
    Delivery(){
        distance = 0;
        weight = 0;
    }
    Delivery(int distance , int weight){
        this.distance = distance;
        this.weight = weight;
    }

    public abstract long CalculateFee();
}
