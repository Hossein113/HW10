package maktab74.practice10.org.Base.service.Imple;

import maktab74.practice10.org.Base.domain.BaseEntity;
import maktab74.practice10.org.Base.repository.BaseRpository;
import maktab74.practice10.org.Base.service.BaseService;

import java.io.Serializable;

public class BaseServiceImple <E extends BaseEntity<ID>, ID extends Serializable , R extends BaseRpository<E , ID>>
        implements BaseService<E, ID>
{

    protected final R repository ;

    public BaseServiceImple(R repository) {
        this.repository = repository;
    }

    @Override
    public E save(ID id) {
        return repository.save(id);
    }

    @Override
    public void read() {
        repository.read();

    }
}
