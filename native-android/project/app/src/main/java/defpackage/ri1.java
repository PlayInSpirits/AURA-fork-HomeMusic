package defpackage;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ri1 extends Handler {
    public final ArrayList a;
    public final ArrayList b;
    public final /* synthetic */ ui1 c;

    public ri1(ui1 r1) {
        this.c = r1;
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public static void a(sq2 r3, int r4, Object r5) {
        yq2 r0 = r3.a;
        uo r1 = r3.b;
        int r2 = 65280 & r4;
        if (r2 == 256) goto L27;
        if (r2 != 512) goto L7;
        vq2 r6 = (vq2) r5;
        switch(r4) {
            case 513: goto L24;
            case 514: goto L22;
            case 515: goto L20;
            default: goto L72;
        };
    L20:
        r1.E();
        return;
    L22:
        r1.F();
        return;
    L24:
        r1.D();
        return;
    L72:
        return;
    L7:
        if (r2 == 768) goto L10;
        return;
    L10:
        if (r4 != 769) goto L71;
        if (r5 != null) goto L15;
        r1.M();
        return;
    L15:
        kf2.k();
        return;
    L71:
        return;
    L27:
        if (r4 != 264) goto L29;
    L38:
        wq2 r7 = ((ti1) r5).a;
    L39:
        if (r7 != null) goto L41;
        return;
    L41:
        if ((r3.d & 2) == 0) goto L43;
    L47:
        switch(r4) {
            case 257: goto L67;
            case 258: goto L65;
            case 259: goto L63;
            case 260: goto L61;
            case 261: goto L59;
            case 262: goto L57;
            case 263: goto L55;
            case 264: goto L53;
            case 265: goto L51;
            case 266: goto L49;
            default: goto L73;
        };
    L49:
        r1.getClass();
        return;
    L51:
        r1.getClass();
        return;
    L53:
        r1.J(r7);
        return;
    L55:
        r1.K();
        return;
    L57:
        r1.J(r7);
        return;
    L59:
        r1.getClass();
        return;
    L61:
        r1.L(r7);
        return;
    L63:
        r1.H(r7);
        return;
    L65:
        r1.I();
        return;
    L67:
        r1.G();
        return;
    L73:
        return;
    L43:
        if (r7.h(r3.c) == true) goto L47;
        yq2.c().getClass();
        return;
    L29:
        if (r4 == 262) goto L38;
        if (r4 != 265) goto L34;
    L36:
        r5.getClass();
        kf2.k();
        return;
    L34:
        if (r4 == 266) goto L36;
        r7 = (wq2) r5;
        goto L39
    }

    public final void b(int r1, Object r2) {
        obtainMessage(r1, r2).sendToTarget();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message r9) {
        ArrayList r0 = this.a;
        ui1 r1 = this.c;
        ArrayList r2 = r1.g;
        vg3 r3 = r1.r;
        int r4 = r9.what;
        Object r10 = r9.obj;
        if (r4 == 259) goto L5;
    L7:
        int r6 = 0;
        ArrayList r8 = this.b;
        if (r4 != 262) goto L10;
        ti1 r5 = (ti1) r10;
        wq2 r7 = r5.a;
        if (r5.b == false) goto L27;
        r3.p(r7);
    L27:
        if (r1.t != null) goto L29;
    L51:
        int r11 = r2.size();     // Catch: Throwable -> L40
    L35:
        r11 = r11 - 1;     // Catch: Throwable -> L40
        if (r11 < 0) goto L43;
        yq2 r12 = (yq2) ((WeakReference) r2.get(r11)).get();     // Catch: Throwable -> L40
        if (r12 == null) goto L39;
        r0.addAll(r12.b);     // Catch: Throwable -> L40
        goto L35
    L39:
        r2.remove(r11);     // Catch: Throwable -> L40
        goto L35
    L43:
        int r13 = r0.size();     // Catch: Throwable -> L40
    L44:
        if (r6 >= r13) goto L47;
        Object r14 = r0.get(r6);     // Catch: Throwable -> L40
        r6 = r6 + 1;     // Catch: Throwable -> L40
        a((sq2) r14, r4, r10);     // Catch: Throwable -> L40
        goto L44
    L47:
        r0.clear();
        return;
    L40:
        th = move-exception;
        r0.clear();
        throw th;
    L29:
        if (r7.d() == false) goto L51;
        int r15 = r8.size();
        int r16 = 0;
    L31:
        if (r16 >= r15) goto L33;
        Object r17 = r8.get(r16);
        r16 = r16 + 1;
        r3.o((wq2) r17);
        goto L31
    L33:
        r8.clear();
        goto L51
    L10:
        if (r4 == 264) goto L20;
        switch(r4) {
            case 257: goto L19;
            case 258: goto L18;
            case 259: goto L13;
            default: goto L51;
        };
    L13:
        wq2 r18 = (wq2) r10;
        r3.getClass();
        if (r18.c() == r3) goto L51;
        int r19 = r3.k(r18);
        if (r19 < 0) goto L51;
        vg3.t((yg3) r3.E.get(r19));
        goto L51
    L18:
        r3.o((wq2) r10);
        goto L51
    L19:
        r3.n((wq2) r10);
        goto L51
    L20:
        ti1 r20 = (ti1) r10;
        wq2 r21 = r20.a;
        r8.add(r21);
        r3.n(r21);
        if (r20.b == false) goto L51;
        r3.p(r21);
        goto L51
    L5:
        if (r1.g().c.equals(((wq2) r10).c) == false) goto L7;
        r1.o(true);
        goto L7
    }
}
