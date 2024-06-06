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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/TambahDataBaru'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/TambahDataBaru'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_PaketRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_PaketRFI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_PaketRFI'), 'Manual/RFI/2024/050201')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_KeteranganPaketRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_KeteranganPaketRFI'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_KeteranganPaketRFI'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.')

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/CBOX_PilihDR_R1'))

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
WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_1WaktuMulaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_1WaktuMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_1TglMulaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_1TglMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_1WaktuSelesaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_1WaktuSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_1TglSelesaiPengumuman'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_1TglSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_2WaktuMulaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_2WaktuMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_2TglMulaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_2TglMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_2WaktuSelesaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_2WaktuSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_2TglSelesaiPenjelasan'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_2TglSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_3WaktuMulaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_3WaktuMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_3TglMulaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_3TglMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_3WaktuSelesaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_3WaktuSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_3TglSelesaiPenyampaianRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_3TglSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_4WaktuMulaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_4WaktuMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_4TglMulaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_4TglMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_4WaktuSelesaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_4WaktuSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_4TglSelesaiPembukaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_4TglSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_5WaktuMulaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_5WaktuMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_5TglMulaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_5TglMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_5WaktuSelesaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Field_5WaktuSelesaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_5TglSelesaiKlarifikasiRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_5TglSelesaiKlarifikasiRFI'))

WebUI.sendKeys(findTestObject('Budget-Planning/RFI/TambahRFIManual/Div_5TglSelesaiKlarifikasiRFI'), Keys.chord(Keys.ENTER))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_Konfigurasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_Konfigurasi'))

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

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Nama'), 'Anthoni Salim')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 'anthonisalim@invest.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 'Pendamping Pengadaan')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 'PT. Pengadaan Solusi Sejahtera')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_TambahPertanyaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_TambahPertanyaanRFI'))

WebUI.waitForElementVisible(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahPertanyaanRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahPertanyaanRFI'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahPertanyaanRFI'), 'Apakah pertanyaan RFI ini penting?')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_TambahPertanyaanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_TambahPertanyaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_TambahPertanyaanRFI_Text'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_TambahPertanyaanRFI_Text'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Upload_Dokumen'), 20)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/RFI/TambahRFIManual/Upload_Dokumen')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahDokumenRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahDokumenRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahDokumenRFI'), 20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahDokumenRFI'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIManual/TBOX_TambahDokumenRFI'), 'Tambahan Dokumen RFI')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/UPLOAD_TambahanDokumenRFI'), 20)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('Budget-Planning/RFI/TambahRFIManual/UPLOAD_TambahanDokumenRFI')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_TambahRekananBerdasarkanKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/Button_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/CBOX_TambahRekananBerdasarkanKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/CBOX_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_NamaPencarian'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_NamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_NamaPencarian_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_NamaPencarian_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_Nilai'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_Nilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_Nilai_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/SBOX_Nilai_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_CariRekananKualifikasi'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_CariRekananKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/CBOX_RekananYangDiundang_B1'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/CBOX_RekananYangDiundang_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahkanKeRekananYangDiundang'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahkanKeRekananYangDiundang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahkanRekananBerdasarkanPencarianManual'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahkanRekananBerdasarkanPencarianManual'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/TBOX_CariBerdasarkanNamaPerusahaan'), 'PT SURYA TUBAL INDONESIA')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_CariBerdasarkanNamaPerusahaan_B1'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/CBOX_CariBerdasarkanNamaPerusahaan_B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PBUTTON_TambahkanKeRekananYangDiundang'), 
    20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/PBUTTON_TambahkanKeRekananYangDiundang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahVendorDiLuarDRM'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_TambahVendorDiLuarDRM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPerusahaan'), 'PT. Maju Kena Mundur Kena')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_Email'), 'majukenamundurkena@maju.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NamaPIC'), 'Prajogo Pangestu')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'), 
    20)

WebUI.clearText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'))

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/1_New/PTBOX_TambahVendorDiLuarDRM_NoHandphonePIC'), '081122334455')

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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_KIRIM'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIManual/BUTTON_KIRIM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

