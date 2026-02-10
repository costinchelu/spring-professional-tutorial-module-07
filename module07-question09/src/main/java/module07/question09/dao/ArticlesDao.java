package module07.question09.dao;

import module07.question09.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ArticlesDao extends CrudRepository<Article, Integer> {

    List<Article> findByBodyLikeIgnoreCase(String content);
}
