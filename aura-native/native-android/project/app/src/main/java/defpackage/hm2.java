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

    public hm2(hm2 hm2Var) {
        this.d = (fg4) hm2Var.d;
        this.e = (ei3) hm2Var.e;
        this.f = (eo2) hm2Var.f;
        this.a = hm2Var.a;
        this.g = (CharSequence) hm2Var.g;
        this.b = hm2Var.b;
        this.c = hm2Var.c;
        this.h = (Bundle) hm2Var.h;
    }

    public void a(cx3 cx3Var, boolean z) {
        RecyclerView.l(cx3Var);
        View view = cx3Var.a;
        RecyclerView recyclerView = (RecyclerView) this.h;
        ex3 ex3Var = recyclerView.B0;
        if (ex3Var != null) {
            z2 z2VarJ = ex3Var.j();
            j65.o(view, z2VarJ instanceof dx3 ? (z2) ((dx3) z2VarJ).r.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.B;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                kf2.k();
                return;
            }
            dw3 dw3Var = recyclerView.z;
            if (dw3Var != null) {
                dw3Var.n(cx3Var);
            }
            if (recyclerView.u0 != null) {
                recyclerView.t.O(cx3Var);
            }
            if (RecyclerView.Q0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + cx3Var);
            }
        }
        cx3Var.s = null;
        cx3Var.r = null;
        tw3 tw3VarC = c();
        tw3VarC.getClass();
        int i = cx3Var.f;
        ArrayList arrayList2 = tw3VarC.a(i).a;
        if (((sw3) tw3VarC.a.get(i)).b <= arrayList2.size()) {
            wr1.g(view);
        } else if (RecyclerView.P0 && arrayList2.contains(cx3Var)) {
            kf2.n("this scrap item already exists");
        } else {
            cx3Var.o();
            arrayList2.add(cx3Var);
        }
    }

    public int b(int i) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        yw3 yw3Var = recyclerView.u0;
        if (i >= 0 && i < yw3Var.b()) {
            return !yw3Var.g ? i : recyclerView.r.i(i, 0);
        }
        StringBuilder sbJ = f34.j(i, "invalid position ", ". State item count is ");
        sbJ.append(yw3Var.b());
        sbJ.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbJ.toString());
    }

    public tw3 c() {
        if (((tw3) this.g) == null) {
            tw3 tw3Var = new tw3();
            tw3Var.a = new SparseArray();
            tw3Var.b = 0;
            tw3Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = tw3Var;
            d();
        }
        return (tw3) this.g;
    }

    public void d() {
        RecyclerView recyclerView;
        dw3 dw3Var;
        tw3 tw3Var = (tw3) this.g;
        if (tw3Var == null || (dw3Var = (recyclerView = (RecyclerView) this.h).z) == null || !recyclerView.F) {
            return;
        }
        tw3Var.c.add(dw3Var);
    }

    public void e(dw3 dw3Var, boolean z) {
        tw3 tw3Var = (tw3) this.g;
        if (tw3Var != null) {
            SparseArray sparseArray = tw3Var.a;
            Set set = tw3Var.c;
            set.remove(dw3Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((sw3) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    wr1.g(((cx3) arrayList.get(i2)).a);
                }
            }
        }
    }

    public void f() {
        ArrayList arrayList = (ArrayList) this.f;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g(size);
        }
        arrayList.clear();
        if (RecyclerView.U0) {
            b30 b30Var = ((RecyclerView) this.h).t0;
            int[] iArr = b30Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            b30Var.d = 0;
        }
    }

    public void g(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        if (RecyclerView.Q0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        cx3 cx3Var = (cx3) arrayList.get(i);
        if (RecyclerView.Q0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + cx3Var);
        }
        a(cx3Var, true);
        arrayList.remove(i);
    }

    public void h(View view) {
        RecyclerView recyclerView = (RecyclerView) this.h;
        cx3 cx3VarN = RecyclerView.N(view);
        if (cx3VarN.l()) {
            recyclerView.removeDetachedView(view, false);
        }
        if (cx3VarN.k()) {
            cx3VarN.n.l(cx3VarN);
        } else if (cx3VarN.r()) {
            cx3VarN.j &= -33;
        }
        i(cx3VarN);
        if (recyclerView.c0 == null || cx3VarN.i()) {
            return;
        }
        recyclerView.c0.d(cx3VarN);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0038  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00db A[LOOP:2: B:64:0x00d0->B:68:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:93:0x00de A[EDGE_INSN: B:93:0x00de->B:69:0x00de BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00d8, LOOP_LABEL: LOOP:1: B:60:0x00bd->B:67:0x00d8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00de A[EDGE_INSN: B:95:0x00de->B:69:0x00de BREAK  A[LOOP:1: B:60:0x00bd->B:67:0x00d8], SYNTHETIC] */
    public void i(cx3 cx3Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f;
        RecyclerView recyclerView = (RecyclerView) this.h;
        b30 b30Var = recyclerView.t0;
        boolean zK = cx3Var.k();
        View view = cx3Var.a;
        boolean z3 = false;
        boolean z4 = true;
        if (zK || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(cx3Var.k());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.C());
            throw new IllegalArgumentException(sb.toString());
        }
        if (cx3Var.l()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(cx3Var);
            kf2.g(recyclerView.C(), sb2);
            return;
        }
        if (cx3Var.q()) {
            kf2.n("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(recyclerView.C()));
            return;
        }
        if ((cx3Var.j & 16) == 0) {
            WeakHashMap weakHashMap = j65.a;
            if (view.hasTransientState()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        dw3 dw3Var = recyclerView.z;
        boolean z5 = dw3Var != null && z && dw3Var.k(cx3Var);
        if (RecyclerView.P0 && arrayList.contains(cx3Var)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(cx3Var);
            kf2.g(recyclerView.C(), sb3);
            return;
        }
        if (z5 || cx3Var.i()) {
            if (this.c <= 0 || (cx3Var.j & 526) != 0) {
                z2 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.c && size > 0) {
                    g(0);
                    size--;
                }
                if (RecyclerView.U0 && size > 0) {
                    int i5 = cx3Var.c;
                    if (b30Var.c != null) {
                        int i6 = b30Var.d * 2;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= i6) {
                                i = size - 1;
                                loop1: while (i >= 0) {
                                    i2 = ((cx3) arrayList.get(i)).c;
                                    if (b30Var.c != null) {
                                        break;
                                    }
                                    i3 = b30Var.d * 2;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 < i3) {
                                            break loop1;
                                        } else if (b30Var.c[i4] == i2) {
                                            break;
                                        } else {
                                            i4 += 2;
                                        }
                                    }
                                    i--;
                                }
                                size = i + 1;
                            } else if (b30Var.c[i7] != i5) {
                                i7 += 2;
                            }
                        }
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                            i2 = ((cx3) arrayList.get(i)).c;
                            if (b30Var.c != null) {
                                break;
                                break;
                            }
                            i3 = b30Var.d * 2;
                            i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    break loop1;
                                    break loop1;
                                } else if (b30Var.c[i4] == i2) {
                                    break;
                                } else {
                                    i4 += 2;
                                }
                            }
                            i--;
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, cx3Var);
                z2 = true;
            }
            if (z2) {
                z4 = false;
            } else {
                a(cx3Var, true);
            }
            z3 = z2;
        } else {
            if (RecyclerView.Q0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists".concat(recyclerView.C()));
            }
            z4 = false;
        }
        recyclerView.t.O(cx3Var);
        if (z3 || z4 || !z) {
            return;
        }
        wr1.g(view);
        cx3Var.s = null;
        cx3Var.r = null;
    }

    public void j(View view) {
        jw3 jw3Var;
        RecyclerView recyclerView = (RecyclerView) this.h;
        cx3 cx3VarN = RecyclerView.N(view);
        if ((cx3VarN.j & 12) == 0 && cx3VarN.m() && (jw3Var = recyclerView.c0) != null) {
            pl0 pl0Var = (pl0) jw3Var;
            if (cx3VarN.e().isEmpty() && pl0Var.g && !cx3VarN.h()) {
                if (((ArrayList) this.e) == null) {
                    this.e = new ArrayList();
                }
                cx3VarN.n = this;
                cx3VarN.o = true;
                ((ArrayList) this.e).add(cx3VarN);
                return;
            }
        }
        if (cx3VarN.h() && !cx3VarN.j() && !recyclerView.z.o) {
            kf2.n("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        cx3VarN.n = this;
        cx3VarN.o = false;
        ((ArrayList) this.d).add(cx3VarN);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x021c  */
    /* JADX WARN: Code duplicated, block: B:195:0x039e A[EDGE_INSN: B:195:0x039e->B:196:0x039f BREAK  A[LOOP:3: B:190:0x0386->B:194:0x039b]] */
    /* JADX WARN: Code duplicated, block: B:276:0x0501  */
    /* JADX WARN: Code duplicated, block: B:278:0x0507  */
    /* JADX WARN: Code duplicated, block: B:279:0x0515  */
    /* JADX WARN: Code duplicated, block: B:282:0x051f  */
    /* JADX WARN: Code duplicated, block: B:283:0x0522  */
    /* JADX WARN: Code duplicated, block: B:285:0x0525  */
    /* JADX WARN: Code duplicated, block: B:287:0x052d  */
    /* JADX WARN: Code duplicated, block: B:290:0x0541  */
    /* JADX WARN: Code duplicated, block: B:291:0x0555  */
    /* JADX WARN: Code duplicated, block: B:294:0x055d  */
    /* JADX WARN: Code duplicated, block: B:309:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:311:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:314:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:317:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:321:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:345:0x0643  */
    /* JADX WARN: Code duplicated, block: B:348:0x0648  */
    /* JADX WARN: Code duplicated, block: B:352:0x0651  */
    /* JADX WARN: Code duplicated, block: B:353:0x065b  */
    /* JADX WARN: Code duplicated, block: B:355:0x0661  */
    /* JADX WARN: Code duplicated, block: B:356:0x066b  */
    /* JADX WARN: Code duplicated, block: B:361:0x0675  */
    /* JADX WARN: Code duplicated, block: B:36:0x0095 A[EDGE_INSN: B:36:0x0095->B:37:0x0099 BREAK  A[LOOP:0: B:14:0x0030->B:20:0x004f]] */
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
    public cx3 k(int i, long j) {
        View view;
        boolean z;
        boolean z2;
        cx3 cx3Var;
        cx3 cx3Var2;
        cx3 cx3VarI;
        long j2;
        boolean z3;
        dw3 dw3Var;
        boolean z4;
        long j3;
        long nanoTime;
        long j4;
        AccessibilityManager accessibilityManager;
        boolean z5;
        boolean z6;
        ArrayList arrayList;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        nw3 nw3Var;
        boolean z7;
        String str;
        cx3 cx3Var3;
        String str2;
        RecyclerView recyclerViewH;
        cx3 cx3Var4;
        cx3 cx3Var5;
        cx3 cx3Var6;
        cx3 cx3Var7;
        View view2;
        cx3 cx3Var8;
        cx3 cx3Var9;
        cx3 cx3Var10;
        boolean z8;
        View view3;
        cx3 cx3Var11;
        int size;
        int i2;
        ArrayList arrayList2 = (ArrayList) this.d;
        ArrayList arrayList3 = (ArrayList) this.f;
        RecyclerView recyclerView = (RecyclerView) this.h;
        yw3 yw3Var = recyclerView.u0;
        if (i < 0 || i >= yw3Var.b()) {
            StringBuilder sbT = b11.t("Invalid item position ", "(", i, i, "). Item count:");
            sbT.append(yw3Var.b());
            sbT.append(recyclerView.C());
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (yw3Var.g) {
            ArrayList arrayList4 = (ArrayList) this.e;
            if (arrayList4 != null && (size = arrayList4.size()) != 0) {
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        if (recyclerView.z.o && (i2 = recyclerView.r.i(i, 0)) > 0 && i2 < recyclerView.z.a()) {
                            long jB = recyclerView.z.b(i2);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    view3 = null;
                                    z = true;
                                    cx3Var11 = null;
                                    break;
                                }
                                cx3 cx3Var12 = (cx3) ((ArrayList) this.e).get(i4);
                                if (!cx3Var12.r()) {
                                    view3 = null;
                                    z = true;
                                    if (cx3Var12.e == jB) {
                                        cx3Var12.a(32);
                                        cx3Var11 = cx3Var12;
                                        break;
                                    }
                                }
                                i4++;
                            }
                        } else {
                            view3 = null;
                            z = true;
                            cx3Var11 = null;
                            break;
                        }
                    } else {
                        cx3 cx3Var13 = (cx3) ((ArrayList) this.e).get(i3);
                        if (!cx3Var13.r() && cx3Var13.d() == i) {
                            cx3Var13.a(32);
                            view3 = null;
                            z = true;
                            cx3Var11 = cx3Var13;
                            break;
                        }
                        i3++;
                    }
                }
            } else {
                view3 = null;
                z = true;
                cx3Var11 = null;
                break;
            }
            if (cx3Var11 != null) {
                z2 = z;
                cx3Var = cx3Var11;
                view = view3;
            } else {
                z2 = false;
                cx3Var = cx3Var11;
                view = view3;
            }
        } else {
            view = null;
            z = true;
            z2 = false;
            cx3Var = null;
        }
        String str3 = "RecyclerView";
        if (cx3Var == null) {
            int size2 = arrayList2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    ArrayList arrayList5 = (ArrayList) recyclerView.s.r;
                    int size3 = arrayList5.size();
                    int i6 = 0;
                    View view4 = view;
                    while (true) {
                        if (i6 >= size3) {
                            cx3Var7 = view4;
                            view2 = view4;
                            break;
                        }
                        View view5 = (View) arrayList5.get(i6);
                        cx3 cx3VarN = RecyclerView.N(view5);
                        View view6 = view4;
                        if (cx3VarN.d() == i && !cx3VarN.h() && !cx3VarN.j()) {
                            view2 = view5;
                            cx3Var7 = view6;
                            break;
                        }
                        i6++;
                        view4 = view6;
                    }
                    if (view2 == null) {
                        int size4 = arrayList3.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size4) {
                                cx3Var8 = cx3Var7;
                                cx3Var10 = cx3Var7;
                                break;
                            }
                            cx3Var9 = (cx3) arrayList3.get(i7);
                            if (!cx3Var9.h() && cx3Var9.d() == i && !cx3Var9.f()) {
                                arrayList3.remove(i7);
                                cx3Var8 = cx3Var9;
                                cx3Var10 = cx3Var7;
                                if (!RecyclerView.Q0) {
                                    break;
                                }
                                Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + cx3Var9);
                                break;
                            }
                            i7++;
                        }
                    } else {
                        cx3 cx3VarN2 = RecyclerView.N(view2);
                        ew4 ew4Var = recyclerView.s;
                        e20 e20Var = (e20) ew4Var.q;
                        int iIndexOfChild = ((RecyclerView) ((rm2) ew4Var.p).o).indexOfChild(view2);
                        if (iIndexOfChild < 0) {
                            mj0.l(view2, "view is not a child, cannot hide ");
                            return cx3Var7;
                        }
                        if (!e20Var.s(iIndexOfChild)) {
                            throw new RuntimeException("trying to unhide a view that was not hidden" + view2);
                        }
                        e20Var.o(iIndexOfChild);
                        ew4Var.p(view2);
                        ew4 ew4Var2 = recyclerView.s;
                        e20 e20Var2 = (e20) ew4Var2.q;
                        int iIndexOfChild2 = ((RecyclerView) ((rm2) ew4Var2.p).o).indexOfChild(view2);
                        int iQ = (iIndexOfChild2 == -1 || e20Var2.s(iIndexOfChild2)) ? -1 : iIndexOfChild2 - e20Var2.q(iIndexOfChild2);
                        if (iQ == -1) {
                            StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                            sb.append(cx3VarN2);
                            nz2.m(recyclerView.C(), sb);
                            return cx3Var7;
                        }
                        recyclerView.s.f(iQ);
                        j(view2);
                        cx3VarN2.a(8224);
                        cx3Var8 = cx3VarN2;
                        break;
                    }
                } else {
                    cx3 cx3Var14 = (cx3) arrayList2.get(i5);
                    if (!cx3Var14.r() && cx3Var14.d() == i && !cx3Var14.h() && (yw3Var.g || !cx3Var14.j())) {
                        cx3Var14.a(32);
                        cx3Var10 = view;
                        cx3Var8 = cx3Var14;
                        break;
                    }
                    i5++;
                }
            }
            if (cx3Var8 != null) {
                cx3Var8 = cx3Var9;
                cx3Var10 = cx3Var7;
                cx3Var10 = cx3Var7;
                if (!cx3Var8.j()) {
                    int i8 = cx3Var8.c;
                    if (i8 < 0 || i8 >= recyclerView.z.a()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + cx3Var8 + recyclerView.C());
                    }
                    if (yw3Var.g || recyclerView.z.c(cx3Var8.c) == cx3Var8.f) {
                        dw3 dw3Var2 = recyclerView.z;
                        if (!dw3Var2.o || cx3Var8.e == dw3Var2.b(cx3Var8.c)) {
                            z8 = z;
                        } else {
                            z8 = false;
                        }
                    } else {
                        z8 = false;
                    }
                } else {
                    if (RecyclerView.P0 && !yw3Var.g) {
                        kf2.o("should not receive a removed view unless it is pre layout".concat(recyclerView.C()));
                        return cx3Var10;
                    }
                    z8 = yw3Var.g;
                }
                if (z8) {
                    cx3VarI = cx3Var8;
                    z2 = z;
                    cx3Var2 = cx3Var10;
                } else {
                    cx3Var8.a(4);
                    if (cx3Var8.k()) {
                        recyclerView.removeDetachedView(cx3Var8.a, false);
                        cx3Var8.n.l(cx3Var8);
                    } else if (cx3Var8.r()) {
                        cx3Var8.j &= -33;
                    }
                    i(cx3Var8);
                    cx3VarI = cx3Var10;
                    cx3Var2 = cx3Var10;
                }
            } else {
                cx3Var8 = cx3Var9;
                cx3Var10 = cx3Var7;
                cx3Var10 = cx3Var7;
                cx3VarI = cx3Var8;
                cx3Var2 = cx3Var10;
            }
        } else {
            cx3Var2 = view;
            cx3VarI = cx3Var;
        }
        if (cx3VarI == null) {
            int i9 = recyclerView.r.i(i, 0);
            if (i9 < 0 || i9 >= recyclerView.z.a()) {
                StringBuilder sbT2 = b11.t("Inconsistency detected. Invalid item position ", "(offset:", i, i9, ").state:");
                sbT2.append(yw3Var.b());
                sbT2.append(recyclerView.C());
                throw new IndexOutOfBoundsException(sbT2.toString());
            }
            int iC = recyclerView.z.c(i9);
            dw3 dw3Var3 = recyclerView.z;
            j2 = 3;
            if (dw3Var3.o) {
                long jB2 = dw3Var3.b(i9);
                int size5 = arrayList2.size() - 1;
                while (true) {
                    if (size5 < 0) {
                        cx3Var5 = cx3Var2;
                        str = str3;
                        int size6 = arrayList3.size() - 1;
                        while (true) {
                            if (size6 >= 0) {
                                cx3Var6 = (cx3) arrayList3.get(size6);
                                long j5 = jB2;
                                if (cx3Var6.e != j5 || cx3Var6.f()) {
                                    size6--;
                                    jB2 = j5;
                                } else {
                                    if (iC == cx3Var6.f) {
                                        arrayList3.remove(size6);
                                        break;
                                    }
                                    g(size6);
                                }
                            }
                            cx3Var6 = null;
                            break;
                        }
                    }
                    cx3 cx3Var15 = (cx3) arrayList2.get(size5);
                    str = str3;
                    long j6 = cx3Var15.e;
                    View view7 = cx3Var15.a;
                    if (j6 != jB2 || cx3Var15.r()) {
                        cx3Var5 = cx3Var2;
                        cx3Var5 = cx3Var2;
                    } else {
                        if (iC == cx3Var15.f) {
                            cx3Var5 = cx3Var2;
                            cx3Var15.a(32);
                            if (cx3Var15.j() && !yw3Var.g) {
                                cx3Var15.j = (cx3Var15.j & (-15)) | 2;
                            }
                            cx3Var6 = cx3Var15;
                            break;
                        }
                        cx3Var5 = cx3Var2;
                        arrayList2.remove(size5);
                        recyclerView.removeDetachedView(view7, false);
                        cx3 cx3VarN3 = RecyclerView.N(view7);
                        cx3VarN3.n = cx3Var5;
                        cx3VarN3.o = false;
                        cx3VarN3.j &= -33;
                        i(cx3VarN3);
                    }
                    size5--;
                    str3 = str;
                    cx3Var5 = null;
                }
                if (cx3Var6 != null) {
                    cx3Var6.c = i9;
                    cx3Var3 = cx3Var6;
                    z2 = z;
                } else {
                    cx3Var3 = cx3Var6;
                }
            } else {
                str = "RecyclerView";
            }
            if (cx3Var3 == null) {
                cx3Var3 = cx3VarI;
                if (RecyclerView.Q0) {
                    str2 = str;
                    Log.d(str2, "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                } else {
                    str2 = str;
                }
                sw3 sw3Var = (sw3) c().a.get(iC);
                if (sw3Var == null) {
                    cx3Var4 = null;
                    break;
                }
                ArrayList arrayList6 = sw3Var.a;
                if (!arrayList6.isEmpty()) {
                    int size7 = arrayList6.size() - 1;
                    while (true) {
                        if (size7 < 0) {
                            cx3Var4 = null;
                            break;
                        }
                        if (!((cx3) arrayList6.get(size7)).f()) {
                            cx3Var4 = (cx3) arrayList6.remove(size7);
                            break;
                        }
                        size7--;
                    }
                } else {
                    cx3Var4 = null;
                    break;
                }
                if (cx3Var4 != null) {
                    cx3Var4.o();
                    boolean z9 = RecyclerView.P0;
                }
                cx3VarI = cx3Var4;
            } else {
                cx3Var3 = cx3VarI;
                str2 = str;
            }
            if (cx3VarI == null) {
                cx3VarI = cx3Var3;
                long nanoTime2 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j7 = ((tw3) this.g).a(iC).c;
                    if (j7 != 0 && j7 + nanoTime2 >= j) {
                        return null;
                    }
                }
                dw3 dw3Var4 = recyclerView.z;
                dw3Var4.getClass();
                try {
                    if (ov4.a()) {
                        Trace.beginSection(String.format("RV onCreateViewHolder type=0x%X", Integer.valueOf(iC)));
                    }
                    cx3VarI = dw3Var4.i(recyclerView, iC);
                    if (cx3VarI.a.getParent() != null) {
                        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                    }
                    cx3VarI.f = iC;
                    Trace.endSection();
                    if (RecyclerView.U0 && (recyclerViewH = RecyclerView.H(cx3VarI.a)) != null) {
                        cx3VarI.b = new WeakReference(recyclerViewH);
                    }
                    long nanoTime3 = recyclerView.getNanoTime() - nanoTime2;
                    sw3 sw3VarA = ((tw3) this.g).a(iC);
                    long j8 = sw3VarA.c;
                    if (j8 != 0) {
                        nanoTime3 = (nanoTime3 / 4) + ((j8 / 4) * 3);
                    }
                    sw3VarA.c = nanoTime3;
                    if (RecyclerView.Q0) {
                        Log.d(str2, "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
        } else {
            j2 = 3;
        }
        cx3VarI = cx3Var3;
        View view8 = cx3VarI.a;
        if (z2 && !yw3Var.g) {
            int i10 = cx3VarI.j;
            if ((i10 & 8192) != 0) {
                cx3VarI.j = i10 & (-8193);
                if (yw3Var.j) {
                    jw3.b(cx3VarI);
                    jw3 jw3Var = recyclerView.c0;
                    cx3VarI.e();
                    jw3Var.getClass();
                    n50 n50Var = new n50();
                    n50Var.b(cx3VarI);
                    recyclerView.b0(cx3VarI, n50Var);
                }
            }
        }
        if (!yw3Var.g || !cx3VarI.g()) {
            if (!cx3VarI.g() || (cx3VarI.j & 2) != 0 || cx3VarI.h()) {
                if (RecyclerView.P0 && cx3VarI.j()) {
                    StringBuilder sb2 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    sb2.append(cx3VarI);
                    nz2.m(recyclerView.C(), sb2);
                    return null;
                }
                int i11 = recyclerView.r.i(i, 0);
                cx3VarI.s = null;
                cx3VarI.r = recyclerView;
                int i12 = cx3VarI.f;
                long nanoTime4 = recyclerView.getNanoTime();
                if (j != Long.MAX_VALUE) {
                    long j9 = ((tw3) this.g).a(i12).d;
                    if (j9 == 0 || j9 + nanoTime4 < j) {
                        if (cx3VarI.l()) {
                            recyclerView.attachViewToParent(view8, recyclerView.getChildCount(), view8.getLayoutParams());
                            z3 = z;
                        } else {
                            z3 = false;
                        }
                        dw3Var = recyclerView.z;
                        dw3Var.getClass();
                        if (cx3VarI.s == null) {
                            z4 = z;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            cx3VarI.c = i11;
                            j3 = nanoTime4;
                            if (dw3Var.o) {
                                cx3VarI.e = dw3Var.b(i11);
                            }
                            cx3VarI.j = (cx3VarI.j & (-520)) | 1;
                            if (ov4.a()) {
                                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(cx3VarI.f)));
                            }
                        } else {
                            j3 = nanoTime4;
                        }
                        cx3VarI.s = dw3Var;
                        if (RecyclerView.P0) {
                            if (view8.getParent() != null && view8.isAttachedToWindow() != cx3VarI.l()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + cx3VarI.l() + ", attached to window: " + view8.isAttachedToWindow() + ", holder: " + cx3VarI);
                            }
                            if (view8.getParent() == null && view8.isAttachedToWindow()) {
                                er1.o(cx3VarI, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                                return null;
                            }
                        }
                        z2 z2Var = null;
                        dw3Var.h(cx3VarI, i11, cx3VarI.e());
                        if (z4) {
                            arrayList = cx3VarI.k;
                            if (arrayList != null) {
                                arrayList.clear();
                            }
                            cx3VarI.j &= -1025;
                            layoutParams = view8.getLayoutParams();
                            if (layoutParams instanceof nw3) {
                                ((nw3) layoutParams).c = z;
                            }
                            Trace.endSection();
                        }
                        if (z3) {
                            recyclerView.detachViewFromParent(view8);
                        }
                        nanoTime = recyclerView.getNanoTime() - j3;
                        sw3 sw3VarA2 = ((tw3) this.g).a(cx3VarI.f);
                        j4 = sw3VarA2.d;
                        if (j4 != 0) {
                            nanoTime = (nanoTime / 4) + ((j4 / 4) * j2);
                        }
                        sw3VarA2.d = nanoTime;
                        accessibilityManager = recyclerView.O;
                        if (accessibilityManager == null && accessibilityManager.isEnabled()) {
                            z5 = true;
                            if (view8.getImportantForAccessibility() == 0) {
                                view8.setImportantForAccessibility(1);
                            }
                            ex3 ex3Var = recyclerView.B0;
                            if (ex3Var != null) {
                                z2 z2VarJ = ex3Var.j();
                                if (z2VarJ instanceof dx3) {
                                    dx3 dx3Var = (dx3) z2VarJ;
                                    View.AccessibilityDelegate accessibilityDelegateD = j65.d(view8);
                                    if (accessibilityDelegateD != null) {
                                        z2Var = accessibilityDelegateD instanceof y2 ? ((y2) accessibilityDelegateD).a : new z2(accessibilityDelegateD);
                                    }
                                    if (z2Var != null && z2Var != dx3Var) {
                                        dx3Var.r.put(view8, z2Var);
                                    }
                                }
                                j65.o(view8, z2VarJ);
                            }
                        } else {
                            z5 = true;
                        }
                        if (yw3Var.g) {
                            cx3VarI.g = i;
                        }
                        z6 = z5;
                    } else {
                        z6 = false;
                        z5 = z;
                    }
                } else {
                    if (cx3VarI.l()) {
                        recyclerView.attachViewToParent(view8, recyclerView.getChildCount(), view8.getLayoutParams());
                        z3 = z;
                    } else {
                        z3 = false;
                    }
                    dw3Var = recyclerView.z;
                    dw3Var.getClass();
                    if (cx3VarI.s == null) {
                        z4 = z;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        cx3VarI.c = i11;
                        j3 = nanoTime4;
                        if (dw3Var.o) {
                            cx3VarI.e = dw3Var.b(i11);
                        }
                        cx3VarI.j = (cx3VarI.j & (-520)) | 1;
                        if (ov4.a()) {
                            Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(cx3VarI.f)));
                        }
                    } else {
                        j3 = nanoTime4;
                    }
                    cx3VarI.s = dw3Var;
                    if (RecyclerView.P0) {
                        if (view8.getParent() != null) {
                        }
                        if (view8.getParent() == null) {
                            er1.o(cx3VarI, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                            return null;
                        }
                    }
                    z2 z2Var2 = null;
                    dw3Var.h(cx3VarI, i11, cx3VarI.e());
                    if (z4) {
                        arrayList = cx3VarI.k;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        cx3VarI.j &= -1025;
                        layoutParams = view8.getLayoutParams();
                        if (layoutParams instanceof nw3) {
                            ((nw3) layoutParams).c = z;
                        }
                        Trace.endSection();
                    }
                    if (z3) {
                        recyclerView.detachViewFromParent(view8);
                    }
                    nanoTime = recyclerView.getNanoTime() - j3;
                    sw3 sw3VarA3 = ((tw3) this.g).a(cx3VarI.f);
                    j4 = sw3VarA3.d;
                    if (j4 != 0) {
                        nanoTime = (nanoTime / 4) + ((j4 / 4) * j2);
                    }
                    sw3VarA3.d = nanoTime;
                    accessibilityManager = recyclerView.O;
                    if (accessibilityManager == null) {
                        z5 = true;
                    } else {
                        z5 = true;
                    }
                    if (yw3Var.g) {
                        cx3VarI.g = i;
                    }
                    z6 = z5;
                }
            }
            layoutParams2 = view8.getLayoutParams();
            if (layoutParams2 == null) {
                nw3Var = (nw3) recyclerView.generateDefaultLayoutParams();
                view8.setLayoutParams(nw3Var);
            } else if (recyclerView.checkLayoutParams(layoutParams2)) {
                nw3Var = (nw3) layoutParams2;
            } else {
                nw3Var = (nw3) recyclerView.generateLayoutParams(layoutParams2);
                view8.setLayoutParams(nw3Var);
            }
            nw3Var.a = cx3VarI;
            if (z2 || !z6) {
                z7 = false;
            } else {
                z7 = z5;
            }
            nw3Var.d = z7;
            return cx3VarI;
        }
        cx3VarI.g = i;
        z5 = z;
        z6 = false;
        layoutParams2 = view8.getLayoutParams();
        if (layoutParams2 == null) {
            nw3Var = (nw3) recyclerView.generateDefaultLayoutParams();
            view8.setLayoutParams(nw3Var);
        } else if (recyclerView.checkLayoutParams(layoutParams2)) {
            nw3Var = (nw3) recyclerView.generateLayoutParams(layoutParams2);
            view8.setLayoutParams(nw3Var);
        } else {
            nw3Var = (nw3) layoutParams2;
        }
        nw3Var.a = cx3VarI;
        if (z2) {
            z7 = false;
        } else {
            z7 = false;
        }
        nw3Var.d = z7;
        return cx3VarI;
    }

    public void l(cx3 cx3Var) {
        if (cx3Var.o) {
            ((ArrayList) this.e).remove(cx3Var);
        } else {
            ((ArrayList) this.d).remove(cx3Var);
        }
        cx3Var.n = null;
        cx3Var.o = false;
        cx3Var.j &= -33;
    }

    public void m() {
        ArrayList arrayList = (ArrayList) this.f;
        mw3 mw3Var = ((RecyclerView) this.h).A;
        this.c = this.b + (mw3Var != null ? mw3Var.j : 0);
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.c; size--) {
            g(size);
        }
    }

    public hm2(fg4 fg4Var, ei3 ei3Var, eo2 eo2Var, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.d = fg4Var;
        this.e = ei3Var;
        this.f = eo2Var;
        list.getClass();
        this.a = list;
        this.g = charSequence;
        this.b = i;
        this.c = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
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

    public hm2(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.a = Collections.unmodifiableList(arrayList);
        this.b = 2;
        this.c = 2;
    }
}
