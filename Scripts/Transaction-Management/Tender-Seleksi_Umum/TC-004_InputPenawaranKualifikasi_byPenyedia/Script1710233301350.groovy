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

WebUI.click(findTestObject('Object Repository/TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/input_Username_username'), 
    'DRM-JP.24.000004')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/input_Password_password'), 
    'password.1')

WebUI.click(findTestObject('Object Repository/TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Login'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/a_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/a_Tender  Seleksi Umum'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/a_TenderSeleksi Umum Yang Diikuti'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/proses_Penawaran'))

WebUI.delay(5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/isian_Kualifikasi'))

// Script Upload File
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/1_upload_SBU')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah1'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldSIUP = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/2_upload_SIUP_SIUJK')

not_run: def filePathSIUP = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldSIUP, filePathSIUP)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah2'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldSPT = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/3_upload_SPTTahunan')

not_run: def filePathSPT = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldSPT, filePathSPT)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah3'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldRefBank = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/4_RefBank_RekeningKoran')

not_run: def filePathRefBank = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldRefBank, filePathRefBank)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah4'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldCV = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/5_upload_CV')

not_run: def filePathCV = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldCV, filePathCV)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah5'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldPeralatan = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/6_upload_Peralatan')

not_run: def filePathPeralatan = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldPeralatan, filePathPeralatan)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah6'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldPengalaman = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/7_upload_PengalamanPerusahaan')

not_run: def filePathPengalaman = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldPengalaman, filePathPengalaman)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah7'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldAkta = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/8_upload_AktaPerusahaan')

not_run: def filePathAkta = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldAkta, filePathAkta)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah8'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldPemegangSaham = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/9_upload_PemegangSaham')

not_run: def filePathPemegangSaham = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldPemegangSaham, filePathPemegangSaham)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah9'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldNPWP = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/10_upload_NPWP_PKP')

not_run: def filePathNPWP = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldNPWP, filePathNPWP)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah10'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldNIB = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/11_upload_TDP_NIB')

not_run: def filePathNIB = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldNIB, filePathNIB)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah11'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldIzinLokasi = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/12_upload_IzinLokasi')

not_run: def filePathIzinLokasi = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldIzinLokasi, filePathIzinLokasi)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah12'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldPernyataan = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/13_upload_Surat_Pernyataan')

not_run: def filePathPernyataan = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldPernyataan, filePathPernyataan)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah13'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldPaktaIntegritas = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/14_Pakta_Integritas')

not_run: def filePathPaktaIntegritas = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldPaktaIntegritas, filePathPaktaIntegritas)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah14'))

// Ambil elemen field "Choose File"
not_run: TestObject uploadFieldCompanyProfile = findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/15_Company_Profile')

not_run: def filePathCompanyProfile = projectDir + '/Document/DataTest.docx'

not_run: WebUI.uploadFile(uploadFieldCompanyProfile, filePathCompanyProfile)

not_run: WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_Unggah15'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/konfirmasi_SimpanKirim'))

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/info_SudahSubmit'), 
    2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/004-InputPenawaranKualifikasi/info_SudahSubmit'))

WebUI.delay(2)

WebUI.closeBrowser()

