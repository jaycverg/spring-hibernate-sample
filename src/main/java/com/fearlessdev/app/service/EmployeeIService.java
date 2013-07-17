package com.fearlessdev.app.service;

import com.fearlessdev.app.model.Employee;
import java.util.List;

/**
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
public interface EmployeeIService
{

    Employee save(Employee employee);

    Employee update(Employee employee);

    void delete(Long id);

    Employee find(Long id);

    List<Employee> findAll();
}
