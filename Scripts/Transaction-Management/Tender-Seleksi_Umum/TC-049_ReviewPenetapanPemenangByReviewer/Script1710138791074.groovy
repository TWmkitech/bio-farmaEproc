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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/login/PGagen_Reviewer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SubModul_TenderSeleksi umum'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/span_Tahapan  Penetapan Pemenang'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/buttonPersetujuanBeritaAcaraPenetapanPemenangByReviewer'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/input_Disposisi_lampiran_disposisiByReviewer'), 
    'Lanjutkan')

def projectDir = Config.getProjectDir()

TestObject upload_LampiranDisposisiByReviewer = findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/upload_LampiranDisposisiByReviewer')

// Membentuk path lengkap file yang ingin diunggah
def filePathLampiranDisposisiByReviewer = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_LampiranDisposisiByReviewer, filePathLampiranDisposisiByReviewer)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/CatatanPenetapanPemenangByReviewer'), 
    'Lanjutkan')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/input_Persetujuan_status_approvalByReviewer'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/button_KirimPersetujuanPemenangByReviewer'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/a_OK_PersetujuanPenetapanPemenangByReviewer'))

WebUI.delay(7)

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/PenetapanPemenang/span_Status Persetujuan Ke Approval'))

