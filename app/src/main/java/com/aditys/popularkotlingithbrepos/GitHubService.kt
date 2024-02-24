package com.aditys.popularkotlingithbrepos

import retrofit2.Response
import retrofit2.http.GET

interface GitHubService {
    @GET("search/repositories?q=language:kotlin&sort=stars")
    suspend fun getPopularKotlinRepositories(): Response<GitHubResponse>
}

