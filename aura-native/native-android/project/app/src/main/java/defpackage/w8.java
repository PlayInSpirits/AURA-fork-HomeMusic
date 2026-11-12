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
    Call<ApiResponse> a(@QueryMap Map<String, String> map, @Query("size") int i, @Query("fromYear") Integer num, @Query("toYear") Integer num2, @Query("genre") String str, @Query("musicFolderId") String str2);

    @GET("getAlbumList2")
    Call<ApiResponse> b(@QueryMap Map<String, String> map, @Query("type") String str, @Query("size") int i, @Query("offset") int i2, @Query("fromYear") Integer num, @Query("toYear") Integer num2, @Query("musicFolderId") String str2);

    @GET("getRandomSongs")
    Call<ApiResponse> c(@QueryMap Map<String, String> map, @Query("size") int i, @Query("fromYear") Integer num, @Query("toYear") Integer num2, @Query("musicFolderId") String str);

    @GET("getStarred2")
    Call<ApiResponse> d(@QueryMap Map<String, String> map);

    @GET("getSongsByGenre")
    Call<ApiResponse> e(@QueryMap Map<String, String> map, @Query("genre") String str, @Query("count") int i, @Query("offset") int i2, @Query("musicFolderId") String str2);
}
