package hashFormer;

public interface HashFormer<T,S> {

    public T genHash(S columnsData);
}
