package defpackage;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.eddyizm.tempus.service.MediaService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s25 extends qq2 {
    public static final IntentFilter E = null;
    public static final long F = 0;
    public static final long G = 0;
    public volatile boolean A;
    public volatile boolean B;
    public volatile boolean C;
    public final wu4 D;
    public final f25 v;
    public hd5 w;
    public final ExecutorService x;
    public final Handler y;
    public volatile Map z;

    static {
        IntentFilter r0 = new IntentFilter();
        r0.addCategory("com.eddyizm.tempus.UPNP");
        E = r0;
        F = 10000;
        G = 120000;
    }

    public s25(MediaService r2, f25 r3) {
        super(r2, null);
        this.v = r3;
        this.x = Executors.newSingleThreadExecutor();
        this.y = new Handler(Looper.getMainLooper());
        this.z = v01.n;
        this.D = new wu4(3, this);
    }

    public static final void h(s25 r8) {
        int r1 = 0;
    L4:
        if (r1 >= 3) goto L35;
        if (r8.A == false) goto L36;
        List r2 = f25.a(r8.v);     // Catch: Exception -> L23
        if (r2.isEmpty() == true) goto L20;
        LinkedHashMap r3 = new LinkedHashMap(r8.z);
        Iterator r4 = r2.iterator();
    L13:
        if (r4.hasNext() == false) goto L18;
        g25 r5 = (g25) r4.next();
        String r6 = r5.a;
        if (qm4.u0(r6) == false) goto L17;
        r6 = b11.o(r5.f, "|", r5.b);
    L17:
        r3.put(r6, r5);
        goto L13
    L18:
        r8.z = r3;
    L20:
        if (r8.z.isEmpty() == true) goto L22;
        r8.y.post(new r25(r8, 0));
    L22:
        r1 = r1 + 1;
    L23:
        e = move-exception;
        Log.w("UpnpRouteProvider", "discovery failed", e);
        return;
    L36:
        return;
    }

    @Override // defpackage.qq2
    public final oq2 b(String r3) {
        r3.getClass();
        g25 r4 = (g25) this.z.get(r3);
        if (r4 != null) goto L7;
        return null;
    L7:
        return new wo2(1, this, r4);
    }

    @Override // defpackage.qq2
    public final void e(up2 r8) {
        boolean r0 = false;
        if (r8 == null) goto L12;
        r8.a();
        rq2 r2 = r8.b;
        if (r2 == null) goto L12;
        r2.a();
        int r3 = r2.b.size();
        int r4 = 0;
    L7:
        if (r4 >= r3) goto L12;
        if (((String) r2.b.get(r4)).equals("com.eddyizm.tempus.UPNP") == true) goto L10;
        r4 = r4 + 1;
        goto L7
    L10:
        boolean r5 = true;
    L13:
        if (r5 == false) goto L19;
        if (r8 == null) goto L19;
        if (r8.b() != true) goto L19;
        r0 = true;
    L19:
        if (r5 == this.A) goto L21;
    L23:
        this.A = r5;
        this.B = r0;
        this.y.removeCallbacks(this.D);
        if (r5 == false) goto L29;
        this.y.post(this.D);
        return;
    L29:
        return;
    L21:
        if (r0 != this.B) goto L23;
        return;
    L12:
        r5 = false;
        goto L13
    }
}
