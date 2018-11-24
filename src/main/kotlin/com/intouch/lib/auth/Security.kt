/*
 * Copyright (c) 2018 This file is subject to the terms and conditions defined in file 'LICENSE.txt' which is part of this source code package.
 */

package com.intouch.lib.auth


object JwtTokenCustomFields {
    const val USER_ID = "userId"
    const val DEVICE_ID = "deviceId"
    const val ROLES = "roles"
}

object Roles {
    // User
    const val USER = "ROLE_USER"
}

object Privileges {
    // User
    const val RATE_PRODUCT = "RATE_PRODUCT_PRIVILEGE"
    const val ADD_PRODUCT = "ADD_PRODUCT_PRIVILEGE"
}