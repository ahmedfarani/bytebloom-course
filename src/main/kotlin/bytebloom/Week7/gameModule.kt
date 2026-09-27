package bytebloom.Week7

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val gameModule = module {
    singleOf(::LiveAuditService) bind AuditService::class

    factory { PlayerStats() }

    singleOf(::Game)
}