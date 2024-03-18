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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/login/PGagen_creator'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'), 5)

not_run: WebUI.verifyElementPresent(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'), 
    5)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SubModul_TenderSeleksi umum'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/span_Tahapan  Penetapan Pemenang'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/AjukanPersetujuanPenetapanPemenangByCreator'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/Pilih_Lampiran_PenetapanPemenang'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/Pilihan_DokumenPendukungPenetapan1'))

def projectDir = Config.getProjectDir()

TestObject upload_LampiranPenetapanPemenang = findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/upload_LampiranPenetapanPemenang')

// Membentuk path lengkap file yang ingin diunggah
def filePathLampiranPenetapanPemenang = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_LampiranPenetapanPemenang, filePathLampiranPenetapanPemenang)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/input_DisposisiAjukanPenetapanPemenang'), 
    'setuju dan lanjutkan')

TestObject upload_DisposisiAjukanPenetapanPemenang = findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/upload_DisposisiAjukanPenetapanPemenang')

// Membentuk path lengkap file yang ingin diunggah
def filePathDisposisiAjukanPenetapanPemenang = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_DisposisiAjukanPenetapanPemenang, filePathDisposisiAjukanPenetapanPemenang)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/CatatanAjukanPersetujuanPenetapanPemenang'), 
    'lanjutkan')

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/unduh_BeritaAcaraPenetapanPemenangByCreator'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/Kirim_AjukanPernetapanPemenangByCreator'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/a_OK_AjukanPersetujuanPenetapanPemenangByCreator'))

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/span_StatusPersetujuanPenetapanPemenangDiajukanKeReview'))

