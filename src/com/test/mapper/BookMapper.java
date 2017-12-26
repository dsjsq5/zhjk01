package com.test.mapper;





import java.util.List;

import com.test.book.Book;

public interface BookMapper {
	 /**
     * ͨ��ID��ѯ����ͼ��
     * 
     * @param id
     * @return
     */
    Book queryById(Integer id);
 
    /**
     * ��ѯ����ͼ��
     * 
     * @param offset ��ѯ��ʼλ��
     * @param limit ��ѯ����
     * @return
     */
    List<Book> queryall();
    
    void insert(Book book);
    
    void update(Book book);
    
    void delete(Book book);

}
