package tutorial.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tutorial.jokesapp.services.JokeService;

@Controller
public class ChuckNorrisJokeController {
    private final JokeService jokeService;

    public ChuckNorrisJokeController(@Qualifier("chuckNorrisJokeService") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping("/")
    public String getChuckNorrisJoke(Model model) {


        return "chuck";
    }
}
