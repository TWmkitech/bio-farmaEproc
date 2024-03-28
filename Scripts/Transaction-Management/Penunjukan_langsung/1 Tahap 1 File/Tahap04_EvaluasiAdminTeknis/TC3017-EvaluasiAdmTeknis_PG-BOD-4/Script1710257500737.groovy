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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket2/PGHolding_KAEF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Modul_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Submodul_PenunjukanLangsung'))

WebUI.delay(5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/input_Searching'), GlobalVariable.NoPP)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/General/Icon_Proses', [('row') : 1]))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/Tab_Tahapan04'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/icon_DetailEvaluasi'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/text_CatatanPOC'), 'Catatan Presentasi POC')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_UploadPOC'))

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/input_NamaDokPOC'), 'Dokumen POC')

// Upload Dokumen Pendukung POC
TestObject uploadPOC = findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/upload_DokumenPOC')

def projectDir = Config.getProjectDir()

def pocPath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadPOC, pocPath)

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_SubmitDokPOC'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_OK'))

WebUI.delay(10)

//Evaluasi Administrasi
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_LihatDokAdmin'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/radio_KesesuaianAdmin'))

WebUI.verifyElementChecked(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/radio_LulusAdmin'), 
    5, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/text_CatatanAdmin'), 'Catatan Evaluasi Administrasi')

WebUI.delay(7)

//Evaluasi Teknis
WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_LihatDokTeknis'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/radio_KesesuaianTeknis'))

WebUI.verifyElementChecked(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/radio_LulusTeknis'), 
    5)

WebUI.setText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/text_CatatanTeknis'), 'Catatan Evaluasi Teknis')

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_SimpanPerubahan'))

WebUI.click(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/button_OKSimpan'))

WebUI.delay(10)

//Verifikasi Hasil Evaluasi
WebUI.executeJavaScript('window.scrollTo(0, 999999);', null)

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/verify_HasilAdmin'), 
    'Lulus')

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/verify_HasilTeknis'), 
    'Lulus')

WebUI.verifyElementText(findTestObject('TransactionManagement/Penunjukan_Langsung/Internal/Tahap04/verify_StatusEvaluasi'), 
    'Lulus')

WebUI.closeBrowser()

