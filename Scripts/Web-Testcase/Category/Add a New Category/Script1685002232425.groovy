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

WebUI.callTestCase(findTestCase('Web-Testcase/Login/Login-Positive'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Web Objects/Category/btn kategori'))

WebUI.verifyElementPresent(findTestObject('Web Objects/Category/div_dashboard   kategori'), 0)

WebUI.click(findTestObject('Web Objects/Category/btn tambah'))

WebUI.setText(findTestObject('Web Objects/Category/input_nama_kategori'), 'Technology')

WebUI.setText(findTestObject('Web Objects/Category/input_deskripsi_kategori'), 'Kategori Teknologi')

WebUI.click(findTestObject('Web Objects/Category/button_simpan'))

WebUI.verifyElementPresent(findTestObject('Web Objects/Category/popup_success'), 0)

