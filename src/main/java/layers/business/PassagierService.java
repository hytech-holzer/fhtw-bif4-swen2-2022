package layers.business;

import layers.model.Flug;
import layers.model.Passagier;

import java.util.Collection;

public interface PassagierService {

    Collection<Passagier> getPassagierListeForFlug(Flug flug);

    void savePassagier(Passagier passagier);

}
