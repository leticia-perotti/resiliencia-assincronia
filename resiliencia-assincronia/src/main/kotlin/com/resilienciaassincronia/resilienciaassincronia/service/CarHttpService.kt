@Service
interface CarHttpService {

    @GET("cars-inventory")
    fun getByModel(@Query("model") model: String): Call<List<CarHttp>>
}