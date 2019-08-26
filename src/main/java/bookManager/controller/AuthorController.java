package bookManager.controller;

import bookManager.model.Author;
import bookManager.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AuthorController {
    private AuthorService authorService;

    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public ModelAndView allAuthor() {
        List<Author> authors = authorService.allAuthor();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorPage");
        modelAndView.addObject("authorList", authors);
        return modelAndView;
    }

    @RequestMapping(value = "/deleteAuthor/{id}", method = RequestMethod.GET)
    public ModelAndView deleteAuthor(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        Author author = authorService.getById(id);
        authorService.delete(author);
        return modelAndView;
    }

    @RequestMapping(value = "/addAuthor", method = RequestMethod.GET)
    public ModelAndView addAuthorPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorAddPage");
        return modelAndView;
    }

    @RequestMapping(value = "/addAuthor", method = RequestMethod.POST)
    public ModelAndView addAuthor(@ModelAttribute("author") Author author) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        authorService.add(author);
        return modelAndView;
    }

    @RequestMapping(value = "/editAuthor/{id}", method = RequestMethod.GET)
    public ModelAndView editGenrePage(@PathVariable("id") int id) {
        Author author = authorService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("authorEditPage");
        modelAndView.addObject("author", author);
        return modelAndView;
    }

    @RequestMapping(value = "/editAuthor", method = RequestMethod.POST)
    public ModelAndView editGenre(@ModelAttribute("author") Author author) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/author");
        authorService.edit(author);
        return modelAndView;
    }

}
