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

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Tab_Tahapan02'))

def closed = WebUI.verifyTextPresent('Proses Pengadaan Tahapan Aanwijzing sudah habis!', false)

// Ubah Jadwal Aanwijzing
if (closed.equals(false)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal'), [('tahap') : 3], 
        FailureHandling.STOP_ON_FAILURE)

    WebUI.refresh()
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_DraftBA'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/verify_TitleDraftBA'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_LIhatDokumen'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_TutupDokumen'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/button_OK'))

// Verifikasi
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Tab_Tahapan02'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/tab_StatusPersetujuan'))

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap02/Approval/verify_StatusBOD4'), 
    'Diajukan')

WebUI.closeBrowser()

