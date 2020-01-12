public class Plane {

    private PlaneType planetype;

    public Plane(PlaneType planetype){
        this.planetype = planetype;
    }

    public PlaneType getPlaneType(){
        return planetype;
    }

    public int getPlaneCapacity(){
        return this.planetype.getPlaneCapacity();
    }

    public int getPlaneWeight(){
        return this.planetype.getPlaneWeight();
    }

}
