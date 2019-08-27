package bookManager.controller;

import bookManager.model.Genre;
import bookManager.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GenreController {
    private GenreService genreService;

    @Autowired
    public void setGenreService(GenreService genreService) {
        this.genreService = genreService;
    }

    @RequestMapping(value = "/genre", method = RequestMethod.GET)
    public ModelAndView allGenre() {
        List<Genre> genres = genreService.allGenre();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("genrePage");
        modelAndView.addObject("genreList", genres);
        return modelAndView;
    }

    @RequestMapping(value = "/deleteGenre/{id}", method = RequestMethod.GET)
    public ModelAndView deleteGenre(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/genre");
        Genre genre = genreService.getById(id);
        genreService.delete(genre);
        return modelAndView;
    }

    @RequestMapping(value = "/addGenre", method = RequestMethod.GET)
    public ModelAndView addGenrePage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("genreAddPage");
        return modelAndView;
    }

    @RequestMapping(value = "/addGenre", method = RequestMethod.POST)
    public ModelAndView addGenre(@ModelAttribute("genre") Genre genre) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/genre");
        genreService.add(genre);
        return modelAndView;
    }

    @GetMapping(value = "/editGenre/{id}")
    public ModelAndView editGenrePage(@PathVariable("id") int id) {
        Genre genre = genreService.getById(id);
        return new ModelAndView("genreEditPage","genre", genre);
    }

    @PostMapping(value = "/editGenre")
    public ModelAndView editGenre(@ModelAttribute("genre") Genre genre) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/genre");
        genreService.edit(genre);
        return modelAndView;
    }

}
