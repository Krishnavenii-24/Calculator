package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalciController {
	@Autowired
	CalcService calcService;
   @RequestMapping("/")
   public String home() {
	   return "home";
   }
   @PostMapping("/calculate")
   public String performOperation(@RequestParam("num1") double num1,@RequestParam("num2") double num2 ,@RequestParam("operation") String opt,Model model) {
	   double res;
	   switch(opt) {
	   case "add"->res=calcService.add(num1, num2);
	   case "sub"->res=calcService.sub(num1, num2);
	   case "mul"->res=calcService.mul(num1, num2);
	   case "div"->res=calcService.div(num1,num2);
	   default-> {
		   model.addAttribute("errrmsg","Invalid Operation");
		   return "result";
	   }

	   }
	   System.out.println(res);
	   model.addAttribute("res",res);
	   model.addAttribute("operation",opt);
	   return "result";
   }
}