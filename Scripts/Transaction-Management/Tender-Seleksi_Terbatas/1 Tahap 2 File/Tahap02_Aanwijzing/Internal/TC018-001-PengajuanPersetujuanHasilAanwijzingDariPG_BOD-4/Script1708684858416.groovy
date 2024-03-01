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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Form_TahapanAanwijzing'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/button_Draft Konsep Berita Acara'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_PokokAcaraRapat'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_PokokAcaraRapat'), 
    'Pokok Acara Rapat Dari BOD-4')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_JalannyaRapat'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_JalannyaRapat'), 
    'Jalannya Rapat Dari BOD-4')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_Penutup'))

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextArea_Penutup'), 
    'Penutup Dari BOD-4')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/TextBox_Dokumen Pendukung_nama_file_pendukung'), 
    'TestDoc')

WebUI.uploadFile(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/Upload_DokumenPendukung'), 
    'C:\\Users\\ASUS\\git\\bio-farmaEproc\\Document\\DataTest.docx')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/1_PengajuanPersetujuanHasilAanwijzing/button_Ajukan Persetujuan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Internal/Button_Popup_OK'))

WebUI.closeBrowser()

