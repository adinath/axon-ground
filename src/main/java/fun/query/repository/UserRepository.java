package fun.query.repository;


import fun.query.views.UserView;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserView, String> {
}
