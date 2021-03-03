package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectEqualsStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;

public class SelectEqualsStrategyFactory extends AbstractComparisonStrategyFactory {

    @Override
    public SelectStrategy createStrategy(final int comparisonElement) {
        return new SelectEqualsStrategy(comparisonElement);
    }
}
