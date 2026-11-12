package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vt3 {
    public static final List b = Arrays.asList("de1.api.radio-browser.info", "de2.api.radio-browser.info", "nl1.api.radio-browser.info", "at1.api.radio-browser.info");
    public static vt3 c;
    public final wt3 a;

    public vt3() {
        ArrayList arrayList = new ArrayList(b);
        Collections.shuffle(arrayList);
        n83 n83Var = new n83();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        n83Var.b(15L, timeUnit);
        n83Var.z = ze5.b(30L, timeUnit);
        ut3 ut3Var = new ut3();
        ArrayList arrayList2 = n83Var.c;
        arrayList2.add(ut3Var);
        arrayList2.add(new xu(2, arrayList));
        this.a = (wt3) new Retrofit.Builder().baseUrl("https://" + ((String) arrayList.get(0)) + "/").client(new o83(n83Var)).addConverterFactory(GsonConverterFactory.create()).build().create(wt3.class);
    }

    public static synchronized vt3 a() {
        try {
            if (c == null) {
                c = new vt3();
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }
}
