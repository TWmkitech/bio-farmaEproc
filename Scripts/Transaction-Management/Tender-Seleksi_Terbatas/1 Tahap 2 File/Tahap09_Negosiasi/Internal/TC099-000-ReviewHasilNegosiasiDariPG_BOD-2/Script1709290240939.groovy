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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGHolding_BioFarma_BOD-2'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/Custom_Icon_Proses'), 
    [('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/2_NegosiasiDariPG/Menu_TahapanNegosiasi'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/6_ReviewApproval/button_ReviewApproval'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/6_ReviewApproval/Rbutton_Setuju'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/6_ReviewApproval/Textbox_Catatan'), 
    'Catatan Aproval Dari BOD-2')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/6_ReviewApproval/button_Popup_ReviewApproval'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap09_Negosiasi/Internal/6_ReviewApproval/Button_PopupKonfirmasi_OK'))

WebUI.delay(10)

WebUI.closeBrowser()

