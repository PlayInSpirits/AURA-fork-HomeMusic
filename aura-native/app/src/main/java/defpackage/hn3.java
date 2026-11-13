package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public interface hn3 {
    @GET("deletePodcastChannel")
    Call<ApiResponse> a(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("downloadPodcastEpisode")
    Call<ApiResponse> b(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getPodcasts")
    Call<ApiResponse> c(@QueryMap Map<String, String> map, @Query("includeEpisodes") boolean z, @Query("id") String str);

    @GET("createPodcastChannel")
    Call<ApiResponse> d(@QueryMap Map<String, String> map, @Query("url") String str);

    @GET("deletePodcastEpisode")
    Call<ApiResponse> e(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getNewestPodcasts")
    Call<ApiResponse> f(@QueryMap Map<String, String> map, @Query("count") int i);
}
