package com.suixingpay.controller;

import com.suixingpay.dao.EmployeeDao;
import com.suixingpay.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.Map;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String findAll(Map<String, Object> map){
        Collection<Employee> list = employeeDao.getAll();
        map.put("emps", list);
        return "emp/list";
    }
}
