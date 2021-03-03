package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectStrategy;

public abstract class AbstractComparisonStrategyFactory implements SelectStrategyFactory{

    @Override
    public SelectStrategy createStrategy() {
        throw new IllegalCallerException("Can't create the chosen strategy without parameters");
    }

    @Override
    public abstract SelectStrategy createStrategy(int comparisonElement);

}
