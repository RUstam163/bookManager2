package bookManager.controller;

import bookManager.model.Author;
import bookManager.model.Book;
import bookManager.model.Genre;
import bookManager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping(value = "/book")
    public ModelAndView allBook() {
        List<Book> books = bookService.allBook();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookPage");
        modelAndView.addObject("bookList", books);
        return modelAndView;
    }

    @GetMapping(value = "/addBook")
    public ModelAndView addBookPage() {
        List<Genre> genres = bookService.genreList();
        List<Author> authors = bookService.authorList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookAddPage");
        modelAndView.addObject("genreList", genres);
        modelAndView.addObject("authorList", authors);
        return modelAndView;
    }

    @PostMapping(value = "/addBook")
    public ModelAndView addBook(@ModelAttribute("book") Book book) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/book");
        bookService.add(book);
        return modelAndView;
    }

    @GetMapping(value = "/deleteBook/{id}")
    public ModelAndView deleteBook(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/book");
        Book book = bookService.getById(id);
        bookService.delete(book);
        return modelAndView;
    }

    @GetMapping(value = "/editBook/{id}")
    public ModelAndView editPage(@PathVariable("id") int id) {
        Book book = bookService.getById(id);
        List<Genre> genres = bookService.genreList();
        List<Author> authors = bookService.authorList();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bookEditPage");
        modelAndView.addObject("genreList", genres);
        modelAndView.addObject("authorList", authors);
        modelAndView.addObject("book", book);
        return modelAndView;
    }

    @PostMapping(value = "/editBook")
    public ModelAndView editBook(@ModelAttribute("book") Book book) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:/book");
        bookService.edit(book);
        return modelAndView;
    }
}
