package lab01.tdd.selectStrategy;

public abstract class AbstractComparisonStrategy implements SelectStrategy{

    private final int comparisonElement;

    protected AbstractComparisonStrategy(final int comparisonElement) {
        this.comparisonElement = comparisonElement;
    }

    @Override
    public abstract boolean apply(final int element);

    protected int getComparisonElement() {
        return comparisonElement;
    }
}
