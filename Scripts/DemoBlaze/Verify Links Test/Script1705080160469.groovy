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

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Contact'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DemoBlaze/button_Close'),60)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_About us'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DemoBlaze/span_'),60)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/span_'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Log in'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DemoBlaze/span_ (1)'),60)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/span_ (1)'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Sign up'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DemoBlaze/span_ (2)'),60)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/span_ (2)'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_CATEGORIES'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Phones'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Monitors'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Home (current)'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Samsung galaxy s6'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Home (current)'))

WebUI.closeBrowser()

