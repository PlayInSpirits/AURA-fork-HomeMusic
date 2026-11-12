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
    Call<ApiResponse> a(@QueryMap Map<String, String> map, @Query("query") String str, @Query("songCount") int i, @Query("songOffset") int i2, @Query("albumCount") int i3, @Query("albumOffset") int i4, @Query("artistCount") int i5, @Query("artistOffset") int i6, @Query("musicFolderId") String str2);
}
