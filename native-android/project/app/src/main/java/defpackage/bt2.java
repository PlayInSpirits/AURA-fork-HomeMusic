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

    public /* synthetic */ bt2(Object r1, Object r2) {
        this.n = r1;
        this.o = r2;
    }

    @Override // defpackage.q43
    public boolean a(MenuItem r3) {
        v23 r0 = (v23) this.n;
        NavigationView r2 = (NavigationView) this.o;
        r0.getClass();
        r2.getClass();
        r3.getClass();
        boolean r4 = uo.C(r3, r0);
        if (r4 == false) goto L11;
        ViewParent r1 = r2.getParent();
        if ((r1 instanceof DrawerLayout) == false) goto L8;
        ((DrawerLayout) r1).d();
        return r4;
    L8:
        BottomSheetBehavior r5 = uo.r(r2);
        if (r5 == null) goto L11;
        r5.J(5);
    L11:
        return r4;
    }

    @Override // defpackage.wc0
    public void accept(Object r3) {
        ue1 r0 = (ue1) this.n;
        un2 r2 = (un2) this.o;
        ((st2) r3).l(r0.o, (mt2) r0.p, r2);
    }

    @Override // defpackage.md4
    public boolean b() {
        vp3 r0 = (vp3) this.n;
        zn r7 = (zn) this.o;
        if (r0.q == true) goto L6;
        r0.h();
        long r1 = zn.a(r0.o, r7.a);
        r7.a = r1;
        r0.q = !r0.g(r0.n, r1 + r7.b);
    L6:
        return r0.q;
    }

    @Override // defpackage.it2
    public Object h(tn2 r3, fr2 r4, int r5) {
        it2 r0 = (it2) this.n;
        ht2 r2 = (ht2) this.o;
        if (r3.l() == false) goto L7;
        return new mw1(new ab4(-100));
    L7:
        return f35.h0((ic2) r0.h(r3, r4, r5), new eg0(r3, r4, r2, 9));
    }

    @Override // defpackage.cp3
    public void j(Preference r1) {
        vb4 r2 = (vb4) this.n;
        Intent r0 = (Intent) this.o;
        r2.z0.a(r0);
    }

    @Override // defpackage.py
    public Object k(oy r6) {
        Executor r0 = (Executor) this.n;
        gf1 r5 = (gf1) this.o;
        AtomicBoolean r1 = new AtomicBoolean(false);
        jc2 r2 = new jc2(r1, 1);
        n04 r3 = r6.c;
        if (r3 == null) goto L5;
        r3.f(r2, fq0.n);
    L5:
        r0.execute(new qo2(r1, r6, r5, 22));
        return j15.a;
    }
}
