package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface x02 {
    @GET("getInternetRadioStations")
    Call<ApiResponse> a(@QueryMap Map<String, String> map);

    @GET("updateInternetRadioStation")
    Call<ApiResponse> b(@QueryMap Map<String, String> map, @Query("id") String str, @Query("streamUrl") String str2, @Query("name") String str3, @Query("homepageUrl") String str4);

    @GET("deleteInternetRadioStation")
    Call<ApiResponse> c(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("createInternetRadioStation")
    Call<ApiResponse> d(@QueryMap Map<String, String> map, @Query("streamUrl") String str, @Query("name") String str2, @Query("homepageUrl") String str3);
}
