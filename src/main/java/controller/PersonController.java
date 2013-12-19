package controller;

import model.Person;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {
	
	@RequestMapping(value="/addPerson", method=RequestMethod.GET)
	public ModelAndView get(){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("person", new Person());
		modelAndView.setViewName("addPerson.jsp");
		return modelAndView;
	}
	
	@RequestMapping(value="/addPerson", method=RequestMethod.POST)
	public String post(Person person){
		System.out.println(person);
		return "redirect:index.html";

	}

}
