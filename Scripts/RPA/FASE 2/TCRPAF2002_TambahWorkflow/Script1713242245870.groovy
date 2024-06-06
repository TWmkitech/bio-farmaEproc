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

CustomKeywords.'login.Bod4.login'(GlobalVariable.BOD_4, GlobalVariable.Pass)

WebUI.click(findTestObject('RPA/Button_Roles'))

WebUI.click(findTestObject('RPA/Button_ChangeRoles'))

WebUI.click(findTestObject('RPA/Button_DropdownRoles'))

WebUI.click(findTestObject('RPA/Pilih_AdminRPA'))

WebUI.click(findTestObject('RPA/Button_Ganti'))

WebUI.click(findTestObject('RPA/Button_ModulRPA'))

WebUI.scrollToElement(findTestObject('RPA/TambahWorkFlow/Detail_WorkFlow'), 0)

WebUI.click(findTestObject('RPA/TambahWorkFlow/Detail_WorkFlow'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Button_TambahAlurKerja'))

WebUI.delay(5)

WebUI.setText(findTestObject('RPA/TambahWorkFlow/Field_NamaAlurKerja'), 'testtttttttttt')

WebUI.setText(findTestObject('RPA/TambahWorkFlow/Field_Keterangan'), 'testtttttttt')

WebUI.click(findTestObject('RPA/TambahWorkFlow/Field_Tanggal'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Pilih_TanggalMulai'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Field_TanggalSampai'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Pilih_TanggalSampai'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Checklist'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Button_Simpan'))

WebUI.click(findTestObject('RPA/TambahWorkFlow/Button_OK'))

WebUI.delay(5)

WebUI.closeBrowser()

