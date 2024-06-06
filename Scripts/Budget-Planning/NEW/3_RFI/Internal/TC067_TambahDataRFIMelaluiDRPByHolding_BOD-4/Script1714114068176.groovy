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
import java.text.SimpleDateFormat as SimpleDateFormat

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/Icon_Edit'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/Icon_Edit'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_PaketRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_PaketRFI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_PaketRFI'), 'RFI/2024/052701')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Keterangan'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Keterangan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Keterangan'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.')

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

/*
def date = new Date()

SimpleDateFormat wholeDate = new SimpleDateFormat('MM/dd/yyyy')

String strDate = wholeDate.format(date)

list = strDate.split('/')

String finaltime = ((((list[0]) + '/') + (list[1])) + '/') + (list[2])

String MM = list[0]

String dd = list[1]

String yyyy = list[2]

int date = dd.toInteger()

int today = date + 1

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglMulaiPengumuman'), 20)

def xpath = ('/html/body/div[2]/div[2]/div/div[2]/div/span['+ today +']')
 
WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/2_Parameterize/Param_TglMulaiPengumuman', [('nowtoday') : today))
 */
WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglMulaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglSelesaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglMulaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglSelesaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglMulaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglSelesaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglMulaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglSelesaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglMulaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglSelesaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglSelesaiKlarifikasiRFI'))

WebUI.sendKeys(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglSelesaiKlarifikasiRFI'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Konfigurasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Konfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_JenisMeeting'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_JenisMeeting'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataJenisMeeting'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataJenisMeeting'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Tempat'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Tempat'), 'PT. Mediatama Kreasi Informatika')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Url'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Url'), 'meet.google.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_KeteranganKonfigurasi'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_KeteranganKonfigurasi'), 'Keterangan Konfigurasi Aanwizjing')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_TataTertib'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_TataTertib'), 'Peraturan tata tertib wajib dipatuhi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahUndangan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Nama'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Nama'), 'Warren Buffet')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 'warrenbuffet@invest.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 'Pendamping Pengadaan')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 'PT. Pengadaan Solusi Bisnis')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/Button_TambahPertanyaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/Button_TambahPertanyaanRFI'))

WebUI.waitForElementVisible(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahPertanyaanRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahPertanyaanRFI'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahPertanyaanRFI'), 'Apakah pertanyaan RFI ini penting?')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_TambahPertanyaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_TambahPertanyaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_TambahPertanyaanRFI_Text'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahPertanyaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Upload_Dokumen'), 20)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Upload_Dokumen')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahDokumenRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahDokumenRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahDokumenRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahDokumenRFI'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_TambahDokumenRFI'), 'Tambahan Dokumen RFI')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/UPLOAD_TambahanDokumenRFI'), 20)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/UPLOAD_TambahanDokumenRFI')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahRekananBerdasarkanKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/CBOX_TambahRekananBerdasarkanKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/CBOX_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_NamaPencarian'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_NamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_NamaPencarian_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_NamaPencarian_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_Nilai'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_Nilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_Nilai_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/SBOX_Nilai_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_CariRekananKualifikasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_CariRekananKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_RekananYangDiundang_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_RekananYangDiundang_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahkanKeRekananYangDiundang'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahkanKeRekananYangDiundang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahkanRekananBerdasarkanPencarianManual'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahkanRekananBerdasarkanPencarianManual'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'), 'PT SURYA TUBAL INDONESIA')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_CariBerdasarkanNamaPerusahaan_B1'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_CariBerdasarkanNamaPerusahaan_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PBUTTON_TambahkanKeRekananYangDiundang'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PBUTTON_TambahkanKeRekananYangDiundang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahVendorDiLuarDRM'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_TambahVendorDiLuarDRM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'), 'PT. Maju Mundur Kena')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'), 'majumundur@maju.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'), 'Leonardo Dicaprio')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'), '080987654321')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PSBOX_TambahVendorDiLuarDRM_AreaVendor'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PSBOX_TambahVendorDiLuarDRM_AreaVendor'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PSBOX_TambahVendorDiLuarDRM_AreaVendor_Domestik'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PSBOX_TambahVendorDiLuarDRM_AreaVendor_Domestik'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Simpan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Simpan'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_KIRIM'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/BUTTON_KIRIM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Button_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Button_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

