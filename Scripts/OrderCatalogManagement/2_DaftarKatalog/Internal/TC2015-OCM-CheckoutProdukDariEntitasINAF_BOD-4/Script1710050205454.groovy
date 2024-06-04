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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/TransactionManagement/Paket1/PGEntitas_INAF_BOD-4'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OrderCatalogManagement/0_Object/Internal/0_OrderCatalogManagement'))

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/1_LihatDetail/SubModul_DaftarKatalog'))

WebUI.delay(5)

WebUI.setText(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/1_LihatDetail/TBOX_Search'), 'SPJ/JPROC/2024/100030')

WebUI.delay(10)

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/button_Tambah ke keranjang_1'))

WebUI.clearText(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/TBOX_QTY_1'))

WebUI.setText(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/TBOX_QTY_1'), '5')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/button_Checkout'))

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/CBOX_ROW1'))

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/4_Checkout/button_Konfirmasi Checkout'))

WebUI.click(findTestObject('OrderCatalogManagement/2_DaftarKatalog/Internal/Button_PopupKonfirmasi_OK'))

WebUI.delay(15)

WebUI.closeBrowser()
