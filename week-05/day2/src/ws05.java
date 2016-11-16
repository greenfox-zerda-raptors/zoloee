/**
 * Created by zoloe on 2016. 11. 16..
 */
public class ws05 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,2);
        Block b1 = new Block();
        Block b2 = new Block(3,4,5);

        System.out.println("r1 a: " + r1.getArea());
        System.out.println(r1.getWidth() + " " + r1.getHeight());
        System.out.println("r2 a: " + r2.getArea());
        System.out.println(r2.getWidth() + " " + r2.getHeight());
        System.out.println("b1 a: " + b1.getArea());
        System.out.println("b1 v: " + b1.getVolume());
        System.out.println(b1.getWidth() + " " + b1.getHeight() + " " + b1.getLength());
        System.out.println("b2 a: " + b2.getArea());
        System.out.println("b2 v: " + b2.getVolume());
        System.out.println(b2.getWidth() + " " + b2.getHeight() + " " + b2.getLength());


    }

}
