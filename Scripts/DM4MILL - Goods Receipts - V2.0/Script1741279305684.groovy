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
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords

WebUI.openBrowser('https://dlwr-dmc-discovery.execution.us10-quality.web.dmc.cloud.sap/cp.portal/site#Shell-home')

WebUI.maximizeWindow()

WebUI.enhancedClick(findTestObject('Object Repository/Page_Login/a_Default Identity Provider'))

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Email or User Name_j_username'), 'julie.hoste@delaware.pro')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Sign In/button_Continue'))

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('Object Repository/Page_SAP Universal ID/button_I accept all cookies'))

WebUI.delay(2)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_pro_password'), 'UB7+rfb8H+So++oIaShgEQ==')

not_run: WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in_1'))

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/Page_SAP Universal ID/input_pro_password'), 'UB7+rfb8H+So++oIaShgEQ==')

WebUI.click(findTestObject('Object Repository/Page_SAP Universal ID/button_Sign in_1'))

WebUI.delay(4)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Home/div_DM4Mill GR Good Receipts'), 0)

WebUI.click(findTestObject('Object Repository/Page_Home/span_DM4Mill GR'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Home/span_DM4Mill GR'), 3)

WebUI.delay(4)

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Work Center___xmlview100--reservedComp_9efbcc'))

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Select Work Center___xmlview100--rese_915078'), 
    '43')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/div_Clear___xmlview100--reservedComponentCo_b6c65f'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/bdi_Select'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Order ID___xmlview100--reservedCompon_66eb78'), 
    '1003344')

WebUI.enhancedClick(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Go'))

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/td_1003344_1_2'))

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Mill Goods Receipt'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_GR Qty_DETAILSView--icontabfilterCSGX_c763b3'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_GR Qty_DETAILSView--icontabfilterCSGX_c763b3'), 
    '1')

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Post GR'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_'))

WebUI.setText(findTestObject('Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Plant 1210 ( DDE - Plant )_search'), 'Integration Message Dashboard')

WebUI.sendKeys(findTestObject('Object Repository/Page_Integration Message Dashboard/input_Plant 1210 ( DDE - Plant )_search'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Search for Integration Message dashboa_230a0e/div_Integration Message Dashboard'))

