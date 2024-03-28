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
    FailureHandling.OPTIONAL).contains('Revisi Evaluasi Penawaran').toString()

WebUI.verifyMatch(notif, 'true', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/Tab_Tahapan06'))

WebUI.verifyTextNotPresent('Proses Pengadaan Tahapan Approval Evaluasi Penawaran akan dimulai pada:', false)

WebUI.delay(3)

// Mengajukan Persetujuan ke Entitas
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/btn_AjukanPersetujuan'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_PersetujuaninForm'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_OK'))

WebUI.delay(8)

// Verifikasi persetujuan berhasil
WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'),
	5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'),
	5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/verify_StatApproval-PG-BOD4'),
	'Diajukan', FailureHandling.OPTIONAL)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3023-ReviewEvaluasi_KAEF-BOD-3'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3024-ReviewEvaluasi_KAEF-BOD-2'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3025-ReviewEvaluasi_KAEF-BOD-1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3026-ReviewEvaluasi_KFTD-BOD-3'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3027-ReviewEvaluasi_KFTD-BOD-2'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Tahap06_ApprovalEvalPenawaran/TC3028-ReviewEvaluasi_KFTD-BOD-1'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/Tab_Tahapan06'))

WebUI.verifyTextNotPresent('Proses Pengadaan Tahapan Approval Evaluasi Penawaran akan dimulai pada:', false)

WebUI.delay(3)

// Mengajukan Persetujuan
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/btn_AjukanPersetujuan'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/textarea_Catatan_form'), 'Pengajuan REVISI dari Hasil Review Holding')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_PersetujuaninForm'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_OK'))

WebUI.delay(12)

// Verifikasi persetujuan berhasil
WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/verify_StatApproval-PG-BOD4'), 
    'Diajukan', FailureHandling.OPTIONAL)

WebUI.closeBrowser()

