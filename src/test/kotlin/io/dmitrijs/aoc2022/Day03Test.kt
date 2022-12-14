package io.dmitrijs.aoc2022

import io.dmitrijs.aoc2022.Resources.resourceAsLines
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Day 3")
internal class Day03Test {
    private val exampleInput = resourceAsLines("day03_example")
    private val problemInput = resourceAsLines("day03")

    @Nested
    @DisplayName("Puzzle 1")
    inner class Puzzle1 {
        @Test
        fun `solves example`() {
            assertEquals(157, Day03(exampleInput).puzzle1())
        }

        @Test
        fun `solves problem`() {
            assertEquals(8_394, Day03(problemInput).puzzle1())
        }
    }

    @Nested
    @DisplayName("Puzzle 2")
    inner class Puzzle2 {
        @Test
        fun `solves example`() {
            assertEquals(70, Day03(exampleInput).puzzle2())
        }

        @Test
        fun `solves problem`() {
            assertEquals(2_413, Day03(problemInput).puzzle2())
        }
    }
}
