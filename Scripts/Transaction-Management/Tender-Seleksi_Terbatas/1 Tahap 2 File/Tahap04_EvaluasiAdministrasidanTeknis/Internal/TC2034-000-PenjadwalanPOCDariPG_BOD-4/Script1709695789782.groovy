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

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/0_Anchor_TransactionManagement'))

WebUI.click(findTestObject('TransactionManagement/Global-TestObject/2_Anchor_Tender-Seleksi_Terbatas'))

WebUI.delay(15)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

//WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))
//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/CustomIconProses'), 
//    [('index') : 2], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/Menu_TahapanEvaluasiAdminTeknis'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/button_PenjadwalanPOC'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Selectbox_TanggaldanWaktu'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Selectbox_TanggaldanWaktu_18'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Selectbox_JenisRapat'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Selectbox_JenisRapat_Online'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Textbox_LinkOnlineRapat'), 
    'https://rapatonlinevendor1.com/')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC1_Textbox_Keterangan'), 
    'KetenganRapatOnline1')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Selectbox_TanggaldanWaktu'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Selectbox_TanggaldanWaktu_18'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Selectbox_JenisRapat'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Selectbox_JenisRapat_Online'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Textbox_LinkOnlineRapat'), 
    'https://rapatonlinevendor2.com/')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/JPOC2_Textbox_Keterangan'), 
    'KetenganRapatOnline2')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Icon_Add'))

WebUI.delay(10)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Rbutton_PesertaExternal'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Textbox_Nama'), 
    'Test Nama Eksternal')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Textbox_Email'), 
    'external@mail.com')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Textbox_Unit'), 
    'Test Unit Eksternal')

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Add_Textbox_Instansi'), 
    'Test Instansi Eksternal')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/button_Simpan dan Kirim'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap04_EvaluasiAdministrasiTeknis/Internal/2_PenjadwalanPOCDariPGBOD/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

