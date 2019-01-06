package com.simulant.lambda

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler

class ExampleRequestHandler : RequestHandler<String, String> {
    override fun handleRequest(input: String?, context: Context?): String {
        return "Your input was '$input'"
    }
}
