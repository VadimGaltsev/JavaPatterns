package state;

import state.stateOfData.DataFile;

public class MainState {
    public static void main(String[] args) {
        DataFile file = new DataFile();
        System.out.println(file.getState());
        file.write();
        System.out.println(file.getState());
        file.readData();
        System.out.println(file.getState());
    }
}
