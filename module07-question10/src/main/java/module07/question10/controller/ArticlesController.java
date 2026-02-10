package module07.question10.controller;

import lombok.AllArgsConstructor;
import module07.question10.dao.ArticlesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class ArticlesController {

    private ArticlesDao articlesDao;

    // http://localhost:8080/articles
    @GetMapping("/articles")
    public String listArticles(Model model) {
        model.addAttribute("articles", articlesDao.findAll());

        return "index";
    }
}
