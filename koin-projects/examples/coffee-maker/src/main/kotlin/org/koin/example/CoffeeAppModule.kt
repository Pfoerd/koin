package org.koin.example

import org.koin.dsl.ext.single
import org.koin.dsl.module.module

val coffeeMakerModule = module {
    single<CoffeeMaker>()
//    single<Thermosiphon>() bind Pump::class
    single<Thermosiphon, Pump>()
//    single { build<ElectricHeater>() as Heater }
//    single<ElectricHeater>() bind Heater::class
    single<ElectricHeater, Heater>()
}