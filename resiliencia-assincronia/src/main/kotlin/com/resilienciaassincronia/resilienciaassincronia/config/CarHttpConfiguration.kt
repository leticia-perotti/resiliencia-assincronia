@Configuration
class CarHttpConfiguration {

    private companion object {
        const val BASE_URL = "http://ec2-18-215-156-13.compute-1.amazonaws.com:8080"
    }

    private fun buildClient() = OkHttpClient.Builder().build()

    private fun buildRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(buildClient())
        .build()

    @Bean
    fun carHttpService(): CarHttpService = buildRetrofit().create(CarHttpService::class.java)
}