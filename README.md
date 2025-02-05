  <h3 align="center">Popular Kotlin GitHub Repos </h3>

  <p align="center">
    A mini Project to Get Popular Kotlin GitHub Repos. in Your Android Application .
    <br/>
    <br/>
  </p>
</p>



## Media
<img src="https://github.com/Aditys018/PopularKotlinGitHBRepos/assets/100122761/84d5b6d6-f414-4c49-a3e7-1a2d98a9dc61" width="200" height="400" align="left" alt="Screenshot1">


<img src="https://github.com/Aditys018/PopularKotlinGitHBRepos/assets/100122761/09609755-b11a-4dbb-b49a-07ae2ecdcb3e" width="200" height="400" align="center" alt="Screenshot2">


<img src="https://github.com/Aditys018/PopularKotlinGitHBRepos/assets/100122761/2ad8dcf6-c312-4963-bf2f-23bbdc1b5d4f"  width="200" height="400" align="center" alt="Screenshot2">



## About
This project aims to provide users with a seamless way to explore popular Kotlin repositories directly from their Android devices. Additionally, it serves as a valuable resource for developers, enthusiasts, recruiters, and learners within the Kotlin development community, facilitating discovery, learning, collaboration, and networking.


## Built With

The project began with setting up Retrofit, a popular HTTP Client library for Android, to simplify API requests. A Retrofit instance was created with a base URL pointing to the GitHub API.

Service Interface: A service interface (GitHubService) was defined with methods corresponding to the endpoints of the GitHub API. These methods utilize Retrofit annotations to specify the HTTP request type, URL, and response type.

Fetching Data from GitHub: Utilizing the GitHubService interface, asynchronous API requests were made using Kotlin coroutines to fetch data from the GitHub API.

Displaying Data in RecyclerView: A RecyclerView was employed to present the fetched repository data in a list format. A custom adapter (RepositoryAdapter) was created to bind the data to the RecyclerView. This adapter inflates layout items for each repository and populates them with the corresponding data.






