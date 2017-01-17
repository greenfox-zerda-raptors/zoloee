/**
 * Created by zoloe on 2017. 01. 17..
 */
public class World {
    char playground[][];

    public World(char[][] myMatrix) {
        this.playground =myMatrix;
    }

    public char[][] runEvolution(){
        System.out.println(playground.toString());
        return playground;
    }
}

