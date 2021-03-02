package lab01.tdd.selectStrategy;

public class SelectEqualsStrategy extends AbstractComparisonStrategy {

    public SelectEqualsStrategy(int comparisonElement) {
        super(comparisonElement);
    }

    @Override
    public boolean apply(int element) {
        return element == getComparisonElement();
    }
}
