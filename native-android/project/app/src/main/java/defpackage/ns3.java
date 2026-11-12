package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.LruCache;
import com.eddyizm.tempus.database.AppDatabase;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ns3 implements xs {
    public final /* synthetic */ int n;
    public Object o;
    public Object p;
    public Object q;

    public ns3(int r3) {
        this.n = r3;
        switch(r3) {
            case 6: goto L8;
            case 7: goto L7;
            default: goto L4;
        };
    L4:
        ExecutorService r4 = Executors.newSingleThreadExecutor(new h5(0));
        this.o = new HashMap();
        this.p = new ReferenceQueue();
        r4.execute(new g5(1, this));
        return;
    L8:
        kf2 r5 = kf2.o;
        this.o = new HashSet();
        this.p = r5;
        return;
    }

    public static void d() {
        if (Build.VERSION.SDK_INT >= 29) goto L6;
        return;
    L6:
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }

    public synchronized void a(f42 r3, o11 r4) {
        monitor-enter(this);
        i5 r0 = new i5(r3, r4, (ReferenceQueue) this.p);     // Catch: Throwable -> L8
        i5 r5 = (i5) ((HashMap) this.o).put(r3, r0);     // Catch: Throwable -> L8
        if (r5 == null) goto L6;
        r5.c = null;     // Catch: Throwable -> L8
        r5.clear();     // Catch: Throwable -> L8
    L6:
        monitor-exit(this);
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public void b(i5 r8) {
        monitor-enter(this);
        ((HashMap) this.o).remove(r8.a);     // Catch: Throwable -> L11
        if (r8.b == false) goto L13;
        q04 r2 = r8.c;     // Catch: Throwable -> L11
        if (r2 == null) goto L13;
        monitor-exit(this);     // Catch: Throwable -> L11
        o11 r1 = new o11(r2, true, false, r8.a, (i11) this.q);
        ((i11) this.q).e(r8.a, r1);
        return;
    L13:
        monitor-exit(this);     // Catch: Throwable -> L11
        return;
    L11:
        th = move-exception;
        throw th;
    }

    public List c() {
        return (List) xl.E((s24) this.o, true, false, new ms3(this));
    }

    public void e(MediaCodec r2) {
        if (((HashSet) this.o).remove(r2) == false) goto L8;
        LoudnessCodecController r1 = (LoudnessCodecController) this.q;
        if (r1 == null) goto L9;
        vk.f(r1, r2);
        return;
    L9:
        return;
    }

    public void f(int r2) {
        LoudnessCodecController r0 = (LoudnessCodecController) this.q;
        if (r0 == null) goto L5;
        vk.e(r0);
        this.q = null;
    L5:
        LoudnessCodecController r3 = vk.a(r2, new jf2(this));
        this.q = r3;
        Iterator r1 = ((HashSet) this.o).iterator();
    L7:
        if (r1.hasNext() == false) goto L11;
        if (vk.i(r3, (MediaCodec) r1.next()) == true) goto L7;
        r1.remove();
        goto L7
    }

    @Override // defpackage.xs
    public ic2 g(Uri r5) {
        r5.getClass();
        Bitmap r0 = (Bitmap) ((LruCache) this.p).get(r5);
        if (r0 != null) goto L5;
        lb4 r1 = new lb4();
        ((ExecutorService) this.q).execute(new qo2(this, r5, r1, 16));
        return r1;
    L5:
        return new mw1(r0);
    }

    public void h(Object r3, String r4) {
        c12 r0 = new c12(11);
        ((c12) this.q).q = r0;
        this.q = r0;
        r0.p = r3;
        r0.o = r4;
    }

    @Override // defpackage.xs
    public ic2 j(byte[] r3) {
        r3.getClass();
        Bitmap r0 = BitmapFactory.decodeByteArray(r3, 0, r3.length);     // Catch: Exception -> L9
        if (r0 != null) goto L8;
        IOException r1 = new IOException("BitmapFactory returned null for " + r3.length + "B");     // Catch: Exception -> L9
        lw1 r2 = new lw1();     // Catch: Exception -> L9
        r2.m(r1);     // Catch: Exception -> L9
        return r2;
    L8:
        return new mw1(r0);
    L9:
        e = move-exception;
        Log.w("SyncBitmapLoader", "decodeBitmap failed", e);
        lw1 r4 = new lw1();
        r4.m(e);
        return r4;
    }

    public String toString() {
        switch(this.n) {
            case 9: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder(32);
        r0.append((String) this.o);
        r0.append('{');
        c12 r4 = (c12) ((c12) this.p).q;
        String r1 = "";
    L7:
        if (r4 == null) goto L17;
        Object r2 = r4.p;
        r0.append(r1);
        String r3 = (String) r4.o;
        if (r3 == null) goto L11;
        r0.append(r3);
        r0.append('=');
    L11:
        if (r2 != null) goto L13;
    L15:
        r0.append(r2);
    L16:
        r4 = (c12) r4.q;
        r1 = ", ";
        goto L7
    L13:
        if (r2.getClass().isArray() == false) goto L15;
        String r5 = Arrays.deepToString(new Object[]{r2});
        r0.append(r5, 1, r5.length() - 1);
        goto L16
    L17:
        r0.append('}');
        return r0.toString();
    L5:
        return super.toString();
    }

    public ns3(String r3) {
        this.n = 9;
        c12 r0 = new c12(11);
        this.p = r0;
        this.q = r0;
        this.o = r3;
    }

    public ns3(Context r2) {
        this.n = 8;
        this.o = r2;
        this.p = new LruCache(20);
        ExecutorService r3 = Executors.newFixedThreadPool(2);
        r3.getClass();
        this.q = r3;
    }

    public /* synthetic */ ns3(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    public ns3(AppDatabase r3) {
        this.n = 0;
        this.q = new i80(22);
        this.o = r3;
        this.p = new q20(7, this);
    }
}
