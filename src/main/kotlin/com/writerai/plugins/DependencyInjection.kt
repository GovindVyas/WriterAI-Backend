package com.writerai.plugins

import com.writerai.di.blogModule
import com.writerai.di.sharedToModule
import com.writerai.di.userModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun Application.configureDependencyInjection() {
    install(Koin) {
        modules(userModule, blogModule, sharedToModule)
    }
}
