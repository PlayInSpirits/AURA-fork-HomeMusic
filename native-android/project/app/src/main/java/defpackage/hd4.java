package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface hd4 {
    @GET("deleteShare")
    Call<ApiResponse> a(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getShares")
    Call<ApiResponse> b(@QueryMap Map<String, String> map);

    @GET("createShare")
    Call<ApiResponse> c(@QueryMap Map<String, String> map, @Query("id") String str, @Query("description") String str2, @Query("expires") Long l);

    @GET("updateShare")
    Call<ApiResponse> d(@QueryMap Map<String, String> map, @Query("id") String str, @Query("description") String str2, @Query("expires") Long l);
}
