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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-1'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Tab_Tahapan09'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/radio_Setuju_PG'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_PersetujuanSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_OK'))

// Verifikasi
WebUI.delay(15)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_Pratinjau_SPPBJ'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_TeksPratinjau'), 
    'Pratinjau Dokumen SPPBJ')

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_Tutup'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_Setuju_PG', [('row') : 3]), 
    5, FailureHandling.OPTIONAL)

String user = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_h6_PG', [('row') : 3]))

String approv = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_Setuju_PG', 
        [('row') : 3]))

System.println(user)

System.println(approv)

if(user.contains('  Approver (HOLDING) | ')) {
	WebUI.verifyElementText(approv, 'Setuju')
}

WebUI.delay(5)

WebUI.closeBrowser() 

