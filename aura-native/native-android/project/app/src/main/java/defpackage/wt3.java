package defpackage;

import com.eddyizm.tempus.radiobrowser.RadioBrowserCountry;
import com.eddyizm.tempus.radiobrowser.RadioBrowserStation;
import java.util.List;
import java.util.Map;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface wt3 {
    @GET("json/countries")
    Call<List<RadioBrowserCountry>> a();

    @GET("json/stations/search")
    Call<List<RadioBrowserStation>> b(@QueryMap Map<String, String> map);

    @GET("json/stations/search")
    Call<List<RadioBrowserStation>> c(@Query("name") String str, @Query("limit") int i, @Query("order") String str2, @Query("reverse") boolean z);

    @GET("json/stations/search")
    Call<List<RadioBrowserStation>> d(@Query("countryexact") String str, @Query("limit") int i, @Query("order") String str2, @Query("reverse") boolean z);
}
