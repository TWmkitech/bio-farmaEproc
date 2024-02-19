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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_AgenPengadaan'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Button_TambahAgenPengadaan'))

WebUI.setText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/input_NomorKontrak'), '12/120/877')

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_TanggalKontrak'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_TanggalKontrak13'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_Periode'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_Periode_17'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_SampaiDengan'))

//WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_SampaiDengan_NextMonth'))
WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_SampaiDengan_25'))

WebUI.setText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Input_NamaAgenPengadaan'), 'Test NamaAgen')

WebUI.waitForElementPresent(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_EntitasorHolding'), 
    10)

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_EntitasorHolding'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_EntitasorHolding_PT Bio Farma (Persero)'))

WebUI.scrollToElement(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Upload_UnggahKontrak'), 5)

//WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_EntitasorHolding_PT Bio Farma (Persero)'))
WebUI.uploadFile(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Upload_UnggahKontrak'), 'C:\\Users\\ASUS\\git\\bio-farmaEproc\\Document\\DataTest.docx')

WebUI.setText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Input_Nama'), 'Test Nama')

WebUI.setText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Input_Email'), 'testemail@test.com')

WebUI.setText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Input_Username'), 'Test Username Aplikasi')

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_Role'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/SelectBox_Role_Approval'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Checkbox_Agreement'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/button_Simpan Data'))

WebUI.click(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Button_OK'))

WebUI.verifyElementText(findTestObject('User-Management/AgenPengadaan/TambahAgenPengadaan/Verify_NomorKontrak'), '12/120/877')

WebUI.delay(10)

WebUI.closeBrowser()

