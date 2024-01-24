import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookResolver implements GraphQLQueryResolver {

    public List<Book> getAllBooks() {
        // Implement logic to fetch and return all books from your data source
        // For simplicity, a static list is used in this example
        return List.of(new Book(1L, "Book 1", "Author 1"), new Book(2L, "Book 2", "Author 2"));
    }
}
