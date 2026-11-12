package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface w8 {
    @GET("getRandomSongs")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1, @Query("size") int r2, @Query("fromYear") Integer r3, @Query("toYear") Integer r4, @Query("genre") String r5, @Query("musicFolderId") String r6);

    @GET("getAlbumList2")
    Call<ApiResponse> b(@QueryMap Map<String, String> r1, @Query("type") String r2, @Query("size") int r3, @Query("offset") int r4, @Query("fromYear") Integer r5, @Query("toYear") Integer r6, @Query("musicFolderId") String r7);

    @GET("getRandomSongs")
    Call<ApiResponse> c(@QueryMap Map<String, String> r1, @Query("size") int r2, @Query("fromYear") Integer r3, @Query("toYear") Integer r4, @Query("musicFolderId") String r5);

    @GET("getStarred2")
    Call<ApiResponse> d(@QueryMap Map<String, String> r1);

    @GET("getSongsByGenre")
    Call<ApiResponse> e(@QueryMap Map<String, String> r1, @Query("genre") String r2, @Query("count") int r3, @Query("offset") int r4, @Query("musicFolderId") String r5);
}
