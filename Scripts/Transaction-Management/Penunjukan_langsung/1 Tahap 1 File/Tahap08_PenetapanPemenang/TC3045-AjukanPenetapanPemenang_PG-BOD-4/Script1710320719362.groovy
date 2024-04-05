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

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_Tahapan08'))

def closed = WebUI.verifyTextPresent('Proses pengadaan tahap Penetapan Pemenang akan dimulai pada:', false, FailureHandling.OPTIONAL)

// Ubah Jadwal 
if (closed.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
        [('tahap') : 9], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap07/Tab_Tahapan07'))

WebUI.verifyTextPresent('Proses Pengadaan Tahapan Negosiasi sudah habis!', false, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_Tahapan08'))

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_PersetujuanPenetapan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/div_PilihLampiran'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/div_DokumenPendukung1'))

// Upload Dokumen Pendukung
TestObject uploadField1 = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/btn_UploadDokPendukung')

def projectDir1 = Config.getProjectDir()

def filePath1 = projectDir1 + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadField1, filePath1)

// Upload File Disposisi
WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/input_NamaDisposisi'), 'doc_test')

TestObject uploadField2 = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/btn_UploadFileDisposisi')

//def projectDir2 = Config.getProjectDir()
def filePath2 = projectDir1 + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/text_NotesLampiran'), 'Catatan Pengajuan Penetapan Pemenang by BOD 4')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_KirimPengajuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_OK'))

WebUI.delay(12)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_LihatBA'), 8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_LihatBA'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_Kembali'), 8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_Kembali'))

// Verifikasi Persetujuan
WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_StatusPersetujuan'))

WebUI.delay(3)

//WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/verify_StatusBOD4'), 5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/verify_StatusBOD4'), 
    'Diajukan', FailureHandling.OPTIONAL)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/verify_StatusBOD2'), 
    'Proses Review', FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()

