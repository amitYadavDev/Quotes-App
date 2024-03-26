package com.amitapps.quotesapp.paging

import androidx.paging.PagingSource
import com.amitapps.quotesapp.data.network.QuoteApiService

class QuotePagingSource(private val quoteApiService: QuoteApiService) : PagingSource<Int, Result>() {
}