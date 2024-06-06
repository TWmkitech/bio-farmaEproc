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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Pegawai'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Pegawai'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Pegawai'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Button_TambahPegawai'))

WebUI.setText(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Textbox_NamaPegawai'), 'Test Nama')

WebUI.setText(findTestObject('User-Management/Pegawai/TambahPegawai/Textbox_NpkPegawai'), '543210')

WebUI.setText(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Textbox_EmailPegawai'), 'testemail@mail.com')

WebUI.setText(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Textbox_NoTelp'), '0812341234')

WebUI.setText(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Textbox_BandPegawai'), 'Test Band Pegawai')

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Selectbox_Perusahaan'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Selectbox_Perusahaan_1'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Selectbox_Jabatan'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Selectbox_Jabatan_1'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Selectbox_Organisasi'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Selectbox_Organisasi_1'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Checkbox_SayaYakinDanBertanggungJawab'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Button_SimpanData'))

WebUI.click(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/Pegawai/TambahPegawai/Try/Verify_PopupKonfirmasi_Berhasil'), 
    5)

WebUI.closeBrowser()

