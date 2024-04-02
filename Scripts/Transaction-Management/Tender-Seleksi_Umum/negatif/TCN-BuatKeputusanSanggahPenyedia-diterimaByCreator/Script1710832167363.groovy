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

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_transactionManagement_Entitas'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/submodul_seleksi umum_entitas'))

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Searching'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/span_Tahapan Masa Sanggah'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/aksi_keputusanSanggah'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/status_sanggah'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/diterima'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/catatan_diterima'), 'Ditunjau ulang')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/pilihLampiranKeputusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/PilihanLampiranKeputusan'))

def projectDir = Config.getProjectDir()

TestObject upload_DokumenLain = findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/upload_LampiranKeputusan')

// Membentuk path lengkap file yang ingin diunggah
def filePathDokLain = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_DokumenLain, filePathDokLain)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/SimpanKeputusanSanggah'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/MasaSanggah/a_ok_diterima'))

