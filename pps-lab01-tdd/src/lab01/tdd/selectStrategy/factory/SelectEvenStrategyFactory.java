package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectEvenStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;

public class SelectEvenStrategyFactory extends AbstractComparisonStrategyFactory{

    @Override
    public SelectStrategy createStrategy() {
        return new SelectEvenStrategy();
    }

    @Override
    public SelectStrategy createStrategy(int comparisonElement) {
        throw new IllegalCallerException("Can't create the chosen strategy without parameters");
    }


}
