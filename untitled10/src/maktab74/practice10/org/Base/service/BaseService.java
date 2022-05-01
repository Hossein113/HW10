package maktab74.practice10.org.Base.service;

import maktab74.practice10.org.Base.domain.BaseEntity;

import java.io.Serializable;

public interface BaseService <E extends BaseEntity<ID>, ID extends Serializable> {

    E save(ID id);

    void read();
}
