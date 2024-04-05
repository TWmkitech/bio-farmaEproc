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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGEntitas_INAF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_LegalContractManagement'))

WebUI.click(findTestObject('LegalContractManagement/0_Global-TestObject/Anchor_KontrakAmandemen'))

WebUI.delay(5)

TestObject targetElement = findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/1_UploadDokumenFinal/Icon_Rincian')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/Custom_Icon_Detail'),
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Icon_Tambah'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Date_Amandemen'))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/LegalKontrakManajemen/2_KontrakAmandemen/3_TambahAmandemen/Select_Date_Amandemen'), 
    [('index') : 16], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Sbox_PasalKontrak'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Sbox_PasalKontrak_Ketentuan Umum'))

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Tbox_Semula'), 
    'Test Semula')

WebUI.setText(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Tbox_Menjadi'), 
    'Test Menjadi')

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Cbox_R1_PermintaanAmendemenEntitas'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/button_Simpan'))

WebUI.click(findTestObject('LegalContractManagement/1Tahap2File/2_KontrakAmandemen/Internal/3_TambahAmandemen/Button_PopupKonfirmasi_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

