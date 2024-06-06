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

/*TestObject targetElement = findTestObject('Object Repository/User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Icon_UpdateData')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.delay(5) */
WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Icon_UpdateData'))

WebUI.clearText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_NamaTimPengadaan'))

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_NamaTimPengadaan'), 'Update Nama Tim Pengadaan')

WebUI.clearText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_KodeTimPengadaan'))

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_KodeTimPengadaan'), '22UpdateTestKodeTimPengadaan')

WebUI.clearText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_DeskripsiTimPengadaan'))

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_DeskripsiTimPengadaan'), 'Update Test Desktripsi Tim Pengadaan')

WebUI.clearText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_NomorSK'))

WebUI.setText(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Textbox_NomorSK'), '9898UpdateTestNomorSK')

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_TanggalSK'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_TanggalSK_17'))

WebUI.uploadFile(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Upload_SKTimPengadaan'), 'D:\\Automation Biofarma\\Biofarma new\\Document\\DataTest.docx')

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_PemimpinKetuaTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_PemimpinKetuaTimPengadaan_1'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_SekretarisTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_SekretarisTimPengadaan_3'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_AnggotaTimPengadaan'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Selectbox_AnggotaTimPengadaan_1'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Checkbox_Agreement'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/button_Simpan Data'))

WebUI.click(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/PanitiaPengadaan/UpdateDataTimPengadaan/Verify_Berhasil'), 5)

