package com.fearlessdev.app.service;

import com.fearlessdev.app.dao.EmployeeIDAO;
import com.fearlessdev.app.model.Employee;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
@Service
@Transactional
public class EmployeeService implements EmployeeIService
{
    @Autowired
    private EmployeeIDAO repository;

    @Override
    public Employee save(Employee employee)
    {
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee)
    {
        return repository.save(employee);
    }

    @Override
    public void delete(Long id)
    {
        Employee employee = repository.findOne(id);
        repository.delete(employee);
    }

    @Override
    public Employee find(Long id)
    {
        return repository.findOne(id);
    }

    @Override
    public List<Employee> findAll()
    {
        return (List<Employee>) repository.findAll();
    }

}
