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

WebUI.navigateToUrl(GlobalVariable.DEMOBLAZE_URL)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/a_Contact'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_DemoBlaze/inputrecipient-email'), 60)

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputrecipient-email'), 'sarada@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/inputrecipient-name'), 'Sarada')

WebUI.setText(findTestObject('Object Repository/Page_DemoBlaze/textareamessage-text'), 'Message')

WebUI.click(findTestObject('Object Repository/Page_DemoBlaze/button_Send message'))

WebUI.closeBrowser()

