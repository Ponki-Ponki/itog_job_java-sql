package app;

import java.util.ArrayList;
import java.util.Collection;

public class PackBase implements DataBase<PackAnimal>{

    private ArrayList<PackAnimal> packCollection;

    @Override
    public void add(PackAnimal item) {
        packCollection.add(item);

    }

    @Override
    public Collection<PackAnimal> getAll() {
        return packCollection;
    }
}
