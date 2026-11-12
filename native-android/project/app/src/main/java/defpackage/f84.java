package defpackage;

import com.eddyizm.tempus.subsonic.base.ApiResponse;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface f84 {
    @GET("search3")
    Call<ApiResponse> a(@QueryMap Map<String, String> r1, @Query("query") String r2, @Query("songCount") int r3, @Query("songOffset") int r4, @Query("albumCount") int r5, @Query("albumOffset") int r6, @Query("artistCount") int r7, @Query("artistOffset") int r8, @Query("musicFolderId") String r9);
}
