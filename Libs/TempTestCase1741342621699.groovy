import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\hostej\\AppData\\Local\\Temp\\Katalon\\20250307_111701\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'https://dlwr-dmc-discovery.execution.us10-quality.web.dmc.cloud.sap/cp.portal/site#Shell-home\')\n\nWebUI.maximizeWindow()\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_Login/a_Default Identity Provider\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_Sign In/input_Email or User Name_j_username\'), \'julie.hoste@delaware.pro\')\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/Page_Sign In/button_Continue\'))\n\nWebUI.delay(2)\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_SAP Universal ID/button_I accept all cookies\'))\n\nWebUI.delay(2)\n\nWebUI.setEncryptedText(findTestObject(\'Object Repository/Page_SAP Universal ID/input_pro_password\'), \'UB7+rfb8H+So++oIaShgEQ==\')\n\nnot_run: WebUI.click(findTestObject(\'Object Repository/Page_SAP Universal ID/button_Sign in_1\'))\n\nnot_run: WebUI.setEncryptedText(findTestObject(\'Object Repository/Page_SAP Universal ID/input_pro_password\'), \'UB7+rfb8H+So++oIaShgEQ==\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_SAP Universal ID/button_Sign in_1\'))\n\nWebUI.delay(4)\n\nWebUI.scrollToElement(findTestObject(\'Object Repository/Page_Home/div_DM4Mill GR Good Receipts\'), 0)\n\nWebUI.click(findTestObject(\'Object Repository/Page_Home/span_DM4Mill GR\'))\n\nWebUI.verifyElementPresent(findTestObject(\'Object Repository/Page_Home/span_DM4Mill GR\'), 3)\n\nWebUI.delay(4)\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Work Center___xmlview100--reservedComp_9efbcc\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Select Work Center___xmlview100--rese_915078\'), \n    \'43\')\n\nWebUI.delay(3)\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/div_Clear___xmlview100--reservedComponentCo_b6c65f\'))\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/bdi_Select\'))\n\nWebUI.delay(2)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Order ID___xmlview100--reservedCompon_66eb78\'), \n    \'1003344\')\n\nWebUI.enhancedClick(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Go\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/td_1003344_1_2\'))\n\nWebUI.click(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Mill Goods Receipt\'))\n\nWebUI.delay(2)\n\nWebUI.clearText(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_GR Qty_DETAILSView--icontabfilterCSGX_c763b3\'), \n    FailureHandling.STOP_ON_FAILURE)\n\nWebUI.setText(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_GR Qty_DETAILSView--icontabfilterCSGX_c763b3\'), \n    \'1\')\n\nWebUI.click(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_Post GR\'))\n\nWebUI.delay(3)\n\nWebUI.click(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/span_\'))\n\nWebUI.setText(findTestObject(\'Object Repository/Page_DDE_DM4MILL_GR_FINAL/input_Plant 1210 ( DDE - Plant )_search\'), \'Integration Message Dashboard\')\n\nWebUI.sendKeys(findTestObject(\'Object Repository/Page_Integration Message Dashboard/input_Plant 1210 ( DDE - Plant )_search\'), \n    Keys.chord(Keys.ENTER))\n\nWebUI.delay(2)\n\nWebUI.click(findTestObject(\'Object Repository/Page_Search for Integration Message dashboa_230a0e/div_Integration Message Dashboard\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

