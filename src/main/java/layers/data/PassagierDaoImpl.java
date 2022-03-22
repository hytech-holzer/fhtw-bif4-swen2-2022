package layers.data;

import layers.model.Passagier;

import java.util.Collection;

public class PassagierDaoImpl implements PassagierDao {
    @Override
    public Collection<Passagier> getAllPassagiere() {
        return null;
    }

    @Override
    public void savePassagier(Passagier passagier) {
        // jdbc call
        // ...
        System.out.println(passagier + " saved.");
    }
}
