package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.ArrayList;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface qm3 {
    @GET("createPlaylist")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1, @Query("playlistId") String r2, @Query("name") String r3, @Query("songId") ArrayList<String> r4);

    @GET("updatePlaylist")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1, @Query("playlistId") String r2, @Query("name") String r3, @Query("public") Boolean r4, @Query("songIdToAdd") ArrayList<String> r5, @Query("songIndexToRemove") ArrayList<Integer> r6);

    @GET("getPlaylist")
    Call<ApiResponse> c(@QueryMap Map<String, String> r1, @Query("id") String r2);

    @GET("getPlaylists")
    Call<ApiResponse> d(@QueryMap Map<String, String> r1);

    @GET("deletePlaylist")
    Call<ApiResponse> e(@QueryMap Map<String, String> r1, @Query("id") String r2);
}
