package com.amitapps.quotesapp.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.amitapps.quotesapp.data.network.QuoteApiService
import com.amitapps.quotesapp.paging.QuotePagingSource
import javax.inject.Inject

class QuoteDataRepository @Inject constructor(private val quoteApiService: QuoteApiService) {
    fun getQuotes() = Pager(
        config = PagingConfig(pageSize = 20, maxSize = 100),
        pagingSourceFactory = { QuotePagingSource(quoteApiService) }
    ).liveData
}