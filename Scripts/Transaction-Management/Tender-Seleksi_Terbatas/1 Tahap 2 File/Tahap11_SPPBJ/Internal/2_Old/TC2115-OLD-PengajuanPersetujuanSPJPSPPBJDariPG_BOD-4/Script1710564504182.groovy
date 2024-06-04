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

WebUI.delay(10)

TestObject targetElement = findTestObject('Object Repository/TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses')

WebUI.sendKeys(targetElement, Keys.chord(Keys.ARROW_RIGHT))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap01_PendaftaranDanResponMinat/Internal/Icon_Proses'))

//WebUI.callTestCase(findTestCase('000_Custom/Precondition/ParameterizedTestObject/TransactionManagement/Internal/CustomIconProses'), 
//    [('index') : 3], FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Menu_TahapanSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1Selectbox_JaminanPelaksanaan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1Selectbox_JaminanPelaksanaan_YA'))

//WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_PersentaseJaminan'), 
//    Keys.chord(Keys.ARROW_DOWN))
WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_PersentaseJaminan'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_PersentaseJaminan'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_Pajak'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_Pajak'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Date_TanggalSPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Date_TanggalSPJP_17'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Date_BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Date_BerlakuSampai_23'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Textbox_PersentaseJaminan'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Textbox_PersentaseJaminan'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Textbox_Pajak'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Textbox_Pajak'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Date_TanggalSPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Date_TanggalSPJP_15'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Date_BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E2JP_Date_BerlakuSampai_30'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1JP_button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Text_PenunjukanPenyediaBarangJasa'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1SPPBJ_Date'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1SPPBJ_Date_19'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1SPPBJ_Selectbox_Tembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1SPPBJ_Selectbox_Tembusan_1DirHumCapBIOF'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1SPPBJ_button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2Selectbox_JaminanPelaksanaan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2Selectbox_JaminanPelaksanaan_YA'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Textbox_PersentaseJaminan'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Textbox_PersentaseJaminan'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Textbox_Pajak'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Textbox_Pajak'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Date_TanggalSPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Date_TanggalSPJP_16'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Date_BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2E1JP_Date_BerlakuSampai_30'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2JP_button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Date'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Date_20'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Selectbox_Tembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Selectbox_Tembusan_DirHumCapBIOF'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_button_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/button_Ajukan Persetujuan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

