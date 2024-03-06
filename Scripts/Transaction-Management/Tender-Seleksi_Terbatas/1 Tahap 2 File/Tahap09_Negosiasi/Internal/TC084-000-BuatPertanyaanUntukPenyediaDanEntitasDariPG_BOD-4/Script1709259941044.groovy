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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/Custom_Icon_Proses'), 
    [('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Menu_TahapanNegosiasi'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Textbox_Pertanya_DariPenyedia'), 
    'Pertanyaan Dari PG BOD-4 ke Penyedia 1')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Upload_Pertanya_DariPenyedia')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Text_BuatPertanyaan1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariPenyediaSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariPenyediaSimpandanKirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Button_PopupKonfirmasi_OK'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    10)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Textbox_Pertanya_DariEntitas'), 
    'Pertanyaan Dari PG BOD-4 ke Entitas 1')

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Upload_Pertanya_DariEntitas')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Button_PopupKonfirmasi_OK'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Menu_TahapanNegosiasi'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/SubMenu_Vendor2'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Textbox_Pertanya_DariPenyedia'), 
    'Pertanyaan Dari PG BOD-4 ke Penyedia 2')

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Upload_Pertanya_DariPenyedia')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Text_BuatPertanyaan1'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariPenyediaSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariPenyediaSimpandanKirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Button_PopupKonfirmasi_OK'))

WebUI.delay(5)

WebUI.waitForElementVisible(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    10)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Textbox_Pertanya_DariEntitas'), 
    'Pertanyaan Dari PG BOD-4 ke Entitas 2')

// Ambil elemen field "Choose File"
TestObject uploadField3 = findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Upload_Pertanya_DariEntitas')

// Mendapatkan direktori proyek
def projectDir3 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath3 = projectDir3 + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField3, filePath3)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'), 
    Keys.chord(Keys.ARROW_DOWN))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/button_Pertanya_DariEntitasSimpandanKirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Button_PopupKonfirmasi_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

