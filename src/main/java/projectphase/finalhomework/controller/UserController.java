package projectphase.finalhomework.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import projectphase.finalhomework.user.LoginDTO;

@RestController
public class UserController {

  @RequestMapping(path = "/", method = RequestMethod.GET)
  public String hello(){
    return "Hello";
  }

  @RequestMapping(path = "/login", method = RequestMethod.POST)
  public String login(@RequestBody LoginDTO loginDTO){
    return "redirect:/";
  }
}
