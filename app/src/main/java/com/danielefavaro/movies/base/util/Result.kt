package com.danielefavaro.movies.base.util

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    data class Error(val error: Exception?) : Result<Nothing>()
}