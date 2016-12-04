/**
 * Created by zoloe on 2016. 12. 04..
 */
public class Ant extends AbstractAnimal{


    @Override
    int defaultFoodAmount() {
        return 1;
    }

    @Override
    public void move(int distance) {
        distance /=2;
        super.move(distance);
    }

}
