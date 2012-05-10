package cz.sweb.pichlik;

public interface Book {

    public abstract Long getId();

    public abstract void setId(Long id);

    public abstract String getName();

    public abstract void setName(String name);

    public abstract String getAuthor();

    public abstract void setAuthor(String author);

}