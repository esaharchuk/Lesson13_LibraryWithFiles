package runner;

import been.Book;
import been.Catalog;
import logic.LibraryService;
import logic.impl.CityLibraryServiceImpl;

public class LibrarianMain {

	public static void main(String[] args) {
		
		LibraryService service = new CityLibraryServiceImpl();
		Catalog booksCatalog = service.getMainCatalog();
		viewCatalogInfo(booksCatalog);

	}

	private static void viewCatalogInfo(Catalog catalog) {
		
		for(Book book: catalog.getBooks()) {
			System.out.println(book);
		}
	}
}
