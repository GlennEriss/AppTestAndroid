package com.example.apptest.services

interface IService<T> {
    fun getAll(): List<T>;
    fun getBy(values:Map<String, Any>);
    fun getById(id: Int): T;

    fun add(entity:T): T;
    fun update(entity:T): T;
    fun delete(entity:T): Boolean;
}