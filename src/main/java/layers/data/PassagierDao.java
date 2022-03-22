package layers.data;

import layers.model.Passagier;

import java.util.Collection;

public interface PassagierDao {

    Collection<Passagier> getAllPassagiere();
    void savePassagier(Passagier passagier);
}
