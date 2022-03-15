package be.vdab.bootstrap.controllers;

import be.vdab.bootstrap.domain.Persoon;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public ModelAndView index() {
        return new ModelAndView("index", "personen", new Persoon[] {
                new Persoon(1, "Eddy", "Wally", "Ertevelde"),
                new Persoon(2, "Johny", "Turbo", "Kortrijk"),
                new Persoon(3, "Bobbejaan", "Schoepen", "Turnhout")
        });
    }
}
