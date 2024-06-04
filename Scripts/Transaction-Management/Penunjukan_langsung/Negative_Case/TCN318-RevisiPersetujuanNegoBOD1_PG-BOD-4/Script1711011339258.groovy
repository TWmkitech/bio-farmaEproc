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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

// Verfikasi Notifikasi 
WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/btn_Notifikasi'))

WebUI.delay(3)

String text = 'Permintaan Revisi Negosiasi Pada Paket Pekerjaan No PP : ' + GlobalVariable.NoPP

String notif = WebUI.getText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/row1_Notifikasi'),
	FailureHandling.OPTIONAL).contains(text).toString()

WebUI.verifyMatch(notif, 'true', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/row1_Notifikasi'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/verify_NoPP'), GlobalVariable.NoPP,
	FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Tab_Tahapan07'))

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/btn_AjukanPersetujuanNego'))

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/text_CatatanAjukanPersetujuan'), 
    'REVISI Hasil Persetujuan Negosiasi BOD-1 oleh PG BOD 4')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_ConfirmAjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_OKPengajuan'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_LihatBA'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/button_TutupBA'))

// Verifikasi Status Persetujuan
WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/tab_StatusPersetujuan'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/tab_StatusPersetujuan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/verify_StatApproval-PG-BOD4'), 
    'Diajukan', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/verify_StatApproval-PG-BOD2'), 
    'Proses Review', FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()

