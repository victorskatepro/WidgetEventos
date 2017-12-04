package com.victorsaico.widgeteventos.servicies;

import com.victorsaico.widgeteventos.Evento;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by JARVIS on 4/12/2017.
 */

public interface ApiService {
    String API_BASE_URL = "https://denuncias-api-alejovictor.c9users.io/";

    @GET("api/v1/eventos")
    Call<List<Evento>> getEventos();
}
