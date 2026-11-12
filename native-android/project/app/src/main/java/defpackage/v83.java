package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v83 {
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;

    public v83(boolean r2) {
        this.a = new ArrayList();
        this.b = r2;
        this.c = new CopyOnWriteArrayList();
    }

    public abstract void a();

    public final void b() {
        CopyOnWriteArrayList r0 = this.c;
        Iterator r1 = r0.iterator();
        r1.getClass();
    L3:
        int r3 = 0;
        if (r1.hasNext() == false) goto L34;
        AutoCloseable r2 = (AutoCloseable) r1.next();
        if ((r2 instanceof AutoCloseable) == true) goto L7;
        if ((r2 instanceof ExecutorService) == true) goto L10;
        if ((r2 instanceof TypedArray) == true) goto L25;
        if ((r2 instanceof MediaMetadataRetriever) == true) goto L28;
        if ((r2 instanceof MediaDrm) == false) goto L32;
        ((MediaDrm) r2).release();
        goto L3
    L32:
        nz2.c();
        return;
    L28:
        ((MediaMetadataRetriever) r2).release();
        goto L3
    L25:
        ((TypedArray) r2).recycle();
        goto L3
    L10:
        ExecutorService r4 = (ExecutorService) r2;
        if (r4 == ForkJoinPool.commonPool()) goto L3;
        boolean r5 = r4.isTerminated();
        if (r5 == true) goto L3;
        r4.shutdown();
    L16:
        if (r5 == true) goto L21;
        r5 = r4.awaitTermination(1, TimeUnit.DAYS);     // Catch: InterruptedException -> L19
    L19:
        if (r3 != 0) goto L16;
        r4.shutdownNow();
        r3 = 1;
        goto L16
    L21:
        if (r3 == 0) goto L3;
        Thread.currentThread().interrupt();
        goto L3
    L7:
        r2.close();
        goto L3
    L34:
        r0.clear();
        ArrayList r8 = this.a;
        int r6 = r8.size();
    L35:
        if (r3 >= r6) goto L37;
        Object r7 = r8.get(r3);
        r3 = r3 + 1;
        ((u83) r7).a();
        goto L35
    L37:
        r8.clear();
    }

    public final void c(boolean r7) {
        this.b = r7;
        ArrayList r6 = this.a;
        int r0 = r6.size();
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L17;
        Object r3 = r6.get(r2);
        r2 = r2 + 1;
        u83 r4 = (u83) r3;
        if (r4.e == false) goto L8;
        if (r7 == false) goto L8;
        boolean r5 = true;
    L10:
        if (r4.b == r5) goto L3;
        r4.b = r5;
        bq4 r8 = r4.c;
        if (r8 == null) goto L3;
        w33 r9 = (w33) r8.o;
        if (r9 == null) goto L3;
        r9.b();
    L8:
        r5 = false;
        goto L10
    }
}
