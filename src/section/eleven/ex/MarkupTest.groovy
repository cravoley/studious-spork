package section.eleven.ex

import groovy.xml.MarkupBuilder

def books = [];
books << new Book("978-1935182443", "Groovy in Action 2nd Edition", "Dierk Koenig", 50.58);
books << new Book("978-1935182948", "Making Java Groovy", "Ken Kousen", 33.96);
books << new Book("978-1937785307", "Programming Groovy 2: Dynamic Productivity for the Java Developer", "Venkat Subramaniam", 28.92);

MarkupBuilder builder = new MarkupBuilder();
builder.books {
    books.each { bookEntry ->
        book(isbn: bookEntry.isbn) {
            title bookEntry.title;
            author bookEntry.author;
            price bookEntry.price;
        }
    }
}