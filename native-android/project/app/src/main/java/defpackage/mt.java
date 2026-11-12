package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface mt {
    @GET("getPlayQueue")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1);

    @GET("createBookmark")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1, @Query("id") String r2, @Query("position") long r3);

    @GET("getBookmarks")
    Call<ApiResponse> c(@QueryMap Map<String, String> r1);

    @GET("deleteBookmark")
    Call<ApiResponse> d(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("savePlayQueue")
    Call<ApiResponse> e(@QueryMap Map<String, String> r1, @Query("id") List<String> r2, @Query("current") String r3, @Query("position") long r4);
}
