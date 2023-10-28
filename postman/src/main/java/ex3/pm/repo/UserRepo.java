package ex3.pm.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ex3.pm.user.User;


@Repository
public interface UserRepo extends CrudRepository<User, Long> { }
