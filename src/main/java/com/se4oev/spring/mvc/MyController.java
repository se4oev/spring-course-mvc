package com.se4oev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by se4oev on 06.02.2022
 * Description:
 */
@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmpDetails(Model model) {

//        Employee emp = new Employee();
//        emp.setName("Ivan");
//        emp.setSurname("Ivanov");
//        emp.setSalary(500);

        model.addAttribute("employee", new Employee());

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {

        System.out.println("surname length = " + emp.getSurname().length());

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
//
//        String name = emp.getName();
//        emp.setName("Mr. " + name);
//
//        String surname = emp.getSurname();
//        emp.setSurname(surname + "!");
//
//        int salary = emp.getSalary();
//        emp.setSalary(salary * 10);
//
//        return "show-emp-details-view";
//    }

}
