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
    Call<List<RadioBrowserStation>> b(@QueryMap Map<String, String> r1);

    @GET("json/stations/search")
    Call<List<RadioBrowserStation>> c(@Query("name") String r1, @Query("limit") int r2, @Query("order") String r3, @Query("reverse") boolean r4);

    @GET("json/stations/search")
    Call<List<RadioBrowserStation>> d(@Query("countryexact") String r1, @Query("limit") int r2, @Query("order") String r3, @Query("reverse") boolean r4);
}
