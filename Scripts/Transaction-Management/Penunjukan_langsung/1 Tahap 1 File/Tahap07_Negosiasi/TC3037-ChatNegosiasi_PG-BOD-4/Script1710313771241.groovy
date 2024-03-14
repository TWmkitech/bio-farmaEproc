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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Tab_Tahapan07'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/verify_StatusNego'), 
    'Proses Negosiasi', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Icon_AksiNego'))

// Kirim Chat ke Entitas
WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_ChatNego_PGtoEntitas'), 'Harga Negosiasi Entitas diterima')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_KirimChat_toEntitas'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_OKChat'))

WebUI.delay(8)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_ChatNego_PGtoVendor'), 'Harga Negosiasi by PG BOD4 sudah terkirim')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_KirimChat_toVendor'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_OKChat'))

WebUI.delay(8)

WebUI.closeBrowser()

