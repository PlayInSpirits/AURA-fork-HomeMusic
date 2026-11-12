package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface gq4 {
    @GET("getOpenSubsonicExtensions")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1);

    @GET("ping")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1);
}
