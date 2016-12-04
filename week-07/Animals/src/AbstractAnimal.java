/**
 * Created by zoloe on 2016. 12. 04..
 */
public abstract class AbstractAnimal implements Animal {
    private String name;
    private int feedCounter = 0;
    private int movedDistance = 0;
    private int childrenNum = 0;

    public AbstractAnimal() {
    }

    public AbstractAnimal(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        this.feedCounter += defaultFoodAmount();
    }

    @Override
    public void move(int distance) {
        this.movedDistance += distance;
    }

    abstract int defaultFoodAmount();

    public String getName() {
        return name;
    }

    public void setChildrenNum(int childrenNum) {
        if ( childrenNum < 0)
        this.childrenNum = childrenNum;
    }

    public int getFeedCounter() {
        return feedCounter;
    }

    @Override
    public String toString() {
        return "AbstractAnimal{" +
                "name='" + name + '\'' +
                ", feedCounter=" + feedCounter +
                ", movedDistance=" + movedDistance +
                ", childrenNum=" + childrenNum +
                '}';
    }
} //AbstractAnimal
