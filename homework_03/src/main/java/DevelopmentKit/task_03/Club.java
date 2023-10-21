package DevelopmentKit.task_03;

import java.util.Iterator;

public class Club <T extends Person> implements Iterable<T>{
    private T[] community;

    public Club(T[] community) {
        this.community = community;
    }

    public void restForAll() {
        for (T t: community) {
            t.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<T>();
    }

//    Внедрить итератор из задания 2 в коллекцию, написанную в задании 3 таким образом,
//    чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.

    public class ParamIterator<T extends Person> implements Iterator<T> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < community.length;
        }

        @Override
        public T next() {
            return (T)community[index++];
        }
    }
}
