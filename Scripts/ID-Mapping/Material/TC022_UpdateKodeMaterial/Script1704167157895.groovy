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

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/ID-Mapping/Material/Update_KodeMaterial/Button_Update')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Update'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Update'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Field_PilihEntitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Field_PilihEntitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Div_DataEntitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Div_DataEntitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Field_PilihKodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Field_PilihKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Div_DataKodeMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Div_DataKodeMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Komparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Komparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_NamaMaterial'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_NamaMaterial'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_UOM'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_UOM'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_Spesifikasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Checkbox_Spesifikasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanKomparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanKomparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Input_NamaMaterial'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Input_NamaMaterial'), 'Update 01 - Automated Test')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Input_Spesifikasi'), 0)

WebUI.setText(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Input_Spesifikasi'), 'Update Automatisasi')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanDraft'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_SimpanDraft'))

//WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Kirim'), 0)
//
//WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_Kirim'))
WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/Update_KodeMaterial/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

