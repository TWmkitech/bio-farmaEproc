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

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/span_Transaction Management'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/SubModul_TenderSeleksi umum'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/span_Tahapan  Negosiasi'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/aksi_negosiasi'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/button_KeputusanNegosiasi'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/Pilih_Keputusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/Berhasil_Negosiasi'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/catatan_keputusan'), 'sesuai kesepakatan')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/kirim_keputusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/a_OK_keputusanNegosiasi'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/button_Selesaikan Negosiasi'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/a_OK_SelesaiNegosiasi'))

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/button_AjukanPersetujuanNegosiasi'))

not_run: WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/dokumenPendukung_PengajuanPersetujuanNegosiasi'), 
    'dokumen pendukung')

not_run: def projectDir = Config.getProjectDir()

not_run: TestObject upload_dokPendukungAjukanPersetujuan = findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/upload_dokPendukungAjukanPersetujuan')

// Membentuk path lengkap file yang ingin diunggah
not_run: def filePathdokPendukungAjukanPersetujuan = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(upload_dokPendukungAjukanPersetujuan, filePathdokPendukungAjukanPersetujuan)

not_run: WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/catatan_AjukanPersetujuan'), 
    'setelah kesepakatan negosiasi')

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/button_Ajukan Persetujuan'))

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/a_OK_AjukanPersetujuan'))

not_run: WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Negosiasi/span_Status Persetujuan Negosiasi Reviewer'))

