package demo.repository;

import demo.model.Manager;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by poo2 on 17/06/2015.
 */
 public interface ManagerRepository extends PagingAndSortingRepository<Manager, Long> {
     public List<Manager> findByBonusSuccessGreaterThan(@Param("bonusSuccess") Double bonusSuccess);
     public List<Manager> findByLastname(@Param("lastname") String lastname);
 }

