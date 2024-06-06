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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/BudgetPlanning/Holding/PGHolding_BioFarma_BOD-4'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_BudgetPlanning'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'), 20)

WebUI.click(findTestObject('Budget-Planning/Global_TestObject/Anchor_RFI'))

WebUI.callTestCase(findTestCase('Budget-Planning/NEW/3_RFI/Internal/SearchRFIDariDRP'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

TestObject targetElement = findTestObject('Budget-Planning/RFI/Aanwijzing/ICON_PenjelasanRFI')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/ICON_PenjelasanRFI'), 20)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/ICON_PenjelasanRFI'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/ICON_Tanggapan'), 30)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/ICON_Tanggapan'))

WebUI.delay(10)

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/BUTTON_DraftKonsepBeritaAcara'))

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_PokokAcaraRapat'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_PokokAcaraRapat'), 'Pokok acara rapat ini berisi mengenai pembahasan penjelasan RFI')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_JalannyaRapat'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_JalannyaRapat'), 'Jalannya rapat ini berjalan dengan sangat amat baik')

WebUI.waitForElementPresent(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_Penutup'), 20)

WebUI.setText(findTestObject('Budget-Planning/RFI/Aanwijzing/TAREA_Penutup'), 'Semua pihak yang hadir setuju')

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/BUTTON_KirimDraftKonsepBeritaAcara'))

WebUI.click(findTestObject('Budget-Planning/RFI/Aanwijzing/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

