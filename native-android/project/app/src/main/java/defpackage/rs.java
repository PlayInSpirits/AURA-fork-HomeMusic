package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rs implements t04 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public rs(Resources r2, t04 r3) {
        this.a = 0;
        this.c = r2;
        this.b = r3;
    }

    @Override // defpackage.t04
    public final boolean a(Object r2, db3 r3) {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        InputStream r4 = (InputStream) r2;
        return true;
    L7:
        return "android.resource".equals(((Uri) r2).getScheme());
    L9:
        return ((t04) this.b).a(r2, r3);
    }

    @Override // defpackage.t04
    public final q04 b(Object r12, int r13, int r14, db3 r15) {
        switch(this.a) {
            case 0: goto L48;
            case 1: goto L43;
            default: goto L4;
        };
    L4:
        InputStream r16 = (InputStream) r12;
        if ((r16 instanceof aw3) == false) goto L7;
        aw3 r17 = (aw3) r16;
        boolean r2 = false;
    L8:
        ArrayDeque r3 = n21.p;
        monitor-enter(r3);
        n21 r0 = (n21) r3.poll();     // Catch: Throwable -> L39
        monitor-exit(r3);     // Catch: Throwable -> L39
        if (r0 != null) goto L14;
        r0 = new n21();
    L14:
        n21 r4 = r0;
        r4.n = r17;
        mg2 r1 = new mg2(r4);
        wo0 r10 = new wo0(r17, r4);
        iu0 r5 = (iu0) this.b;     // Catch: Throwable -> L27
        ArrayList r11 = r5.d;     // Catch: Throwable -> L27
        qj0 r7 = r5.c;     // Catch: Throwable -> L27
        yc5 r6 = new yc5();     // Catch: Throwable -> L27
        h12.f(r7, "Argument must not be null");     // Catch: Throwable -> L27
        r6.o = r7;     // Catch: Throwable -> L27
        h12.f(r11, "Argument must not be null");     // Catch: Throwable -> L27
        r6.p = r11;     // Catch: Throwable -> L27
        r6.n = new hg3(r1, r7);     // Catch: Throwable -> L27
        at r18 = r5.a(r6, r13, r14, r15, r10);     // Catch: Throwable -> L27
        r4.o = null;
        r4.n = null;
        monitor-enter(r3);
        r3.offer(r4);     // Catch: Throwable -> L23
        monitor-exit(r3);     // Catch: Throwable -> L23
        if (r2 == false) goto L22;
        r17.f();
    L22:
        return r18;
    L23:
        th = move-exception;
        throw th;
    L27:
        th = move-exception;
        r4.o = null;
        r4.n = null;
        ArrayDeque r19 = n21.p;
        monitor-enter(r19);
        r19.offer(r4);     // Catch: Throwable -> L35
        if (r2 == false) goto L61;
        r17.f();
        throw th;
    L61:
        throw th;
    L35:
        th = move-exception;
        throw th;
    L39:
        th = move-exception;
        throw th;
    L7:
        r2 = true;
        r17 = new aw3(r16, (qj0) this.c);
        goto L8
    L43:
        q04 r110 = ((v04) this.b).c((Uri) r12, r15);
        if (r110 != null) goto L47;
        return null;
    L47:
        return vv0.a((zs) this.c, (Drawable) ((wh1) r110).get(), r13, r14);
    L48:
        q04 r111 = ((t04) this.b).b(r12, r13, r14, r15);
        Resources r112 = (Resources) this.c;
        if (r111 != null) goto L52;
        return null;
    L52:
        return new at(r112, r111);
    }

    public /* synthetic */ rs(int r1, Object r2, Object r3) {
        this.a = r1;
        this.b = r2;
        this.c = r3;
    }
}
