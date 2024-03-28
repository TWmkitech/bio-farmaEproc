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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-1'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_Tahapan08'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_PersetujuanPenetapan'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/text_NotesLampiran'), 'Approval Penetapan Pemenang by BOD 1')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/radio_Setuju'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_KirimPengajuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_OK'))

WebUI.delay(10)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_LihatBA'), 5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_LihatBA'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_Kembali'), 5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/button_Kembali'))

// Verifikasi Persetujuan
WebUI.delay(5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/Tab_StatusPersetujuan'))

WebUI.delay(3)

//WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/verify_StatusBOD1'), 5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap08/verify_StatusBOD1'), 
    'Disetujui', FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.closeBrowser()
