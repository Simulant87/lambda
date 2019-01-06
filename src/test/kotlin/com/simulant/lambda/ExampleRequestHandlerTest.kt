package com.simulant.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExampleRequestHandlerTest {

    @Test
    fun handleRequest() {
        val tested = ExampleRequestHandler()

        val input = "testInput"
        val result = tested.handleRequest(input, null)

        assertThat(result).isEqualTo("Your input was '$input'")
    }
}
