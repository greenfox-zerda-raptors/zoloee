
public class Main {

    public static void main(String[] args) {
        Util util = new Util();
        int[] list = new int[]{1, 3, 8, 6, 7, 4};
        int[] list2 = new int[]{1, 9, 8, 6, 7, 8};

        int x = util.getBiggestFromPairs(list);
        int y = util.getBiggestFromPairs(list2);
        System.out.println(x);
        System.out.println(y);

    }
}
