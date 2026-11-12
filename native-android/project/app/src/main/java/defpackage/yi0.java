package defpackage;

import android.util.Log;
import com.bumptech.glide.Registry$NoResultEncoderAvailableException;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class yi0 {
    public final Class a;
    public final List b;
    public final d14 c;
    public final io3 d;
    public final String e;

    public yi0(Class r1, Class r2, Class r3, List r4, d14 r5, io3 r6) {
        this.a = r1;
        this.b = r4;
        this.c = r5;
        this.d = r6;
        this.e = "Failed DecodePath{" + r1.getSimpleName() + "->" + r2.getSimpleName() + "->" + r3.getSimpleName() + "}";
    }

    public final q04 a(int r18, int r19, x7 r20, yh0 r21, db3 r22) {
        io3 r7 = this.d;
        Object r1 = r7.b();
        h12.f(r1, "Argument must not be null");
        List r5 = (List) r1;
        q04 r2 = b(r21, r18, r19, r22, r5);     // Catch: Throwable -> L61
        r7.a(r5);
        xi0 r3 = (xi0) r20.p;
        int r4 = r20.o;
        wi0 r6 = r3.n;
        Class<?> r13 = r2.get().getClass();
        if (r4 == 4) goto L7;
        uw4 r8 = r6.e(r13);
        uw4 r12 = r8;
        q04 r15 = r8.a(r3.u, r2, r3.y, r3.z);
    L9:
        if (r2.equals(r15) == true) goto L12;
        r2.b();
    L12:
        if (r6.c.a().d.a(r15.e()) == null) goto L18;
        w04 r9 = r6.c.a().d.a(r15.e());
        if (r9 == null) goto L16;
        int r10 = r9.l(r3.B);
    L19:
        f42 r11 = r3.I;
        ArrayList r14 = r6.b();
        int r16 = r14.size();
        int r17 = 0;
    L21:
        if (r17 >= r16) goto L26;
        if (((tw2) r14.get(r17)).a.equals(r11) == true) goto L24;
        r17 = r17 + 1;
        goto L21
    L24:
        boolean r23 = true;
    L28:
        switch(r3.A.a) {
            case 0: goto L36;
            case 1: goto L34;
            case 2: goto L34;
            default: goto L29;
        };
    L29:
        if (r23 == true) goto L31;
        if (r4 != 3) goto L31;
    L32:
        if (r10 != 2) goto L34;
    L33:
        boolean r24 = true;
    L40:
        if (r24 == false) goto L60;
        if (r9 == null) goto L57;
        int r25 = xa3.w(r10);
        if (r25 == 0) goto L55;
        if (r25 != 1) goto L46;
        boolean r26 = false;
        Object r27 = new s04(r6.c.a, r3.I, r3.v, r3.y, r3.z, r12, r13, r3.B);
    L56:
        de2 r28 = (de2) de2.r.b();
        r28.q = r26;
        r28.p = true;
        r28.o = r15;
        jv3 r29 = r3.s;
        r29.n = r27;
        r29.o = r9;
        r29.p = r28;
        r15 = r28;
        goto L60
    L46:
        if (r10 == 1) goto L52;
        if (r10 == 2) goto L51;
        if (r10 == 3) goto L50;
        String r0 = "null";
    L53:
        kf2.n("Unknown strategy: ".concat(r0));
        return null;
    L50:
        r0 = "NONE";
        goto L53
    L51:
        r0 = "TRANSFORMED";
        goto L53
    L52:
        r0 = "SOURCE";
        goto L53
    L55:
        r26 = false;
        r27 = new qh0(r3.I, r3.v);
        goto L56
    L57:
        final Class<?> r30 = r15.get().getClass();
        throw new Registry$NoResultEncoderAvailableException(r30);
    L60:
        return this.c.q(r15, r22);
    L31:
        if (r4 == 1) goto L32;
    L34:
        r24 = false;
        goto L40
    L36:
        if (r4 == 4) goto L34;
        if (r4 == 5) goto L34;
    L26:
        r23 = false;
        goto L28
    L16:
        final Class r31 = r15.e();
        throw new Registry$NoResultEncoderAvailableException(r31);
    L18:
        r10 = 3;
        r9 = null;
        goto L19
    L7:
        r15 = r2;
        r12 = null;
    L61:
        th = move-exception;
        r7.a(r5);
        throw th;
    }

    public final q04 b(yh0 r10, int r11, int r12, db3 r13, List r14) {
        List r0 = this.b;
        int r1 = r0.size();
        q04 r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L21;
        t04 r4 = (t04) r0.get(r3);
    L9:
        e = move-exception;
        if (Log.isLoggable("DecodePath", 2) == false) goto L17;
        Log.v("DecodePath", "Failed to decode data for " + r4, e);
    L17:
        r14.add(e);
    L18:
        if (r2 != null) goto L21;
        r3 = r3 + 1;
        goto L3
    L6:
        if (r4.a(r10.l(), r13) == false) goto L18;
        r2 = r4.b(r10.l(), r11, r12, r13);     // Catch: Throwable -> L9 RuntimeException -> L11 IOException -> L13
    L21:
        if (r2 == null) goto L24;
        return r2;
    L24:
        throw new GlideException(this.e, new ArrayList(r14));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
