package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectMultipleOfStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;

public class SelectMultipleOfStrategyFactory implements SelectStrategyFactory {
    @Override
    public SelectStrategy createStrategy() {
        throw new IllegalCallerException("Can't invoke this method on class: " + this.getClass().getName());
    }

    @Override
    public SelectStrategy createStrategy(final int comparisonElement) {
        return new SelectMultipleOfStrategy(comparisonElement);
    }
}
