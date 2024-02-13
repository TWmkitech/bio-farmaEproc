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

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Global_TestObject/Anchor_Origin'), 0)

WebUI.click(findTestObject('ID-Mapping/Global_TestObject/Anchor_Origin'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_LihatData'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_LihatData'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Anper'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Anper'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataAnper'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataAnper'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Proses'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Proses'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/ID-Mapping/Origin/Tambah_Origin/Button_Tambah')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Tambah'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Tambah'))

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataEntitas1'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataEntitas1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_OriginCode'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_OriginCode'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataOriginCode1'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataOriginCode1'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanManual'))

//Tambah data kedua secara manual
WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_TambahManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_TambahManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Entitas'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_Entitas'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataEntitas2'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataEntitas2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_OriginCode'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Field_OriginCode'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataOriginCode2'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Div_DataOriginCode2'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanManual'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanManual'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Komparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_Komparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_KodeOrigin'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_KodeOrigin'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_NamaOrigin'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_NamaOrigin'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_Country'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Checkbox_Country'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanKomparasi'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanKomparasi'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanDraft'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_SimpanDraft'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Origin/Tambah_Origin/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

