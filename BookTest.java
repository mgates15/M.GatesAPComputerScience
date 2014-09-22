/* Works in conjunction with BookProgram.java to display the
 * current page and count pages.
 */

public class BookTest
{
	public static void main(String[] args)
	{
		BookProgram myBook=new BookProgram(5);
		BookProgram otherBook=new BookProgram(50);
		System.out.println(myBook.getCurrentPage());
		myBook.nextPage();
		System.out.println(myBook.getCurrentPage());
		myBook.nextPage();
		System.out.println(myBook.getCurrentPage());
		myBook.nextPage();
		System.out.println(myBook.getCurrentPage());
	}
}
