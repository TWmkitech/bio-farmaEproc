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

WebUI.callTestCase(findTestCase('000_Custom/Precondition/Login/ThirdParty/PGHolding_BioFarma_BOD-3'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Third Party/Internal/Verifikasi/Anchor_ThirdPartyManagement'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/Anchor_PenilaianKinerja'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Anchor_PenugasanPenilaian'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Filter_KriteriaCari'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Filter_KriteriaCari_Data'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Filter_CariData'))

WebUI.setText(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Filter_CariData'), 'SCHOTT IGAR GLASS, PT')

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Button_Tambah'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Pilih_Penilai'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Pilih_PenilaiData'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Field_TanggalMulai'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Field_TanggalMulai_Data'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Field_TanggalSelesai'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Field_TanggalSelesai_Data'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Button_Simpan'))

WebUI.click(findTestObject('Third Party/Internal/PenilaianKinerja/PenugasanPenilaian/Button_KonfirmasiOK'))

