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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Menu_PengadaanLainnyaYangDiikuti'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/input_Searching02'), GlobalVariable.NoPP)

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Proses'))

WebUI.verifyElementPresent(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Verify_Title'), 5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/Menu_2_Aanwijzing'))

int topik = GlobalVariable.topikInternal

String teks = ('Balasan Topik Aanwijzing ke-' + topik) + ' dari Vendor'

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/Icon_Balas', [('list') : topik]), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/Icon_Balas', [('list') : topik]))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/text_BalasTopik', [('list') : topik]), 
    teks)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/button_BalasTanggapan', [('list') : topik]))

WebUI.delay(8)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap02/verify_TextBalasan', [('list') : topik]), 
    teks)

WebUI.delay(5)

WebUI.closeBrowser()

