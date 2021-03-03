package lab01.tdd.selectStrategy.factory;

import lab01.tdd.selectStrategy.SelectStrategy;

/**
 * Use the AbstractFactory pattern to create a new Strategy.
 */
public interface SelectStrategyFactory {

    SelectStrategy createStrategy();

    SelectStrategy createStrategy(final int comparisonElement);

}
