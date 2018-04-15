package momento;

import momento.list_momento.CacheableList;

import java.util.Arrays;

public class MainClassMomento {

    public static void main(String[] args) {
        CacheableList cacheableList = new CacheableList();
        cacheableList.add("Hello");
        CacheableList.ListMomento _momento = cacheableList.createMomento();
        _momento.saveState();
        cacheableList.add("From");
        cacheableList.add("Momento");
        System.out.println(Arrays.toString(cacheableList.toArray()));
        cacheableList.restoreStateFrom(_momento);
        System.out.println(Arrays.toString(cacheableList.toArray()));
    }
}
