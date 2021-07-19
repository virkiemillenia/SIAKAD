package com.ivenavm.sistemakademik

import retrofit2.Call
import retrofit2.http.*

interface ServiceInterface {
    @GET("Mahasiswa")
    fun getData(): Call<List<KontakData>>

    @POST("Mahasiswa")
    fun postKontak(@Body kontakData: KontakData): Call<KontakData>


    @FormUrlEncoded
    @HTTP(method="DELETE", path="Mahasiswa", hasBody = true)
    fun deleteKontak(@Field("Nim") id: Int): Call<KontakData>

    @FormUrlEncoded
    @HTTP(method="PUT", path="Mahasiswa", hasBody = true)
    fun updateKontak(
        @Field("Nim") id: Int,
        @Field("Nama") nama: String): Call<KontakData>

}
