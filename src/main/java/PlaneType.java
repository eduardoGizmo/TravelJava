public enum PlaneType {

    BOEING747(416, 183500);

    private final int planeCapacity; // Number of passengers
    private final int planeWeight; // In kilograms

    PlaneType(int planeCapacity, int planeWeight){
        this.planeCapacity = planeCapacity;
        this.planeWeight = planeWeight;
    }

    public int getPlaneCapacity(){
        return planeCapacity;
    }

    public int getPlaneWeight(){
        return planeWeight;
    }



}
