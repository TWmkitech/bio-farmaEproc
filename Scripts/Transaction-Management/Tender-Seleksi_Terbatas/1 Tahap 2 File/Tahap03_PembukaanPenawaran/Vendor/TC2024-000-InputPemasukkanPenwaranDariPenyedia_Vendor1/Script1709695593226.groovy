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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/1_Vendor/Vendor1_PT SURYA TUBAL INDONESIA'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/SubModul_Tender  Seleksi Terbatas'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Menu_Tender  Seleksi Terbatas Yang Diikuti'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap02_Aanwijzing/Vendor/Icon_ProsesTender'))

WebUI.verifyElementPresent(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Vendor/Vendor/Verify_InformasiUmumPengadaan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Menu_PemasukanPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Tutup'))

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_SuratPernyataanKebenaranData')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_SuratPernyataanKebenaranData'))

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_SuratPernyataanKesanggupan')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_SuratPernyataanKesanggupan'))

// Ambil elemen field "Choose File"
TestObject uploadField3 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_SuratKeteranganJalurDistribusi')

// Mendapatkan direktori proyek
def projectDir3 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir3 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField3, filePath3)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_SuratKeteranganJalurDistribusi'))

// Ambil elemen field "Choose File"
TestObject uploadField4 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_ProposalTeknis')

// Mendapatkan direktori proyek
def projectDir4 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath4 = projectDir4 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField4, filePath4)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_ProposalTeknis'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Berikutnya'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Submenu_Harga'), 
    5)

// Ambil elemen field "Choose File"
TestObject uploadField5 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_SuratPenawaranHarga')

// Mendapatkan direktori proyek
def projectDir5 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath5 = projectDir5 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField5, filePath5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_SuratPenawaranHarga'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Unggah_SuratPenawaranHarga'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/TextBox_NomorSuratPenawaran'), 
    '123TestNoSurat')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_Date_TanggalPenawaran'))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Vendor/Tahap03/Select_Date_TanggalPenawaran'), 
    [('index') : 31], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_PilihMataUang'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_PilihMataUang_IDR - Rupiah'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Textbox_MasaBerlakuPenawaran(HariKalender)'), 
    '5')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Textbox_JangkaWaktuPelaksanaan(Bulan)'), 
    '2')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selextbox_PimpinanPerusahaan'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selextbox_PimpinanPerusahaan_Direktur Utama - Taufik Hadi'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Textbox_HargaSatuan_Row1'), 
    '703')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Selectbox_Origin_Row1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Selectbox_Origin_Row1_PT. Madu Baru'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Textbox_HargaSatuan_Row2'), 
    '704')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Selectbox_Origin_Row2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel1_Selectbox_Origin_Row2_PT. Madu Baru'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel2_Textbox_HargaSatuan_Row1'), 
    '679')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel2_Selectbox_Origin_Row1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel2_Selectbox_Origin_Row1_PT. Madu Baru'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Textbox_HargaSatuan_Row1'), 
    '679')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Selectbox_Origin_Row1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Selectbox_Origin_Row1_PT. Madu Baru'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Textbox_HargaSatuan_Row2'), 
    '703')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Selectbox_Origin_Row2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Tabel3_Selectbox_Origin_Row2_PT. Madu Baru'), 
    FailureHandling.STOP_ON_FAILURE)

// Ambil elemen field "Choose File"
TestObject uploadField6 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_UnggahRincianPenawaran')

// Mendapatkan direktori proyek
def projectDir6 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath6 = projectDir6 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField6, filePath6)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_TermofPayment'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_TermofPayment_1Sekaligus'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Textbox_TermofPayment_note'), 
    'Automation Testing Term of Payment')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_Incoterm'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Selectbox_Incoterm_1EXW - Ex Works'), 
    FailureHandling.STOP_ON_FAILURE)

// Ambil elemen field "Choose File"
TestObject uploadField7 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Upload_UnggahSuratPenawaranHarga')

// Mendapatkan direktori proyek
def projectDir7 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath7 = projectDir7 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField7, filePath7)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/button_Simpan  Kirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap03_PembukaanPenawaran/Vendor/1_InputPemasukanPenawaran/Button_PopupKonfirmasi_OK'))

WebUI.closeBrowser()

