package momento.list_momento;

import java.util.ArrayList;

public class CacheableList extends ArrayList<String> {

    ListMomento _Momento;

    public void restoreStateFrom(ListMomento _momento) {
        this.clear();
        this.addAll(_momento.restoreState());
    }

    public ListMomento createMomento () {
        _Momento = new ListMomento() {
            ArrayList<String> _List = new ArrayList<>();
            @Override
            public void saveState() {
                _List.addAll(CacheableList.this);
            }

            @Override
            public ArrayList<String> restoreState() {
                return _List;
            }
        };
        return _Momento;
    }

    public interface ListMomento {
        void saveState();
        ArrayList<String> restoreState();
    }
}
