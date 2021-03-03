package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectEvenStrategy;
import lab01.tdd.selectStrategy.SelectStrategy;

public class SelectEvenStrategyFactory implements  SelectStrategyFactory{

    @Override
    public SelectStrategy createStrategy() {
        return new SelectEvenStrategy();
    }

    @Override
    public SelectStrategy createStrategy(final int comparisonElement) {
        throw new IllegalCallerException("Can't invoke this method on class: " + this.getClass().getName());
    }

}
