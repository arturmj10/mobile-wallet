/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.feature.notification

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable

const val NOTIFICATION_ROUTE = "notification_route"

fun NavGraphBuilder.notificationScreen() {
    composable(NOTIFICATION_ROUTE) {
        NotificationScreen()
    }
}

fun NavController.navigateToNotification() {
    navigate(NOTIFICATION_ROUTE)
}