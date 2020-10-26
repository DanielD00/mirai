/*
 * Copyright 2019-2020 Mamoe Technologies and contributors.
 *
 * 此源代码的使用受 GNU AFFERO GENERAL PUBLIC LICENSE version 3 许可证的约束, 可以在以下链接找到该许可证.
 * Use of this source code is governed by the GNU AFFERO GENERAL PUBLIC LICENSE version 3 license that can be found via the following link.
 *
 * https://github.com/mamoe/mirai/blob/master/LICENSE
 *
 */

package net.mamoe.mirai.console.internal.logging

import net.mamoe.mirai.console.logging.LoggerController
import net.mamoe.mirai.utils.SimpleLogger

internal class LoggerControllerDelegate(
    @Volatile
    var delegate: LoggerController
) : LoggerController {
    override fun shouldLog(identity: String?, priority: SimpleLogger.LogPriority): Boolean = delegate.shouldLog(identity, priority)
}