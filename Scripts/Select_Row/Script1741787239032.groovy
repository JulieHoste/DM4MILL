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

// WebElement element = driver.findElement(By.xpath('//*[@id="__text89-__clone51"]'))

WebElement element = driver.findElement(By.xpath("//table[1]/tbody"))

'To locate rows of table it will Capture all the rows available in the table'

List<WebElement> rows_table = Table.findElements(By.tagName("tr"))
'To calculate no of rows In table'
int rows_count = rows_table.size()

println('No. of rows second table: ' + rows_count)

// EXPECT VALUE
String ColumnOrderId = rows_table.get(1).findElements(By.tagName('td')).get(3).getText()
String ColumnQuantity = rows_table.get(1).findElements(By.tagName('td')).get(5).getText()
String CombineCellText= ColumnOrderId + "_" + ColumnQuantity.replace(" M" , "")
println("Expected Value: " + CombineCellText)

String ColumnQuantity2 = rows_table.get(1).findElements(By.tagName('td')).get(5).getText()
String strColQ2 = ColumnQuantity2.replace(" M" , "")


int  numQ = {$numberQuantity}
if( numQ == 1)
{
	int value = strColQ2 + 1
	println("New value +1 : " + value)
	
}
if (numQ == 2)
{
	int value = strColQ2 - 1
	println("New value -1 : " + value)
}
