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

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Global_TestObject/Anchor_Penyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Global_TestObject/Anchor_Penyedia'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/ID-Mapping/Penyedia/Detail_Penyedia/Button_Detail')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_Update'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_Update'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Div_DataEntitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Div_DataEntitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Field_KodePenyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Field_KodePenyedia'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Div_DataKodePenyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Div_DataKodePenyedia'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_Komparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_Komparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Area'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Area'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_NamaPenyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_NamaPenyedia'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_NPWP'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_NPWP'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Negara'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Negara'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Provinsi'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Provinsi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Kota'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Kota'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Alamat'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Alamat'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_BadanUsaha'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_BadanUsaha'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Email'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Email'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_KategoriPenyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_KategoriPenyedia'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Pengurus'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Pengurus'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Kontak'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_Kontak'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_RekeningBank'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Checkbox_RekeningBank'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanKomparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanKomparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Input_NPWP'), 0)

WebUI.clearText(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Input_NPWP'))

WebUI.setText(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Input_NPWP'), '1609384712473910')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanDraft'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_SimpanDraft'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Update_Penyedia/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

