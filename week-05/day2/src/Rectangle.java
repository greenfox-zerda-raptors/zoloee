/**
 * Created by zoloe on 2016. 11. 16..
 */
public class Rectangle {
    int width;
    int height;

    public Rectangle() {
        this(1,1);
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    protected float getArea(){
        return width * height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
