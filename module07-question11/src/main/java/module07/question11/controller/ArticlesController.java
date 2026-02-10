package module07.question11.controller;

import lombok.AllArgsConstructor;
import module07.question11.dao.ArticlesDao;
import module07.question11.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collections;

@AllArgsConstructor
@Controller
public class ArticlesController {

    private ArticlesDao articlesDao;

    // http://localhost:8080/articles
    @GetMapping("/articles")
    public ModelAndView listArticles() {
        return new ModelAndView(
                "index",
                Collections.singletonMap("articles", articlesDao.findAll())
        );
    }

    // having the @ResponseBody annotation means it will just serialize the response and returning it as text (unformatted)
    // http://localhost:8080/articlesResponseBody
    // curl -H 'Accept: application/json' localhost:8080/articlesResponseBody |jq
    // curl -H 'Accept: application/xml' localhost:8080/articlesResponseBody |xml_pp
    @GetMapping("/articlesResponseBody")
    @ResponseBody
    public Iterable<Article> listArticlesResponseBody() {
        return articlesDao.findAll();
    }

    // this doesn't have the @ResponseBody annotation and the response will result in an error
    // http://localhost:8080/articlesWithoutResponseBody
    @GetMapping("/articlesWithoutResponseBody")
    public Iterable<Article> listArticlesWithoutResponseBody() {
        return articlesDao.findAll();
    }
}
