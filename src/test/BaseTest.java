package test;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.book.Book;
import com.test.mapper.BookMapper;

public class BaseTest {

	private static ApplicationContext ctx;
	
	
	static {
		ctx = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
	}

	public static void main(String[] args) {
		
		BookMapper bookmapper = (BookMapper)ctx.getBean("bookMapper");
		Book book = bookmapper.queryById(100);
		
		
		
		
		
//		BookDao bookdao = (BookDao)ctx.getBean("BookDao");
//		Book book = bookdao.queryById(1000);
		int id = (int)book.getBook_id();
		String name = book.getName();
		int num = book.getNumber();
		System.out.println( id +name+"/"+num);
		
		
		
//		UserMaper userMaper = (UserMaper) ctx.getBean("userMaper");
//		// ����id=1���û���ѯ���ɸ������ݿ��е�����޸�.
//		User user = userMaper.getUserById(1);
//		System.out.println("��ȡ�û� ID=1 ���û�����"+user.getUsername());
//
//		// �õ������б����
//		System.out.println("�õ��û�idΪ1�����ж����б�:");
//		System.out.println("=============================================");
//		List<Order> orders = userMaper.getUserOrders(1);
//
//		for (Order order : orders) {
//			System.out.println("�����ţ�"+order.getOrderNo() + "��������" + order.getMoney());
//		}

	}

}
