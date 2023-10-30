package com.travel1.travel1.Repo;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travel1.travel1.Model.User;

@Repository
public interface Userrepo extends CrudRepository<User, Long> { }


