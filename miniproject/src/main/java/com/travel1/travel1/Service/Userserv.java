package com.travel1.travel1.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel1.travel1.Model.User;
import com.travel1.travel1.Repo.Userrepo;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
@Service
public class Userserv implements UserService{
      @Autowired
  Userrepo userRepo;
  @Override
  public void deleteUser(long id) {
    userRepo.deleteById(id);
  }
  @Override
  public void addUser(User user) {
    userRepo.save(user);
  }
@Override
  public void updateUser(long id, User user) {
    userRepo.save(user);
  }
  @Override
  public Optional<User> getUserById(long id) {
    return userRepo.findById(id);
  }
  @Override
  public List<User> getAll() {
    return (List<User>) userRepo.findAll();
  }
}
