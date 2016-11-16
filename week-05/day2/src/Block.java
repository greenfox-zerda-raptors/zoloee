/**
 * Created by zoloe on 2016. 11. 16..
 */
public class Block extends Rectangle{
    int length;
//    float vol;

    public Block() {
        super();
        this.length = 1;
    }

    public Block(int width, int height, int length) {
        super(width, height);
        this.length = length;
    }

    public float getVolume(){
        return width * height * length;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
 } //Block

