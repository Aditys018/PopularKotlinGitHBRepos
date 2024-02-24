package com.aditys.popularkotlingithbrepos

data class Repository(
    val name: String,
    val description: String?,
    val stargazers_count: Int,
    val forks_count: Int,
    val html_url: String // Renamed from 'url' to 'html_url' to match GitHub API response
)


