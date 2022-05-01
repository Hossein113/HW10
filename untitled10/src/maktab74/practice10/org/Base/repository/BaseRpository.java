package maktab74.practice10.org.Base.repository;

import maktab74.practice10.org.Base.domain.BaseEntity;

import java.io.Serializable;

public interface BaseRpository <E extends BaseEntity<ID>, ID extends Serializable> {

    E save(ID id);

    void read();

}
