package defpackage;

import android.content.SharedPreferences;
import android.graphics.Point;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.credentials.playservices.controllers.GetRestoreCredential.CredentialProviderGetDigitalCredentialController;
import androidx.preference.Preference;
import app.homemusic.R;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dg0 implements e93, fz, mn0, cp3, mk, ks2 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    public /* synthetic */ dg0(Object r1, Object r2, Object r3, Object r4, int r5) {
        this.n = r5;
        this.o = r1;
        this.p = r2;
        this.q = r3;
        this.r = r4;
    }

    @Override // defpackage.e93
    public void a(Exception r4) {
        CredentialProviderGetDigitalCredentialController.$r8$lambda$iQQ111WndOqJplgmKt5mtJ5jYgo((CredentialProviderGetDigitalCredentialController) this.o, (CancellationSignal) this.p, (Executor) this.q, (vf0) this.r, r4);
    }

    @Override // defpackage.mk
    public ic2 apply(Object r13) {
        fr2 r0 = (fr2) this.o;
        kn2 r1 = (kn2) this.p;
        String r2 = (String) this.q;
        jn2 r12 = (jn2) this.r;
        m92 r14 = (m92) r13;
        if (r14.a != 0) goto L37;
        Object r3 = r14.c;
        if (r3 == null) goto L37;
        Boolean r4 = ((gn2) r3).d.q;
        if (r4 == null) goto L37;
        if (r4.booleanValue() == false) goto L37;
        if (r0.b == 0) goto L36;
        r1.getClass();
        rr2.l(!TextUtils.isEmpty(r2));
        tn2 r15 = r1.a;
        if (r15.y == true) goto L16;
    L34:
        r15.e(r0, new eg0(r15, r2, r12, 6));
        goto L36
    L16:
        if (r15.k(r0) == false) goto L34;
        yw1 r5 = r15.h.f.u();
        int r6 = 0;
        int r7 = 0;
    L19:
        if (r7 >= r5.size()) goto L24;
        fr2 r8 = (fr2) r5.get(r7);
        if (tn2.m(r8) == true) goto L22;
        r7 = r7 + 1;
        goto L19
    L22:
        r0 = r8;
    L32:
        if (r0 != null) goto L34;
    L24:
        yw1 r9 = r15.g.f.u();
    L26:
        if (r6 >= r9.size()) goto L31;
        fr2 r10 = (fr2) r9.get(r6);
        if (tn2.m(r10) == true) goto L29;
        r6 = r6 + 1;
        goto L26
    L29:
        r0 = r10;
        goto L32
    L31:
        r0 = null;
    L36:
        return new mw1(new m92(0, SystemClock.elapsedRealtime(), null, null, null, 1));
    L37:
        int r16 = r14.a;
        if (r16 != 0) goto L42;
        r16 = -3;
    L42:
        return new mw1(m92.b(r16));
    }

    @Override // defpackage.ks2
    public void b(fr2 r4) {
        ls2 r0 = (ls2) this.o;
        va4 r1 = (va4) this.p;
        Bundle r2 = (Bundle) this.q;
        ResultReceiver r3 = (ResultReceiver) this.r;
        tn2 r5 = r0.g;
        if (r2 != null) goto L5;
        r2 = Bundle.EMPTY;
    L5:
        ic2 r6 = r5.q(r4, r1, r2);
        if (r3 == null) goto L9;
        r6.f(new ur2(1, r6, r3), gq0.n);
        return;
    }

    @Override // defpackage.mn0
    public gy3 g(int r17, sv4 r18, int[] r19) {
        sv4 r2 = r18;
        jn0 r4 = (jn0) this.o;
        String r6 = (String) this.p;
        int[] r1 = (int[]) this.q;
        Point r0 = (Point) this.r;
        int r7 = r1[r17];
        if (r0 == null) goto L5;
        int r3 = r0.x;
    L6:
        if (r0 == null) goto L8;
        int r5 = r0.y;
    L9:
        boolean r8 = r4.l;
        if (r3 == Integer.MAX_VALUE) goto L41;
        if (r5 == Integer.MAX_VALUE) goto L41;
        int r9 = Integer.MAX_VALUE;
        int r10 = 0;
    L15:
        if (r10 >= r2.a) goto L40;
        tb1 r12 = r2.d[r10];
        int r13 = r12.u;
        int r14 = r12.v;
        if (r13 <= 0) goto L39;
        if (r14 <= 0) goto L39;
        if (r8 == false) goto L28;
        if (r13 <= r14) goto L22;
        boolean r15 = true;
    L23:
        if (r3 <= r5) goto L25;
        boolean r11 = true;
    L26:
        if (r15 == r11) goto L28;
        int r16 = r5;
        int r110 = r3;
    L29:
        int r111 = r13 * r110;
        int r20 = r14 * r16;
        if (r111 < r20) goto L32;
        Point r112 = new Point(r16, f35.g(r20, r13));
    L33:
        int r21 = r12.u;
        int r113 = r21 * r14;
        if (r21 < ((int) (r112.x * 0.98f))) goto L39;
        if (r14 < ((int) (r112.y * 0.98f))) goto L39;
        if (r113 >= r9) goto L39;
        r9 = r113;
        goto L39
    L32:
        r112 = new Point(f35.g(r111, r14), r110);
        goto L33
    L25:
        r11 = false;
        goto L26
    L22:
        r15 = false;
    L28:
        r110 = r5;
        r16 = r3;
    L39:
        r10 = r10 + 1;
        goto L15
    L40:
        int r22 = r9;
    L42:
        uw1 r114 = yw1.j();
        int r23 = 0;
    L44:
        if (r23 >= r2.a) goto L61;
        tb1 r24 = r2.d[r23];
        int r25 = r24.u;
        if (r25 == (-1)) goto L52;
        int r26 = r24.v;
        if (r26 == (-1)) goto L52;
        int r27 = r25 * r26;
    L53:
        if (r22 == Integer.MAX_VALUE) goto L58;
        if (r27 == (-1)) goto L57;
        if (r27 <= r22) goto L58;
    L57:
        boolean r28 = false;
    L59:
        r114.c(new on0(r17, r2, r23, r4, r19[r23], r6, r7, r28));
        r23 = r23 + 1;
        r2 = r18;
    L58:
        r28 = true;
    L52:
        r27 = -1;
        goto L53
    L61:
        return r114.f();
    L41:
        r22 = Integer.MAX_VALUE;
        goto L42
    L8:
        r5 = r4.j;
        goto L9
    L5:
        r3 = r4.i;
        goto L6
    }

    @Override // defpackage.cp3
    public void j(Preference r10) {
        int r11 = this.n;
        Object r3 = this.r;
        Object r4 = this.q;
        Object r5 = this.p;
        Object r9 = this.o;
        switch(r11) {
            case 3: goto L9;
            default: goto L4;
        };
    L4:
        h62 r12 = (h62) r9;
        vg2 r13 = new vg2(r12.Z(), 0);
        vg2 r14 = r13.o((String) r5);
        r14.i(R.string.lan_revoke_question);
        f9 r15 = r14.l(R.string.lan_revoke, new rn1((SharedPreferences) r4, r12, (String) r3, 3)).j(android.R.string.cancel, null).create();
        r12.U0 = null;
        f9 r0 = r12.K0;
        if (r0 == null) goto L7;
        r0.dismiss();
    L7:
        r12.K0 = r15;
        r15.show();
        return;
    L9:
        jx3 r16 = (jx3) r9;
        vb4 r6 = (vb4) r5;
        jx3 r7 = (jx3) r4;
        Preference r8 = (Preference) r3;
        String r17 = (String) r16.n;
        if (r17 == null) goto L12;
        vg2 r18 = new vg2(r6.Z(), 0);
        r18.a.f = r6.t(R.string.homemusic_settings_google_unlink, new Object[]{r17});
        r18.l(R.string.homemusic_settings_google_unlink_ok, new vs1(r6, r16, r7, r8, 0)).j(android.R.string.cancel, null).h();
        return;
    L12:
        String r19 = (String) r7.n;
        if (r19 == null) goto L18;
        ud3.M(r6.X(), r19, new na4(r6, r16, r7, r8));
        return;
    }

    @Override // defpackage.fz
    public void onCancel() {
        View r0 = (View) this.o;
        xm0 r1 = (xm0) this.p;
        tm0 r2 = (tm0) this.q;
        pj4 r3 = (pj4) this.r;
        r0.clearAnimation();
        r1.a.endViewTransition(r0);
        r2.d();
        if (ld1.I(2) == false) goto L6;
        Log.v("FragmentManager", "Animation from operation " + r3 + " has been cancelled.");
        return;
    }
}
