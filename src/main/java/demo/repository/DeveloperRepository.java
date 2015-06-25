package demo.repository;

import demo.model.Category;
import demo.model.Developer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
  public interface DeveloperRepository extends PagingAndSortingRepository<Developer, Long> {
       public List<Developer> findByCategory(@Param("category") Category category);
       public List<Developer> findByName(@Param("name") String name);
  }

