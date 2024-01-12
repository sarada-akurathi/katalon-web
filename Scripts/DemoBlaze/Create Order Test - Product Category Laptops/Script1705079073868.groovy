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

WebUI.callTestCase(findTestCase('DemoBlaze/Login to DemoBlaze'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Laptops'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Sony vaio i5'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Cart'))

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/button_Place Order'))

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputname'), 'Sarada')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputcountry'), 'India')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputcity'), 'Bangalore')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputcard'), '5239872389018792')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputmonth'), '10')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputyear'), '2030')

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/button_Purchase'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_DemoBlaze/h2_Thank you for your purchase'), 'Thank you for your purchase!')

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/button_OK'))

WebUI.click(findTestObject('Page_DemoBlaze/a_Log out'))

WebUI.closeBrowser()

