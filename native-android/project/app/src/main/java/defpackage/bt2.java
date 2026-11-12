package defpackage;

import android.content.Intent;
import android.view.MenuItem;
import android.view.ViewParent;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.preference.Preference;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bt2 implements it2, wc0, q43, md4, cp3, py {
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;

    public /* synthetic */ bt2(Object obj, Object obj2) {
        this.n = obj;
        this.o = obj2;
    }

    @Override // defpackage.q43
    public boolean a(MenuItem menuItem) {
        v23 v23Var = (v23) this.n;
        NavigationView navigationView = (NavigationView) this.o;
        v23Var.getClass();
        navigationView.getClass();
        menuItem.getClass();
        boolean zC = uo.C(menuItem, v23Var);
        if (zC) {
            ViewParent parent = navigationView.getParent();
            if (parent instanceof DrawerLayout) {
                ((DrawerLayout) parent).d();
                return zC;
            }
            BottomSheetBehavior bottomSheetBehaviorR = uo.r(navigationView);
            if (bottomSheetBehaviorR != null) {
                bottomSheetBehaviorR.J(5);
            }
        }
        return zC;
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ue1 ue1Var = (ue1) this.n;
        ((st2) obj).l(ue1Var.o, (mt2) ue1Var.p, (un2) this.o);
    }

    @Override // defpackage.md4
    public boolean b() {
        vp3 vp3Var = (vp3) this.n;
        zn znVar = (zn) this.o;
        if (!vp3Var.q) {
            vp3Var.h();
            long jA = zn.a(vp3Var.o, znVar.a);
            znVar.a = jA;
            vp3Var.q = !vp3Var.g(vp3Var.n, jA + znVar.b);
        }
        return vp3Var.q;
    }

    @Override // defpackage.it2
    public Object h(tn2 tn2Var, fr2 fr2Var, int i) {
        return tn2Var.l() ? new mw1(new ab4(-100)) : f35.h0((ic2) ((it2) this.n).h(tn2Var, fr2Var, i), new eg0(tn2Var, fr2Var, (ht2) this.o, 9));
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        vb4 vb4Var = (vb4) this.n;
        vb4Var.z0.a((Intent) this.o);
    }

    @Override // defpackage.py
    public Object k(oy oyVar) {
        Executor executor = (Executor) this.n;
        gf1 gf1Var = (gf1) this.o;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        jc2 jc2Var = new jc2(atomicBoolean, 1);
        n04 n04Var = oyVar.c;
        if (n04Var != null) {
            n04Var.f(jc2Var, fq0.n);
        }
        executor.execute(new qo2(atomicBoolean, oyVar, gf1Var, 22));
        return j15.a;
    }
}
