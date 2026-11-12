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

    public /* synthetic */ eg0(Object r1, Object r2, Object r3, int r4) {
        this.n = r4;
        this.o = r1;
        this.p = r2;
        this.q = r3;
    }

    @Override // defpackage.e93
    public void a(Exception r3) {
        CredentialProviderGetRestoreCredentialController.m51$r8$lambda$JhAAZy1dMYZ2AM86jeMkBv3itw((CancellationSignal) this.o, (Executor) this.p, (vf0) this.q, r3);
    }

    @Override // defpackage.wc0
    public void accept(Object r3) {
        ue1 r0 = (ue1) this.o;
        mt2 r1 = (mt2) this.p;
        un2 r2 = (un2) this.q;
        ((st2) r3).m(r0.o, r1, r2);
    }

    @Override // defpackage.mk
    public ic2 apply(Object r12) {
        int r0 = this.n;
        int r1 = 18;
        Object r3 = this.q;
        Object r4 = this.p;
        Object r11 = this.o;
        switch(r0) {
            case 8: goto L6;
            default: goto L4;
        };
    L4:
        tn2 r6 = (tn2) r11;
        fr2 r8 = (fr2) r4;
        Handler r13 = r6.l;
        ur2 r14 = new ur2(r6, r8, new t6(r6, (ht2) r3, r8, (List) r12, 25));
        ab4 r2 = new ab4(0);
        String r5 = f35.a;
        lb4 r7 = new lb4();
        f35.W(r13, new qo2(r7, r14, r2, r1));
        return r7;
    L6:
        tn2 r15 = (tn2) r11;
        Handler r9 = r15.l;
        ur2 r16 = new ur2(r15, (fr2) r4, new qo2(r15, (zr2) r3, (gr2) r12, 2));
        ab4 r17 = new ab4(0);
        String r10 = f35.a;
        lb4 r18 = new lb4();
        f35.W(r9, new qo2(r18, r16, r17, r1));
        return r18;
    }

    @Override // defpackage.ks2
    public void b(fr2 r3) {
        ls2 r0 = (ls2) this.o;
        va4 r1 = (va4) this.p;
        Bundle r2 = (Bundle) this.q;
        r0.g.q(r3, r1, r2);
    }

    @Override // defpackage.zd1
    public void d(String r6, Bundle r7) {
        ni4 r8 = (ni4) this.o;
        SongListPageFragment r0 = (SongListPageFragment) this.p;
        si4 r5 = (si4) this.q;
        Child r9 = (Child) r7.getParcelable("TRACK_OBJECT");
        if (r9 != null) goto L5;
        return;
    L5:
        List r1 = r8.u;
        r1.getClass();
        Iterator r2 = r1.iterator();
    L7:
        if (r2.hasNext() == false) goto L11;
        Object r3 = r2.next();
        if (h12.c(((Child) r3).getId(), r9.getId()) == false) goto L7;
    L12:
        Child r4 = (Child) r3;
        if (r4 == null) goto L16;
        r9 = r4;
    L16:
        jz4.P(r0, r8, gb.O(r9), true, r5);
        return;
    L11:
        r3 = null;
        goto L12
    }

    @Override // defpackage.yr2
    public void f(er2 r3, int r4) {
        tn2 r0 = (tn2) this.o;
        String r1 = (String) this.p;
        jn2 r2 = (jn2) this.q;
        if (r0.F.c(r3, r1) == true) goto L5;
        return;
    L5:
        r3.z(r4, r1, r2);
    }

    @Override // defpackage.mn0
    public gy3 g(int r10, sv4 r11, int[] r12) {
        jn0 r5 = (jn0) this.o;
        String r7 = (String) this.p;
        String r8 = (String) this.q;
        uw1 r9 = yw1.j();
        int r4 = 0;
    L4:
        if (r4 >= r11.a) goto L7;
        r9.c(new ln0(r10, r11, r4, r5, r12[r4], r7, r8));
        r4 = r4 + 1;
        goto L4
    L7:
        return r9.f();
    }

    @Override // defpackage.qc2
    public void invoke(Object r3) {
        ml3 r0 = (ml3) this.o;
        ml3 r1 = (ml3) this.p;
        Integer r2 = (Integer) this.q;
        ((oi3) r3).k(((lk3) r0.a).c.a, ((lk3) r1.a).c.a, r2.intValue());
    }

    @Override // defpackage.cp3
    public void j(Preference r5) {
        vb4 r6 = (vb4) this.o;
        String r0 = (String) this.p;
        String r4 = (String) this.q;
        vg2 r1 = new vg2(r6.Z(), 0);
        r1.p(R.string.homemusic_leave_title);
        r1.a.f = r6.t(R.string.homemusic_leave_message, new Object[]{r0, r4});
        r1.l(R.string.homemusic_leave_ok, new vr(2, r6)).j(android.R.string.cancel, null).h();
    }

    @Override // defpackage.py
    public Object k(oy r6) {
        ne0 r0 = (ne0) this.o;
        ze0 r1 = (ze0) this.p;
        wf1 r5 = (wf1) this.q;
        int r4 = 17;
        qa1 r3 = new qa1(r4, (s22) r0.K(fz0.h0));
        n04 r2 = r6.c;
        if (r2 == null) goto L5;
        r2.f(r3, fq0.n);
    L5:
        vd0 r7 = null;
        return fu.G(te5.a(r0), null, r1, new r(r5, r6, r7, 8), 1);
    }
}
