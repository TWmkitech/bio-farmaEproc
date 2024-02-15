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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Organisasi'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Organisasi'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Organisasi'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Button_TambahOrganisasi'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_OrganisasiPerusahaan'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_OrganisasiPerusahaan_Record1'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_IndukOrganisasi'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_IndukOrganisasi_Record1'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_TipeOrganisasi'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Selectbox_TipeOrganisasi_1'))

WebUI.setText(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Textbox_NamaOrganisasi'), 'Test Nama Organisasi')

WebUI.setText(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Textbox_KodeOrganisasi'), 'OrganizationCode')

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Checkbox_SayaYakinDanBertanggungJawab'))

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Button_SimpanData'))

WebUI.waitForElementPresent(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Button_PopupKonfirmasi_OK'), 
    5)

WebUI.click(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/Organisasi/TambahDataOrganisasi/Verify_Berhasil'), 0)

WebUI.closeBrowser()

