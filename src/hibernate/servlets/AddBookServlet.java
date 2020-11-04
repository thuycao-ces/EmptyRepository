package hibernate.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.validation.BookValidation;
import hibernate.dao.AuthorDao;
import hibernate.dao.BookDao;
import hibernate.dao.BookTypeDao;
import hibernate.dao.Book_BookTypeDao;
import hibernate.entities.Author;
import hibernate.entities.Book;
import hibernate.entities.BookType;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BookDao bookDao;
	private AuthorDao authorDao;
	private BookTypeDao bookTypeDao;
	private Book_BookTypeDao book_bookTypeDao;

	/**
	 * bookTypeDao
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public AddBookServlet() {
		super();
	}

	public void init() {
		bookDao = new BookDao();
		authorDao = new AuthorDao();
		bookTypeDao = new BookTypeDao();
		book_bookTypeDao = new Book_BookTypeDao();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		_getFile(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String bookName = request.getParameter("bookName");
		int authorId = Integer.parseInt(request.getParameter("author.authorId"));

		String[] listbookType = request.getParameterValues("bookTypeSelected");

		if (!BookValidation._checkEmpty(bookName)) {
			request.setAttribute("error", "The book's name is not null.");
			_getFile(request, response);

		} else if (!BookValidation._checkExisted(bookId, bookName, bookDao.getAllBook())) {
			request.setAttribute("error", "The book's name is existed.");
			_getFile(request, response);

		} else {
			Book newBook = new Book(bookName, authorDao.getAuthorById(authorId));
			bookDao.saveBook(newBook);

			if (listbookType != null) {
				for (String item : listbookType) {
					book_bookTypeDao.saveItem(newBook, bookTypeDao.getBookTypeById(Integer.parseInt(item)));
				}
			}
			response.sendRedirect("books");
		}
	}

	public void _getFile(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Author> listAuthor = authorDao.getAllAuthor();
		List<BookType> listBookType = bookTypeDao.getAllBookType();

		request.setAttribute("listAuthor", listAuthor);
		request.setAttribute("listBookType", listBookType);

		RequestDispatcher dispatcher = this.getServletContext()
				.getRequestDispatcher("/WEB-INF/view/addAndEditBook/index.jsp");
		dispatcher.forward(request, response);
	}

}
