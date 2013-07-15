package com.fearlessdev.app.dao;

import com.fearlessdev.app.model.Employee;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
public interface EmployeeIDAO extends CrudRepository<Employee, Long>
{
    
}
