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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

not_run: WebUI.callTestCase(findTestCase('Third Party/Internal/TC129_130_132_133_CalonPenyedia/TC129_130_Verifikasi/TC129_00_VerifikasiLogin'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.executeJavaScript('window.scrollTo(0, 0);', null)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Tab_RingkasanVerifikasi'))

WebUI.scrollToElement(findTestObject('Third Party/Internal/Verifikasi/Download_SuratSMAP'), 0)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Pilih_VerifikasiOffline'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Pilih_VerifikasiOffline_DataTidak'))

WebUI.setText(findTestObject('Third Party/Internal/Verifikasi/Field_Keterangan_Verifikasi'), 'Dibuat menggunakan automation')

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_Submit_VerifikasiOffline'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_KonfirmasiOK_VerifikasiOffline'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_Submit_PersetujuanVerifikasi'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Button_KonfirmasiOK_VerifikasiOffline'))

WebUI.delay(5)

WebUI.closeBrowser()

