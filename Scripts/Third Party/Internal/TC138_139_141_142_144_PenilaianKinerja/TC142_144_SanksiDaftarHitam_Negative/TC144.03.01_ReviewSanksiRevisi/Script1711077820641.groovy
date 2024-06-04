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
import com.kms.katalon.core.configuration.RunConfiguration as Config

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-2'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/Anchor_PenilaianKinerja'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Anchor_SanksiDaftarHitam'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Button_Approval'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Radio_Revisi'))

WebUI.setText(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Field_AlasanPenolakan'), 'Direvisi menggunakan automation')

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Button_KirimApproval'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/SanksiDaftarHitam/Button_KonfirmasiOK_Approval'))

