public class GlassObject extends Container{
    double capacity;
    GlassObject(){
        this.capacity = 0.0d;
    }
    @Override
    //this method can be extended in parent class with different
    // signatures to return the total volume of an object like a glass or
    // cube that can override the parent class method
    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity){
        this.capacity = capacity;
    }
}
