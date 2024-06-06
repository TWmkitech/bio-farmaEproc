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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/P2P/SatkerHolding2/SatkerHolding2BIOF_BOD-4_AbdulahFajar'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('P2P/1_PurchaseRequest/0_GlobalTestObject/Satker/Anchor_PurchaseRequest'))

WebUI.callTestCase(findTestCase('P2P/1_PurchaseRequest/Search Purchase Request'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('P2P/1_PurchaseRequest/1_TambahData/1_Icon/ICON_Update'), 30)

WebUI.sendKeys(findTestObject('P2P/1_PurchaseRequest/1_TambahData/1_Icon/ICON_Update'), Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/1_Icon/ICON_Update'))

WebUI.waitForElementPresent(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_NomorReferensi'), 30)

WebUI.clearText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_NomorReferensi'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_NomorReferensi'), '9999')

WebUI.clearText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_Kuantitas_A'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_Kuantitas_A'), '1000')

WebUI.clearText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_HargaSatuan_A'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TBOX_HargaSatuan_A'), '95')

WebUI.clearText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TAREA_DeskripsiPR'))

WebUI.setText(findTestObject('P2P/1_PurchaseRequest/1_TambahData/TAREA_DeskripsiPR'), 'PR Telah Diperbaharui')

WebUI.click(findTestObject('P2P/1_PurchaseRequest/1_TambahData/button_Kirim'))

WebUI.click(findTestObject('P2P/1_PurchaseRequest/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

