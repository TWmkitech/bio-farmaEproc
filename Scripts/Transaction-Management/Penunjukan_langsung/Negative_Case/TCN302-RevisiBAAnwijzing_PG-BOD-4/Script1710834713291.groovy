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

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Tab_Tahapan02'))

def closed = WebUI.verifyTextPresent('Proses Pengadaan Tahapan Aanwijzing sudah habis!', false, FailureHandling.OPTIONAL)

// Ubah Jadwal Tutup Aanwijzing
if (closed.equals(false)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
        [('tahap') : 3], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(8)
}

WebUI.verifyTextPresent('Proses Pengadaan Tahapan Aanwijzing sudah habis!', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_DraftBA'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/verify_TitleDraftBA'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_LIhatDokumen'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_TutupDokumen'))

// Tidak ada catatan tambahan
// Upload File
TestObject uploadField = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/upload_DokPendukung')

def projectDir = Config.getProjectDir()

def filePath = projectDir + '/Document/TM-Paket2/doc_test.docx'

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/input_NamaDokumen'), '[REVISI] Approval Aanwijzing')

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_OK'))

// Verifikasi
WebUI.delay(15)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/tab_StatusPersetujuan'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/tab_StatusPersetujuan'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/verify_StatusBOD4'), 
    'Diajukan', FailureHandling.OPTIONAL)

WebUI.closeBrowser()

