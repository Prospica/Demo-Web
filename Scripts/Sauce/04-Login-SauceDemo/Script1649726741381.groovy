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
WebUI.navigateToUrl(GlobalVariable.sauce)
WebUI.maximizeWindow()
WebUI.delay(2)

//TestData input = findTestData('Data Files/Login-SauceDemo')

// for (int baris=1; baris<= input.getRowNumbers(); baris++)
// {
	WebUI.setText(findTestObject('Object Repository/Sauce/Login-SauceDemo/Input_Username'), 'standard_user')
	WebUI.delay(1)
	WebUI.setText(findTestObject('Object Repository/Sauce/Login-SauceDemo/Input_Password'), 'secret_sauce')
	WebUI.delay(1)
	WebUI.takeScreenshot()
	WebUI.click(findTestObject('Object Repository/Sauce/Login-SauceDemo/Button_Login'))
	WebUI.waitForElementPresent(findTestObject('Object Repository/Sauce/Login-SauceDemo/Div_Products'), 0)
	WebUI.delay(3)
	WebUI.takeScreenshot()
// }
