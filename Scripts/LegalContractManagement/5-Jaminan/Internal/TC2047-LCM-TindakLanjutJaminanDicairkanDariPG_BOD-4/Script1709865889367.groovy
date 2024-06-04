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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-4'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_LegalContractManagement'))

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_Jaminan'))

WebUI.delay(5)

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/Icon_Rincian'))

TestObject targetElement1 = findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/DJ_Icon_Rincian')

WebUI.sendKeys(targetElement1, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/DJ_Icon_TindakLanjuti'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/SBox_Status'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/SBox_Status_Dicairkan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/Date_TindakLanjut'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/Date_TindakLanjut_13'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/TBox_INAF_Nama'), 
    'Test Nama Entitas')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/TBox_INAF_Contact'), 
    '08787878877')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/TBOX_Vendor1_Nama'), 
    'Test Nama Vendor')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/TBOX_Vendor1_Contact'), 
    '085757575757')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/5_Jaminan/Internal/1_TindakLanjutJaminan/button_Simpan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/4_Repository/Internal/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

