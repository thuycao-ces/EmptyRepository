package ces.springmvc.bookmanagementspringmvc.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ces.springmvc.bookmanagementspringmvc.service.BookService;
import ces.springmvc.bookmanagementspringmvc.service.Book_BookTypeService;
import ces.springmvc.bookmanagementspringmvc.dao.AuthorDAO;
import ces.springmvc.bookmanagementspringmvc.dao.BookDAO;
import ces.springmvc.bookmanagementspringmvc.entity.BookEntity;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	AuthorDAO authorDAO;

	@Autowired
	BookDAO bookDAO;

	@Autowired
	Book_BookTypeService book_BookTypeService;

	@Override
	public void deleteBook(Long bookId) {
		book_BookTypeService.deleteBook_BookTypeDaoByBookId(bookId);
		bookDAO.deleteById(bookId);
	}

	@Override
	public void saveBook(BookEntity book) {
		BookEntity bookEntity = new BookEntity();
		bookEntity.setBookName(book.getBookName());
		Long authorId = book.getAuthor().getAuthorId();

		if (authorId == 0) {
			bookEntity.setAuthor(null);
		} else {
			bookEntity.setAuthor(authorDAO.getOne(authorId));
		}
		bookDAO.saveAndFlush(bookEntity);
	}

	@Override
	public void updateBook(BookEntity book) {
		BookEntity bookEntity = bookDAO.getOne(book.getBookId());
		bookEntity.setBookName(book.getBookName());
		Long authorId = book.getAuthor().getAuthorId();

		if (authorId == 0) {
			bookEntity.setAuthor(null);
		} else {
			bookEntity.setAuthor(authorDAO.getOne(authorId));
		}
		bookDAO.saveAndFlush(bookEntity);
	}

	@Override
	public BookEntity getBookByBookId(Long bookId) {
		return bookDAO.getOne(bookId);
	}

	@Override
	public List<BookEntity> getAllBooks() {
		return bookDAO.findAll();
	}
}
