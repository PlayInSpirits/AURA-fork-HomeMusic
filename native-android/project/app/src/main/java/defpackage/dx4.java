package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dx4 implements Cloneable {
    public static final int[] H = null;
    public static final xi4 I = null;
    public static final ThreadLocal J = null;
    public int A;
    public boolean B;
    public boolean C;
    public ArrayList D;
    public ArrayList E;
    public cx F;
    public xi4 G;
    public final String n;
    public long o;
    public long p;
    public TimeInterpolator q;
    public final ArrayList r;
    public final ArrayList s;
    public bq4 t;
    public bq4 u;
    public kx4 v;
    public final int[] w;
    public ArrayList x;
    public ArrayList y;
    public final ArrayList z;

    static {
        H = new int[]{2, 1, 3, 4};
        I = new xi4(23);
        J = new ThreadLocal();
    }

    public dx4() {
        this.n = getClass().getName();
        this.o = -1;
        this.p = -1;
        this.q = null;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new bq4(12);
        this.u = new bq4(12);
        this.v = null;
        this.w = H;
        this.z = new ArrayList();
        this.A = 0;
        this.B = false;
        this.C = false;
        this.D = null;
        this.E = new ArrayList();
        this.G = I;
    }

    public static void b(bq4 r4, View r5, mx4 r6) {
        oi r0 = (oi) r4.n;
        oi r1 = (oi) r4.q;
        SparseArray r2 = (SparseArray) r4.o;
        xe2 r7 = (xe2) r4.p;
        r0.put(r5, r6);
        int r8 = r5.getId();
        if (r8 >= 0) goto L5;
    L8:
        WeakHashMap r9 = j65.a;
        String r10 = r5.getTransitionName();
        if (r10 == null) goto L15;
        if (r1.containsKey(r10) == false) goto L13;
        r1.put(r10, null);
        goto L15
    L13:
        r1.put(r10, r5);
    L15:
        if ((r5.getParent() instanceof ListView) == false) goto L26;
        ListView r11 = (ListView) r5.getParent();
        if (r11.getAdapter().hasStableIds() == false) goto L27;
        long r3 = r11.getItemIdAtPosition(r11.getPositionForView(r5));
        if (r7.c(r3) < 0) goto L24;
        View r12 = (View) r7.b(r3);
        if (r12 == null) goto L28;
        r12.setHasTransientState(false);
        r7.f(r3, null);
        return;
    L28:
        return;
    L24:
        r5.setHasTransientState(true);
        r7.f(r3, r5);
        return;
    L27:
        return;
    L26:
        return;
    L5:
        if (r2.indexOfKey(r8) < 0) goto L7;
        r2.put(r8, null);
        goto L8
    L7:
        r2.put(r8, r5);
        goto L8
    }

    public static oi n() {
        ThreadLocal r0 = J;
        oi r1 = (oi) r0.get();
        if (r1 != null) goto L6;
        oi r2 = new oi(0);
        r0.set(r2);
        return r2;
    L6:
        return r1;
    }

    public static boolean s(mx4 r0, mx4 r1, String r2) {
        Object r3 = r0.a.get(r2);
        Object r4 = r1.a.get(r2);
        if (r3 != null) goto L8;
        if (r4 != null) goto L8;
        return false;
    L8:
        if (r3 == null) goto L13;
        if (r4 == null) goto L13;
        return !r3.equals(r4);
    L13:
        return true;
    }

    public void A(xi4 r1) {
        if (r1 != null) goto L5;
        this.G = I;
        return;
    L5:
        this.G = r1;
    }

    public void B(cx r1) {
        this.F = r1;
    }

    public void C(long r1) {
        this.o = r1;
    }

    public final void D() {
        if (this.A != 0) goto L12;
        ArrayList r0 = this.D;
        if (r0 != null) goto L7;
    L11:
        this.C = false;
        goto L12
    L7:
        if (r0.size() <= 0) goto L11;
        ArrayList r1 = (ArrayList) this.D.clone();
        int r2 = r1.size();
        int r3 = 0;
    L9:
        if (r3 >= r2) goto L11;
        ((bx4) r1.get(r3)).a(this);
        r3 = r3 + 1;
    L12:
        this.A++;
    }

    public String E(String r7) {
        StringBuilder r8 = xa3.i(r7);
        r8.append(getClass().getSimpleName());
        r8.append("@");
        r8.append(Integer.toHexString(hashCode()));
        r8.append(": ");
        String r9 = r8.toString();
        if (this.p == (-1)) goto L6;
        r9 = b11.p(b11.s(r9, "dur("), this.p, ") ");
    L6:
        if (this.o == (-1)) goto L9;
        r9 = b11.p(b11.s(r9, "dly("), this.o, ") ");
    L9:
        if (this.q == null) goto L11;
        StringBuilder r10 = b11.s(r9, "interp(");
        r10.append(this.q);
        r10.append(") ");
        r9 = r10.toString();
    L11:
        ArrayList r0 = this.r;
        int r1 = r0.size();
        ArrayList r6 = this.s;
        if (r1 <= 0) goto L14;
    L17:
        String r11 = r9.concat("tgts(");
        int r3 = 0;
        if (r0.size() <= 0) goto L26;
        int r2 = 0;
    L21:
        if (r2 >= r0.size()) goto L26;
        if (r2 <= 0) goto L24;
        r11 = r11.concat(", ");
    L24:
        StringBuilder r12 = xa3.i(r11);
        r12.append(r0.get(r2));
        r11 = r12.toString();
        r2 = r2 + 1;
    L26:
        if (r6.size() <= 0) goto L33;
    L28:
        if (r3 >= r6.size()) goto L33;
        if (r3 <= 0) goto L31;
        r11 = r11.concat(", ");
    L31:
        StringBuilder r13 = xa3.i(r11);
        r13.append(r6.get(r3));
        r11 = r13.toString();
        r3 = r3 + 1;
    L33:
        return r11.concat(")");
    L14:
        if (r6.size() > 0) goto L17;
        return r9;
    }

    public void a(bx4 r2) {
        if (this.D != null) goto L5;
        this.D = new ArrayList();
    L5:
        this.D.add(r2);
    }

    public abstract void c(mx4 r1);

    public void cancel() {
        ArrayList r0 = this.z;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L5;
        ((Animator) r0.get(r1)).cancel();
        r1 = r1 - 1;
        goto L3
    L5:
        ArrayList r2 = this.D;
        if (r2 != null) goto L8;
        return;
    L8:
        if (r2.size() <= 0) goto L15;
        ArrayList r3 = (ArrayList) this.D.clone();
        int r4 = r3.size();
        int r5 = 0;
    L10:
        if (r5 >= r4) goto L16;
        ((bx4) r3.get(r5)).d();
        r5 = r5 + 1;
        goto L10
    L16:
        return;
    }

    public /* bridge */ /* synthetic */ Object clone() {
        return i();
    }

    public final void d(View r3, boolean r4) {
        if (r3 == null) goto L22;
        r3.getId();
        if ((r3.getParent() instanceof ViewGroup) == false) goto L15;
        mx4 r0 = new mx4(r3);
        if (r4 == false) goto L9;
        f(r0);
    L10:
        r0.c.add(this);
        e(r0);
        if (r4 == false) goto L13;
        b(this.t, r3, r0);
        goto L15
    L13:
        b(this.u, r3, r0);
        goto L15
    L9:
        c(r0);
    L15:
        if ((r3 instanceof ViewGroup) == false) goto L20;
        ViewGroup r5 = (ViewGroup) r3;
        int r1 = 0;
    L18:
        if (r1 >= r5.getChildCount()) goto L23;
        d(r5.getChildAt(r1), r4);
        r1 = r1 + 1;
        goto L18
    L23:
        return;
    L20:
        return;
    }

    public void e(mx4 r7) {
        if (this.F == null) goto L17;
        HashMap r0 = r7.a;
        if (r0.isEmpty() == true) goto L20;
        this.F.getClass();
        String[] r1 = cx.e;
        int r3 = 0;
    L8:
        if (r3 >= 2) goto L21;
        if (r0.containsKey(r1[r3]) == false) goto L11;
        r3 = r3 + 1;
        goto L8
    L11:
        this.F.getClass();
        View r6 = r7.b;
        Integer r8 = (Integer) r0.get("android:visibility:visibility");
        if (r8 != null) goto L14;
        r8 = Integer.valueOf(r6.getVisibility());
    L14:
        r0.put("android:visibilityPropagation:visibility", r8);
        int[] r9 = {r3, 0};
        r6.getLocationOnScreen(r9);
        int r4 = Math.round(r6.getTranslationX()) + r9[0];
        r9[0] = (r6.getWidth() / 2) + r4;
        int r5 = Math.round(r6.getTranslationY()) + r9[1];
        r9[1] = r5;
        r9[1] = (r6.getHeight() / 2) + r5;
        r0.put("android:visibilityPropagation:center", r9);
        return;
    L21:
        return;
    L20:
        return;
    }

    public abstract void f(mx4 r1);

    public final void g(ViewGroup r8, boolean r9) {
        h(r9);
        ArrayList r0 = this.r;
        int r1 = r0.size();
        ArrayList r2 = this.s;
        if (r1 <= 0) goto L5;
    L9:
        int r3 = 0;
        int r4 = 0;
    L11:
        if (r4 >= r0.size()) goto L24;
        View r5 = r8.findViewById(((Integer) r0.get(r4)).intValue());
        if (r5 == null) goto L22;
        mx4 r6 = new mx4(r5);
        if (r9 == false) goto L17;
        f(r6);
    L18:
        r6.c.add(this);
        e(r6);
        if (r9 == false) goto L21;
        b(this.t, r5, r6);
        goto L22
    L21:
        b(this.u, r5, r6);
        goto L22
    L17:
        c(r6);
    L22:
        r4 = r4 + 1;
    L24:
        if (r3 >= r2.size()) goto L34;
        View r10 = (View) r2.get(r3);
        mx4 r7 = new mx4(r10);
        if (r9 == false) goto L28;
        f(r7);
    L29:
        r7.c.add(this);
        e(r7);
        if (r9 == false) goto L32;
        b(this.t, r10, r7);
    L33:
        r3 = r3 + 1;
        goto L24
    L32:
        b(this.u, r10, r7);
        goto L33
    L28:
        c(r7);
        goto L29
    L34:
        return;
    L5:
        if (r2.size() > 0) goto L9;
        d(r8, r9);
    }

    public final void h(boolean r1) {
        if (r1 == false) goto L5;
        ((oi) this.t.n).clear();
        ((SparseArray) this.t.o).clear();
        ((xe2) this.t.p).a();
        return;
    L5:
        ((oi) this.u.n).clear();
        ((SparseArray) this.u.o).clear();
        ((xe2) this.u.p).a();
    }

    public dx4 i() {
        dx4 r3 = (dx4) super.clone();     // Catch: CloneNotSupportedException -> L5
        r3.E = new ArrayList();     // Catch: CloneNotSupportedException -> L5
        r3.t = new bq4(12);     // Catch: CloneNotSupportedException -> L5
        r3.u = new bq4(12);     // Catch: CloneNotSupportedException -> L5
        r3.x = null;     // Catch: CloneNotSupportedException -> L5
        r3.y = null;     // Catch: CloneNotSupportedException -> L5
        return r3;
    L5:
        return null;
    }

    public Animator j(ViewGroup r1, mx4 r2, mx4 r3) {
        return null;
    }

    public void k(ViewGroup r29, bq4 r30, bq4 r31, ArrayList r32, ArrayList r33) {
        oi r2 = n();
        SparseIntArray r3 = new SparseIntArray();
        int r4 = r32.size();
        long r5 = Long.MAX_VALUE;
        int r8 = 0;
    L3:
        if (r8 >= r4) goto L123;
        mx4 r10 = (mx4) r32.get(r8);
        mx4 r12 = (mx4) r33.get(r8);
        if (r10 != null) goto L7;
    L9:
        if (r12 != null) goto L11;
    L13:
        if (r10 != null) goto L16;
        if (r12 != null) goto L16;
    L15:
        r4 = r4;
        int r18 = r8;
    L121:
        r8 = r18 + 1;
        r4 = r4;
    L16:
        if (r10 == null) goto L20;
        if (r12 == null) goto L20;
        if (q(r10, r12) == false) goto L15;
    L20:
        Animator r14 = j(r29, r10, r12);
        if (r14 == null) goto L15;
        String r15 = this.n;
        if (r12 == null) goto L49;
        int r34 = 0;
        View r7 = r12.b;
        String[] r13 = o();
        if (r13 != null) goto L27;
    L47:
        r18 = r8;
        Animator r16 = r14;
        mx4 r6 = null;
    L48:
        r14 = r16;
        mx4 r17 = r6;
    L50:
        if (r14 == null) goto L121;
        cx r9 = this.F;
        if (r9 == null) goto L120;
        if (r10 != null) goto L57;
        if (r12 != null) goto L57;
        long r11 = 0;
    L119:
        r3.put(this.E.size(), (int) r11);
        r5 = Math.min(r11, r5);
    L57:
        if (r12 == null) goto L67;
        if (r10 != null) goto L60;
    L59:
        int r19 = 8;
    L64:
        if (r19 == 0) goto L67;
        int r20 = 1;
        r10 = r12;
    L69:
        if (r10 == null) goto L73;
        int[] r110 = (int[]) r10.a.get("android:visibilityPropagation:center");
        if (r110 == null) goto L73;
        int r111 = r110[r34];
    L75:
        if (r10 == null) goto L79;
        int[] r112 = (int[]) r10.a.get("android:visibilityPropagation:center");
        if (r112 == null) goto L79;
        int r113 = r112[1];
    L81:
        int[] r21 = new int[2];
        r29.getLocationOnScreen(r21);
        int r22 = Math.round(r29.getTranslationX()) + r21[r34];
        int r23 = Math.round(r29.getTranslationY()) + r21[1];
        int r24 = r29.getWidth() + r22;
        int r25 = r29.getHeight() + r23;
        int r26 = (r22 + r24) / 2;
        int r27 = (r23 + r25) / 2;
        int r114 = r9.a;
        int r28 = r113;
        if (r114 != 8388611) goto L89;
        WeakHashMap r115 = j65.a;
        if (r29.getLayoutDirection() != 1) goto L86;
    L85:
        r114 = 5;
    L93:
        if (r114 != 3) goto L95;
        int r35 = (r24 - r111) + Math.abs(r27 - r28);
    L105:
        float r36 = r35;
        int r37 = r9.a;
        if (r37 != 3) goto L108;
    L114:
        int r38 = r29.getWidth();
    L115:
        float r39 = r36 / r38;
        long r116 = this.p;
        if (r116 >= 0) goto L118;
        r116 = 300;
    L118:
        r11 = Math.round(((r116 * ((long) r20)) / 3.0f) * r39);
        goto L119
    L108:
        if (r37 == 5) goto L114;
        if (r37 == 8388611) goto L114;
        if (r37 == 8388613) goto L114;
        r38 = r29.getHeight();
        goto L115
    L95:
        if (r114 != 5) goto L97;
        r35 = Math.abs(r27 - r28) + (r111 - r22);
        goto L105
    L97:
        if (r114 != 48) goto L99;
        r35 = Math.abs(r26 - r111) + (r25 - r28);
        goto L105
    L99:
        if (r114 == 80) goto L101;
        r35 = r34;
        goto L105
    L101:
        r35 = Math.abs(r26 - r111) + (r28 - r23);
    L86:
        r114 = 3;
        goto L93
    L89:
        if (r114 != 8388613) goto L93;
        WeakHashMap r117 = j65.a;
        if (r29.getLayoutDirection() != 1) goto L85;
    L79:
        r113 = -1;
    L73:
        r111 = -1;
        goto L75
    L60:
        Integer r40 = (Integer) r10.a.get("android:visibilityPropagation:visibility");
        if (r40 == null) goto L59;
        r19 = r40.intValue();
    L67:
        r20 = -1;
    L120:
        f85 r41 = d85.a;
        ja5 r42 = new ja5(r29);
        ax4 r43 = new ax4();
        r43.a = r7;
        r43.b = r15;
        r43.c = r17;
        r43.d = r42;
        r43.e = this;
        r2.put(r14, r43);
        this.E.add(r14);
        goto L121
    L27:
        if (r13.length <= 0) goto L47;
        r6 = new mx4(r7);
        r18 = r8;
        mx4 r44 = (mx4) ((oi) r31.n).get(r7);
        if (r44 == null) goto L34;
        int r45 = 0;
    L32:
        if (r45 >= r13.length) goto L34;
        String r118 = r13[r45];
        int r119 = r45;
        r6.a.put(r118, r44.a.get(r118));
        r45 = r119 + 1;
        r44 = r44;
    L34:
        int r46 = r2.p;
        int r47 = 0;
    L35:
        if (r47 >= r46) goto L46;
        ax4 r120 = (ax4) r2.get((Animator) r2.f(r47));
        if (r120.c == null) goto L45;
        if (r120.a != r7) goto L45;
        if (r120.b.equals(r15) == false) goto L45;
        if (r120.c.equals(r6) == false) goto L45;
        r16 = null;
    L45:
        r47 = r47 + 1;
        goto L35
    L46:
        r16 = r14;
        goto L48
    L49:
        r18 = r8;
        r34 = 0;
        r7 = r10.b;
        r17 = null;
        goto L50
    L11:
        if (r12.c.contains(this) == true) goto L13;
        r12 = null;
        goto L13
    L7:
        if (r10.c.contains(this) == true) goto L9;
        r10 = null;
        goto L9
    L123:
        if (r3.size() == 0) goto L128;
        int r48 = 0;
    L126:
        if (r48 >= r3.size()) goto L141;
        Animator r1 = (Animator) this.E.get(r3.keyAt(r48));
        r1.setStartDelay(r1.getStartDelay() + (((long) r3.valueAt(r48)) - r5));
        r48 = r48 + 1;
        goto L126
    L141:
        return;
    }

    public final void l() {
        int r0 = this.A - 1;
        this.A = r0;
        if (r0 != 0) goto L34;
        ArrayList r1 = this.D;
        if (r1 != null) goto L7;
    L11:
        int r2 = 0;
    L13:
        if (r2 >= ((xe2) this.t.p).h()) goto L18;
        View r3 = (View) ((xe2) this.t.p).i(r2);
        if (r3 == null) goto L17;
        WeakHashMap r4 = j65.a;
        r3.setHasTransientState(false);
    L17:
        r2 = r2 + 1;
        goto L13
    L18:
        int r5 = 0;
    L20:
        if (r5 >= ((xe2) this.u.p).h()) goto L25;
        View r6 = (View) ((xe2) this.u.p).i(r5);
        if (r6 == null) goto L24;
        WeakHashMap r7 = j65.a;
        r6.setHasTransientState(false);
    L24:
        r5 = r5 + 1;
        goto L20
    L25:
        this.C = true;
        return;
    L7:
        if (r1.size() <= 0) goto L11;
        ArrayList r8 = (ArrayList) this.D.clone();
        int r9 = r8.size();
        int r10 = 0;
    L9:
        if (r10 >= r9) goto L11;
        ((bx4) r8.get(r10)).c(this);
        r10 = r10 + 1;
        goto L9
    }

    public final mx4 m(View r5, boolean r6) {
        kx4 r0 = this.v;
        if (r0 != null) goto L5;
        if (r6 == false) goto L8;
        ArrayList r1 = this.x;
    L9:
        if (r1 == null) goto L32;
        int r2 = r1.size();
        int r3 = 0;
    L12:
        if (r3 >= r2) goto L20;
        mx4 r4 = (mx4) r1.get(r3);
        if (r4 == null) goto L33;
        if (r4.b == r5) goto L21;
        r3 = r3 + 1;
    L21:
        if (r3 < 0) goto L27;
        if (r6 == false) goto L24;
        ArrayList r7 = this.y;
    L26:
        return (mx4) r7.get(r3);
    L24:
        r7 = this.x;
        goto L26
    L27:
        return null;
    L33:
        return null;
    L20:
        r3 = -1;
        goto L21
    L32:
        return null;
    L8:
        r1 = this.y;
        goto L9
    L5:
        return r0.m(r5, r6);
    }

    public String[] o() {
        return null;
    }

    public final mx4 p(View r2, boolean r3) {
        kx4 r0 = this.v;
        if (r0 != null) goto L5;
        if (r3 == false) goto L8;
        bq4 r1 = this.t;
    L10:
        return (mx4) ((oi) r1.n).get(r2);
    L8:
        r1 = this.u;
        goto L10
    L5:
        return r0.p(r2, r3);
    }

    public boolean q(mx4 r5, mx4 r6) {
        if (r5 == null) goto L20;
        if (r6 == null) goto L20;
        String[] r4 = o();
        if (r4 == null) goto L13;
        int r1 = r4.length;
        int r2 = 0;
    L8:
        if (r2 >= r1) goto L20;
        if (s(r5, r6, r4[r2]) == true) goto L18;
        r2 = r2 + 1;
        goto L8
    L18:
        return true;
    L13:
        Iterator r7 = r5.a.keySet().iterator();
    L15:
        if (r7.hasNext() == false) goto L20;
        if (s(r5, r6, (String) r7.next()) == false) goto L15;
        return true;
    L20:
        return false;
    }

    public final boolean r(View r5) {
        int r0 = r5.getId();
        ArrayList r1 = this.r;
        int r2 = r1.size();
        ArrayList r4 = this.s;
        if (r2 != 0) goto L8;
        if (r4.size() != 0) goto L8;
        return true;
    L8:
        if (r1.contains(Integer.valueOf(r0)) == false) goto L10;
    L14:
        return true;
    L10:
        if (r4.contains(r5) == true) goto L14;
        return false;
    }

    public void t(View r5) {
        if (this.C == true) goto L18;
        ArrayList r6 = this.z;
        int r0 = r6.size() - 1;
    L5:
        if (r0 < 0) goto L7;
        ((Animator) r6.get(r0)).pause();
        r0 = r0 - 1;
        goto L5
    L7:
        ArrayList r7 = this.D;
        if (r7 != null) goto L10;
    L14:
        this.B = true;
        return;
    L10:
        if (r7.size() <= 0) goto L14;
        ArrayList r8 = (ArrayList) this.D.clone();
        int r1 = r8.size();
        int r2 = 0;
    L12:
        if (r2 >= r1) goto L14;
        ((bx4) r8.get(r2)).b();
        r2 = r2 + 1;
        goto L12
    }

    public final String toString() {
        return E("");
    }

    public void u(bx4 r2) {
        ArrayList r0 = this.D;
        if (r0 == null) goto L10;
        r0.remove(r2);
        if (this.D.size() != 0) goto L9;
        this.D = null;
        return;
    L9:
        return;
    }

    public void v(View r5) {
        if (this.B == true) goto L5;
        return;
    L5:
        if (this.C == true) goto L16;
        ArrayList r6 = this.z;
        int r1 = r6.size() - 1;
    L7:
        if (r1 < 0) goto L9;
        ((Animator) r6.get(r1)).resume();
        r1 = r1 - 1;
        goto L7
    L9:
        ArrayList r7 = this.D;
        if (r7 == null) goto L16;
        if (r7.size() <= 0) goto L16;
        ArrayList r8 = (ArrayList) this.D.clone();
        int r2 = r8.size();
        int r3 = 0;
    L14:
        if (r3 >= r2) goto L16;
        ((bx4) r8.get(r3)).e();
        r3 = r3 + 1;
    L16:
        this.B = false;
    }

    public void w() {
        D();
        oi r0 = n();
        ArrayList r1 = this.E;
        int r2 = r1.size();
        int r3 = 0;
    L3:
        if (r3 >= r2) goto L18;
        Object r4 = r1.get(r3);
        r3 = r3 + 1;
        Animator r5 = (Animator) r4;
        if (r0.containsKey(r5) == false) goto L3;
        D();
        if (r5 == null) goto L3;
        r5.addListener(new kw0(this, r0));
        long r6 = this.p;
        if (r6 < 0) goto L11;
        r5.setDuration(r6);
    L11:
        long r7 = this.o;
        if (r7 < 0) goto L14;
        r5.setStartDelay(r5.getStartDelay() + r7);
    L14:
        TimeInterpolator r8 = this.q;
        if (r8 == null) goto L17;
        r5.setInterpolator(r8);
    L17:
        r5.addListener(new l4(14, this));
        r5.start();
        goto L3
    L18:
        this.E.clear();
        l();
    }

    public void x(long r1) {
        this.p = r1;
    }

    public void y(hw r1) {
    }

    public void z(TimeInterpolator r1) {
        this.q = r1;
    }
}
