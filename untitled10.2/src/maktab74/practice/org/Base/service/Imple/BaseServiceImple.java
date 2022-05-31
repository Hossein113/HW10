package maktab74.practice.org.Base.service.Imple;

import maktab74.practice.org.Base.domain.BaseEntity;
import maktab74.practice.org.Base.repository.BaseRepository;
import maktab74.practice.org.Base.service.BaseService;

import java.io.Serializable;

public class BaseServiceImple<E extends BaseEntity<ID>, ID extends Serializable, R extends BaseRepository<E, ID>>
        implements BaseService<E, ID> {

    protected final R repository;

    public BaseServiceImple(R repository) {
        this.repository = repository;
    }
}
