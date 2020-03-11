package T1908a.lap7.GeometricObject;

public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }

    @Override
    public double resize(int percent) {
        return getRadius()* percent/100;
    }
}
