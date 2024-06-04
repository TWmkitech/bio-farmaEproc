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

WebUI.delay(3)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/ICON_Proses_2'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Menu_TahapanSPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_1DJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_1DJP_YA'))

//WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1E1JP_Textbox_PersentaseJaminan'), 
//    Keys.chord(Keys.ARROW_DOWN))
WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_1PJPJaminan'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_1PJPJaminan'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_1PJPPAJAK'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_1PJPPAJAK'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1SPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1SPJP_21'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1BerlakuSampai_36'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Text_PenunjukanPenyediaBarangJasa'), 
    5)

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_1PJPSimpan'), 
    20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_1PJPSimpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Text_PenunjukanPenyediaBarangJasa'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1SPPBJ'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_1SPPBJ_21'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_1Tembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_1Tembusan_DirekturHumanCapitalBIOF'))

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_1SPPBJ_Simpan'), 
    20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_1SPPBJ_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_2DJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/SBOX_2DJP_YA'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_2PJPJaminan'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_2PJPJaminan'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_2PJPPajak'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_2PJPPajak'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_2SPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_2SPJP_21'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_2BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_2BerlakuSampai_36'))

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_3PJPJaminan (1)'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_3PJPJaminan (1)'), 
    '6')

WebUI.clearText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_3PJPPajak'))

WebUI.setText(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/TBOX_3PJPPajak'), 
    '12')

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_3SPJP'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_3SPJP_21'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_3BerlakuSampai'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/DATE_3BerlakuSampai_21'))

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2PJPSimpan'), 
    5)

WebUI.sendKeys(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2PJPSimpan'), 
    Keys.chord(Keys.ARROW_UP))

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2PJPSimpan'), 
    20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2PJPSimpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.scrollToElement(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_1PJPSimpan'), 
    5)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Date'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Date_20'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Selectbox_Tembusan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/2SPPBJ_Selectbox_Tembusan_DirHumCapBIOF'))

WebUI.waitForElementClickable(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2SPPBJ_Simpan'), 
    20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/1_N/button_2SPPBJ_Simpan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/2_PengajuanDariBOD-4/button_Ajukan Persetujuan'))

WebUI.click(findTestObject('TransactionManagement/Tender-Seleksi_Terbatas/1 Tahap 2 File/Tahap11_SPPBJ/Internal/3_PersetujuanSPJPEntitas/Button_PopupKonfirmasi_OK'))

WebUI.delay(20)

WebUI.closeBrowser()

