package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bw3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ RecyclerView o;

    public /* synthetic */ bw3(RecyclerView recyclerView, int i) {
        this.n = i;
        this.o = recyclerView;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        int i = this.n;
        RecyclerView recyclerView = this.o;
        switch (i) {
            case 0:
                if (recyclerView.H && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.F) {
                        recyclerView.requestLayout();
                    } else if (!recyclerView.K) {
                        recyclerView.p();
                    } else {
                        recyclerView.J = true;
                    }
                    break;
                }
                break;
            default:
                jw3 jw3Var = recyclerView.c0;
                if (jw3Var != null) {
                    pl0 pl0Var = (pl0) jw3Var;
                    long j = pl0Var.d;
                    ArrayList arrayList = pl0Var.h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = pl0Var.j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = pl0Var.k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = pl0Var.i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
                        z = false;
                    } else {
                        int size = arrayList.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            cx3 cx3Var = (cx3) obj;
                            View view = cx3Var.a;
                            ArrayList arrayList5 = arrayList;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            pl0Var.q.add(cx3Var);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new kl0(pl0Var, cx3Var, viewPropertyAnimatorAnimate, view)).start();
                            arrayList = arrayList5;
                            zIsEmpty = zIsEmpty;
                            zIsEmpty2 = zIsEmpty2;
                        }
                        boolean z2 = zIsEmpty;
                        boolean z3 = zIsEmpty2;
                        arrayList.clear();
                        if (!z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            pl0Var.m.add(arrayList6);
                            arrayList2.clear();
                            jl0 jl0Var = new jl0(pl0Var, arrayList6, 0);
                            if (z2) {
                                jl0Var.run();
                            } else {
                                View view2 = ((ol0) arrayList6.get(0)).a.a;
                                WeakHashMap weakHashMap = j65.a;
                                view2.postOnAnimationDelayed(jl0Var, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            pl0Var.n.add(arrayList7);
                            arrayList3.clear();
                            jl0 jl0Var2 = new jl0(pl0Var, arrayList7, 1);
                            if (z2) {
                                jl0Var2.run();
                            } else {
                                View view3 = ((nl0) arrayList7.get(0)).a.a;
                                WeakHashMap weakHashMap2 = j65.a;
                                view3.postOnAnimationDelayed(jl0Var2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z = false;
                        } else {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList4);
                            pl0Var.l.add(arrayList8);
                            arrayList4.clear();
                            jl0 jl0Var3 = new jl0(pl0Var, arrayList8, 2);
                            if (z2 && z3 && zIsEmpty3) {
                                jl0Var3.run();
                                z = false;
                            } else {
                                if (z2) {
                                    j = 0;
                                }
                                long jMax = Math.max(!z3 ? pl0Var.e : 0L, zIsEmpty3 ? 0L : pl0Var.f) + j;
                                z = false;
                                View view4 = ((cx3) arrayList8.get(0)).a;
                                WeakHashMap weakHashMap3 = j65.a;
                                view4.postOnAnimationDelayed(jl0Var3, jMax);
                            }
                        }
                    }
                } else {
                    z = false;
                }
                recyclerView.A0 = z;
                break;
        }
    }
}
