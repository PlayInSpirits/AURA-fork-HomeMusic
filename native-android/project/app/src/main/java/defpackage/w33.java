package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 {
    public final nl4 a;
    public final nl4 b;
    public final vu3 c;
    public final ii d;
    public final ii e;
    public u83 f;
    public int g;
    public v33 h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;

    public w33() {
        this.a = ya4.a(x33.p);
        nl4 r0 = ya4.a(new u33());
        this.b = r0;
        this.c = new vu3(r0);
        this.d = new ii();
        this.e = new ii();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }

    public final void a(bq4 r3, v33 r4, int r5) {
        r3.getClass();
        if (r4.a == null) goto L5;
        StringBuilder r2 = new StringBuilder("Input '");
        r2.append(r4);
        bq4 r6 = r4.a;
        r2.append("' is already added to dispatcher ");
        r2.append(r6);
        r2.append('.');
        throw new IllegalArgumentException(r2.toString().toString());
    L5:
        if (r5 == 0) goto L9;
        if (r5 == 1) goto L8;
        LinkedHashSet r1 = this.i;
    L10:
        r1.add(r4);
        r4.a = r3;
        ((u33) this.c.n.getValue()).getClass();
        if (r5 == 0) goto L15;
        if (r5 == 1) goto L14;
        boolean r7 = this.n;
    L16:
        r4.b(r7);
        return;
    L14:
        r7 = this.l;
        goto L16
    L15:
        r7 = this.m;
        goto L16
    L8:
        r1 = this.j;
        goto L10
    L9:
        r1 = this.k;
        goto L10
    }

    public final void b() {
        boolean r0 = true;
        ii r2 = this.d;
        if (r2 != null) goto L5;
    L7:
        Iterator r3 = r2.iterator();
    L9:
        if (r3.hasNext() == false) goto L6;
        if (((u83) r3.next()).b == false) goto L9;
        boolean r4 = true;
    L14:
        ii r5 = this.e;
        if (r5 != null) goto L17;
    L19:
        Iterator r6 = r5.iterator();
    L21:
        if (r6.hasNext() == false) goto L18;
        if (((u83) r6.next()).b == false) goto L21;
        boolean r7 = true;
    L26:
        if (r4 == true) goto L30;
        if (r7 == true) goto L30;
        boolean r8 = false;
    L32:
        if (this.m == r4) goto L34;
        boolean r9 = true;
    L36:
        if (this.l == r7) goto L38;
        boolean r10 = true;
    L40:
        if (this.n != r8) goto L43;
        r0 = false;
    L43:
        LinkedHashSet r11 = this.k;
        if (r9 == false) goto L49;
        Iterator r12 = r11.iterator();
    L47:
        if (r12.hasNext() == false) goto L49;
        ((v33) r12.next()).b(r4);
    L49:
        LinkedHashSet r13 = this.j;
        if (r10 == false) goto L55;
        Iterator r14 = r13.iterator();
    L53:
        if (r14.hasNext() == false) goto L55;
        ((v33) r14.next()).b(r7);
    L55:
        LinkedHashSet r15 = this.i;
        if (r0 == false) goto L61;
        Iterator r1 = r15.iterator();
    L59:
        if (r1.hasNext() == false) goto L61;
        ((v33) r1.next()).b(r8);
    L61:
        this.m = r4;
        this.l = r7;
        this.n = r8;
        u83 r16 = this.f;
        if (r16 != null) goto L64;
        r16 = c(0);
    L64:
        u83 r17 = this.f;
        if (r17 != null) goto L68;
        r17 = c(0);
    L68:
        if (h12.c(r17, r16) == false) goto L96;
        if (r17 != null) goto L72;
        u33 r18 = new u33();
    L81:
        nl4 r19 = this.b;
        if (h12.c((u33) r19.getValue(), r18) == true) goto L111;
        r19.j(null, r18);
        Iterator r110 = r11.iterator();
    L86:
        if (r110.hasNext() == false) goto L88;
        ((v33) r110.next()).getClass();
        goto L86
    L88:
        Iterator r111 = r13.iterator();
    L90:
        if (r111.hasNext() == false) goto L92;
        ((v33) r111.next()).getClass();
        goto L90
    L92:
        Iterator r112 = r15.iterator();
    L94:
        if (r112.hasNext() == false) goto L112;
        ((v33) r112.next()).getClass();
        goto L94
    L112:
        return;
    L111:
        return;
    L72:
        ArrayList r20 = new ArrayList();
        Iterator<E> r21 = r2.iterator();
    L74:
        if (r21.hasNext() == false) goto L76;
        ((u83) r21.next()).getClass();
        goto L74
    L76:
        Iterator<E> r22 = r5.iterator();
    L78:
        if (r22.hasNext() == false) goto L80;
        ((u83) r22.next()).getClass();
        goto L78
    L80:
        w83 r23 = r17.a;
        qb2 r24 = gb.r();
        v40.n0(r20, r24);
        r24.add(r23);
        v40.n0(u01.n, r24);
        r18 = new u33(gb.f(r24), r20.size());
        goto L81
    L96:
        return;
    L38:
        r10 = false;
        goto L40
    L34:
        r9 = false;
    L30:
        r8 = true;
    L18:
        r7 = false;
        goto L26
    L17:
        if (r5.isEmpty() == false) goto L19;
    L6:
        r4 = false;
        goto L14
    L5:
        if (r2.isEmpty() == false) goto L7;
        goto L6
    }

    public final u83 c(int r4) {
        ii r1 = this.e;
        ii r3 = this.d;
        Object r2 = null;
        if (r4 == (-1)) goto L37;
        if (r4 != 0) goto L6;
        Iterator r5 = r3.iterator();
    L20:
        if (r5.hasNext() == false) goto L24;
        Object r6 = r5.next();
        if (((u83) r6).b == false) goto L20;
    L25:
        u83 r7 = (u83) r6;
        if (r7 != null) goto L36;
        Iterator r8 = r1.iterator();
    L29:
        if (r8.hasNext() == false) goto L35;
        Object r9 = r8.next();
        if (((u83) r9).b == false) goto L29;
        r2 = r9;
    L35:
        return (u83) r2;
    L36:
        return r7;
    L24:
        r6 = null;
        goto L25
    L6:
        if (r4 != 1) goto L17;
        Iterator r10 = r3.iterator();
    L9:
        if (r10.hasNext() == false) goto L11;
        ((u83) r10.next()).getClass();
        goto L9
    L11:
        Iterator r11 = r1.iterator();
    L13:
        if (r11.hasNext() == false) goto L15;
        ((u83) r11.next()).getClass();
        goto L13
    L15:
        return null;
    L17:
        throw new IllegalStateException(("Unsupported direction: '" + r4 + "'.").toString());
    L37:
        Iterator r12 = r3.iterator();
    L39:
        if (r12.hasNext() == false) goto L43;
        Object r13 = r12.next();
        if (((u83) r13).b == false) goto L39;
    L44:
        u83 r14 = (u83) r13;
        if (r14 != null) goto L54;
        Iterator r15 = r1.iterator();
    L48:
        if (r15.hasNext() == false) goto L53;
        Object r16 = r15.next();
        if (((u83) r16).b == false) goto L48;
        r2 = r16;
    L53:
        return (u83) r2;
    L54:
        return r14;
    L43:
        r13 = null;
        goto L44
    }
}
