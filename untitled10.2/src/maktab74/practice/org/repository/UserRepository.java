package maktab74.practice.org.repository;

import maktab74.practice.org.Base.repository.BaseRepository;
import maktab74.practice.org.domain.User;

import java.io.IOException;

public interface UserRepository extends BaseRepository<User, Long> {

  void save(User user) throws IOException;
}
