package defpackage;

import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 {
    public final List a;
    public int b;
    public int c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public final Object h;

    public hm2(hm2 r2) {
        this.d = (fg4) r2.d;
        this.e = (ei3) r2.e;
        this.f = (eo2) r2.f;
        this.a = r2.a;
        this.g = (CharSequence) r2.g;
        this.b = r2.b;
        this.c = r2.c;
        this.h = (Bundle) r2.h;
    }

    public void a(cx3 r6, boolean r7) {
        RecyclerView.l(r6);
        View r0 = r6.a;
        RecyclerView r1 = (RecyclerView) this.h;
        ex3 r2 = r1.B0;
        if (r2 == null) goto L9;
        z2 r3 = r2.j();
        if ((r3 instanceof dx3) == false) goto L7;
        z2 r4 = (z2) ((dx3) r3).r.remove(r0);
    L8:
        j65.o(r0, r4);
        goto L9
    L7:
        r4 = null;
    L9:
        if (r7 == false) goto L23;
        ArrayList r8 = r1.B;
        if (r8.size() > 0) goto L21;
        dw3 r9 = r1.z;
        if (r9 == null) goto L16;
        r9.n(r6);
    L16:
        if (r1.u0 == null) goto L19;
        r1.t.O(r6);
    L19:
        if (RecyclerView.Q0 == false) goto L23;
        Log.d("RecyclerView", "dispatchViewRecycled: " + r6);
        goto L23
    L21:
        r8.get(0).getClass();
        kf2.k();
        return;
    L23:
        r6.s = null;
        r6.r = null;
        tw3 r5 = c();
        r5.getClass();
        int r10 = r6.f;
        ArrayList r11 = r5.a(r10).a;
        if (((sw3) r5.a.get(r10)).b > r11.size()) goto L28;
        wr1.g(r0);
        return;
    L28:
        if (RecyclerView.P0 == true) goto L30;
    L34:
        r6.o();
        r11.add(r6);
        return;
    L30:
        if (r11.contains(r6) == false) goto L34;
        kf2.n("this scrap item already exists");
    }

    public int b(int r5) {
        RecyclerView r4 = (RecyclerView) this.h;
        yw3 r0 = r4.u0;
        if (r5 >= 0) goto L5;
    L11:
        StringBuilder r6 = f34.j(r5, "invalid position ", ". State item count is ");
        r6.append(r0.b());
        r6.append(r4.C());
        throw new IndexOutOfBoundsException(r6.toString());
    L5:
        if (r5 >= r0.b()) goto L11;
        if (r0.g == true) goto L10;
        return r5;
    L10:
        return r4.r.i(r5, 0);
    }

    public tw3 c() {
        if (((tw3) this.g) != null) goto L6;
        tw3 r0 = new tw3();
        r0.a = new SparseArray();
        r0.b = 0;
        r0.c = Collections.newSetFromMap(new IdentityHashMap());
        this.g = r0;
        d();
    L6:
        return (tw3) this.g;
    }

    public void d() {
        tw3 r0 = (tw3) this.g;
        if (r0 == null) goto L10;
        RecyclerView r2 = (RecyclerView) this.h;
        dw3 r1 = r2.z;
        if (r1 != null) goto L7;
        return;
    L7:
        if (r2.F == false) goto L12;
        r0.c.add(r1);
        return;
    L12:
        return;
    }

    public void e(dw3 r4, boolean r5) {
        tw3 r3 = (tw3) this.g;
        if (r3 == null) goto L15;
        SparseArray r0 = r3.a;
        Set r6 = r3.c;
        r6.remove(r4);
        if (r6.size() != 0) goto L18;
        if (r5 == true) goto L19;
        int r7 = 0;
    L9:
        if (r7 >= r0.size()) goto L20;
        ArrayList r8 = ((sw3) r0.get(r0.keyAt(r7))).a;
        int r1 = 0;
    L12:
        if (r1 >= r8.size()) goto L14;
        wr1.g(((cx3) r8.get(r1)).a);
        r1 = r1 + 1;
        goto L12
    L14:
        r7 = r7 + 1;
        goto L9
    L20:
        return;
    L19:
        return;
    L18:
        return;
    }

    public void f() {
        ArrayList r0 = (ArrayList) this.f;
        int r1 = r0.size() - 1;
    L3:
        if (r1 < 0) goto L5;
        g(r1);
        r1 = r1 - 1;
        goto L3
    L5:
        r0.clear();
        if (RecyclerView.U0 == false) goto L13;
        b30 r2 = ((RecyclerView) this.h).t0;
        int[] r3 = r2.c;
        if (r3 == null) goto L10;
        Arrays.fill(r3, -1);
    L10:
        r2.d = 0;
        return;
    }

    public void g(int r6) {
        ArrayList r0 = (ArrayList) this.f;
        if (RecyclerView.Q0 == false) goto L5;
        Log.d("RecyclerView", "Recycling cached view at index " + r6);
    L5:
        cx3 r1 = (cx3) r0.get(r6);
        if (RecyclerView.Q0 == false) goto L8;
        Log.d("RecyclerView", "CachedViewHolder to be recycled: " + r1);
    L8:
        a(r1, true);
        r0.remove(r6);
    }

    public void h(View r4) {
        RecyclerView r0 = (RecyclerView) this.h;
        cx3 r1 = RecyclerView.N(r4);
        if (r1.l() == false) goto L6;
        r0.removeDetachedView(r4, false);
    L6:
        if (r1.k() == false) goto L9;
        r1.n.l(r1);
    L11:
        i(r1);
        if (r0.c0 != null) goto L14;
        return;
    L14:
        if (r1.i() == true) goto L18;
        r0.c0.d(r1);
        return;
    L18:
        return;
    L9:
        if (r1.r() == false) goto L11;
        r1.j &= -33;
        goto L11
    }

    public void i(cx3 r13) {
        ArrayList r0 = (ArrayList) this.f;
        RecyclerView r1 = (RecyclerView) this.h;
        b30 r2 = r1.t0;
        boolean r3 = r13.k();
        View r4 = r13.a;
        boolean r5 = false;
        boolean r6 = true;
        if (r3 == false) goto L5;
    L86:
        StringBuilder r7 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        r7.append(r13.k());
        r7.append(" isAttached:");
        if (r4.getParent() == null) goto L89;
        r5 = true;
    L89:
        r7.append(r5);
        r7.append(r1.C());
        throw new IllegalArgumentException(r7.toString());
    L5:
        if (r4.getParent() != null) goto L86;
        if (r13.l() == false) goto L10;
        StringBuilder r12 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
        r12.append(r13);
        kf2.g(r1.C(), r12);
        return;
    L10:
        if (r13.q() == false) goto L12;
        kf2.n("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(r1.C()));
        return;
    L12:
        if ((r13.j & 16) != 0) goto L16;
        WeakHashMap r8 = j65.a;
        if (r4.hasTransientState() == false) goto L16;
        boolean r9 = true;
    L17:
        dw3 r10 = r1.z;
        if (r10 == null) goto L23;
        if (r9 == false) goto L23;
        if (r10.k(r13) == false) goto L23;
        boolean r11 = true;
    L25:
        if (RecyclerView.P0 == true) goto L27;
    L31:
        if (r11 == true) goto L40;
        if (r13.i() == true) goto L40;
        if (RecyclerView.Q0 == false) goto L38;
        Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(r1.C()));
    L38:
        r6 = false;
    L76:
        r1.t.O(r13);
        if (r5 == true) goto L97;
        if (r6 == true) goto L98;
        if (r9 == false) goto L99;
        wr1.g(r4);
        r13.s = null;
        r13.r = null;
        return;
    L99:
        return;
    L98:
        return;
    L97:
        return;
    L40:
        if (this.c > 0) goto L42;
    L71:
        boolean r14 = false;
    L72:
        if (r14 == true) goto L75;
        a(r13, true);
    L74:
        r5 = r14;
        goto L76
    L75:
        r6 = false;
        goto L74
    L42:
        if ((r13.j & 526) != 0) goto L71;
        int r15 = r0.size();
        if (r15 < this.c) goto L49;
        if (r15 <= 0) goto L49;
        g(0);
        r15 = r15 - 1;
    L49:
        if (RecyclerView.U0 == false) goto L70;
        if (r15 <= 0) goto L70;
        int r16 = r13.c;
        if (r2.c == null) goto L59;
        int r17 = r2.d * 2;
        int r18 = 0;
    L54:
        if (r18 >= r17) goto L59;
        if (r2.c[r18] == r16) goto L70;
        r18 = r18 + 2;
    L59:
        int r19 = r15 - 1;
    L60:
        if (r19 < 0) goto L69;
        int r20 = ((cx3) r0.get(r19)).c;
        if (r2.c == null) goto L69;
        int r21 = r2.d * 2;
        int r110 = 0;
    L64:
        if (r110 >= r21) goto L69;
        if (r2.c[r110] == r20) goto L67;
        r110 = r110 + 2;
        goto L64
    L67:
        r19 = r19 - 1;
    L69:
        r15 = r19 + 1;
    L70:
        r0.add(r15, r13);
        r14 = true;
        goto L72
    L27:
        if (r0.contains(r13) == false) goto L31;
        StringBuilder r111 = new StringBuilder("cached view received recycle internal? ");
        r111.append(r13);
        kf2.g(r1.C(), r111);
        return;
    L23:
        r11 = false;
    L16:
        r9 = false;
        goto L17
    }

    public void j(View r4) {
        RecyclerView r0 = (RecyclerView) this.h;
        cx3 r5 = RecyclerView.N(r4);
        if ((r5.j & 12) != 0) goto L22;
        if (r5.m() == false) goto L22;
        jw3 r1 = r0.c0;
        if (r1 == null) goto L22;
        pl0 r2 = (pl0) r1;
        if (r5.e().isEmpty() == false) goto L22;
        if (r2.g == false) goto L22;
        if (r5.h() == true) goto L22;
        if (((ArrayList) this.e) != null) goto L19;
        this.e = new ArrayList();
    L19:
        r5.n = this;
        r5.o = true;
        ((ArrayList) this.e).add(r5);
        return;
    L22:
        if (r5.h() == true) goto L24;
    L30:
        r5.n = this;
        r5.o = false;
        ((ArrayList) this.d).add(r5);
        return;
    L24:
        if (r5.j() == true) goto L30;
        if (r0.z.o == true) goto L30;
        kf2.n("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(r0.C()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public cx3 k(int r30, long r31) {
        ArrayList r2 = (ArrayList) this.d;
        ArrayList r3 = (ArrayList) this.f;
        RecyclerView r4 = (RecyclerView) this.h;
        yw3 r5 = r4.u0;
        if (r30 >= 0) goto L5;
    L364:
        StringBuilder r1 = b11.t("Invalid item position ", "(", r30, r30, "). Item count:");
        r1.append(r5.b());
        r1.append(r4.C());
        throw new IndexOutOfBoundsException(r1.toString());
    L5:
        if (r30 >= r5.b()) goto L364;
        if (r5.g == false) goto L40;
        ArrayList r6 = (ArrayList) this.e;
        if (r6 == null) goto L36;
        int r7 = r6.size();
        if (r7 == 0) goto L36;
        int r11 = 0;
    L14:
        if (r11 >= r7) goto L22;
        cx3 r12 = (cx3) ((ArrayList) this.e).get(r11);
        if (r12.r() == true) goto L20;
        if (r12.d() != r30) goto L20;
        r12.a(32);
        View r15 = null;
        boolean r16 = true;
        cx3 r13 = r12;
    L37:
        if (r13 == null) goto L39;
        boolean r8 = r16;
        cx3 r14 = r13;
        View r17 = r15;
    L41:
        String r9 = "RecyclerView";
        if (r14 != null) goto L138;
        int r10 = r2.size();
        int r18 = 0;
    L44:
        if (r18 >= r10) goto L57;
        cx3 r19 = (cx3) r2.get(r18);
        if (r19.r() == true) goto L56;
        if (r19.d() != r30) goto L56;
        if (r19.h() == true) goto L56;
        if (r5.g == true) goto L55;
        if (r19.j() == true) goto L56;
    L55:
        r19.a(32);
        cx3 r110 = r17;
        cx3 r111 = r19;
    L101:
        if (r111 != null) goto L103;
        cx3 r112 = r111;
        cx3 r113 = r110;
    L140:
        if (r112 != null) goto L236;
        int r20 = r4.r.i(r30, 0);
        if (r20 >= 0) goto L144;
    L234:
        StringBuilder r21 = b11.t("Inconsistency detected. Invalid item position ", "(offset:", r30, r20, ").state:");
        r21.append(r5.b());
        r21.append(r4.C());
        throw new IndexOutOfBoundsException(r21.toString());
    L144:
        if (r20 >= r4.z.a()) goto L234;
        int r114 = r4.z.c(r20);
        dw3 r115 = r4.z;
        long r24 = 3;
        if (r115.o == false) goto L179;
        long r116 = r115.b(r20);
        int r117 = r2.size() - 1;
        cx3 r118 = r113;
    L148:
        if (r117 < 0) goto L164;
        cx3 r119 = (cx3) r2.get(r117);
        String r26 = r9;
        long r22 = r119.e;
        View r120 = r119.a;
        if (r22 != r116) goto L163;
        if (r119.r() == true) goto L163;
        if (r114 == r119.f) goto L155;
        r2.remove(r117);
        r4.removeDetachedView(r120, false);
        cx3 r121 = RecyclerView.N(r120);
        r121.n = r118;
        r121.o = false;
        r121.j &= -33;
        i(r121);
        goto L163
    L155:
        r119.a(32);
        if (r119.j() == true) goto L158;
    L160:
        cx3 r23 = r119;
    L176:
        if (r23 == null) goto L178;
        r23.c = r20;
        cx3 r122 = r23;
        r8 = r16;
    L180:
        if (r122 == null) goto L182;
        String r25 = r26;
        r112 = r122;
    L200:
        if (r112 != null) goto L237;
        long r27 = r4.getNanoTime();
        if (r31 == Long.MAX_VALUE) goto L210;
        long r28 = ((tw3) this.g).a(r114).c;
        if (r28 == 0) goto L210;
        if ((r28 + r27) < r31) goto L210;
        return null;
    L210:
        dw3 r29 = r4.z;
        r29.getClass();
    L231:
        th = move-exception;
        Trace.endSection();
        throw th;
    L212:
        if (ov4.a() == false) goto L214;
        Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", new Object[]{Integer.valueOf(r114)}));     // Catch: Throwable -> L231
    L214:
        r112 = r29.i(r4, r114);     // Catch: Throwable -> L231
        if (r112.a.getParent() != null) goto L230;
        r112.f = r114;     // Catch: Throwable -> L231
        Trace.endSection();
        if (RecyclerView.U0 == false) goto L222;
        RecyclerView r32 = RecyclerView.H(r112.a);
        if (r32 == null) goto L222;
        r112.b = new WeakReference(r32);
    L222:
        long r33 = r4.getNanoTime() - r27;
        sw3 r34 = ((tw3) this.g).a(r114);
        long r35 = r34.c;
        if (r35 == 0) goto L226;
        r33 = (r33 / 4) + ((r35 / 4) * 3);
    L226:
        r34.c = r33;
        if (RecyclerView.Q0 == false) goto L237;
        Log.d(r25, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
        goto L237
    L230:
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");     // Catch: Throwable -> L231
    L237:
        View r36 = r112.a;
        if (r8 == false) goto L247;
        if (r5.g == true) goto L247;
        int r37 = r112.j;
        if ((r37 & 8192) == 0) goto L247;
        r112.j = r37 & (-8193);
        if (r5.j == false) goto L247;
        jw3.b(r112);
        jw3 r38 = r4.c0;
        r112.e();
        r38.getClass();
        n50 r39 = new n50();
        r39.b(r112);
        r4.b0(r112, r39);
    L247:
        if (r5.g == false) goto L252;
        if (r112.g() == false) goto L252;
        r112.g = r30;
    L259:
        boolean r40 = r16;
        boolean r0 = false;
    L350:
        ViewGroup.LayoutParams r41 = r36.getLayoutParams();
        if (r41 != null) goto L354;
        nw3 r42 = (nw3) r4.generateDefaultLayoutParams();
        r36.setLayoutParams(r42);
    L357:
        r42.a = r112;
        if (r8 == false) goto L361;
        if (r0 == false) goto L361;
        boolean r43 = r40;
    L362:
        r42.d = r43;
        return r112;
    L361:
        r43 = false;
        goto L362
    L354:
        if (r4.checkLayoutParams(r41) == true) goto L356;
        r42 = (nw3) r4.generateLayoutParams(r41);
        r36.setLayoutParams(r42);
        goto L357
    L356:
        r42 = (nw3) r41;
    L252:
        if (r112.g() == false) goto L261;
        if ((r112.j & 2) != 0) goto L261;
        if (r112.h() == false) goto L259;
    L261:
        if (RecyclerView.P0 == false) goto L268;
        if (r112.j() == false) goto L268;
        StringBuilder r44 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
        r44.append(r112);
        nz2.m(r4.C(), r44);
        return null;
    L268:
        int r45 = r4.r.i(r30, 0);
        r112.s = null;
        r112.r = r4;
        int r46 = r112.f;
        long r47 = r4.getNanoTime();
        if (r31 == Long.MAX_VALUE) goto L277;
        long r123 = ((tw3) this.g).a(r46).d;
        if (r123 == 0) goto L277;
        if ((r123 + r47) < r31) goto L277;
        r0 = false;
        r40 = r16;
    L277:
        if (r112.l() == false) goto L279;
        RecyclerView.e(r4, r36, r4.getChildCount(), r36.getLayoutParams());
        boolean r48 = r16;
    L280:
        dw3 r124 = r4.z;
        r124.getClass();
        if (r112.s != null) goto L283;
        boolean r125 = r16;
    L284:
        if (r125 == false) goto L291;
        r112.c = r45;
        long r210 = r47;
        if (r124.o == false) goto L288;
        r112.e = r124.b(r45);
    L288:
        r112.j = (r112.j & (-520)) | 1;
        if (ov4.a() == false) goto L292;
        Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", new Object[]{Integer.valueOf(r112.f)}));
    L292:
        r112.s = r124;
        if (RecyclerView.P0 == true) goto L295;
    L305:
        z2 r126 = null;
        r124.h(r112, r45, r112.e());
        if (r125 == false) goto L316;
        ArrayList r49 = r112.k;
        if (r49 == null) goto L312;
        r49.clear();
    L312:
        r112.j &= -1025;
        ViewGroup.LayoutParams r50 = r36.getLayoutParams();
        if ((r50 instanceof nw3) == false) goto L315;
        ((nw3) r50).c = r16;
    L315:
        Trace.endSection();
    L316:
        if (r48 == false) goto L318;
        RecyclerView.f(r36, r4);
    L318:
        long r51 = r4.getNanoTime() - r210;
        sw3 r52 = ((tw3) this.g).a(r112.f);
        long r53 = r52.d;
        if (r53 == 0) goto L322;
        r51 = (r51 / 4) + ((r53 / 4) * r24);
    L322:
        r52.d = r51;
        AccessibilityManager r54 = r4.O;
        if (r54 != null) goto L325;
    L345:
        r40 = true;
    L347:
        if (r5.g == false) goto L349;
        r112.g = r30;
    L349:
        r0 = r40;
        goto L350
    L325:
        if (r54.isEnabled() == false) goto L345;
        r40 = true;
        if (r36.getImportantForAccessibility() != 0) goto L329;
        r36.setImportantForAccessibility(1);
    L329:
        ex3 r55 = r4.B0;
        if (r55 == null) goto L347;
        z2 r56 = r55.j();
        if ((r56 instanceof dx3) == false) goto L344;
        dx3 r57 = (dx3) r56;
        View.AccessibilityDelegate r58 = j65.d(r36);
        if (r58 != null) goto L338;
    L341:
        if (r126 == null) goto L344;
        if (r126 == r57) goto L344;
        r57.r.put(r36, r126);
        goto L344
    L338:
        if ((r58 instanceof y2) == false) goto L340;
        r126 = ((y2) r58).a;
        goto L341
    L340:
        r126 = new z2(r58);
    L344:
        j65.o(r36, r56);
        goto L347
    L295:
        if (r36.getParent() != null) goto L302;
        if (r36.isAttachedToWindow() == r112.l()) goto L302;
        throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + r112.l() + ", attached to window: " + r36.isAttachedToWindow() + ", holder: " + r112);
    L302:
        if (r36.getParent() != null) goto L305;
        if (r36.isAttachedToWindow() == false) goto L305;
        er1.o(r112, "Attempting to bind attached holder with no parent (AKA temp detached): ");
        return null;
    L291:
        r210 = r47;
        goto L292
    L283:
        r125 = false;
        goto L284
    L279:
        r48 = false;
        goto L280
    L182:
        if (RecyclerView.Q0 == false) goto L184;
        r25 = r26;
        Log.d(r25, "tryGetViewHolderForPositionByDeadline(" + r30 + ") fetching from shared pool");
    L185:
        sw3 r59 = (sw3) c().a.get(r114);
        if (r59 == null) goto L195;
        ArrayList r60 = r59.a;
        if (r60.isEmpty() == true) goto L195;
        int r61 = r60.size() - 1;
    L190:
        if (r61 < 0) goto L195;
        if (((cx3) r60.get(r61)).f() == false) goto L193;
        r61 = r61 - 1;
        goto L190
    L193:
        cx3 r62 = (cx3) r60.remove(r61);
    L196:
        if (r62 == null) goto L198;
        r62.o();
        boolean r63 = RecyclerView.P0;
    L198:
        r112 = r62;
    L195:
        r62 = null;
        goto L196
    L184:
        r25 = r26;
        goto L185
    L178:
        r122 = r23;
        goto L180
    L158:
        if (r5.g == true) goto L160;
        r119.j = (r119.j & (-15)) | 2;
    L163:
        r117 = r117 - 1;
        r9 = r26;
        r118 = null;
        goto L148
    L164:
        r26 = r9;
        int r64 = r3.size() - 1;
    L165:
        if (r64 < 0) goto L174;
        r23 = (cx3) r3.get(r64);
        long r211 = r116;
        if (r23.e != r211) goto L175;
        if (r23.f() == true) goto L175;
        if (r114 != r23.f) goto L173;
        r3.remove(r64);
        goto L176
    L173:
        g(r64);
    L175:
        r64 = r64 - 1;
        r116 = r211;
    L174:
        r23 = null;
        goto L176
    L179:
        r26 = "RecyclerView";
        r122 = r112;
        goto L180
    L236:
        r24 = 3;
        goto L237
    L103:
        if (r111.j() == true) goto L105;
        int r65 = r111.c;
        if (r65 < 0) goto L136;
        if (r65 >= r4.z.a()) goto L136;
        if (r5.g == false) goto L119;
    L121:
        dw3 r66 = r4.z;
        if (r66.o == true) goto L124;
    L125:
        boolean r67 = r16;
    L126:
        if (r67 == true) goto L134;
        r111.a(4);
        if (r111.k() == false) goto L131;
        r4.removeDetachedView(r111.a, false);
        r111.n.l(r111);
    L133:
        i(r111);
        r112 = r110;
        r113 = r110;
        goto L140
    L131:
        if (r111.r() == false) goto L133;
        r111.j &= -33;
        goto L133
    L134:
        r112 = r111;
        r8 = r16;
        r113 = r110;
        goto L140
    L124:
        if (r111.e == r66.b(r111.c)) goto L125;
    L120:
        r67 = false;
        goto L126
    L119:
        if (r4.z.c(r111.c) == r111.f) goto L121;
    L136:
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + r111 + r4.C());
    L105:
        if (RecyclerView.P0 == true) goto L107;
    L111:
        r67 = r5.g;
        goto L126
    L107:
        if (r5.g == true) goto L111;
        kf2.o("should not receive a removed view unless it is pre layout".concat(r4.C()));
        return r110;
    L56:
        r18 = r18 + 1;
        goto L44
    L57:
        ArrayList r68 = (ArrayList) r4.s.r;
        int r127 = r68.size();
        int r128 = 0;
        View r129 = r17;
    L58:
        if (r128 >= r127) goto L67;
        View r130 = (View) r68.get(r128);
        cx3 r131 = RecyclerView.N(r130);
        View r132 = r129;
        if (r131.d() != r30) goto L66;
        if (r131.h() == true) goto L66;
        if (r131.j() == true) goto L66;
        View r133 = r130;
        cx3 r134 = r132;
    L68:
        if (r133 == null) goto L88;
        cx3 r69 = RecyclerView.N(r133);
        ew4 r135 = r4.s;
        e20 r136 = (e20) r135.q;
        int r137 = ((RecyclerView) ((rm2) r135.p).o).indexOfChild(r133);
        if (r137 >= 0) goto L72;
        mj0.l(r133, "view is not a child, cannot hide ");
        return r134;
    L72:
        if (r136.s(r137) == false) goto L85;
        r136.o(r137);
        r135.p(r133);
        ew4 r138 = r4.s;
        e20 r139 = (e20) r138.q;
        int r140 = ((RecyclerView) ((rm2) r138.p).o).indexOfChild(r133);
        if (r140 != (-1)) goto L77;
    L78:
        int r141 = -1;
    L80:
        if (r141 == (-1)) goto L82;
        r4.s.f(r141);
        j(r133);
        r69.a(8224);
        r111 = r69;
        r110 = r134;
        goto L101
    L82:
        StringBuilder r70 = new StringBuilder("layout index should not be -1 after unhiding a view:");
        r70.append(r69);
        nz2.m(r4.C(), r70);
        return r134;
    L77:
        if (r139.s(r140) == true) goto L78;
        r141 = r140 - r139.q(r140);
        goto L80
    L85:
        throw new RuntimeException("trying to unhide a view that was not hidden" + r133);
    L88:
        int r71 = r3.size();
        int r142 = 0;
    L89:
        if (r142 >= r71) goto L100;
        cx3 r143 = (cx3) r3.get(r142);
        if (r143.h() == true) goto L99;
        if (r143.d() != r30) goto L99;
        if (r143.f() == true) goto L99;
        r3.remove(r142);
        r111 = r143;
        r110 = r134;
        if (RecyclerView.Q0 == false) goto L101;
        Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + r30 + ") found match in cache: " + r143);
        r111 = r143;
        r110 = r134;
    L99:
        r142 = r142 + 1;
        goto L89
    L100:
        r111 = r134;
        r110 = r134;
    L66:
        r128 = r128 + 1;
        r129 = r132;
        goto L58
    L67:
        r134 = r129;
        r133 = r129;
        goto L68
    L138:
        r113 = r17;
        r112 = r14;
        goto L140
    L39:
        r8 = false;
        r14 = r13;
        r17 = r15;
    L20:
        r11 = r11 + 1;
        goto L14
    L22:
        if (r4.z.o == false) goto L36;
        int r144 = r4.r.i(r30, 0);
        if (r144 <= 0) goto L36;
        if (r144 >= r4.z.a()) goto L36;
        long r145 = r4.z.b(r144);
        int r146 = 0;
    L28:
        if (r146 >= r7) goto L36;
        cx3 r147 = (cx3) ((ArrayList) this.e).get(r146);
        if (r147.r() == true) goto L35;
        r15 = null;
        r16 = true;
        if (r147.e != r145) goto L35;
        r147.a(32);
        r13 = r147;
    L35:
        r146 = r146 + 1;
    L36:
        r15 = null;
        r16 = true;
        r13 = null;
        goto L37
    L40:
        r17 = null;
        r16 = true;
        r8 = false;
        r14 = null;
        goto L41
    }

    public void l(cx3 r2) {
        if (r2.o == false) goto L5;
        ((ArrayList) this.e).remove(r2);
    L6:
        r2.n = null;
        r2.o = false;
        r2.j &= -33;
        return;
    L5:
        ((ArrayList) this.d).remove(r2);
        goto L6
    }

    public void m() {
        ArrayList r0 = (ArrayList) this.f;
        mw3 r1 = ((RecyclerView) this.h).A;
        if (r1 == null) goto L5;
        int r2 = r1.j;
    L6:
        this.c = this.b + r2;
        int r3 = r0.size() - 1;
    L7:
        if (r3 < 0) goto L11;
        if (r0.size() <= this.c) goto L14;
        g(r3);
        r3 = r3 - 1;
        goto L7
    L14:
        return;
    L11:
        return;
    L5:
        r2 = 0;
        goto L6
    }

    public hm2(fg4 r1, ei3 r2, eo2 r3, List r4, CharSequence r5, int r6, int r7, Bundle r8) {
        this.d = r1;
        this.e = r2;
        this.f = r3;
        r4.getClass();
        this.a = r4;
        this.g = r5;
        this.b = r6;
        this.c = r7;
        if (r8 != null) goto L6;
        r8 = Bundle.EMPTY;
    L6:
        this.h = r8;
    }

    public hm2() {
        this.d = null;
        this.e = null;
        this.f = null;
        this.a = Collections.EMPTY_LIST;
        this.g = null;
        this.b = 0;
        this.c = 0;
        this.h = Bundle.EMPTY;
    }

    public hm2(RecyclerView r2) {
        this.h = r2;
        ArrayList r3 = new ArrayList();
        this.d = r3;
        this.e = null;
        this.f = new ArrayList();
        this.a = Collections.unmodifiableList(r3);
        this.b = 2;
        this.c = 2;
    }
}
