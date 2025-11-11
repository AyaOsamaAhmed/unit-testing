package com.aya.unittesting

import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Test

class BoardingTest {

    @Test
    fun generateBoardingTest(){
       val weigth = 32
        val size = "M"
        val expectedOutput = "32M"
        val actualOutput =  generateBoardingPass(weigth,size)

        assertEquals(expectedOutput,actualOutput)
    }
}