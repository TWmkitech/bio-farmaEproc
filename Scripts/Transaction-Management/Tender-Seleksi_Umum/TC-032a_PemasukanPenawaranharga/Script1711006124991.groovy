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

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/Vendor/Login_vendor/Techolution Digital Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Modul_Transaction'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Submodul_Tender Seleksi Umum'))

WebUI.enhancedClick(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/span_Tender Umum yang diikuti'))

WebUI.callTestCase(findTestCase('Transaction-Management/Tender-Seleksi_Umum/SeachingVendor'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/Icon_Detail'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/span_PemasukanHarga'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/button_TutupInformasi'))

def projectDir = Config.getProjectDir()

TestObject upload_SPH = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/upload_SPH')

// Membentuk path lengkap file yang ingin diunggah
def filePathSPH = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_SPH, filePathSPH)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/unggah1'))

TestObject upload_RekapitulasiHarga = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/upload_RekapitulasiHarga')

// Membentuk path lengkap file yang ingin diunggah
def filePathRekapitulasi = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_RekapitulasiHarga, filePathRekapitulasi)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/unggah2'))

TestObject upload_Rincian = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/upload_Rincian')

// Membentuk path lengkap file yang ingin diunggah
def filePathRincian = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_Rincian, filePathRincian)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/unggah3'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/noSuratPenawaran'), '1234/penawaran/2024')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihTanggalPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/TanggalPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihMataUang'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/rupiah'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/BerlakuPenawaran'), '30')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/MasaBerlakuBulan'), '1')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihDataPemimpinPerusahaan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/PemimpinPerusahaan'))

WebUI.delay(3)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/Harga1'), '5000')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihOrigin1'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/origin 1'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/Harga2'), '95000000')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihOrigin2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/origin 2'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/Harga3'), '11000000')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihOrigin3'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/origin3'))

TestObject upload_RincianPenawaran = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/upload_RincianPenawaran')

// Membentuk path lengkap file yang ingin diunggah
def filePathRincianPenawaran = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_RincianPenawaran, filePathRincianPenawaran)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/pilihTermOfPayment'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/Termin'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/PilihIncontern'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/inconterm'))

TestObject upload_SuratPenawaran = findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/upload_SuratPenawaran')

// Membentuk path lengkap file yang ingin diunggah
def filePathSuratPenawaran = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(upload_SuratPenawaran, filePathSuratPenawaran)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi-umum/Vendor/PemasukanHarga/a_ok_pemasukanpenawaran'))

