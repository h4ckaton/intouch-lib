/*
 * Copyright (c) 2018 This file is subject to the terms and conditions defined in file 'LICENSE.txt' which is part of this source code package.
 */

package com.intouch.lib.auth

object AuthEndpoints {
    const val AUTH = "auth"
    const val REGISTER = "$AUTH/register"
    const val LOGIN = "$AUTH/login"
    const val REVOKE = "$AUTH/revoke"
    const val LOGOUT = "$AUTH/logout"
    const val LOGOUT_ALL = "$AUTH/logoutAll"
    const val RESET_PASSWORD = "$AUTH/resetPassword"
}
