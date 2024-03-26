package com.amitapps.quotesapp.data.network

import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApiService {
    @GET("")
    suspend fun getQuotes(@Query("page") page: Int): QuotesData
}