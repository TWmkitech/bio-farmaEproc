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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_DashboardAnalytics'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_SupplierProfile'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_Doc Expiration Date'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Field_JenisFilter'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Pilih_JenisFilter'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Field_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Pilih_Start'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Field_End'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Pilih_end'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Field_JenisDokumen'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Pilih_JenisDokumen'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Field_Tampilkan'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Isi_Tampilkan'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_Search'))

WebUI.scrollToElement(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_Dokumen'), 
    0)

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_Dokumen'))

WebUI.click(findTestObject('Dashboard Analytics/Supplier Profile/Supplier Doc Expiration Date/Button_Download'))

WebUI.delay(5)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

