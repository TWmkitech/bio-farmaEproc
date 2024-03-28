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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGEntitas_KFTD_BOD-3'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/Tab_Tahapan06'))

WebUI.verifyTextNotPresent('Proses Pengadaan Tahapan Approval Evaluasi Penawaran akan dimulai pada:', false)

WebUI.delay(3)

// Melakukan Persetujuan
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/btn_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/radio_Setuju'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/textarea_Catatan_form'), 'Setuju dari KFTD 03')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_SimpanKirim'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_OK'))

WebUI.delay(10)

// Verifikasi persetujuan berhasil
WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_LihatBA'), 8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_LihatBA'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/verify_TitleForm'), 'Approval Evaluasi Penawaran')

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_TutupBA'), 8)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/button_TutupBA'))

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/tab_StatusPersetujuan'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap06/verify_StatApproval-E2-BOD3'), 
    'Setuju', FailureHandling.OPTIONAL)

WebUI.closeBrowser()

