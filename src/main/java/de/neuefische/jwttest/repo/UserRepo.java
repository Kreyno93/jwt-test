package de.neuefische.jwttest.repo;

import de.neuefische.jwttest.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, String> {

    User findByUsername(String username);
    User findByEmail(String email);


}
