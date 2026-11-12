package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sd implements Choreographer.FrameCallback {
    public final /* synthetic */ yc5 n;

    public sd(yc5 r1) {
        this.n = r1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r37) {
        td r0 = (td) ((zg5) this.n.n).n;
        long r1 = SystemClock.uptimeMillis();
        ArrayList r3 = r0.b;
        long r4 = SystemClock.uptimeMillis();
        int r7 = 0;
    L4:
        if (r7 >= r3.size()) goto L58;
        zj4 r8 = (zj4) r3.get(r7);
        if (r8 != null) goto L8;
    L7:
        r7 = r7;
    L56:
        r7 = r7 + 1;
        goto L4
    L8:
        yd4 r10 = r0.a;
        Long r11 = (Long) r10.get(r8);
        if (r11 != null) goto L12;
    L14:
        long r12 = r8.g;
        if (r12 != 0) goto L17;
        r8.g = r1;
        r8.a(r8.b);
        goto L7
    L17:
        long r19 = r1 - r12;
        r8.g = r1;
        boolean r13 = r8.m;
        float r14 = r8.l;
        if (r13 == true) goto L20;
        r7 = r7;
        ak4 r9 = r8.k;
        if (r14 == Float.MAX_VALUE) goto L27;
        double r15 = r9.i;
        long r34 = r19 / 2;
        yx0 r6 = r9.a(r8.b, r8.a, r34);
        ak4 r16 = r8.k;
        r16.i = r8.l;
        r8.l = Float.MAX_VALUE;
        yx0 r17 = r16.a(r6.a, r6.b, r34);
        r8.b = r17.a;
        r8.a = r17.b;
        float r18 = Float.MAX_VALUE;
        float r110 = -3.4028235E38f;
    L28:
        float r20 = Math.max(r8.b, r110);
        r8.b = r20;
        float r21 = Math.min(r20, r18);
        r8.b = r21;
        float r22 = r8.a;
        ak4 r111 = r8.k;
        r111.getClass();
        if (Math.abs(r22) < r111.e) goto L31;
    L33:
        boolean r23 = false;
    L34:
        float r24 = Math.min(r8.b, Float.MAX_VALUE);
        r8.b = r24;
        float r25 = Math.max(r24, r110);
        r8.b = r25;
        r8.a(r25);
        if (r23 == false) goto L56;
        ArrayList r26 = r8.i;
        r8.f = false;
        ThreadLocal r27 = td.f;
        if (r27.get() != null) goto L39;
        r27.set(new td());
    L39:
        td r28 = (td) r27.get();
        r28.a.remove(r8);
        ArrayList r29 = r28.b;
        int r112 = r29.indexOf(r8);
        if (r112 < 0) goto L42;
        r29.set(r112, null);
        r28.e = true;
    L42:
        r8.g = 0;
        r8.c = false;
        int r30 = 0;
    L44:
        if (r30 >= r26.size()) goto L50;
        if (r26.get(r30) != null) goto L48;
        r30 = r30 + 1;
        goto L44
    L48:
        r26.get(r30).getClass();
        kf2.k();
        return;
    L50:
        int r31 = r26.size() - 1;
    L51:
        if (r31 < 0) goto L56;
        if (r26.get(r31) != null) goto L55;
        r26.remove(r31);
    L55:
        r31 = r31 - 1;
        goto L51
    L31:
        if (Math.abs(r21 - ((float) r111.i)) >= r111.d) goto L33;
        r8.b = (float) r8.k.i;
        r8.a = 0.0f;
        r23 = true;
        goto L34
    L27:
        r18 = Float.MAX_VALUE;
        r110 = -3.4028235E38f;
        yx0 r32 = r9.a(r8.b, r8.a, r19);
        r8.b = r32.a;
        r8.a = r32.b;
        goto L28
    L20:
        if (r14 == Float.MAX_VALUE) goto L23;
        r8.k.i = r14;
        r8.l = Float.MAX_VALUE;
    L23:
        r8.b = (float) r8.k.i;
        r8.a = 0.0f;
        r8.m = false;
        r23 = true;
        r110 = -3.4028235E38f;
        goto L34
    L12:
        if (r11.longValue() >= r4) goto L7;
        r10.remove(r8);
        goto L14
    L58:
        if (r0.e == false) goto L67;
        int r2 = r3.size() - 1;
    L60:
        if (r2 < 0) goto L65;
        if (r3.get(r2) != null) goto L64;
        r3.remove(r2);
    L64:
        r2 = r2 - 1;
        goto L60
    L65:
        r0.e = false;
    L67:
        if (r3.size() > 0) goto L69;
        return;
    L69:
        if (r0.d != null) goto L71;
        r0.d = new yc5(r0.c);
    L71:
        yc5 r5 = r0.d;
        ((Choreographer) r5.o).postFrameCallback((sd) r5.p);
    }
}
