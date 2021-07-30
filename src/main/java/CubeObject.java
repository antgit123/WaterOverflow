//class created purely for demo purposes to show inheritance relationship
// with parent class container
public class CubeObject extends Container{
    double l = 5.0;
    double b = 4.0;
    double h = 3.0;
    //overriding parent class method
    @Override
    double getCapacity(double l , double b, double h){
        return l*b*h;
    }
}
