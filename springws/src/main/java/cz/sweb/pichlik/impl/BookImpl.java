package cz.sweb.pichlik.impl;

import java.io.Serializable;

import cz.sweb.pichlik.Book;

public class BookImpl implements Serializable, Book {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String author;

    public BookImpl() {
        super();
    }

    public BookImpl(Long id, String name, String author) {
        super();
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof BookImpl))
            return false;
        BookImpl other = (BookImpl) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
    }
}
