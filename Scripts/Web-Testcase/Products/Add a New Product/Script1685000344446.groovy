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

WebUI.click(findTestObject('Web Objects/Products/btn produk'))

WebUI.click(findTestObject('Web Objects/Products/a_tambah'))

WebUI.setText(findTestObject('Web Objects/Products/input_nama_nama'), 'Laptop')

WebUI.setText(findTestObject('Web Objects/Products/input_deskripsi_deskripsi'), 'Lenovo B123')

WebUI.setText(findTestObject('Web Objects/Products/input_harga beli_harga beli'), '550000')

WebUI.setText(findTestObject('Web Objects/Products/input_harga jual_harga jual'), '6000000')

WebUI.setText(findTestObject('Web Objects/Products/input_stok_stok'), '10')

WebUI.click(findTestObject('Web Objects/Products/input_kategori_kategori'))

WebUI.click(findTestObject('Web Objects/Products/td_Electro'))

WebUI.click(findTestObject('Web Objects/Products/button_simpan'))

WebUI.click(findTestObject('Web Objects/Products/div_success'))

