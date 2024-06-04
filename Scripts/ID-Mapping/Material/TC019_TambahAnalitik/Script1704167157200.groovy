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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Anchor_KodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Anchor_KodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_LihatDataAnalitik'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_LihatDataAnalitik'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_TanggalMulai'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_TanggalMulai'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_KurungSikuKanan'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_KurungSikuKanan'))

// Mendefinisikan objek yang akan diklik
def objekKlik = findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_KurungSikuKanan')

// Looping dua kali untuk mengklik objek
for (int i = 0; i < 2; i++) {
    WebUI.waitForElementPresent(objekKlik, 0)

    WebUI.click(objekKlik)

    Thread.sleep(1000 // Menunggu 1 detik sebelum mengklik lagi (opsional)
        )
}

WebUI.setText(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_Tahun'), '2023')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_DataTanggalMulai'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_DataTanggalMulai'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_TanggalSelesai'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_TanggalSelesai'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_DataTanggalSelesai'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Span_DataTanggalSelesai'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataEntitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataEntitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_Frekuensi'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_Frekuensi'), '1')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Proses'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Proses'))

WebUI.delay(10)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Frekuensi'))

WebUI.scrollToPosition(0, 700)

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/ID-Mapping/Material/Tambah_Analitik/Button_Tambah')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Tambah'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Tambah'))

WebUI.delay(10)

//WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_CheckBox'), 0)
//WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_CheckBox'))
//WebUI.delay(10)
//WebUI.scrollToPosition(0, 2000)
//WebUI.delay(10)
WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Manual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Manual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_EntitasManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_EntitasManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualEntitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualEntitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanManual'))

WebUI.delay(3)

//WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_CheckBox'), 0)
//WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_CheckBox'))
//WebUI.delay(10)
//WebUI.scrollToPosition(0, 2000)
//WebUI.delay(10)
WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Manual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Manual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_EntitasManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_EntitasManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualEntitas2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualEntitas2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_KodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKodeMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataKodeMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Komparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Komparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_NamaMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_NamaMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_UOM'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_UOM'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_Spesifikasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/td_Spesifikasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanKomparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_SimpanKomparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Field_ManualKategori3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Div_DataManualKategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_UOM'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_UOM'), 'UOM Automation')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_Spesifikasi'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/Tambah_Analitik/Input_Spesifikasi'), 'Spek Otomatisasi')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Kirim'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_Kirim'))

WebUI.click(findTestObject('ID-Mapping/Material/Tambah_Analitik/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

