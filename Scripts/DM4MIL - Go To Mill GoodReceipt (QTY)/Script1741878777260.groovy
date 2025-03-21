import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Home/div_DM4Mill GR Good Receipts'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home/span_DM4Mill GR'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/span_DM4Mill GR'), 30)

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Work Center___xmlview100--reservedComp_9efbcc'))

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Select Work Center___xmlview100--rese_915078'), 
    '43')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/div_Clear___xmlview100--reservedComponentCo_b6c65f'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/bdi_Select'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Order ID___xmlview100--reservedCompon_66eb78'), 
    orderId)

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Go'))

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/td_1003344_1_2'))

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Mill Goods Receipt'))

