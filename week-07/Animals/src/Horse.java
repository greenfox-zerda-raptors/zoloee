/**
 * Created by zoloe on 2016. 12. 04..
 */
public class Horse extends AbstractAnimal {
    public Horse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 20;
    }
}
