package defpackage;

import android.os.SystemClock;
import com.google.gson.JsonIOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kf2 implements qc2, eg1, px, ez, ks0 {
    public static final kf2 o = null;
    public static final kf2 p = null;
    public final /* synthetic */ int n;

    static {
        o = new kf2(0);
        p = new kf2(1);
    }

    public /* synthetic */ kf2(int r1) {
        this.n = r1;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static /* synthetic */ void e(Object r1) {
        throw new IllegalArgumentException(r1.toString());
    }

    public static /* synthetic */ void f(Object r2, String r3) {
        throw new JsonIOException(r3 + r2.toString());
    }

    public static /* synthetic */ void g(Object r0, StringBuilder r1) {
        r1.append(r0);
        throw new IllegalArgumentException(r1.toString());
    }

    public static /* synthetic */ void h(String r1) {
        throw new IndexOutOfBoundsException(r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(String r1, int r2, int r3) {
        throw new IllegalArgumentException((r1 + r2 + r3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String r2, Object r3, Object r4, Object r5, int r6) {
        throw new IllegalArgumentException(r2 + r3 + r4 + r5 + r6);
    }

    public static /* synthetic */ void k() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void l(Object r1, String r2) {
        throw new IllegalArgumentException(r2 + r1);
    }

    public static /* synthetic */ void m(String r1) {
        throw new NoSuchElementException(r1);
    }

    public static /* synthetic */ void n(String r1) {
        throw new IllegalArgumentException(r1);
    }

    public static /* synthetic */ void o(String r1) {
        throw new IllegalStateException(r1);
    }

    public List a(boolean r1, boolean r2, String r3) {
        return jk2.e(r1, r2, r3);
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r3) {
        switch(this.n) {
            case 14: goto L11;
            case 26: goto L10;
            default: goto L4;
        };
    L4:
        long r2 = ((lg0) r3).b;
        if (r2 != (-9223372036854775807L)) goto L8;
        r2 = 0;
    L8:
        return Long.valueOf(r2);
    L11:
        k51 r4 = (k51) r3;
        r4.getClass();
        return r4.getClass().getSimpleName();
    L10:
        return Integer.valueOf(((ig0) r3).r);
    }

    @Override // defpackage.ks0
    public double b(double r11) {
        switch(this.n) {
            case 19: goto L23;
            case 20: goto L13;
            case 21: goto L10;
            case 22: goto L8;
            case 23: goto L6;
            default: goto L4;
        };
    L4:
        float[] r10 = s50.a;
        return s50.c(s50.d, r11);
    L6:
        float[] r12 = s50.a;
        return s50.d(s50.d, r11);
    L8:
        float[] r13 = s50.a;
        return s50.a(s50.c, r11);
    L10:
        float[] r14 = s50.a;
        return s50.b(s50.c, r11);
    L13:
        if (r11 >= 0.0d) goto L15;
        double r0 = -r11;
    L17:
        if (r0 < 0.04045d) goto L19;
        double r1 = Math.pow((0.9478672985781991d * r0) + 0.05213270142180095d, 2.4d);
    L21:
        return Math.copySign(r1, r11);
    L19:
        r1 = r0 * 0.07739938080495357d;
        goto L21
    L15:
        r0 = r11;
        goto L17
    L23:
        if (r11 >= 0.0d) goto L25;
        double r2 = -r11;
    L27:
        if (r2 < 0.0031308049535603718d) goto L29;
        double r3 = (Math.pow(r2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d;
    L31:
        return Math.copySign(r3, r11);
    L29:
        r3 = r2 / 0.07739938080495357d;
        goto L31
    L25:
        r2 = r11;
        goto L27
    }

    @Override // defpackage.ez
    public void cancel() {
    }

    @Override // defpackage.px
    public String d(ii0 r1) {
        String r0 = r1.h;
        if (r0 == null) goto L6;
        return r0;
    L6:
        return r1.a.toString();
    }

    @Override // defpackage.qc2
    public void invoke(Object r13) {
        switch(this.n) {
            case 5: goto L26;
            case 6: goto L22;
            case 7: goto L13;
            case 8: goto L8;
            default: goto L4;
        };
    L4:
        rm r12 = ((oj0) r13).a.n;
        if (r12 == null) goto L37;
        r12.s();
        return;
    L37:
        return;
    L8:
        pj0 r14 = (pj0) r13;
        tj0 r15 = r14.b;
        if (r14 != r15.j) goto L38;
        r15.N = true;
        return;
    L38:
        return;
    L13:
        pj0 r16 = (pj0) r13;
        tj0 r17 = r16.b;
        if (r16 != r17.j) goto L41;
        rm r18 = r17.n;
        if (r18 != null) goto L19;
        return;
    L19:
        if (r17.O == false) goto L40;
        r18.x();
        return;
    L40:
        return;
    L41:
        return;
    L22:
        pj0 r19 = (pj0) r13;
        r19.getClass();
        tj0.c0.getAndDecrement();
        rm r110 = r19.b.n;
        if (r110 == null) goto L42;
        int r111 = r19.a.a;
        r110.f(new pa(15));
        return;
    L42:
        return;
    L26:
        pj0 r112 = (pj0) r13;
        tj0 r113 = r112.b;
        if (r112 == r113.j) goto L30;
        return;
    L30:
        if (r113.n == null) goto L43;
        qj0 r114 = r113.p;
        int r0 = r114.b;
        if (r0 == (-1)) goto L34;
        long r1 = ((em) r114.e).f / r0;
        an r115 = r113.t;
        r115.getClass();
        long r2 = f35.Y(r115.a.getSampleRate(), r1);
    L35:
        r113.n.q(((em) r113.p.e).f, f35.i0(r2), SystemClock.elapsedRealtime() - r113.W);
        return;
    L34:
        r2 = -9223372036854775807L;
        goto L35
    }
}
