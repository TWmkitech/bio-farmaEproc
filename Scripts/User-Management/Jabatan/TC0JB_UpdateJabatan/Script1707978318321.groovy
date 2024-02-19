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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Jabatan'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Jabatan'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Jabatan'))

WebUI.click(findTestObject('User-Management/Jabatan/UpdateJabatan/Icon_UpdateData'))

WebUI.clearText(findTestObject('User-Management/Jabatan/UpdateJabatan/Textbox_NamaJabatan'))

WebUI.setText(findTestObject('User-Management/Jabatan/UpdateJabatan/Textbox_NamaJabatan'), 'Update Nama Jabatan')

WebUI.clearText(findTestObject('User-Management/Jabatan/UpdateJabatan/Textbox_KodeJabatan'))

WebUI.setText(findTestObject('User-Management/Jabatan/UpdateJabatan/Textbox_KodeJabatan'), 'Update Kode Jabatan')

WebUI.click(findTestObject('User-Management/Jabatan/UpdateJabatan/Checkbox_SayaYakinDanBertanggungJawab'))

WebUI.click(findTestObject('User-Management/Jabatan/UpdateJabatan/Button_SimpanData'))

WebUI.click(findTestObject('User-Management/Jabatan/UpdateJabatan/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/Jabatan/UpdateJabatan/Verify_PopupKonfirmasi_Berhasil'), 5)

WebUI.closeBrowser()

