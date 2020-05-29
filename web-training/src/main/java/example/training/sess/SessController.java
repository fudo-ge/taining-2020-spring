package example.training.sess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes(names="reqForm")
public class SessController {

	@Autowired
	SessBean sessBean;

	@GetMapping("/sess")
	public String sessGet(Model model) {
		model.addAttribute("beanForm", sessBean.getValue());
		return "sess/SessTop";
	}

    @PostMapping("/sess")
	public String sessPost(@RequestParam("id")String id, Model model) {
    	sessBean.setValue( id );
		model.addAttribute("reqForm", id);
		return "sess/result";
	}

    @GetMapping("/delsess")
	public String sessDel(Model model, SessionStatus sessionStatus) {
    	sessionStatus.setComplete();
    	sessBean.setValue("");
		return "redirect:/sess";
	}

}