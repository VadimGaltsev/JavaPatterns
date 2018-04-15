package state.stateOfData;

public abstract class DataContext {
    DataState mDataState;

    public DataContext() {
    }

    abstract void changeDataState(DataState state);
    abstract void readData();
    abstract void write();
}
