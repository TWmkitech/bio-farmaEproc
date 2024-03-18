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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://eproc-dev.digital-healthcare.id/')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/011_Pemberian_Penjelasan_byPenyedia/input_Username_username'), 
    'bima.g')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/011_Pemberian_Penjelasan_byPenyedia/input_Password_password'), 
    'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/011_Pemberian_Penjelasan_byPenyedia/button_Masuk'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/transaction_Management'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/tender_Seleksi_Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/012-Input_Hasil_Realisasi/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/tab_Pembukaan_Penawaran'))

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/Buka_Dokumen_Penawaran'))

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/Konfirmasi_Ya'))

WebUI.delay(4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Dokumen_Vendor3'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Adm1_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Adm2_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Adm3_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Adm4_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis1_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis2_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis3_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis4_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis5_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis6_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/checklist_Teknis7_Lengkap'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/017_Pembukaan_Dokumen_Penawaran/konfirmasi_OK'))

WebUI.delay(2)

WebUI.closeBrowser()

