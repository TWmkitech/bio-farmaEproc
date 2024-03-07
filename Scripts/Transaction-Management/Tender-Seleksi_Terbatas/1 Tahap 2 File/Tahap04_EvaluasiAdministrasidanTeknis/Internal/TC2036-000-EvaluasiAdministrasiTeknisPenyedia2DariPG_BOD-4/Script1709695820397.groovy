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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))
WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/Custom_Icon_Proses'), 
    [('index') : 2], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/Menu_TahapanEvaluasiAdminTeknis'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/Menu_TahapanEvaluasiAdminTeknis'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/Text_NamaPenyedia2'))

WebUI.delay(5)

TestObject targetElement2 = findTestObject('bject Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/Icon_PenilaianEvaluasi_Vendor2')

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/Icon_PenilaianEvaluasi_Vendor2'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/TextBox_CatatanHasilPelakasanaanPOC'), 
    'Test Catatan Hasil Pelaksanaan V2')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPOC_button_DokumenPendukungPOC'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPOC_Textbox_NamaDokumen'), 
    'DPPOC2')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPOC_Upload_DokumenPendukungPOC')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPOC_button_UploadDokumen'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPOC_Button_PopupKonfirmasi_OK'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SPKD'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SPKD'), 
    '90')

WebUI.delay(5)

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SPK'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SPK'), 
    '90')

WebUI.delay(5)

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SKJD'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Textbox_Nilai_SKJD'), 
    '90')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DA_Rbutton_HasilEvaluasiAdministrasi_Lulus'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DT_Textbox_Nilai_PT'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DT_Textbox_Nilai_PT'), 
    '90')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DT_Rbutton_HasilEvaluasiTeknis_Lulus'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_Button_UploadDokPendEvalAdminTek'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_Button_UploadDokPendEvalAdminTek'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_Textbox_NamaKertasKerja'), 
    'Test Nama Kertas Kerja V2')

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_Upload_DokumenPendukungEvalAdminTek')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_button_Upload Dokumen'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/DPEAT_Button_PopupKonfirmasi_OK'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/button_Simpan Perubahan'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/3_EvaluasiAdminTeknisDariPG/Button_PopupKonfirmasi_OK'))

WebUI.closeBrowser()

