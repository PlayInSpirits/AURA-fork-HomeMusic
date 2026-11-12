package defpackage;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd0 implements pi1 {
    public final Object n;
    public volatile Object o;

    public sd0() {
        this.n = new CopyOnWriteArraySet();
    }

    public wq0 a() {
        if (((wq0) this.o) != null) goto L29;
        monitor-enter(this);
    L19:
        th = move-exception;
        throw th;
    L6:
        if (((wq0) this.o) != null) goto L22;
        e20 r0 = (e20) this.n;     // Catch: Throwable -> L19
        rm3 r1 = (rm3) r0.p;     // Catch: Throwable -> L19
        String r2 = (String) r1.o;     // Catch: Throwable -> L19
        File r3 = ((Context) r1.n).getCacheDir();     // Catch: Throwable -> L19
        lr0 r4 = null;
        if (r3 != null) goto L10;
        File r5 = null;
    L11:
        if (r5 != null) goto L14;
    L18:
        this.o = r4;     // Catch: Throwable -> L19
        goto L22
    L14:
        if (r5.isDirectory() == false) goto L16;
    L17:
        long r6 = r0.o;     // Catch: Throwable -> L19
        r4 = new lr0();     // Catch: Throwable -> L19
        r4.q = new rm3(7);     // Catch: Throwable -> L19
        r4.p = r5;     // Catch: Throwable -> L19
        r4.n = r6;     // Catch: Throwable -> L19
        r4.o = new qr2(17);     // Catch: Throwable -> L19
        goto L18
    L16:
        if (r5.mkdirs() == false) goto L18;
    L10:
        r5 = new File(r3, r2);     // Catch: Throwable -> L19
    L22:
        if (((wq0) this.o) != null) goto L24;
        this.o = new om0(6);     // Catch: Throwable -> L19
    L24:
        monitor-exit(this);     // Catch: Throwable -> L19
    L29:
        return (wq0) this.o;
    }

    @Override // defpackage.pi1
    public Object get() {
        if (this.o != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.o != null) goto L10;
        Object r0 = ((pi1) this.n).get();     // Catch: Throwable -> L8
        h12.f(r0, "Argument must not be null");     // Catch: Throwable -> L8
        this.o = r0;     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.o;
    }

    public /* synthetic */ sd0(Object r1) {
        this.n = r1;
    }
}
