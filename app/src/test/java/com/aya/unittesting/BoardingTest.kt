package com.aya.unittesting

import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertNotNull
import junit.framework.TestCase.assertNotSame
import junit.framework.TestCase.assertTrue
import org.junit.After
import org.junit.Assert
import org.junit.Assert.assertThrows
import org.junit.Before
import org.junit.Test

class BoardingTest {


    /**
     * used to write code that runs before any test case
     *Common setup code is shared here
     * e.g., initializing variables, configuring test environment, etc.
     * declear common variables that will be used in more than one test case
     */
    @Before
    fun setUp() {
        println("Starting Test Execution...")
    }


    /**
     * used to write code that runs after all test case
     * close connections , clear data , release resources , clear objects (view model),etc
     *Common setup code is shared here
     */
    @After
    fun tearDown() {
        println("Test Execution Completed.")
    }


    @Test
    fun generateBoardingTest(){ // 1-AAA  2-GWT 3- Input_output_Verification

        //Arrange  - Given - Input
       val weigth = 32
        val size = "M"
        val expectedOutput = "32M"

        //Act  - When  - Output
        val actualOutput =  generateBoardingPass(weigth,size)

        //Assert  - Then - Verification
        assertEquals(expectedOutput,actualOutput)

        assertTrue(actualOutput == expectedOutput)

        assertFalse(actualOutput != expectedOutput)

        assertNotNull(actualOutput) // check for nullable values

      /*  assertThrows<IllegalArgumentException>{
            generateBoardingPass(-1,"M")
        }*/

        println("Testing...................>>>>>>>>>>>>>>>>>>>>")
    }
}