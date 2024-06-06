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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_PanitiaPengadaan'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_PanitiaPengadaan'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_PanitiaPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Button_TambahTimPengadaan'))

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Textbox_NamaTimPengadaan'), 'Test Nama Tim Pengadaan')

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Textbox_KodeTimPengadaan'), '22TestKodeTimPengadaan')

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Textbox_DeskripsiTimPengadaan'), 
    'Test Desktripsi Tim Pengadaan')

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Textbox_NomorSK'), '9898TestNomorSK')

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_TanggalSK'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_TanggalSK_17'))

WebUI.uploadFile(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Upload_SKTimPengadaan'), 'D:\\Automation Biofarma\\Biofarma new\\Document\\DataTest.docx')

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_PemimpinKetuaTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_PemimpinKetuaTimPengadaan_1'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_SekretarisTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_SekretarisTimPengadaan_1'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_AnggotaTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Selectbox_AnggotaTimPengadaan_1'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Checkbox_Agreement'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/button_Simpan Data'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/PanitiaPengadaan/TambahkanDataTimPengadaan/Verify_Berhasil'), 
    5)

