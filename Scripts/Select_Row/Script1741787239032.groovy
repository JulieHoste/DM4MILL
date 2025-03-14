import org.openqa.selenium.By as By
 
import org.openqa.selenium.WebDriver as WebDriver
 
import org.openqa.selenium.WebElement as WebElement
 
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
 
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

File html = new File("C:\\Users\\hostej\\DDE_DM4MILL_GR_FINAL.mhtml")


WebUI.openBrowser(html.toURI().toURL().toExternalForm());

WebUI.maximizeWindow()


WebDriver driver = DriverFactory.getWebDriver()

'To locate table'

WebElement Table = driver.findElement(By.xpath('//*[@id="DETAILSView--icontabfilterCSGXHZB1_plugin---MainView--grStockHistory-listUl"]'))

// VALUES

String ExpectedValue = '3344_00001'

WebElement element = driver.findElement(By.xpath('//*[@id="__text89-__clone51"]'))

String SetValue = element.text()

List<WebElement> Rows = Table.findElements(By.tagName('tr'))

println('No. of rows second table: ' + Rows.size())
int rows_count = Rows.size()

'Loop will execute for all the rows of the table'
Loop:
for (int row = 0; row < rows_count; row++) 
	{
		'To locate columns(cells) of that specific row'
		
		
		List<WebElement> Columns_row = Rows.get(row).findElements(By.tagName('td'))
		
		
		
		'To calculate no of columns(cells) In that specific row'
		
		int columns_count = Columns_row.size()
		 
		println((('Number of cells In Row ' + row) + ' are ') + columns_count)
	 
		'Loop will execute till the last cell of that specific row'
		for (int column = 0; column < columns_count; column++) 
		{

			'It will retrieve text from each cell'
			String celltext = Columns_row.get(column).getText()
	 
			println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
	 
			'Checking if Cell text is matching with the expected value'
			if (celltext == ExpectedValue) 
				{
				'Getting the if cell text i.e Company name matches with Expected value'
				println('Text present in row number'+ row +'  is: ' + Columns_row.get(6).getText())
				 
				'After getting the Expected value from Table we will Terminate the loop'
				break Loop;
				}
		}
	}
