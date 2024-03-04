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

WebUI.navigateToUrl('https://vendor-dev.digital-healthcare.id/home.html')

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/button_Masuk'))

WebUI.setText(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/input_Username_username'), 'DRM-JP.24.000013')

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/button_Login'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/a_Transaction'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/a_Tender  Seleksi Umum'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/a_TenderSeleksi Umum Yang Diikuti'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/minat'))

WebUI.delay(5)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/button_Minat'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/002-ResponMinat/konfirmasi_Kirim'))

WebUI.delay(13)

WebUI.closeBrowser()

