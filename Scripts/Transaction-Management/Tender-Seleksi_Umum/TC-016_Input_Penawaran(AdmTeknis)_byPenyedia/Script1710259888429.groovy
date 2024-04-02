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

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_Masuk'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Username_username'), 'DRM-JP.24.000013')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/003-MonitoringDaftarMinat/input_Password_password'), 'password.1')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_Login'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/proses'))

WebUI.delay(2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pemasukan_Penawaran'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/tutup_Informasi'))

def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadFieldAdm1 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_adm1')

// Membentuk path lengkap file yang ingin diunggah
def filePathAdm1 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAdm1, filePathAdm1)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahAdm1'))

// Ambil elemen field "Choose File"
TestObject uploadFieldAdm2 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_adm2')

def filePathAdm2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAdm2, filePathAdm2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahAdm2'))

// Ambil elemen field "Choose File"
TestObject uploadFieldAdm3 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_adm3')

def filePathAdm3 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAdm3, filePathAdm3)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahAdm3'))

// Ambil elemen field "Choose File"
TestObject uploadFieldAdm4 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_adm4')

def filePathAdm4 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAdm4, filePathAdm4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahAdm4'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis1 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis1')

def filePathTeknis1 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis1, filePathTeknis1)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis1'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis2 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis2')

def filePathTeknis2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis2, filePathTeknis2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis2'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis3 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis3')

def filePathTeknis3 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis3, filePathTeknis3)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis3'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis4 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis4')

def filePathTeknis4 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis4, filePathTeknis4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis4'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis5 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis5')

def filePathTeknis5 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis5, filePathTeknis5)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis5'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis6 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis6')

def filePathTeknis6 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis6, filePathTeknis6)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis6'))

// Ambil elemen field "Choose File"
TestObject uploadFieldTeknis7 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_teknis7')

def filePathTeknis7 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldTeknis7, filePathTeknis7)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahTeknis7'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_Berikutnya'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_harga1'), 
    4)

// Ambil elemen field "Choose File"
TestObject uploadFieldHarga1 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_harga1')

def filePathHarga1 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldHarga1, filePathHarga1)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahHarga1'))

// Ambil elemen field "Choose File"
TestObject uploadFieldHarga2 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_harga2')

def filePathHarga2 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldHarga2, filePathHarga2)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahHarga2'))

// Ambil elemen field "Choose File"
TestObject uploadFieldHarga3 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_harga3')

def filePathHarga3 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldHarga3, filePathHarga3)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahHarga3'))

// Ambil elemen field "Choose File"
TestObject uploadFieldHarga4 = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/upload_harga4')

def filePathHarga4 = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldHarga4, filePathHarga4)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_UnggahHarga4'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_NomorPenawaran'), 
    '0603/Penawaran/2024')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/Tanggal_Penawaran'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_Tanggal'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_Mata_Uang'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_Rupiah'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_MasaBerlaku_Penawaran'), 
    '10')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_JangkaWaktu'), 
    '3')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_PimpinanPerusahaan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_PimpinanDirektur'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_Harga1'), 
    '8900000')

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_Harga2'), 
    '98000000')

// Ambil elemen field "Choose File"
TestObject uploadFieldRincianPenawaran = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/unggah_Rincian_Penawaran')

def filePathRincianPenawaran = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldRincianPenawaran, filePathRincianPenawaran)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/Term_of_Payment'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_Payment_Sekaligus'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/catatan_Payment'), 
    'Pembayaran 100%')

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/Incoterm'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_CIF'))

WebUI.setText(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/input_Penerbit_Jaminan'), 
    'Test Penerbit Jaminan')

// Ambil elemen field "Choose File"
TestObject uploadFieldUnggahJaminan = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/unggah_Jaminan')

def filePathUnggahJaminan = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldUnggahJaminan, filePathUnggahJaminan)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/Tanggal_MasaBerlaku_Jaminan'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/pilih_Tanggal_MasaBerlaku'), 
    FailureHandling.STOP_ON_FAILURE)

// Ambil elemen field "Choose File"
TestObject uploadFieldPenawaranHarga = findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/unggah_Surat_Penawaran_Harga')

def filePathPenawaranHarga = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPenawaranHarga, filePathPenawaranHarga)

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Seleksi-Umum/016_Input_Penawaran(Administrasi_Teknis)/konfirmasi_OK'))

WebUI.delay(4)

