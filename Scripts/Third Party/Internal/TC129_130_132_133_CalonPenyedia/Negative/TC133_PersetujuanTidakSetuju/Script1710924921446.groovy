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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-1'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_CalonPenyedia'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Filter_PilihPencarian'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Filter_PilihPencarian_Data'))

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Field_CariData'))

WebUI.setText(findTestObject('Third Party/Internal/Verifikasi/Field_CariData'), 'Revisi')

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_PengajuanVerifikasi'))

WebUI.click(findTestObject('Third Party/Internal/Calon Penyedia/Input_VerifikasiReviewTidakSetuju'))

WebUI.setText(findTestObject('Third Party/Internal/Calon Penyedia/Field_VerifikasiAlasanPenolakan'), 'Ditolak menggunakan automation')

WebUI.click(findTestObject('Third Party/Internal/Review/Button_SubmitPersetujuan'))

WebUI.click(findTestObject('Third Party/Internal/Review/Button_KonfirmasiOK_Persetujuan'))

WebUI.delay(5)

WebUI.closeBrowser()

