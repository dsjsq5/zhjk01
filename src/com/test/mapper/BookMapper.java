package com.test.mapper;





import java.util.List;

import com.test.book.Book;

public interface BookMapper {
	 /**
     * 通过ID查询单本图书
     * 
     * @param id
     * @return
     */
    Book queryById(Integer id);
 
    /**
     * 查询所有图书
     * 
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return
     */
    List<Book> queryall();
    
    void insert(Book book);
    
    void update(Book book);
    
    void delete(Book book);

}
