package layers.business;

import layers.data.PassagierDao;
import layers.data.PassagierDaoImpl;
import layers.model.Flug;
import layers.model.Passagier;

import java.util.Collection;

public class PassagierServiceImpl implements PassagierService {

    private PassagierDao passagierDao;

    @Override
    public Collection<Passagier> getPassagierListeForFlug(Flug flug) {
        return null;
    }

    @Override
    public void savePassagier(Passagier passagier) {
        // validate passagier
        // ...

        passagierDao.savePassagier(passagier);
    }

    {
        passagierDao = new PassagierDaoImpl();
    }
}
