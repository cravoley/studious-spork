package section.eleven.ex

import groovy.transform.Canonical
import groovy.xml.MarkupBuilder

/**
 * Created by cravo on 13/09/2016.
 */

def books = [];
books << new Book("978-1935182443", "Groovy in <i>Action</i> 2nd Edition", "Dierk Koenig", 50.58);
books << new Book("978-1935182948", "Making Java Groovy", "Ken Kousen", 33.96);
books << new Book("978-1937785307", "Programming Groovy 2: Dynamic Productivity for the Java Developer", "Venkat Subramaniam", 28.92);

MarkupBuilder builder = new MarkupBuilder();
builder.html {
    head {
        title "Book list";
        keywords = "book, list, groovy, java";
    }
    body {
        ul {
            books.each { bookEntry ->
                li("data-isbn": bookEntry.isbn) {
                    div(class: "title") { mkp.yieldUnescaped(bookEntry.title); }
                    div(class: "author") { mkp.yieldUnescaped(bookEntry.author); }
                    div(class: "price") { mkp.yieldUnescaped(bookEntry.price); }
                }
            }
        }
    }
}