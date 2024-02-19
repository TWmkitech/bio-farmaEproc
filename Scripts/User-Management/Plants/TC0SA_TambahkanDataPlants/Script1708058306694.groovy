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

CustomKeywords.'login.admin.login'(GlobalVariable.Admin, GlobalVariable.Pass)

WebUI.maximizeWindow()

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_UserManagement'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_Plants'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_Plants'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_Plants'))

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/button_Tambah PabrikSide'))

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/Selectbox_Perusahaan'))

WebUI.waitForElementPresent(findTestObject('User-Management/Plants/TambahkanDataPlants/Selectbox_Perusahaan_1'), 5)

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/Selectbox_Perusahaan_1'))

WebUI.setText(findTestObject('User-Management/Plants/TambahkanDataPlants/Textbox_KodePabrikSide'), '01TestKodePabrik')

WebUI.setText(findTestObject('User-Management/Plants/TambahkanDataPlants/Textbox_NamaPabrikSide'), 'PT Test Nama Pabrik')

WebUI.setText(findTestObject('User-Management/Plants/TambahkanDataPlants/Textbox_AlamatPabrikSide'), 'Jl. Test Alamat Pabrik')

WebUI.setText(findTestObject('User-Management/Plants/TambahkanDataPlants/Textbox_AlamatInvoice'), 'Jl. Test Alamat Invoice')

WebUI.setText(findTestObject('User-Management/Plants/TambahkanDataPlants/Textbox_AlamatGudang'), 'Jl. Test Alamat Gudang')

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/Checkbox_Agreement'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/button_simpan Data'))

WebUI.click(findTestObject('User-Management/Plants/TambahkanDataPlants/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/Plants/TambahkanDataPlants/Verify_PopupKonfirmasi_Berhasil'), 
    5)

