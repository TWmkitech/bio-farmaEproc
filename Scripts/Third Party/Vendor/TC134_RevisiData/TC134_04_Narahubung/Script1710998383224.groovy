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

WebUI.waitForElementPresent(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Anchor_Narahubung'), 5)

WebUI.enhancedClick(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Anchor_Narahubung'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Button_EditData'))

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_Jabatan'), 'Marketing Manager')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_Nama'), 'Bpk Hari Edit')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_AlamatEdit'), 'Jl. Alamat Pengurus Edit No. 150')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_Email1'), 'dummynarahubung@yopmail.com')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_Email2'), 'dummynarahubung2@yopmail.com')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_NoHP1'), '08198765432')

WebUI.setText(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Field_NoHP2'), '08191234567')

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Vendor/Data Profile/Narahubung/Button_KonfirmasiOK'))

WebUI.delay(5)

