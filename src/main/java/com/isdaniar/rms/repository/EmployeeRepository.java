package com.isdaniar.rms.repository;

import com.isdaniar.rms.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Isdaniar_F on 23/03/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, String> {

    @Query("SELECT e from Employee e where e.firstName like %?1% or e.lastName like %?1%")
    List<Employee> findByName(@Param("searchKey") String searchKey);
}
