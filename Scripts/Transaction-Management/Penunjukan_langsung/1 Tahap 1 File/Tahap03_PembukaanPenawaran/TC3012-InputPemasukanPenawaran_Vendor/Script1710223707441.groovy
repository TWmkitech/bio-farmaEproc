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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/Vendor_PT Bespin Global Indonesia'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Modul_Transaction'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Submodul_PengadaanLainnya'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Menu_PengadaanLainnyaYangDiikuti'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap07/Icon_Proses'))

WebUI.verifyElementPresent(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap01/Verify_Title'), 5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/Menu_3_Penawaran'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_TutupInfo'))

//Dokumen Administrasi
TestObject uploadAdmin = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_DokAdmin')

def projectDir = Config.getProjectDir()

def adminPath = projectDir + '/Document/TM-Paket2/doc_admin.docx'

WebUI.uploadFile(uploadAdmin, adminPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UnggahAdmin'))

//Dokumen Teknis
TestObject uploadTeknis = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_DokTeknis')

def teknisPath = projectDir + '/Document/TM-Paket2/doc_teknis.docx'

WebUI.uploadFile(uploadTeknis, teknisPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UnggahTeknis'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_Berikutnya'))

// Input Penawaran Harga
TestObject uploadHarga = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_DokHarga')

def hargaPath = projectDir + '/Document/TM-Paket2/doc_price.docx'

WebUI.uploadFile(uploadHarga, hargaPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UnggahHarga'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_NomorPenawaran'), 'TM/02/OFFER/01')

String cDay = new Date().format('d-M-yyyy')

int cDate = (cDay.split('-')[0]).toInteger() + 5

String cMonth = cDay.split('-')[1]

String cYear = cDay.split('-')[2]

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/field_TanggalPenawaran'))

WebUI.doubleClick(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/span_TglPenawaran', [('date') : cDate]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PilihMataUang'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_IDR'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_HariBerlaku'), '2')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_JangkaWaktu'), '1')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PilihPimpinan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_DirekturUtama'))

int offerKFTD = 32000000

int offerKAEF = 57000000

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_HargaKAEF'), offerKAEF.toString())

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PilihOrigin_01'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_Origin_01-1'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_HargaKFTD'), offerKFTD.toString())

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PilihOrigin_02'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_Origin_02-1'))

// Upload Rincian Penawaran
TestObject uploadRincian = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UploadRincian')

def detailPath = projectDir + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadRincian, detailPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PIlihTermofPayment'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_TOPSekaligus'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/text_TermofPayment'), 'Auto Note')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_PIlihIncoterm'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/div_IncotermCIF'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/input_PenerbitJaminan'), 'KAEF')

// Input Jaminan 
TestObject uploadJaminan = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UploadJaminan')

def jaminanPath = projectDir + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadJaminan, jaminanPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/field_TanggalJaminan'))

WebUI.doubleClick(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/span_TglJaminan', [('date') : cDate]))

// Surat Penawaran
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UnduhTemplateSurat'))

TestObject uploadSurat = findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_UploadSurat')

def suratPath = projectDir + '/Document/TM-Paket2/doc_test.docx'

WebUI.uploadFile(uploadSurat, suratPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_OK'))

// Verifikasi sudah submit
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/button_TutupInfo'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('TransactionManagement/Penunjukan_Langsung/Vendor/Tahap03/verify_StatusSubmit'), 
    3)

WebUI.delay(5)

WebUI.closeBrowser()

