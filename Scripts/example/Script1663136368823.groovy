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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('web.whatsapp.com')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_WhatsApp/span_Cornel i3'), 30)

for (int baris = 1; baris <= 1; baris++) {
    WebUI.click(findTestObject('Object Repository/Page_WhatsApp/span_Cornel i3'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('Object Repository/Page_WhatsApp/div_Type a message'), 'halo')

    WebUI.delay(1)

    WebUI.sendKeys(findTestObject('Object Repository/Page_WhatsApp/div_Type a message'), Keys.chord(Keys.ENTER))

    WebUI.delay(3)

    if (WebUI.verifyTextPresent('Halo Kak Cornel, selamat datang di Oxygen Care. Saya Oxy, asisten pelayanan pelanggan di Oxygen Customer Care.Apakah saat ini kamu sudah berlangganan Oxygen.id?(Sudah/Belum)Silakan balas pesan ini dengan mengetik sesuai dengan pilihan di atas. (Contoh: Belum)', false, FailureHandling.OPTIONAL) == true) {
        WebUI.delay(1)

        WebUI.setText(findTestObject('Object Repository/Page_WhatsApp/div_Type a message'), 'sudah')

        WebUI.delay(1)

        WebUI.sendKeys(findTestObject('Object Repository/Page_WhatsApp/div_Type a message'), Keys.chord(Keys.ENTER))
    }
}