package hst.peter.cache;

public interface BookRepository {

  Book getByIsbn(String isbn);

}