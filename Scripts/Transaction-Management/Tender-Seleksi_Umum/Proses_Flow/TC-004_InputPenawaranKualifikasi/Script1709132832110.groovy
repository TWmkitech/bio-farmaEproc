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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://vendor-dev.digital-healthcare.id/home.html')

WebUI.click(findTestObject('Object Repository/Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/input_Username_username'), 
    'DRM-JP.24.000013')

WebUI.setText(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/input_Password_password'), 
    'password.1')

WebUI.click(findTestObject('Object Repository/Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Login'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/a_Transaction'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/a_Tender  Seleksi Umum'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/a_TenderSeleksi Umum Yang Diikuti'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/proses_Penawaran'))

WebUI.delay(5)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/isian_Kualifikasi'))

// Script Upload File
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/1_upload_SBU')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah1'))

// Ambil elemen field "Choose File"
TestObject uploadFieldSIUP = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/2_upload_SIUP_SIUJK')

def filePathSIUP = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldSIUP, filePathSIUP)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah2'))

// Ambil elemen field "Choose File"
TestObject uploadFieldSPT = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/3_upload_SPTTahunan')

def filePathSPT = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldSPT, filePathSPT)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah3'))

// Ambil elemen field "Choose File"
TestObject uploadFieldRefBank = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/4_RefBank_RekeningKoran')

def filePathRefBank = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldRefBank, filePathRefBank)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah4'))

// Ambil elemen field "Choose File"
TestObject uploadFieldCV = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/5_upload_CV')

def filePathCV = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldCV, filePathCV)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah5'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPeralatan = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/6_upload_Peralatan')

def filePathPeralatan = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPeralatan, filePathPeralatan)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah6'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPengalaman = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/7_upload_PengalamanPerusahaan')

def filePathPengalaman = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPengalaman, filePathPengalaman)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah7'))

// Ambil elemen field "Choose File"
TestObject uploadFieldAkta = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/8_upload_AktaPerusahaan')

def filePathAkta = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAkta, filePathAkta)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah8'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPemegangSaham = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/9_upload_PemegangSaham')

def filePathPemegangSaham = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPemegangSaham, filePathPemegangSaham)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah9'))

// Ambil elemen field "Choose File"
TestObject uploadFieldNPWP = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/10_upload_NPWP_PKP')

def filePathNPWP = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldNPWP, filePathNPWP)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah10'))

// Ambil elemen field "Choose File"
TestObject uploadFieldNIB = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/11_upload_TDP_NIB')

def filePathNIB = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldNIB, filePathNIB)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah11'))

// Ambil elemen field "Choose File"
TestObject uploadFieldIzinLokasi = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/12_upload_IzinLokasi')

def filePathIzinLokasi = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldIzinLokasi, filePathIzinLokasi)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah12'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPernyataan = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/13_upload_Surat_Pernyataan')

def filePathPernyataan = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPernyataan, filePathPernyataan)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah13'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPaktaIntegritas = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/14_Pakta_Integritas')

def filePathPaktaIntegritas = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPaktaIntegritas, filePathPaktaIntegritas)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah14'))

// Ambil elemen field "Choose File"
TestObject uploadFieldCompanyProfile = findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/15_Company_Profile')

def filePathCompanyProfile = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldCompanyProfile, filePathCompanyProfile)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah15'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/button_SimpanKirim'))

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/konfirmasi_SimpanKirim'))

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/info_SudahSubmit'), 
    2)

WebUI.click(findTestObject('Transaction-Management/Seleksi-Umum/004-InputPenawaranKualifikasi/info_SudahSubmit'))

WebUI.delay(2)

WebUI.closeBrowser()

