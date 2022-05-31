package maktab74.practice.org.service;

import maktab74.practice.org.Base.service.BaseService;
import maktab74.practice.org.domain.User;

import java.io.IOException;

public interface UserService extends BaseService<User, Long> {

    void save(User user) throws IOException;

}
