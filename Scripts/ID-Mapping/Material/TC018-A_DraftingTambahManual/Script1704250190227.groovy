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

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahKodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahKodeMaterial'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataEntitas1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataEntitas1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKodeMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKodeMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_Simpan-TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_Simpan-TambahManual'))

WebUI.delay(10)

//Tambah material manual kedua
WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataEntitas2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataEntitas2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKodeMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKodeMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_Simpan-TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_Simpan-TambahManual'))

WebUI.delay(10)

//WebUI.scrollToElement(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial1'), 3)
<<<<<<< HEAD

WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_NamaMaterial'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_NamaMaterial'), 'Material Drafting Automated Test')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_UOM'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_UOM'), 'UOM 123')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_Spesifikasi'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_Spesifikasi'), 'Spesifikasi Automatisasi')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Drafting_TambahManual/Button_Simpan'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Drafting_TambahManual/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_OK'))

WebUI.delay(20)
=======
WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial1'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial2'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Field_KategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial3'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Div_DataKategoriMaterial3'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_NamaMaterial'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_NamaMaterial'), 'Material Automated Test')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_UOM'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_UOM'), 'UOM 123')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Input_Spesifikasi'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/tambahManual/Input_Spesifikasi'), 'Spesifikasi Automatisai')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Drafting_TambahManual/Button_Simpan'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Drafting_TambahManual/Button_Simpan'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Button_OK'))

WebUI.delay(10)
>>>>>>> branch 'master' of https://github.com/TWmkitech/bio-farmaEproc.git

WebUI.closeBrowser()