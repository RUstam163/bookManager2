package bookManager.controller;

import bookManager.model.Author;
import bookManager.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AuthorController {
    private AuthorService authorService;

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping(value = "/author")
    public ModelAndView allAuthor() {
        List<Author> authors = authorService.allAuthor();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorPage");
        modelAndView.addObject("authorList", authors);
        return modelAndView;
    }

    @GetMapping(value = "/deleteAuthor/{id}")
    public ModelAndView deleteAuthor(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        Author author = authorService.getById(id);
        authorService.delete(author);
        return modelAndView;
    }

    @GetMapping(value = "/addAuthor")
    public ModelAndView addAuthorPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorAddPage");
        return modelAndView;
    }

    @PostMapping(value = "/addAuthor")
    public ModelAndView addAuthor(@ModelAttribute("author") Author author) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        authorService.add(author);
        return modelAndView;
    }

    @GetMapping(value = "/editAuthor/{id}")
    public ModelAndView editGenrePage(@PathVariable("id") int id) {
        Author author = authorService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorEditPage");
        modelAndView.addObject("author", author);
        return modelAndView;
    }

    @PostMapping(value = "/editAuthor")
    public ModelAndView editGenre(@ModelAttribute("author") Author author) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        authorService.edit(author);
        return modelAndView;
    }

}
