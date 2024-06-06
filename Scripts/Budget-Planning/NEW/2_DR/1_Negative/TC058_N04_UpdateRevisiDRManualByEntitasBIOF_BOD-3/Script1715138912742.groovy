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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Entitas/BIOF/PGEntitas_BIOF_BOD-3'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/2_DR/SearchDRManual'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Update/ICON_Update'), 20)

WebUI.sendKeys(findTestObject('Budget-Planning/DR/Update/ICON_Update'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/DR/Update/ICON_Update'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Update/TBOX_QTY_R1'), 20)

WebUI.clearText(findTestObject('Budget-Planning/DR/Update/TBOX_QTY_R1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/DR/Update/TBOX_QTY_R1'), '999')

WebUI.clearText(findTestObject('Budget-Planning/DR/Update/TBOX_HargaSatuan_R1'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/DR/Update/TBOX_HargaSatuan_R1'), '9999999')

WebUI.clearText(findTestObject('Budget-Planning/DR/Update/TBOX_QTY_R2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/DR/Update/TBOX_QTY_R2'), '99')

WebUI.clearText(findTestObject('Budget-Planning/DR/Update/TBOX_HargaSatuan_R2'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/DR/Update/TBOX_HargaSatuan_R2'), '9999999')

WebUI.click(findTestObject('Budget-Planning/DR/Update/SBOX_MataUang_R2'))

WebUI.click(findTestObject('Budget-Planning/DR/Update/SBOX_MataUang_R2_IDR'))

WebUI.click(findTestObject('Budget-Planning/DR/Update/BUTTON_TambahDokDR'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Update/SBOX_TambahDokDR_R2'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/Update/SBOX_TambahDokDR_R2'))

TestObject uploadField = findTestObject('Budget-Planning/DR/Update/UPLOAD_TambahDokDR_R2')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.clearText(findTestObject('Budget-Planning/DR/Update/TAREA_Catatan'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Budget-Planning/DR/Update/TAREA_Catatan'), 'Data ini telah dibuat secara automated test. Note: Sudah direvisi')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Update/BUTTON_Kirim'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/Update/BUTTON_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

