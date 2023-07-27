public class ShapeApp {
    public static void main(String[] args) {

        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectengle = new Rectangle();
        System.out.println(rectengle.getCorner());
        System.out.println(rectengle.getParentCorner());


    }
}
