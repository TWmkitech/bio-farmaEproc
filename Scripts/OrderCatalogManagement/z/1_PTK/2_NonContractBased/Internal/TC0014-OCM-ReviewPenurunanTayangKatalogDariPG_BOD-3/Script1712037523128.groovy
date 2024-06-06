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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-3'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Internal/0_OrderCatalogManagement'))

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Internal/1_PengajuanTayangKatalog'))

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Internal/1_2_NonContractBased'))

TestObject targetElement = findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Internal/2_VerifikasiPerubahanData/DP_Icon_Detail')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/Custom_Icon_Detail'),
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Internal/2_VerifikasiPerubahanData/Icon_Approve'))

WebUI.delay(10)

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Internal/3_Approval/RButton_Persetujuan_Setuju'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Internal/1_VerifikasiReqPenayangan/1/button_Kirim'))

WebUI.click(findTestObject('OrderCatalogManagement/1_PTK/1_ContractBased/Internal/1_VerifikasiReqPenayangan/Button_PopupKonfirmasi_OK'))

WebUI.waitForElementPresent(findTestObject('OrderCatalogManagement/1_PTK/2_NonContractBased/Internal/Verify_PopupKonfirmasi_Berhasil'), 
    30)

WebUI.closeBrowser()

