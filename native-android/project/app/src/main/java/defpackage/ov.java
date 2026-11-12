package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface ov {
    @GET("getSimilarSongs2")
    Call<ApiResponse> a(@QueryMap Map<String, String> map, @Query("id") String str, @Query("count") int i);

    @GET("getIndexes")
    Call<ApiResponse> b(@QueryMap Map<String, String> map, @Query("musicFolderId") String str, @Query("ifModifiedSince") Long l);

    @GET("getSong")
    Call<ApiResponse> c(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getAlbumInfo2")
    Call<ApiResponse> d(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getArtist")
    Call<ApiResponse> e(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getAlbum")
    Call<ApiResponse> f(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getSimilarSongs")
    Call<ApiResponse> g(@QueryMap Map<String, String> map, @Query("id") String str, @Query("count") int i);

    @GET("getMusicDirectory")
    Call<ApiResponse> h(@QueryMap Map<String, String> map, @Query("id") String str);

    @GET("getGenres")
    Call<ApiResponse> i(@QueryMap Map<String, String> map);

    @GET("getTopSongs")
    Call<ApiResponse> j(@QueryMap Map<String, String> map, @Query("artist") String str, @Query("count") int i);

    @GET("getArtists")
    Call<ApiResponse> k(@QueryMap Map<String, String> map, @Query("musicFolderId") String str);

    @GET("getMusicFolders")
    Call<ApiResponse> l(@QueryMap Map<String, String> map);

    @GET("getArtistInfo2")
    Call<ApiResponse> m(@QueryMap Map<String, String> map, @Query("id") String str);
}
