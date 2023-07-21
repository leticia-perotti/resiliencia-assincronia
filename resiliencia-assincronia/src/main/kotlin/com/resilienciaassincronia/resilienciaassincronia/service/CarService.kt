package com.resilienciaassincronia.resilienciaassincronia.service

interface CarService {

    fun list(model: String?): List<Car>
    fun save(car: Car): Int
    fun update(car: Car, id: Long): Int
    fun findById(id: Long): Car
    fun listByInventory(model: String): List<Car>?
}