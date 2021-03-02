package lab01.tdd;

/**
 * Get the next even element.
 */
public class SelectEvenStrategy implements SelectStrategy {

    @Override
    public boolean apply(int element) {
        return (element % 2) == 0;
    }
}
