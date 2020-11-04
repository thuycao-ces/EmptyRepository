package ces.springmvc.bookmanagementspringmvc.service;

import java.util.List;

import ces.springmvc.bookmanagementspringmvc.entity.BookTypeEntity;

public interface BookTypeService {

	BookTypeEntity getBookTypeById(Long bookTypeId);

	List<BookTypeEntity> getAllBookTypes();

}
