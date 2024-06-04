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

// Verfikasi Notifikasi
WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/btn_Notifikasi'))

WebUI.delay(3)

String notif = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/row1_Notifikasi'), 
    FailureHandling.OPTIONAL).contains('Permintaan revisi SPJP').toString()

WebUI.verifyMatch(notif, 'true', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Tab_Tahapan09'))

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/input_PersenJaminan_E2'), 
    '90')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/Field_SPJPTax_E2'), '12')

String cDay = new Date().format('d-M-yyyy')

int cDate = (cDay.split('-')[0]).toInteger() + 5

// Jaminan Entitas 1
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/Field_TanggalSPJP_E2'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/date_StartSPJP_E2', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/Field_BatasSPJP_E2'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/date_EndSPJP_E2', [('date') : cDate]))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_StatSPJP_E2'), 
    'Proses Revisi', FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/__Revisi/button_SimpanE2'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/button_OK'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap09/verify_StatSPJP_E2'), 
    'Proses Review', FailureHandling.OPTIONAL)

WebUI.closeBrowser()

