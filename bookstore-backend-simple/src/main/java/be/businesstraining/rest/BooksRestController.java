package be.businesstraining.rest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.businesstraining.entities.Book;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BooksRestController {
    
    private List<Book> mockBooks = new ArrayList<>(List.of(       
       new Book (2L," Mikael Krief","Some description Lorem ipsum Lorem ipsum","https://static.packt-cdn.com/products/9781838642730/cover/smaller",BigDecimal.TEN,"Learning DevOps"),
       new Book (3L,"Jeff Nickoloff and Stephen Kuenzli","Some description Lorem ipsum Lorem ipsum","https://drek4537l1klr.cloudfront.net/nickoloff2/Figures/cover.jpg",BigDecimal.TEN,"Docker in action, 2nd Edition"),
       new Book (4L,"Brendan Burns, Joe Beda, Kelsey Hightower","Some description Lorem ipsum Lorem ipsum","https://covers.oreilly.com/images/0636920223788/cat.gif",BigDecimal.TEN,"Kubernetes: Up and Running, 2nd Edition")
       
    ));

    @GetMapping
    public List<Book> findAll() {
        return this.mockBooks ;
    }
    
   
}
