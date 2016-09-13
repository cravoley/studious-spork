package section.eleven.ex.json

import groovy.json.JsonBuilder


def books = [];
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);
books << new Book(title: "A new book", author: new Author(first: "Valdo", last: "Raya"), isbn: "123", read: true);


JsonBuilder builder = new JsonBuilder();
//builder.books {
    builder books, {Book cBook ->
        book {
            title cBook.title;
            author cBook.author;
            isbn cBook.isbn;
            read cBook.read;
        }
    }
//}
println builder.toPrettyString()