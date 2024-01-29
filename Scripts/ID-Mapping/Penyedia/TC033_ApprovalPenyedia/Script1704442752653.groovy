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

CustomKeywords.'login.Bod2.login'(GlobalVariable.BOD_2, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'), 0)

WebUI.click(findTestObject('ID-Mapping/Material/tambahManual/Anchor_IDmapping'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Global_TestObject/Anchor_Penyedia'), 0)

WebUI.click(findTestObject('ID-Mapping/Global_TestObject/Anchor_Penyedia'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/ID-Mapping/Penyedia/Approval_Penyedia/Button_Approve')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_Approve'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_Approve'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 400)

WebUI.delay(10)

WebUI.scrollToPosition(0, 1800)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Checkbox_Persetujuan'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Checkbox_Persetujuan'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Input_Catatan'), 0)

WebUI.setText(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Input_Catatan'), 'Data telah disetujui secara automated testing')

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_Submit'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_Submit'))

WebUI.waitForElementPresent(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_OK'), 0)

WebUI.click(findTestObject('ID-Mapping/Penyedia/Approval_Penyedia/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

