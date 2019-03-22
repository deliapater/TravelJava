public enum PlaneType {
    AIRBUSA330(227000,335),
    AIRBUSA321(93500, 180),
    BOEING747(333400, 416),
    BOEING777(351000, 396),
    BOEING737(70533, 162);

    private final int totalWeight;
    private final int capacity;


    PlaneType(int totalWeight, int capacity){
        this.totalWeight = totalWeight;
        this.capacity = capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

}
