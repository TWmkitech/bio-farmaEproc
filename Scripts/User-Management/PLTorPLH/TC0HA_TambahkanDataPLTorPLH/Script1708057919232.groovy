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

WebUI.scrollToElement(findTestObject('User-Management/Global-TestObject/Anchor_PLTorPLH'), 5)

WebUI.waitForElementPresent(findTestObject('User-Management/Global-TestObject/Anchor_PLTorPLH'), 5)

WebUI.click(findTestObject('User-Management/Global-TestObject/Anchor_PLTorPLH'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/button_Tambah PLTPLH'))

WebUI.setText(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Textbox_NomorSK'), 'TestNoSK')

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_TanggalSK'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_TanggalSK_21'))

WebUI.uploadFile(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Upload_UnggahSurat'), 'D:\\Automation Biofarma\\Biofarma new\\Document\\DataTest.docx')

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PeriodeMulai'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PeriodeMulai_1'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PeriodeSelesai'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PeriodeSelesai_35'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PejabatDefinitif'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PejabatDefinitif_1'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PejabatPengganti'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PejabatPengganti_1'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PLTPLH'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Selectbox_PLTPLH_1'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Checkbox_Agreement'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/button_Simpan Data'))

WebUI.click(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Button_PopupKonfirmasi_OK'))

WebUI.verifyElementPresent(findTestObject('User-Management/PLTorPLH/TambahkanDataPLTorPLH/Button_PopupKonfirmasi_Berhasil'), 
    5)

