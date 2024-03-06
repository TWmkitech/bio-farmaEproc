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

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(5)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))
WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/Custom_Icon_Proses'), 
    [('index') : 3], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap08_Approval Evaluasi Penawaran/Internal/2_ReqApprovalDariPG_BOD-4/Menu_TahapanApprovalEvaluasiPenawaran'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap08_Approval Evaluasi Penawaran/Internal/2_ReqApprovalDariPG_BOD-4/button_Ajukan Persetujuan1'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap08_Approval Evaluasi Penawaran/Internal/4_ReqApprovalDariHolding/Textbox_ApprovalEvalPenawaran_Catatan'), 
    'Catatan Persetujuan Dari Holding BIOF BOD-3')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap08_Approval Evaluasi Penawaran/Internal/4_ReqApprovalDariHolding/button_Popup_AjukanPersetujuan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap08_Approval Evaluasi Penawaran/Internal/4_ReqApprovalDariHolding/Button_PopupKonfirmasi_OK'))

WebUI.delay(10)

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

