package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectMultipleOfStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;

public class SelectMultipleOfStrategyFactory extends AbstractComparisonStrategyFactory {

    @Override
    public SelectStrategy createStrategy(final int comparisonElement) {
        return new SelectMultipleOfStrategy(comparisonElement);
    }

}
