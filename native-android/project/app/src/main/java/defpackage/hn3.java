package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface hn3 {
    @GET("deletePodcastChannel")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("downloadPodcastEpisode")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("getPodcasts")
    Call<ApiResponse> c(@QueryMap Map<String, String> r1, @Query("includeEpisodes") boolean r2, @Query("id") String r3);

    @GET("createPodcastChannel")
    Call<ApiResponse> d(@QueryMap Map<String, String> r1, @Query("url") String r2);

    @GET("deletePodcastEpisode")
    Call<ApiResponse> e(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("getNewestPodcasts")
    Call<ApiResponse> f(@QueryMap Map<String, String> r1, @Query("count") int r2);
}
