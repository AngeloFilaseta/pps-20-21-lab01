package lab01.tdd;

import lab01.tdd.selectStrategy.SelectStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private final List<Integer> list = new ArrayList<>();
    private int actualIndex = 0;

    @Override
    public void add(int element) {
        this.list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public Optional<Integer> next() {
        return next(v -> true);
    }

    @Override
    public Optional<Integer> previous() {
        if(list.isEmpty()){
            return Optional.empty();
        }
        decrementActualIndex();
        return Optional.of(list.get(actualIndex));
    }

    @Override
    public void reset() {
        actualIndex = 0;
    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        return nextByStrategy(strategy);
    }

    private void incrementActualIndex(){
        this.actualIndex += 1;
        this.actualIndex %= list.size();
    }

    private void decrementActualIndex(){
        if(actualIndex == 0){
            this.actualIndex = this.list.size() - 1;
        }else{
            this.actualIndex -= 1;
        }
    }

    private Optional<Integer> nextByStrategy(final SelectStrategy strategy){
        if(list.isEmpty()){
            return Optional.empty();
        }
        final int startIndex = actualIndex;
        do{
            int nextPure = list.get(actualIndex);
            incrementActualIndex();
            if(strategy.apply(nextPure)){
                return Optional.of(nextPure);
            }
        }while(actualIndex != startIndex);
        return Optional.empty();
    }

}
