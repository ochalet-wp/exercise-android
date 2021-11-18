package com.company.exercise.android

import org.junit.Test

import org.junit.Assert.*

class RomanNumeralsParserTest {
    private val romanNumeralsParser = RomanNumeralsParser()

    @Test
    fun shouldReturn1ForI() {
        val result = romanNumeralsParser.parse("I")

        assertEquals(1, result)
    }
}