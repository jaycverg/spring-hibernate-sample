package com.fearlessdev.app.controller;

import com.fearlessdev.app.model.Employee;
import com.fearlessdev.app.service.EmployeeIService;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jaycverg <jaycverg@gmail.com>
 */
@Controller
public class EmployeeController
{

    @Autowired
    private EmployeeIService service;

    /**
     * Handles GET request for "/" URL mapping
     *
     * @param model - the holder of view data
     */
    @RequestMapping("/")
    public String viewList(Map model)
    {
        model.put("list", service.findAll());
        return "index";
    }

    /**
     * Handles GET request for "/employee/{id}" URL mapping
     *
     * @param id - the value of the path variable id
     * @param model - the holder of view data
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String view(@PathVariable Long id, Map model)
    {
        model.put("entity", service.find(id));
        return "view";
    }

    /**
     * Handles POST request for "/employee/{id}" URL mapping
     *
     * @param entity - the object that represents the posted data from the view
     * @param binding - the holder of validation results 
     */
    @RequestMapping(value = "/employee/{id}", method = RequestMethod.POST)
    public String update(@Valid @ModelAttribute("entity") Employee entity, BindingResult binding)
    {
        return post(entity, binding);
    }

    /**
     * Handles GET request for "/employee/create" URL mapping
     *
     * @param entity - the object that will be exposed to the view
     */
    @RequestMapping(value = "/employee/create", method = RequestMethod.GET)
    public String create(@ModelAttribute("entity") Employee entity)
    {
        return "view";
    }

    /**
     * Handles POST request for "/employee/create" URL mapping
     *
     * @param entity - the object that represents the posted data from the view
     * @param binding - the holder of validation results
     */
    @RequestMapping(value = "/employee/create", method = RequestMethod.POST)
    public String post(@Valid @ModelAttribute("entity") Employee entity, BindingResult binding)
    {
        if (binding.hasErrors()) {
            return "view";
        }

        service.save(entity);

        return "redirect:/";
    }
}
