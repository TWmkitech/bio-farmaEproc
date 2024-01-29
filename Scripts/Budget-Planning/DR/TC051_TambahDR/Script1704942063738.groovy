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

CustomKeywords.'login.EntitasAuditBOD3.login'(GlobalVariable.EntitasAuditBOD3, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Button_Tambah'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Button_Tambah'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Holding'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Holding'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataHolding'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataHolding'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_NamaDR'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_NamaDR'), 'Paket 16 - Automated Testing')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_TahunAnggaran'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_TahunAnggaran'), '2024')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_SumberAnggaran'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_SumberAnggaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataSumberAnggaran'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataSumberAnggaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Quantity'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Quantity'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 600)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Kuantitas'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Kuantitas'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_MataUang'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_MataUang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_UOM'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_UOM'))

WebUI.delay(5)

TestObject targetElement1 = findTestObject('Object Repository/Budget-Planning/DR/TambahDR/Checkbox_Spesifikasi')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Spesifikasi'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Spesifikasi'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Origin'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_Origin'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_TglKadaluwarsa'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Checkbox_TglKadaluwarsa'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_NamaMaterial-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_NamaMaterial-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataNamaMaterial-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataNamaMaterial-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Qty-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Qty-A1'), '300')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Currency-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Currency-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataCurrency-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataCurrency-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Harga-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Harga-A1'), '2900000')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_UOM-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_UOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataUOM-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataUOM-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Spek-A1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Spek-A1'), 'Spesifikasi Otomatisasi')

WebUI.delay(5)

TestObject targetElement2 = findTestObject('Object Repository/Budget-Planning/DR/TambahDR/Field_Shipment-A1')

WebUI.sendKeys(targetElement2, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Shipment-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Shipment-A1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataShipment-A1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataShipment-A1'))

//Input manual data material kedua
WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Button_TambahManual'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_NamaMaterial-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_NamaMaterial-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataNamaMaterial-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataNamaMaterial-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Qty-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Qty-B1'), '100')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Currency-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Currency-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataCurrency-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataCurrency-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Harga-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Harga-B1'), '1300000')

WebUI.delay(5)

TestObject targetElement3 = findTestObject('Object Repository/Budget-Planning/DR/TambahDR/Field_UOM-B1')

WebUI.sendKeys(targetElement3, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_UOM-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_UOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataUOM-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataUOM-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Spek-B1'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Spek-B1'), 'Automated Test data kedua')

WebUI.delay(5)

TestObject targetElement4 = findTestObject('Object Repository/Budget-Planning/DR/TambahDR/Field_Shipment-B1')

WebUI.sendKeys(targetElement4, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Shipment-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Shipment-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataShipment-B1'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataShipment-B1'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Vendor'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Vendor'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataVendor'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataVendor'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_KondisiPembayaran'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_KondisiPembayaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataKondisiPembayaran'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataKondisiPembayaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_Incoterms'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_Incoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_DataIncoterms'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_DataIncoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Field_PilihData'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Field_PilihData'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Div_PilihData'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Div_PilihData'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Button_ChooseFile'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/DR/TambahDR/Button_ChooseFile')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Input_Catatan'), 0)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDR/Input_Catatan'), 'Data ini telah dibuat secara automated test')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Button_Kirim'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDR/Button_OK'), 0)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDR/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

