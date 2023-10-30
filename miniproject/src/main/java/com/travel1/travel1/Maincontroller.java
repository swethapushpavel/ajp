package com.travel1.travel1;
    import java.util.ArrayList;
    import java.util.List;
    import java.util.Optional;
    
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.DeleteMapping;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.PostMapping;
    import org.springframework.web.bind.annotation.PutMapping;
    import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel1.travel1.Model.User;
import com.travel1.travel1.Repo.Userrepo;
import com.travel1.travel1.Service.Userserv;
    @RestController
    @RequestMapping("/api/ticketdetails")
    public class Maincontroller {    
    @Autowired
      Userrepo userRepo;
      @Autowired
      Userserv userServ;
      @GetMapping("/all")
      public List<User> getByCategory() {
        return (ArrayList<User>) userRepo.findAll();
      }
      @PostMapping("/insert")
      public String insertUser(@RequestBody User user) {
        //userServ.addUser(user);
        userRepo.save(user);
        return "Data successfully inserted!";
      }
      @GetMapping("display/user{id}")
      public Optional<User> getById(@PathVariable long id) {
        Optional<User> user = userServ.getUserById(id);
        return user;
      }
      @PutMapping("/update/user{id}")
      public String updateUser(@PathVariable long id, @RequestBody User user) {
        user.setId(id);
        userServ.updateUser(id, user);
        return "Updated Sucessfully.";
      }
    @DeleteMapping("/delete/user{id}")
      public String deleteUser(@PathVariable long id) {
        userServ.deleteUser(id);
        return "Deleted Sucessfully.";
      }
    
      private static List<ticketdetails> details = new ArrayList<ticketdetails>();
    
      @GetMapping
    public List<ticketdetails> getDetails() {
        return details;

    }

    @PostMapping
    public ticketdetails addDetails(@RequestBody ticketdetails detail) {
        details.add(detail);
        return detail;
    }
    
    }
    

