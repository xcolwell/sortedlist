package nu.lodes.sortedlist;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nullable;


public interface SortedList<E> extends List<E> {
    boolean insert(E value);
    boolean insertAll(Collection<? extends E> values);

    E first();
    E last();
    
    @Nullable E lower(E value);
    @Nullable E lower(Comparable<? super E> q);
    
    int lowerIndex(E value);
    int lowerIndex(Comparable<? super E> q);
    
    @Nullable E floor(E value);
    @Nullable E floor(Comparable<? super E> q);
    
    int floorIndex(E value);
    int floorIndex(Comparable<? super E> q);
    
    @Nullable E higher(E value);
    @Nullable E higher(Comparable<? super E> q);
    
    int higherIndex(E value);
    int higherIndex(Comparable<? super E> q);
    
    @Nullable E ceiling(E value);
    @Nullable E ceiling(Comparable<? super E> q);
    
    int ceilingIndex(E value);
    int ceilingIndex(Comparable<? super E> q);
}
