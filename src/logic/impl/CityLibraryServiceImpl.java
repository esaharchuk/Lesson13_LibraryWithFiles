package logic.impl;

import been.Book;
import been.Catalog;
import dao.BookDao;
import dao.impl.FileBookDaoImpl;
import logic.LibraryService;

public class CityLibraryServiceImpl implements LibraryService {

	private BookDao dao = new FileBookDaoImpl();

	@Override
	public Catalog getMainCatalog() {

		Catalog catalog = new Catalog();

		Book[] books = dao.readAll();
		catalog.setBooks(books);
		catalog.setTitle("HTP_TAT_7_BOOK_Catalog");

		return catalog;
	}

}
