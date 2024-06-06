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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_KonfigurasiPengadaan'))

WebUI.delay(10)

TestObject targetElement1 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_IsiKonfigurasi'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 500)

WebUI.delay(5)

WebUI.scrollToPosition(0, 1900)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_SifatPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_SifatPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataSifatPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataSifatPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodePemilihan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodePemilihan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodePemilihan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodePemilihan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PenyampaianDokumen'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PenyampaianDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPenyampaianDokumen'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPenyampaianDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Jaminan1'), 20)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Jaminan1'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap2'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap2'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap2'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap2'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPenilaianKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_JenisPenilaianKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPenilaianKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataJenisPenilaianKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_TambahKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_TambahKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_NamaPencarian'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_NamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNamaPencarian'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNamaPencarian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Nilai'), 20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Nilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNilai'), 20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataNilai'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Checkbox_Wajib'), 20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Checkbox_Wajib'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DokumenKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DokumenKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDokumenKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDokumenKualifikasi'))

WebUI.waitForElementClickable(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Upload_DokumenKualifikasi'), 
    20)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Upload_DokumenKualifikasi')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap3'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap3'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap3'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap3'))

WebUI.delay(10)

WebUI.delay(5)

WebUI.scrollToPosition(0, 300)

WebUI.delay(5)

WebUI.scrollToPosition(0, 800)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_IncludeHariLibur'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_IncludeHariLibur'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncludeHariLibur'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncludeHariLibur'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DiperlukanAanwijzing'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_DiperlukanAanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDiperlukanAanwijzing'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataDiperlukanAanwijzing'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PembukaanPenawaran'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PembukaanPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPembukaanPenawaran'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPembukaanPenawaran'))

TestObject targetElement2 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan')

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPemberianPenjelasan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_JenisRapat'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_JenisRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataJenisRapat'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataJenisRapat'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_Tempat'), 
    'Jl. Banda No.30, Citarum, Kec. Bandung Wetan, Kota Bandung, Jawa Barat 40115')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_UrlMeeting'), 
    'meet.google.com/automated-testing')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Input_Keterangan'), 
    'Lorem ipsum dolor sit amet')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_TambahUndangan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Checkbox_PenerimaUndangan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Checkbox_PenerimaUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_Nama'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Field_Nama'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataNama'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Div_DataNama'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_SimpanKonfigurasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPemberianPenjelasan/Button_SimpanKonfigurasi'))

WebUI.delay(5)

TestObject targetElement3 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran')

WebUI.sendKeys(targetElement3, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Anchor_KonfigurasiPembukaanPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Field_JenisRapat'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Field_JenisRapat'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Div_DataJenisRapat'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Div_DataJenisRapat'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Tempat'), 
    'Jakarta')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UrlMeeting'), 
    'meet.google.com/automated-test')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Keterangan'), 
    'sit amet efficitur neque augue vitae enim')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_TambahUndangan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_TambahUndangan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Checkbox_PenerimaUndangan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Checkbox_PenerimaUndangan'))

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Nama'), 
    'Asep')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Email'), 
    'asep@yopmail.com')

WebUI.delay(20)

TestObject targetElement4 = findTestObject('Object Repository/Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UnitKerja')

WebUI.sendKeys(targetElement4, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_UnitKerja'), 
    'Railway Business Development')

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Input_Instansi'), 
    'PT Kereta Cepat Indonesia China')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_SimpanKonfigurasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/FormPembukaanPenawaran/Button_SimpanKonfigurasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap5'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap5'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap5'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap5'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodeEvaluasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_MetodeEvaluasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodeEvaluasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataMetodeEvaluasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_FormatEvaluasiKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_FormatEvaluasiKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataFormatEvaluasiKualifikasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataFormatEvaluasiKualifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiAdministrasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiAdministrasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiAdministrasi'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiAdministrasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiTeknis'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_EvaluasiTeknis'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiTeknis'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataEvaluasiTeknis'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_RumusEvaluasiHarga'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_RumusEvaluasiHarga'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataRumusEvaluasiHarga'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataRumusEvaluasiHarga'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Bobot'), 20)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Bobot'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PaymentMethod'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_PaymentMethod'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPaymentMethod'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataPaymentMethod'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Incoterms'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Field_Incoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncoterms'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Div_DataIncoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap6'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap6'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap6'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap6'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 400)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap7'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_LanjutkanTahap7'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap7'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKtahap7'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 600)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Catatan'), 20)

WebUI.setText(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Input_Catatan'), 'Data pemaketan ini dibuat secara automated test')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_Submit'), 20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_Submit'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKsubmit'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/DraftingKonfigurasi/Button_OKsubmit'))

WebUI.delay(20)

WebUI.closeBrowser()

