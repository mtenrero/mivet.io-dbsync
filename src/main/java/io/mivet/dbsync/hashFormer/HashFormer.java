package io.mivet.dbsync.hashFormer;

public interface HashFormer<T,S> {

    public T genHash(S columnsData);
}
