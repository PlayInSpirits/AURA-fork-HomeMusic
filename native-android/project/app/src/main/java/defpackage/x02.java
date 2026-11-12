package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface x02 {
    @GET("getInternetRadioStations")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1);

    @GET("updateInternetRadioStation")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1, @Query("id") String r2, @Query("streamUrl") String r3, @Query("name") String r4, @Query("homepageUrl") String r5);

    @GET("deleteInternetRadioStation")
    Call<ApiResponse> c(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("createInternetRadioStation")
    Call<ApiResponse> d(@QueryMap Map<String, String> r1, @Query("streamUrl") String r2, @Query("name") String r3, @Query("homepageUrl") String r4);
}
