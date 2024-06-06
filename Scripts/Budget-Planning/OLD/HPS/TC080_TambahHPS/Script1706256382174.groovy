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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_HPS'), 0)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_HPS'))

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/Budget-Planning/HPS/TambahHPS/Button_TambahHPS')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Button_TambahHPS'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Button_TambahHPS'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Field_PilihDokumenPendukung'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Field_PilihDokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Div_DataDokumenPendukung'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Div_DataDokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Upload_DokumenPendukung'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField1 = findTestObject('Budget-Planning/HPS/TambahHPS/Upload_DokumenPendukung')

// Mendapatkan direktori proyek
def projectDir1 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath1 = projectDir1 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField1, filePath1)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Button_UnggahDokumenPendukung'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Button_UnggahDokumenPendukung'))

WebUI.delay(5)

WebUI.scrollToPosition(0, 1200)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Upload_RincianPenawaran'), 0)

// Ambil elemen field "Choose File"
TestObject uploadField2 = findTestObject('Budget-Planning/HPS/TambahHPS/Upload_RincianPenawaran')

// Mendapatkan direktori proyek
def projectDir2 = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath2 = projectDir2 + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField2, filePath2)

WebUI.delay(10)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Button_UnggahRincianPenawaran'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Button_UnggahRincianPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Input_Catatan'), 0)

WebUI.setText(findTestObject('Budget-Planning/HPS/TambahHPS/Input_Catatan'), 'HPS ini telah dibuat secara automated test')

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Button_PermintaanPersetujuan'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Button_PermintaanPersetujuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/TambahHPS/Button_OK'), 0)

WebUI.click(findTestObject('Budget-Planning/HPS/TambahHPS/Button_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

