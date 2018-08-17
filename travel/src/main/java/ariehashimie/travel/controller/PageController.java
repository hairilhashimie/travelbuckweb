package ariehashimie.travel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ariehashimie.travellingback.dao.CategoryDAO;
import ariehashimie.travellingback.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		
		//passing category list
		mv.addObject("categories", categoryDAO.list());
		
		
		mv.addObject("userClickHome", true);
		return mv;

	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About US");
		mv.addObject("userClickAbout", true);
		return mv;

	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", true);
		return mv;

	}

	@RequestMapping(value = { "/services" })
	public ModelAndView services() {

		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Services");
		mv.addObject("userClickServices", true);
		return mv;

	}
	
	/*
	 * Load of services based on category
	 */
	
	@RequestMapping(value = { "/show/category/{id}/services" })
	public ModelAndView showCategoryServices(@PathVariable("id") int id) {

		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO fetcher for single category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title", category.getName());
		
		//passing category list
		mv.addObject("categories", categoryDAO.list());
		
		//passing single category list
		mv.addObject("category", category);
		mv.addObject("userClickCategoryServices", true);
		return mv;

	}
	
	
	
	
	
	
	

}
