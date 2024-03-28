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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.configuration.RunConfiguration as Config
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/Tab_Tahapan03'))

def closed = WebUI.verifyTextPresent('Proses pengadaan tahap Pembukaan Penawaran (Administrasi, Teknis & Harga) akan dimulai pada:', 
    false, FailureHandling.OPTIONAL)

// Ubah Jadwal Aanwijzing
if (closed.equals(true)) {
    WebUI.callTestCase(findTestCase('Transaction-Management/Penunjukan_langsung/1 Tahap 1 File/Paket02_UbahJadwal_woLogin'), 
        [('tahap') : 4], FailureHandling.STOP_ON_FAILURE)

    WebUI.delay(10)
}

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/Tab_Tahapan03'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_BukaDokumenPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_YA_BukaDok'))

WebUI.delay(8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/radio_Hadir'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/text_NamaPerwakilan'), 'Auto Name 01')

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/text_NomorKontak'), '082112345678')

// Ambil elemen field "Choose File"
TestObject uploadSK = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/upload_SuratKuasa')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def skPath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadSK, skPath)

TestObject targetElement1 = findTestObject('Object Repository/TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_ChecklistDok')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Object Repository/TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_ChecklistDok'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/radio_Lengkap1'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/radio_Lengkap2'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/radio_Lengkap3'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_SimpanLengkap'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_OKLengkap'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_Simpan'), 5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap03/button_OK'))

WebUI.delay(8)

WebUI.closeBrowser()

