package com.test.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.book.Book;
import com.test.mapper.BookMapper;



/** 
 * @describe: 读取一个用户下的所有订单
 * @author: Yiibai 
 * @version: V1.0
 * @copyright http://www.yiibai.com
 */ 

// http://localhost:8080/mybatis07-spring-mvc/user/orders
@Controller
//@RequestMapping("/book")
public class BookAction {
	@Autowired
	BookMapper bookMapper;
	
	@RequestMapping(value = "/book",method = RequestMethod.GET)
	public ModelAndView listall(){
		
		List<Book> bookList = new ArrayList<Book>();
		
		bookList = bookMapper.queryall();
//		bookList.add(bookMapper.queryById(100)); 
//		bookList.add(bookMapper.queryById(101));
//		bookList.add(bookMapper.queryById(102));
//		bookList.add(bookMapper.queryById(103));
		System.out.println("book");
		ModelAndView mav=new ModelAndView("book_1");
		
		
		mav.addObject("bookList",bookList);
		
		return mav;
	}
	
	 @RequestMapping(value = "/book1", method = {RequestMethod.GET,RequestMethod.POST})
	   public ModelAndView book() {
	      return new ModelAndView("book_2", "command", new Book());
	   }

	   @RequestMapping(value = "/addbook", method = {RequestMethod.GET,RequestMethod.POST})
	   public ModelAndView addBook(@ModelAttribute("SpringWeb")Book book) {
		   bookMapper.insert(book);
		   return listall();
		   
		   
//	      model.addAttribute("name", book.getName());
//	      model.addAttribute("number",book.getNumber());
//	      model.addAttribute("book_id", book.getBook_id());
//
//	      return "result";
	   }
	
}