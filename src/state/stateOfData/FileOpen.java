package state.stateOfData;

class FileOpen implements DataState {

    protected static FileOpen sFileOpen = new FileOpen();

    @Override
    public void read(DataContext context) {
        context.changeDataState(this);
        System.out.println("Read file " + context);
    }

    @Override
    public void write(DataContext context) {
        changeState(context, FileLock._sFileLock);
        System.out.println("Writing file " + context);
    }

    @Override
    public void changeState(DataContext context, DataState state) {
        context.changeDataState(state);
    }
}
