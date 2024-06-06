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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_CategoryStrategy'), 30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_CategoryStrategy'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_KonfigurasiPengadaan'), 
    30)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/HoldingBOD-3/Anchor_KonfigurasiPengadaan'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/4_CategoryStrategy/3_KonfigurasiPengadaan/SearchPaketPengadaan'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/ICON_IsiKonfigurasiPengadaan'), 
    Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/ICON_IsiKonfigurasiPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/ICON_IsiKonfigurasiPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_SifatPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_SifatPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_SifatPengadaan_Critical'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_SifatPengadaan_Critical'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_JenisPengadaan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_JenisPengadaan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_JenisPengadaan_PengadaanBarang'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_JenisPengadaan_PengadaanBarang'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_MetodePemilihan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_MetodePemilihan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_MetodePemilihan_SeleksiTerbatas'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_MetodePemilihan_SeleksiTerbatas'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_PenyampaianDokumenPenawaran'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_PenyampaianDokumenPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_PenyampaianDokumenPenawaran_1Tahap2File'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/SBOX_PenyampaianDokumenPenawaran_1Tahap2File'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/CBOX_JaminanPenawaran'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/CBOX_JaminanPenawaran'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/BUTTON_SimpanDanLanjutkan'), 
    20)

WebUI.click(findTestObject('Budget-Planning/KonfigurasiPengadaan/01_New/01_InputKonfigurasiPengadaan/Tahap1/BUTTON_SimpanDanLanjutkan'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'), 20)

WebUI.click(findTestObject('Budget-Planning/HPS/01_New/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()
