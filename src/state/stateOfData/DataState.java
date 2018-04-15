package state.stateOfData;

interface DataState {
    void read(DataContext context);
    void write(DataContext context);
    void changeState(DataContext context, DataState state);
}
