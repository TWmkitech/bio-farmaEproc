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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Tambah'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Tambah'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_PaketRFI'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_PaketRFI'), 'Paket RFI - 12081998')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Keterangan'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Keterangan'), 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Checkbox_PilihDR'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Checkbox_PilihDR'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 900)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglMulaiPengumuman'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglMulaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPengumuman'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglSelesaiPengumuman'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_1TglSelesaiPengumuman'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenjelasan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglMulaiPenjelasan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglMulaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenjelasan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglSelesaiPenjelasan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_2TglSelesaiPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenyampaianRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglMulaiPenyampaianRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglMulaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenyampaianRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglSelesaiPenyampaianRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_3TglSelesaiPenyampaianRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPembukaanRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglMulaiPembukaanRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglMulaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPembukaanRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglSelesaiPembukaanRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_4TglSelesaiPembukaanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiKlarifikasiRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglMulaiKlarifikasiRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglMulaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiKlarifikasiRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_WaktuSelesaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglSelesaiKlarifikasiRFI'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_5TglSelesaiKlarifikasiRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Konfigurasi'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Konfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_JenisMeeting'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Field_JenisMeeting'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataJenisMeeting'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataJenisMeeting'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Tempat'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Tempat'), 'PT. MKI')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Url'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Url'), 'meet.google.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_KeteranganKonfigurasi'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_KeteranganKonfigurasi'), 'Dokumen A1')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_TataTertib'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_TataTertib'), 'Berikut merupakan tata tertib yang harus dipatuhi:')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahUndangan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Nama'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Nama'), 'Asep')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Email'), 'asep@mail.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_UnitKerja'), 'Asep')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Instansi'), 'Asep')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanKonfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_DokumenRFI'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_DokumenRFI'), 'Dokumen Pers')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Upload_Dokumen'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Upload_Dokumen')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahRekananBerdasarkanKualifikasi'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/CBOX_TambahRekananBerdasarkanKualifikasi'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/CBOX_TambahRekananBerdasarkanKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanRekanan'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanRekanan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahDRM'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_TambahDRM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Perusahaan'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Perusahaan'), 'PT. XYZ')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Surel'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_Surel'), 'tarja@mail.com')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_NamaPIC'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_NamaPIC'), 'Tarja')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_NoHP'), 0)

WebUI.setText(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Input_NoHP'), '0812345678')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Dropdown_AreaVendor'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Dropdown_AreaVendor'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataAreaVendor'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Div_DataAreaVendor'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanDRM'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_SimpanDRM'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Kirim'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_OK'), 0)

WebUI.click(findTestObject('Budget-Planning/RFI/TambahRFIdariDR/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

