package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatoerController {

  @GetMapping("/")
  String showForm(){
    return "calculate";
  }
@RequestMapping("calculate")
  public ModelAndView caculate(@RequestParam(name="a1") float a1,
                               @RequestParam(name="a2") float a2,
                               @RequestParam(name="operator") String operator
                               ){
 ModelAndView modelAndView = new ModelAndView("/calculate");
 modelAndView.addObject("a1",a1);
 modelAndView.addObject("a2",a2);
 float result = 0;
 switch (operator){
   case "Addition(+)":
     result = a1+a2;
     break;
   case "Subtraction(-)":
     result = a1-a2;
     break;
   case "Multiplication(*)":
     result = a1 * a2;
     break;
   case "Division(/)":
     result = a1/a2;
     break;
   default:
     System.out.println("co loi");
 }
 modelAndView.addObject("result",result);
  return modelAndView;
}
}
