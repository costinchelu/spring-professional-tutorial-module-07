package module07.question11.dao;

import module07.question11.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticlesDao extends CrudRepository<Article, Integer> {
}
