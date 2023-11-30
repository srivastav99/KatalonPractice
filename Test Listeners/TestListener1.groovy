import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.testng.annotations.AfterSuite
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeSuite
import org.testng.annotations.BeforeTest

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
//These apply for entire project
class TestListener1 {
	
	@BeforeTestCase
	def beforeTestCase() {
		
		println "I am inside beforeTestCase function"
	}
	
	@AfterTestCase
	def afterTestCase() {
		
		println "I am inside afterTestCase function"
	}
	
	@BeforeTestSuite
	def beforeTestSuite() {
		
		println "I am inside beforeTestSuite function"
	}
	
	@AfterTestSuite
	def afterTestSuite() {
		
		println "I am inside afterTestSuite function"
	}
	
}