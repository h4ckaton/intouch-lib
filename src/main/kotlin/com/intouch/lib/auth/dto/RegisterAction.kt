/*
 * Copyright (c) 2018. This file is subject to the terms and conditions defined in file 'LICENSE.txt' which is part of this source code package.
 */

package com.intouch.lib.auth.dto

class RegisterRequest(
        var name: String = "",
        var email: String = "",
        var password: String = ""
)

class RegisterResponse(
        var name: String = "",
        var email: String = ""
)