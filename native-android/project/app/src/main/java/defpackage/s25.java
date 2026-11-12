package defpackage;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.eddyizm.tempus.service.MediaService;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class s25 extends qq2 {
    public static final IntentFilter E;
    public static final long F;
    public static final long G;
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
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("com.eddyizm.tempus.UPNP");
        E = intentFilter;
        F = 10000L;
        G = 120000L;
    }

    public s25(MediaService mediaService, f25 f25Var) {
        super(mediaService, null);
        this.v = f25Var;
        this.x = Executors.newSingleThreadExecutor();
        this.y = new Handler(Looper.getMainLooper());
        this.z = v01.n;
        this.D = new wu4(3, this);
    }

    public static final void h(s25 s25Var) {
        for (int i = 0; i < 3 && s25Var.A; i++) {
            try {
                List<g25> listA = f25.a(s25Var.v);
                if (!listA.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(s25Var.z);
                    for (g25 g25Var : listA) {
                        String strO = g25Var.a;
                        if (qm4.u0(strO)) {
                            strO = b11.o(g25Var.f, "|", g25Var.b);
                        }
                        linkedHashMap.put(strO, g25Var);
                    }
                    s25Var.z = linkedHashMap;
                }
                if (!s25Var.z.isEmpty()) {
                    s25Var.y.post(new r25(s25Var, 0));
                }
            } catch (Exception e) {
                Log.w("UpnpRouteProvider", "discovery failed", e);
                return;
            }
        }
    }

    @Override // defpackage.qq2
    public final oq2 b(String str) {
        str.getClass();
        g25 g25Var = (g25) this.z.get(str);
        if (g25Var == null) {
            return null;
        }
        return new wo2(1, this, g25Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c A[EDGE_INSN: B:12:0x002c->B:13:0x002d BREAK  A[LOOP:0: B:7:0x0015->B:11:0x0029]] */
    @Override // defpackage.qq2
    public final void e(up2 up2Var) {
        boolean z;
        boolean z2 = false;
        if (up2Var == null) {
            z = false;
            break;
        }
        up2Var.a();
        rq2 rq2Var = up2Var.b;
        if (rq2Var == null) {
            z = false;
            break;
        }
        rq2Var.a();
        int size = rq2Var.b.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else {
                if (((String) rq2Var.b.get(i)).equals("com.eddyizm.tempus.UPNP")) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        if (z && up2Var != null && up2Var.b()) {
            z2 = true;
        }
        if (z == this.A && z2 == this.B) {
            return;
        }
        this.A = z;
        this.B = z2;
        this.y.removeCallbacks(this.D);
        if (z) {
            this.y.post(this.D);
        }
    }
}
