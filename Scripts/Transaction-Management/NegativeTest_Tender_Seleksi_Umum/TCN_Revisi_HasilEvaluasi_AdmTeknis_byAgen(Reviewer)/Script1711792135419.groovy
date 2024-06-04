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

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Username_username'), 'nurunnadiya')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Password_password'), 'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/button_Masuk'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_Hasil_Evaluasi_byAgen/transaction_Management'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_Hasil_Evaluasi_byAgen/tender_Seleksi_Umum'))

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/Search'), 
    'PP/JPROC/2024/000083')

WebUI.delay(7)

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/proses_tender'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/tab_HasilEvaluasi_AdmTeknis'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/simpan_Persetujuan'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/informasi_Ditampilkan'))

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/pilih_Revisi'))

WebUI.setText(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/isi_Catatan'), 
    'Periksa kembali')

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/NegativeTest_Tender_Seleksi_Umum/Revisi_HasilEvaluasi_AdmTeknis_byAgen/simpan_ReviewApproval'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/006_Pengajuan_Persetujuan_Evaluasi/konfirmasi_OK'))

WebUI.delay(5)

