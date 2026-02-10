package module07.question10.dao;

import module07.question10.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticlesDao extends CrudRepository<Article, Integer> {
}
