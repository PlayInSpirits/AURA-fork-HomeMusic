package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Set;
import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class e10 implements q81 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Serializable o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public e10(jx3 r2, q81 r3, String[] r4, int[] r5) {
        this.n = 2;
        this.o = r2;
        this.r = r3;
        this.p = r4;
        this.q = r5;
    }

    public Object a(int[] r18, vd0 r19) {
        e10 r0 = this;
        int[] r1 = r18;
        String[] r3 = (String[]) r0.p;
        q81 r4 = (q81) r0.r;
        if ((r19 instanceof cy4) == false) goto L7;
        cy4 r5 = (cy4) r19;
        int r6 = r5.r;
        if ((r6 & Integer.MIN_VALUE) == 0) goto L7;
        r5.r = r6 - Integer.MIN_VALUE;
    L8:
        Object r2 = r5.p;
        int r7 = r5.r;
        Object r8 = null;
        if (r7 == 0) goto L16;
        if (r7 == 1) goto L15;
        if (r7 == 2) goto L15;
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        int[] r9 = r5.o;
        e10 r10 = r5.n;
        kb4.X(r2);
        r1 = r9;
        r0 = r10;
    L36:
        ((jx3) r0.o).n = r1;
        return j15.a;
    L16:
        kb4.X(r2);
        jx3 r11 = (jx3) r0.o;
        Object r12 = r11.n;
        xe0 r13 = xe0.n;
        if (r12 != null) goto L21;
        Set r14 = ti.t0(r3);
        r5.n = r0;
        r5.o = r1;
        r5.r = 1;
        if (r4.b(r14, r5) != r13) goto L36;
    L35:
        return r13;
    L21:
        int[] r15 = (int[]) r0.q;
        ArrayList r16 = new ArrayList();
        int r17 = r3.length;
        int r110 = 0;
        int r111 = 0;
    L22:
        if (r110 >= r17) goto L32;
        String r112 = r3[r110];
        int r113 = r111 + 1;
        Object r114 = r8;
        Object r20 = r11.n;
        if (r20 == null) goto L29;
        int r115 = r15[r111];
        if (((int[]) r20)[r115] == r1[r115]) goto L28;
        r16.add(r112);
    L28:
        r110 = r110 + 1;
        r8 = r114;
        r111 = r113;
        goto L22
    L29:
        kf2.o("Required value was null.");
        return r114;
    L32:
        if (r16.isEmpty() == true) goto L36;
        Set r21 = q40.T0(r16);
        r5.n = r0;
        r5.o = r1;
        r5.r = 2;
        if (r4.b(r21, r5) != r13) goto L36;
    L7:
        r5 = new cy4(r0, r19);
        goto L8
    }

    @Override // defpackage.q81
    public final Object b(Object r8, vd0 r9) {
        int r0 = this.n;
        j15 r1 = j15.a;
        boolean r2 = true;
        Serializable r3 = this.o;
        switch(r0) {
            case 0: goto L53;
            case 1: goto L6;
            default: goto L5;
        };
    L6:
        q02 r10 = (q02) r8;
        hx3 r11 = (hx3) this.q;
        hx3 r4 = (hx3) this.p;
        hx3 r5 = (hx3) r3;
        if ((r10 instanceof bq3) == false) goto L10;
        r5.n++;
    L27:
        int r12 = r5.n;
        boolean r6 = false;
        if (r12 <= 0) goto L30;
        boolean r13 = true;
    L32:
        if (r4.n <= 0) goto L34;
        boolean r7 = true;
    L36:
        if (r11.n <= 0) goto L38;
        boolean r14 = true;
    L39:
        ck0 r15 = (ck0) this.r;
        if (r15.C == r13) goto L43;
        r15.C = r13;
        r6 = true;
    L43:
        if (r15.D == r7) goto L46;
        r15.D = r7;
        r6 = true;
    L46:
        if (r15.E == r14) goto L48;
        r15.E = r14;
    L49:
        if (r2 == false) goto L51;
        jz4.z(r15);
    L51:
        return r1;
    L48:
        r2 = r6;
        goto L49
    L38:
        r14 = false;
        goto L39
    L34:
        r7 = false;
        goto L36
    L30:
        r13 = false;
        goto L32
    L10:
        if ((r10 instanceof cq3) == false) goto L13;
        r5.n--;
        goto L27
    L13:
        if ((r10 instanceof aq3) == false) goto L16;
        r5.n--;
        goto L27
    L16:
        if ((r10 instanceof wp1) == false) goto L19;
        r4.n++;
        goto L27
    L19:
        if ((r10 instanceof xp1) == false) goto L22;
        r4.n--;
        goto L27
    L22:
        if ((r10 instanceof p91) == false) goto L25;
        r11.n++;
        goto L27
    L25:
        if ((r10 instanceof q91) == false) goto L27;
        r11.n--;
        goto L27
    L5:
        return a((int[]) r8, r9);
    L53:
        if ((r9 instanceof d10) == false) goto L57;
        d10 r16 = (d10) r9;
        int r17 = r16.r;
        if ((r17 & Integer.MIN_VALUE) == 0) goto L57;
        r16.r = r17 - Integer.MIN_VALUE;
    L58:
        Object r18 = r16.p;
        int r19 = r16.r;
        if (r19 == 0) goto L63;
        if (r19 != 1) goto L62;
        r8 = r16.o;
        e10 this = r16.n;
        kb4.X(r18);
    L68:
        ((jx3) this.o).n = fu.G((we0) this.p, null, ze0.q, new c10((f10) this.q, (q81) this.r, r8, null), 1);
        return r1;
    L62:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L63:
        kb4.X(r18);
        s22 r20 = (s22) ((jx3) r3).n;
        if (r20 == null) goto L68;
        r20.f(new ChildCancelledException());
        r16.n = this;
        r16.o = r8;
        r16.r = 1;
        Object r21 = r20.R(r16);
        xe0 r22 = xe0.n;
        if (r21 != r22) goto L68;
        return r22;
    L57:
        r16 = new d10(this, r9);
        goto L58
    }

    public /* synthetic */ e10(Serializable r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }
}
