package SpringPractice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {

    /*
    - add repository
    - add constructor dependency injection
    - addmethod
    - finall method
    - delete all method
     */

    private final RepositoryInterface repo;


    public ServiceClass(RepositoryInterface repo) {
        this.repo = repo;
    }

    public ModelClass add(ModelClass user){
        return repo.save(user);
    }

    public List<ModelClass> findAll(){

        return repo.findAll();
    }

    public void clearForm(){
        repo.deleteAll();;
    }
}
