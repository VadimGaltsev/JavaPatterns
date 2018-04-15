package state.stateOfData;

public class DataFile extends DataContext {

    public DataFile() {
        mDataState = FileOpen.sFileOpen;
    }

    @Override
    void changeDataState(DataState state) {
        mDataState = state;
    }

    public DataState getState() {
        return mDataState;
    }

    @Override
    public void readData() {
        mDataState.read(this);
    }

    @Override
    public void write() {
        mDataState.write(this);
    }
}
