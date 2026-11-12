package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zr2 implements wc0, it2, ht2, eg1, kv1, oz2 {
    public final /* synthetic */ int n;

    public /* synthetic */ zr2(String r1) {
        this.n = 8;
    }

    public static /* synthetic */ void c(int r1, String r2) {
        throw new IllegalStateException(r2 + r1);
    }

    @Override // defpackage.oz2
    public void a(ValueAnimator r1, View r2) {
        switch(this.n) {
            case 28: goto L6;
            default: goto L4;
        };
    L4:
        r2.setTranslationY(((Float) r1.getAnimatedValue()).floatValue());
        return;
    L6:
        r2.setTranslationX(((Float) r1.getAnimatedValue()).floatValue());
    }

    @Override // defpackage.wc0
    public void accept(Object r1) {
        al3 r2 = (al3) r1;
        switch(this.n) {
            case 1: goto L32;
            case 2: goto L30;
            case 3: goto L28;
            case 4: goto L26;
            case 5: goto L24;
            case 6: goto L22;
            case 7: goto L20;
            case 8: goto L4;
            case 9: goto L18;
            case 10: goto L16;
            case 11: goto L14;
            case 12: goto L4;
            case 13: goto L4;
            case 14: goto L12;
            case 15: goto L10;
            case 16: goto L8;
            case 17: goto L6;
            default: goto L4;
        };
    L4:
        r2.r();
        return;
    L6:
        r2.b();
        return;
    L8:
        r2.C();
        return;
    L10:
        r2.a0();
        return;
    L12:
        r2.stop();
        return;
    L14:
        r2.G();
        return;
    L16:
        r2.H0();
        return;
    L18:
        r2.I0();
        return;
    L20:
        r2.A();
        return;
    L22:
        r2.S();
        return;
    L24:
        r2.J0();
        return;
    L26:
        r2.C0();
        return;
    L28:
        r2.c0();
        return;
    L30:
        r2.c();
        return;
    L32:
        r2.A0();
    }

    @Override // defpackage.eg1
    /* JADX INFO: renamed from: apply */
    public Object mo77apply(Object r6) {
        int r0 = 0;
        boolean r1 = true;
        switch(this.n) {
            case 21: goto L46;
            case 22: goto L12;
            case 23: goto L11;
            case 24: goto L9;
            case 25: goto L7;
            default: goto L5;
        };
    L12:
        Collection r7 = (Collection) r6;
        int r5 = hx1.q;
        if ((r7 instanceof hx1) == true) goto L79;
        boolean r2 = r7 instanceof hx1;
        if (r2 == false) goto L18;
        int r3 = ((gx1) ((my3) ((hx1) r7)).i()).size();
    L19:
        fx1 r8 = new fx1();
        r8.b = false;
        q73 r4 = new q73();
        r4.d(r3);
        r8.a = r4;
        if (r2 == false) goto L37;
        hx1 r9 = (hx1) r7;
        if ((r9 instanceof my3) == false) goto L24;
        q73 r10 = ((my3) r9).r;
    L25:
        if (r10 == null) goto L33;
        r4.a(Math.max(r4.c, r10.c));
        if (r10.c != 0) goto L29;
        r0 = -1;
    L29:
        if (r0 < 0) goto L41;
        rr2.q(r0, r10.c);
        Object r11 = r10.a[r0];
        rr2.q(r0, r10.c);
        r8.c(r10.b[r0], r11);
        r0 = r0 + 1;
        if (r0 < r10.c) goto L29;
        r0 = -1;
    L41:
        Objects.requireNonNull(r8.a);
        if (r8.a.c == 0) goto L80;
        r8.b = true;
        return new my3(r8.a);
    L80:
        return my3.u;
    L33:
        jx1 r12 = r9.j();
        q73 r13 = r8.a;
        r13.a(Math.max(r13.c, r12.size()));
        Iterator r14 = r9.j().iterator();
    L35:
        if (r14.hasNext() == false) goto L41;
        p73 r15 = (p73) r14.next();
        r8.c(r15.a(), r15.a);
        goto L35
    L24:
        r10 = null;
        goto L25
    L37:
        Iterator r16 = r7.iterator();
    L39:
        if (r16.hasNext() == false) goto L41;
        r8.a(r16.next());
        goto L39
    L18:
        r3 = 11;
        goto L19
    L79:
        return (hx1) r7;
    L46:
        String r17 = (String) r6;
        n10 r18 = iu2.g;
        r18.getClass();
        int r19 = r17.length() - 1;
    L47:
        if (r19 < 0) goto L52;
        if (r18.c(r17.charAt(r19)) == false) goto L50;
        r19 = r19 - 1;
        goto L47
    L50:
        r1 = false;
    L52:
        if (r1 == true) goto L54;
    L56:
        StringBuilder r20 = new StringBuilder(r17.length() + 16);
        r20.append('\"');
    L58:
        if (r0 >= r17.length()) goto L65;
        char r21 = r17.charAt(r0);
        if (r21 == '\r') goto L63;
        if (r21 == '\\') goto L63;
        if (r21 == '\"') goto L63;
    L64:
        r20.append(r21);
        r0 = r0 + 1;
    L63:
        r20.append('\\');
        goto L64
    L65:
        r20.append('\"');
        return r20.toString();
    L54:
        if (r17.isEmpty() == true) goto L56;
        return r17;
    L5:
        return (pv4) r6;
    L7:
        return yw1.k(hw.P(new tb4(10), ((no2) r6).n().b));
    L9:
        return Long.valueOf(((lg0) r6).c);
    L11:
        return Long.valueOf(((lg0) r6).b);
    }

    @Override // defpackage.ht2
    public void b(al3 r1, fr2 r2, List r3) {
        switch(this.n) {
            case 12: goto L6;
            default: goto L4;
        };
    L4:
        r1.w0(r3);
        return;
    L6:
        r1.w0(r3);
    }

    @Override // defpackage.kv1
    public boolean d(int r3, int r4, int r5, int r6, int r7) {
        if (r4 == 67) goto L5;
    L9:
        if (r4 == 77) goto L11;
        return false;
    L11:
        if (r5 != 76) goto L23;
        if (r6 == 76) goto L14;
        return false;
    L14:
        if (r7 == 84) goto L21;
        if (r3 != 2) goto L25;
        return true;
    L25:
        return false;
    L21:
        return true;
    L23:
        return false;
    L5:
        if (r5 != 79) goto L9;
        if (r6 != 77) goto L9;
        if (r7 == 77) goto L16;
        if (r3 != 2) goto L9;
        return true;
    L16:
        return true;
    }

    @Override // defpackage.it2
    public Object h(tn2 r2, fr2 r3, int r4) {
        switch(this.n) {
            case 8: goto L6;
            default: goto L5;
        };
    L6:
        pq r1 = r2.D;
        r2.B(r3);
        r1.getClass();
        mw1 r5 = new mw1(m92.b(-6));
        r5.f(new sn2(r2, r5, r3, 0), new rn2(r2, 0));
        return r5;
    L5:
        return r2.w(r3);
    }

    public /* synthetic */ zr2(int r1) {
        this.n = r1;
    }

    public /* synthetic */ zr2(String r1, jn2 r2) {
        this.n = 19;
    }
}
