package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface mt {
    @GET("getPlayQueue")
    Call<ApiResponse> a(@QueryMap Map<String, String> map);

    @GET("createBookmark")
    Call<ApiResponse> b(@QueryMap Map<String, String> map, @Query("id") String str, @Query("position") long j);

    @GET("getBookmarks")
    Call<ApiResponse> c(@QueryMap Map<String, String> map);

    @GET("deleteBookmark")
    Call<ApiResponse> d(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("savePlayQueue")
    Call<ApiResponse> e(@QueryMap Map<String, String> map, @Query("id") List<String> list, @Query("current") String str, @Query("position") long j);
}
