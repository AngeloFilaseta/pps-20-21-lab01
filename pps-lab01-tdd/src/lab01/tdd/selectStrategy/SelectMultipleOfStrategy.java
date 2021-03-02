package lab01.tdd.selectStrategy;

/**
 * Get the next multiple of a given number;
 */
public class SelectMultipleOfStrategy extends AbstractComparisonStrategy {

    private static final int MULTIPLIER = 2;
    public SelectMultipleOfStrategy(int comparisonElement) {
        super(comparisonElement);
    }

    @Override
    public boolean apply(int element) {
        return (getComparisonElement() * MULTIPLIER) == element;
    }
}
