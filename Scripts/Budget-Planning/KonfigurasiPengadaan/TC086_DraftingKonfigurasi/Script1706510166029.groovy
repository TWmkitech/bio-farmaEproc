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

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'))

WebUI.delay(10)

TestObject targetElement1 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1900)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_SifatPengadaan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_SifatPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataSifatPengadaan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataSifatPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPengadaan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPengadaan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodePemilihan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodePemilihan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodePemilihan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodePemilihan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PenyampaianDokumen'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PenyampaianDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPenyampaianDokumen'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPenyampaianDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Jaminan1'), 0)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Jaminan1'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap2'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap2'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap2'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPenilaianKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPenilaianKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPenilaianKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPenilaianKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_TambahKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_TambahKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_NamaPencarian'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_NamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNamaPencarian'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Nilai'), 0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Nilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNilai'), 0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Checkbox_Wajib'), 0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Checkbox_Wajib'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DokumenKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DokumenKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDokumenKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDokumenKualifikasi'))

WebUI.waitForElementClickable(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Upload_DokumenKualifikasi'), 
    0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Upload_DokumenKualifikasi')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap3'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap3'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap3'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap3'))

WebUI.delay(10)

WebUI.delay(5)

WebUI.scrollToPosition(0, 300)

WebUI.delay(5)

WebUI.scrollToPosition(0, 800)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_IncludeHariLibur'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_IncludeHariLibur'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncludeHariLibur'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncludeHariLibur'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DiperlukanAanwijzing'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DiperlukanAanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDiperlukanAanwijzing'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDiperlukanAanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PembukaanPenawaran'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PembukaanPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPembukaanPenawaran'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPembukaanPenawaran'))

TestObject targetElement2 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan')

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_JenisRapat'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_JenisRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataJenisRapat'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataJenisRapat'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_Tempat'), 
    'Jl. Banda No.30, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_UrlMeeting'), 
    'meet.google.com/automated-testing')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_Keterangan'), 
    'Lorem ipsum dolor sit amet')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_TambahUndangan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Checkbox_PenerimaUndangan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Checkbox_PenerimaUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_Nama'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_Nama'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataNama'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataNama'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_SimpanKonfigurasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_SimpanKonfigurasi'))

WebUI.delay(5)

TestObject targetElement3 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran')

WebUI.sendKeys(targetElement3, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Field_JenisRapat'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Field_JenisRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Div_DataJenisRapat'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Div_DataJenisRapat'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Tempat'), 
    'Jakarta')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UrlMeeting'), 
    'meet.google.com/automated-test')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Keterangan'), 
    'sit amet efficitur neque augue vitae enim')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_TambahUndangan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Checkbox_PenerimaUndangan'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Checkbox_PenerimaUndangan'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Nama'), 
    'Asep')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Email'), 
    'asep@yopmail.com')

WebUI.delay(5)

TestObject targetElement4 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UnitKerja')

WebUI.sendKeys(targetElement4, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UnitKerja'), 
    'Railway Business Development')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Instansi'), 
    'PT Kereta Cepat Indonesia China')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_SimpanKonfigurasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_SimpanKonfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap5'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap5'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap5'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap5'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodeEvaluasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodeEvaluasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodeEvaluasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodeEvaluasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_FormatEvaluasiKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_FormatEvaluasiKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataFormatEvaluasiKualifikasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataFormatEvaluasiKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiAdministrasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiAdministrasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiAdministrasi'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiAdministrasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiTeknis'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiTeknis'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiTeknis'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiTeknis'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_RumusEvaluasiHarga'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_RumusEvaluasiHarga'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataRumusEvaluasiHarga'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataRumusEvaluasiHarga'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Bobot'), 0)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Bobot'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PaymentMethod'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PaymentMethod'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPaymentMethod'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPaymentMethod'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Incoterms'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Incoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncoterms'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap6'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap6'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap6'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap6'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 400)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap7'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap7'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap7'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap7'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 600)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Catatan'), 0)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Catatan'), 'Data pemaketan ini dibuat secara automated test')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_Submit'), 0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_Submit'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKsubmit'), 
    0)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKsubmit'))

WebUI.delay(10)

WebUI.closeBrowser()

