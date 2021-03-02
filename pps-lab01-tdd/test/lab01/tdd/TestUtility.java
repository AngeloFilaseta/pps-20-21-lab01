package lab01.tdd;

public class TestUtility {

    public static final int TEST_REPETITION = 50;

    public static void populateListWithElements(final CircularList circularList, final int ... values){
        for(int v : values){
            circularList.add(v);
        }
    }
}
