package defpackage;

import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetRestoreCredentialController;
import androidx.preference.Preference;
import app.homemusic.R;
import com.eddyizm.tempus.subsonic.models.Child;
import com.eddyizm.tempus.ui.fragment.SongListPageFragment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class eg0 implements e93, mn0, zd1, cp3, py, qc2, yr2, ks2, mk, wc0 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    public /* synthetic */ eg0(Object obj, Object obj2, Object obj3, int i) {
        this.n = i;
        this.o = obj;
        this.p = obj2;
        this.q = obj3;
    }

    @Override // defpackage.e93
    public void a(Exception exc) {
        CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$1((CancellationSignal) this.o, (Executor) this.p, (vf0) this.q, exc);
    }

    @Override // defpackage.wc0
    public void accept(Object obj) {
        ue1 ue1Var = (ue1) this.o;
        ((st2) obj).m(ue1Var.o, (mt2) this.p, (un2) this.q);
    }

    @Override // defpackage.mk
    public ic2 apply(Object obj) {
        int i = this.n;
        int i2 = 18;
        Object obj2 = this.q;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 8:
                tn2 tn2Var = (tn2) obj4;
                Handler handler = tn2Var.l;
                ur2 ur2Var = new ur2(tn2Var, (fr2) obj3, new qo2(tn2Var, (zr2) obj2, (gr2) obj, 2));
                ab4 ab4Var = new ab4(0);
                String str = f35.a;
                lb4 lb4Var = new lb4();
                f35.W(handler, new qo2(lb4Var, ur2Var, ab4Var, i2));
                return lb4Var;
            default:
                tn2 tn2Var2 = (tn2) obj4;
                fr2 fr2Var = (fr2) obj3;
                Handler handler2 = tn2Var2.l;
                ur2 ur2Var2 = new ur2(tn2Var2, fr2Var, new t6(tn2Var2, (ht2) obj2, fr2Var, (List) obj, 25));
                ab4 ab4Var2 = new ab4(0);
                String str2 = f35.a;
                lb4 lb4Var2 = new lb4();
                f35.W(handler2, new qo2(lb4Var2, ur2Var2, ab4Var2, i2));
                return lb4Var2;
        }
    }

    @Override // defpackage.ks2
    public void b(fr2 fr2Var) {
        ls2 ls2Var = (ls2) this.o;
        ls2Var.g.q(fr2Var, (va4) this.p, (Bundle) this.q);
    }

    @Override // defpackage.zd1
    public void d(String str, Bundle bundle) {
        Object next;
        ni4 ni4Var = (ni4) this.o;
        SongListPageFragment songListPageFragment = (SongListPageFragment) this.p;
        si4 si4Var = (si4) this.q;
        Child child = (Child) bundle.getParcelable("TRACK_OBJECT");
        if (child == null) {
            return;
        }
        List list = ni4Var.u;
        list.getClass();
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!h12.c(((Child) next).getId(), child.getId()));
        Child child2 = (Child) next;
        if (child2 != null) {
            child = child2;
        }
        jz4.P(songListPageFragment, ni4Var, gb.O(child), true, si4Var);
    }

    @Override // defpackage.yr2
    public void f(er2 er2Var, int i) {
        tn2 tn2Var = (tn2) this.o;
        String str = (String) this.p;
        jn2 jn2Var = (jn2) this.q;
        if (tn2Var.F.c(er2Var, str)) {
            er2Var.z(i, str, jn2Var);
        }
    }

    @Override // defpackage.mn0
    public gy3 g(int i, sv4 sv4Var, int[] iArr) {
        jn0 jn0Var = (jn0) this.o;
        String str = (String) this.p;
        String str2 = (String) this.q;
        uw1 uw1VarJ = yw1.j();
        for (int i2 = 0; i2 < sv4Var.a; i2++) {
            uw1VarJ.c(new ln0(i, sv4Var, i2, jn0Var, iArr[i2], str, str2));
        }
        return uw1VarJ.f();
    }

    @Override // defpackage.qc2
    public void invoke(Object obj) {
        ((oi3) obj).k(((lk3) ((ml3) this.o).a).c.a, ((lk3) ((ml3) this.p).a).c.a, ((Integer) this.q).intValue());
    }

    @Override // defpackage.cp3
    public void j(Preference preference) {
        vb4 vb4Var = (vb4) this.o;
        String str = (String) this.p;
        String str2 = (String) this.q;
        vg2 vg2Var = new vg2(vb4Var.Z(), 0);
        vg2Var.p(R.string.homemusic_leave_title);
        vg2Var.a.f = vb4Var.t(R.string.homemusic_leave_message, str, str2);
        vg2Var.l(R.string.homemusic_leave_ok, new vr(2, vb4Var)).j(android.R.string.cancel, null).h();
    }

    @Override // defpackage.py
    public Object k(oy oyVar) {
        ne0 ne0Var = (ne0) this.o;
        ze0 ze0Var = (ze0) this.p;
        wf1 wf1Var = (wf1) this.q;
        qa1 qa1Var = new qa1(17, (s22) ne0Var.K(fz0.h0));
        n04 n04Var = oyVar.c;
        if (n04Var != null) {
            n04Var.f(qa1Var, fq0.n);
        }
        return fu.G(te5.a(ne0Var), null, ze0Var, new r(wf1Var, oyVar, null, 8), 1);
    }
}
