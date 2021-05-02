package com.hzdawoud.ownspringapp.bootstrap;

import com.hzdawoud.ownspringapp.domain.Author;
import com.hzdawoud.ownspringapp.domain.Book;
import com.hzdawoud.ownspringapp.domain.Publisher;
import com.hzdawoud.ownspringapp.repository.AuthorRepository;
import com.hzdawoud.ownspringapp.repository.BookRepository;
import com.hzdawoud.ownspringapp.repository.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author hazem = new Author("Hazem", "Dawoud");
        Book book = new Book("Spring backend book", "123123");
        hazem.getBooks().add(book);
        book.getAuthors().add(hazem);

        Publisher publisher = new Publisher("Al-Mansoura", "gaza" ,"none", "+972");

        authorRepository.save(hazem);
        bookRepository.save(book);

        Author rod = new Author("Rod", "Dawoud");
        Book springBook = new Book("j2ee development", "6546546");
        hazem.getBooks().add(book);
        book.getAuthors().add(hazem);

        authorRepository.save(rod);
        bookRepository.save(springBook);
        publisherRepository.save(publisher);

        System.out.println("started in bootstrap");
        System.out.println("number of books: " + bookRepository.count());
        System.out.println("number of publishers: " + publisherRepository.count());
    }
}
