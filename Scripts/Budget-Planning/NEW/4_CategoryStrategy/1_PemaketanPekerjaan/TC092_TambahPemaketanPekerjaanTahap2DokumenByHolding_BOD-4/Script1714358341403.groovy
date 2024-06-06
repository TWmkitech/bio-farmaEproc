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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_CS'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_PemaketanPekerjaan'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_PemaketanPekerjaan'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/4_CategoryStrategy/1_PemaketanPekerjaan/SearchPaketPekerjaan'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.delay(10)

WebUI.sendKeys(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 1/ICON_LanjutkanPengisian'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 1/ICON_LanjutkanPengisian'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisKontrak'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisKontrak'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisKontrak_HargaSatuan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisKontrak_HargaSatuan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisDokumen'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisDokumen'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisDokumen_SPK'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_JenisDokumen_SPK'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_ICON_Plus'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_ICON_Plus'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_UnggahDokumenPendukung'), 
    20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_UnggahDokumenPendukung'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_UnggahDokumenPendukung_DokumenLainnya'), 
    20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/SBOX_UnggahDokumenPendukung_DokumenLainnya'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/TBOX_UnggahDokumenPendukung_JudulDokumen'), 
    20)

WebUI.setText(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/TBOX_UnggahDokumenPendukung_JudulDokumen'), 
    'Dokumen Penunjang')

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/UPLOAD_UnggahDokumenPendukung')

// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DokumenDataTest.pdf'

WebUI.uploadFile(uploadField, filePath)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_Unggah'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_Unggah'))

WebUI.delay(20)

WebUI.scrollToPosition(0, 2000)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_SimpanDanLanjutkan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Tahap 2/BUTTON_SimpanDanLanjutkan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/PemaketanPekerjaan/01_New/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

