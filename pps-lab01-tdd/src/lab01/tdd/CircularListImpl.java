package lab01.tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    List<Integer> list = new ArrayList<>();
    int actualIndex = 0;

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
        if(list.isEmpty()){
            return Optional.empty();
        }
        Optional<Integer> nextValue= Optional.of(list.get(actualIndex));
        incrementActualIndex();
        return nextValue;
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

    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        return Optional.empty();
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
}
