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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://vendor-dev.digital-healthcare.id/home.html')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 
    'DRM-JP.24.000013')

WebUI.setText(findTestObject('null'), 
    'password.1')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(5)

WebUI.click(findTestObject('null'))

// Script Upload File
// Mendapatkan direktori proyek
def projectDir = Config.getProjectDir()

// Ambil elemen field "Choose File"
TestObject uploadField = findTestObject('null')

// Membentuk path lengkap file yang ingin diunggah
def filePath = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadField, filePath)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldSIUP = findTestObject('null')

def filePathSIUP = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldSIUP, filePathSIUP)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldSPT = findTestObject('null')

def filePathSPT = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldSPT, filePathSPT)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldRefBank = findTestObject('null')

def filePathRefBank = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldRefBank, filePathRefBank)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldCV = findTestObject('null')

def filePathCV = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldCV, filePathCV)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPeralatan = findTestObject('null')

def filePathPeralatan = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPeralatan, filePathPeralatan)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPengalaman = findTestObject('null')

def filePathPengalaman = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPengalaman, filePathPengalaman)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldAkta = findTestObject('null')

def filePathAkta = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldAkta, filePathAkta)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPemegangSaham = findTestObject('null')

def filePathPemegangSaham = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPemegangSaham, filePathPemegangSaham)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldNPWP = findTestObject('null')

def filePathNPWP = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldNPWP, filePathNPWP)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldNIB = findTestObject('null')

def filePathNIB = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldNIB, filePathNIB)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldIzinLokasi = findTestObject('null')

def filePathIzinLokasi = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldIzinLokasi, filePathIzinLokasi)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPernyataan = findTestObject('null')

def filePathPernyataan = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPernyataan, filePathPernyataan)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldPaktaIntegritas = findTestObject('null')

def filePathPaktaIntegritas = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldPaktaIntegritas, filePathPaktaIntegritas)

WebUI.click(findTestObject('null'))

// Ambil elemen field "Choose File"
TestObject uploadFieldCompanyProfile = findTestObject('null')

def filePathCompanyProfile = projectDir + '/Document/DataTest.docx'

WebUI.uploadFile(uploadFieldCompanyProfile, filePathCompanyProfile)

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.delay(8)

WebUI.scrollToElement(findTestObject('null'), 
    2)

WebUI.click(findTestObject('null'))

WebUI.delay(2)

WebUI.closeBrowser()

