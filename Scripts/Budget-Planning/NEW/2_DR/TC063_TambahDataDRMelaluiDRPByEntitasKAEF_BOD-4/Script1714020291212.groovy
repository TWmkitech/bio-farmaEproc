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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Entitas/KAEF/PGEntitas_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_DR'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/2_DR/SearchDR'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Icon_Update'), 20)

WebUI.sendKeys(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Icon_Update'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Icon_Update'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/TBOX_TahunAnggaran'), 20)

WebUI.setText(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/TBOX_TahunAnggaran'), '2024')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_SumberAnggaran'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_SumberAnggaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_SumberAnggaran_RKAP'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_SumberAnggaran_RKAP'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/RBUTTON_NonBinding'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/RBUTTON_NonBinding'))

WebUI.scrollToPosition(0, 600)

WebUI.sendKeys(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Icon_Delete'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Checkbox_TglKadaluwarsa'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Checkbox_TglKadaluwarsa'))

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_ShipmentTo'))

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_ShipmentTo_BIOFKolonelMatsuri'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_KondisiPembayaran'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_KondisiPembayaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_KondisiPembayaran_Sekaligus'), 
    20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_KondisiPembayaran_Sekaligus'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_Incoterms'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_Incoterms'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_Incoterms_ExWorks'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_Incoterms_ExWorks'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_DokPendukungDR'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_DokPendukungDR'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_DokPendukungDR_InfoRencanaKebutuhan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/SBOX_DokPendukungDR_InfoRencanaKebutuhan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Upload_DokPendukungDR'), 20)

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Upload_DokPendukungDR')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.scrollToPosition(0, 5000)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Button_Kirim'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Button_Kirim'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/DR/TambahDataMelaluiDRP/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

