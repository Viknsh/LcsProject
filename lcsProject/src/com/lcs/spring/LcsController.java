package com.lcs.spring;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.lcs.service.LcsService;
import com.vo.Lcs;

@Controller
public class LcsController {
	
//	@Autowired
//	LcsService lcsService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/lcs", method = RequestMethod.POST, produces = "application/json")
	public String lcsResult(Lcs lcs, Model model) {
		
//		Lcs lcs = objectMapper.readValue(params, Lcs.class);
		String firstString = lcs.getFirstString();
		String secondString = lcs.getSecondString();
		
		LcsService lcsService = new LcsService();
		String resultStr = lcsService.getLcs(firstString, secondString);
		
		model.addAttribute("lcsResult", resultStr );
		model.addAttribute("lcs", lcs.getFirstString()+" and "+lcs.getSecondString() );
		return "lcsResult";
		
	}

}
