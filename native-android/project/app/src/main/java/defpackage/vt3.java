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
    public static final List b = null;
    public static vt3 c;
    public final wt3 a;

    static {
        b = Arrays.asList(new String[]{"de1.api.radio-browser.info", "de2.api.radio-browser.info", "nl1.api.radio-browser.info", "at1.api.radio-browser.info"});
    }

    public vt3() {
        ArrayList r0 = new ArrayList(b);
        Collections.shuffle(r0);
        n83 r1 = new n83();
        TimeUnit r4 = TimeUnit.SECONDS;
        r1.b(15, r4);
        r1.z = ze5.b(30, r4);
        ut3 r2 = new ut3();
        ArrayList r3 = r1.c;
        r3.add(r2);
        r3.add(new xu(2, r0));
        this.a = (wt3) new Retrofit.Builder().baseUrl("https://" + ((String) r0.get(0)) + "/").client(new o83(r1)).addConverterFactory(GsonConverterFactory.create()).build().create(wt3.class);
    }

    public static synchronized vt3 a() {
        monitor-enter(vt3.class);
    L7:
        th = move-exception;
        throw th;
    L5:
        if (c != null) goto L9;
        c = new vt3();     // Catch: Throwable -> L7
    L9:
        vt3 r1 = c;     // Catch: Throwable -> L7
        monitor-exit(vt3.class);
        return r1;
    }
}
