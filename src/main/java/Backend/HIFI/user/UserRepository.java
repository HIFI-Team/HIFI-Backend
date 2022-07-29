package Backend.HIFI.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findUserByEmail(String email);
    User findUserById(Long id);


//    @Modifying
//    @Query(value = "INSERT INTO FOLLOWING(FOLLOWER, FOLLOWING) VALUES(:user1, :user2)", nativeQuery = true)
//    int follow(int user1, int user2);
}