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

not_run: WebUI.callTestCase(findTestCase('Third Party/Vendor/TC121_MelengkapiDataProfile/TC121_00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Anchor_RekeningBank'), 5)

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Anchor_RekeningBank'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Button_EditData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_NoRek'), '0090123456')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_NamaPemilik'), 'Charles Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_PemegangRekening'), 'Charles Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_Bank'), 'Bank Mandiri')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_MataUang'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_MataUang_DataIDR'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_Cabang'), 'KCP Kiaracondong')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Field_Keterangan'), 'Diubah menggunakan automation')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/RekeningBank/Button_KonfirmasiOK'))

WebUI.delay(5)

