package example.training.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class IndexController {

	@GetMapping("zoom")
	public String index() {
		return "index";
	}

	@GetMapping("greeting")
	public String greeting( Model model ) {
		return "greeting";
	}

	@PostMapping("greeting")
	public String greeting( @ModelAttribute( name = "firstName" ) String firstName,
			@ModelAttribute( name = "lastName" ) String lastName, Model model ) {
		model.addAttribute( "name", firstName );
		model.addAttribute( "name", lastName );
		return "greeting";
	}
}
