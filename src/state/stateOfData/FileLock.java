package state.stateOfData;

class FileLock implements DataState {

    protected static FileLock _sFileLock = new FileLock();

    @Override
    public void read(DataContext context) {
        changeState(context, FileOpen.sFileOpen);
        System.out.println("File read " + context);
    }

    @Override
    public void write(DataContext context) {
        context.changeDataState(this);
        System.out.println("Cannot read file while its locked");
    }

    @Override
    public void changeState(DataContext context, DataState state) {
        context.changeDataState(state);
    }
}
