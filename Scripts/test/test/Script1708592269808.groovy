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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging-eproc.digital-healthcare.id/analytic/categorymaterialprofile')

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_Selamat Datang di Sistem Join Procureme_45158e'))

WebUI.setEncryptedText(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/input_Lupa Kata Sandi_password'), 
    'J7V1mJALARKIbhS60E9e1Q==')

WebUI.sendKeys(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/input_Lupa Kata Sandi_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/svg_Yearly_css-8mmkcg'))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_Yearly_1'))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_Start_select__input-container css-19bb58m'))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_2023'))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_Start_select__input-container css-19bb58m'))

WebUI.click(findTestObject('Object Repository/tes/Page_Biofarma - Sistem e-Procurement BUMN H_520e7e/div_2021'))

