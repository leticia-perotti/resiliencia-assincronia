package br.com.car

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

//tem que istalar o plugin do Kotest para executar
class CarTest : FunSpec({

    val car = CarFixture.getCar()

    test("se retorna se o carro e elegivel a uber se o ano e maior que 2008"){
        val actual = car.isEligibleToUber()

        actual.isEligible shouldBe true
    }

    test("se retorna se o carro nao e elegivel a uber se o ano e menor que 2008"){
        val actual = car.copy(year = 2006).isEligibleToUber()

        actual.isEligible shouldBe false
    }


})