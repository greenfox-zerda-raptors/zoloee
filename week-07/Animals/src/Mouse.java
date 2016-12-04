/**
 * Created by zoloe on 2016. 12. 04..
 */
public class Mouse extends AbstractAnimal{
    public Mouse(String name) {
        super(name);
    }

    @Override
    int defaultFoodAmount() {
        return 2;
    }
}
