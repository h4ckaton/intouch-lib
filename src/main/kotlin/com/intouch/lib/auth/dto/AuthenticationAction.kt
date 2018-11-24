/*
 * Copyright (c) 2018 This file is subject to the terms and conditions defined in file 'LICENSE.txt' which is part of this source code package.
 */

package com.intouch.lib.auth.dto

class AuthenticationRequest(val name: String = "", val password: String = "")

class AuthenticationResponse(val resourceToken: String = "", val refreshToken: String = "")