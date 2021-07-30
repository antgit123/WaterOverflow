public class GlassObject extends Container{
    @Override
    //this method can be extended in parent class with different
    // signatures to return the total volume of an object like a glass or
    // cube that can override the parent class method
    public double getCapacity() {
        return 0.25f;
    }
}
