package maktab74.practice10.org.Base.repository.Imple;

import maktab74.practice10.org.Base.domain.BaseEntity;
import maktab74.practice10.org.Base.repository.BaseRpository;

import java.io.Serializable;

public class BaseRepositoryImple<E extends BaseEntity<ID> , ID extends Serializable>
        implements BaseRpository<E, ID> {
    @Override
    public E save(ID id) {
        return null;
    }

    @Override
    public void read() {

    }
}
