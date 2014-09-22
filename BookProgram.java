/* The following is BookProgram.java. It works in conjunction
 * with BookTest.java to display the current page and count 
 * pages. 
*/

public class BookProgram
{
	private int numPages;
	private int currentPage;

	public BookProgram(int pages)
	{
		numPages = pages;
		currentPage = 1;
	}
	
	int getNumPages()
	{
		return numPages;
	}
	
	int getCurrentPage()
	{
		return currentPage;
	
	}
	
	
	void nextPage()
	{
		if (currentPage < numPages)
			currentPage++;
	}
	
}
