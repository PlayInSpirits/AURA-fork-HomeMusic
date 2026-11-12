package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceHolder;
import androidx.media3.common.PlaybackException;
import androidx.media3.session.LegacyConversions$ConversionException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class im2 implements rk2 {
    public final Context a;
    public final sk2 b;
    public final cb4 c;
    public final tc2 d;
    public final gm2 e;
    public final xs f;
    public final Bundle g;
    public wo0 i;
    public jj2 j;
    public boolean k;
    public boolean l;
    public boolean o;
    public hm2 m = new hm2();
    public hm2 n = new hm2();
    public ml3 p = new ml3(12);
    public final long h = 100;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public im2(Context context, sk2 sk2Var, cb4 cb4Var, Bundle bundle, Looper looper, xs xsVar) {
        this.d = new tc2(looper, vp4.a, new em2(this));
        this.a = context;
        this.b = sk2Var;
        this.e = new gm2(this, looper);
        this.c = cb4Var;
        this.g = bundle;
        this.f = xsVar;
        gy3 gy3Var = gy3.r;
    }

    public static List X0(ArrayList arrayList) {
        if (arrayList == null) {
            return Collections.EMPTY_LIST;
        }
        hd5 hd5Var = ju2.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static ei3 Y0(ei3 ei3Var) {
        if (ei3Var == null) {
            return null;
        }
        if (ei3Var.q > 0.0f) {
            return ei3Var;
        }
        l93.q0("MCImplLegacy", "Adjusting playback speed to 1.0f because negative playback speed isn't supported.");
        ArrayList arrayList = new ArrayList();
        long j = ei3Var.p;
        long j2 = ei3Var.r;
        int i = ei3Var.s;
        CharSequence charSequence = ei3Var.t;
        List list = ei3Var.v;
        if (list != null) {
            arrayList.addAll(list);
        }
        return new ei3(ei3Var.n, ei3Var.o, j, 1.0f, j2, i, charSequence, ei3Var.u, arrayList, ei3Var.w, ei3Var.x);
    }

    public static pi3 Z0(int i, gn2 gn2Var, long j, boolean z) {
        return new pi3(null, i, gn2Var, null, i, j, j, z ? 0 : -1, z ? 0 : -1);
    }

    @Override // defpackage.rk2
    public final void A() {
        ((MediaController.TransportControls) this.i.A().o).skipToPrevious();
    }

    @Override // defpackage.rk2
    public final void A0() {
        l93.q0("MCImplLegacy", "Session doesn't support muting the player");
    }

    @Override // defpackage.rk2
    public final float B() {
        return 1.0f;
    }

    @Override // defpackage.rk2
    public final void B0(gn2 gn2Var) {
        s0(gn2Var);
    }

    @Override // defpackage.rk2
    public final void C() {
        f1(o0(), 0L);
    }

    @Override // defpackage.rk2
    public final void C0() {
        J(1);
    }

    @Override // defpackage.rk2
    public final il D() {
        return ((lk3) this.p.a).q;
    }

    @Override // defpackage.rk2
    public final boolean D0() {
        return ((lk3) this.p.a).i;
    }

    @Override // defpackage.rk2
    public final void E(int i, boolean z) {
        if (z != y0()) {
            lk3 lk3VarC = ((lk3) this.p.a).c(j(), z);
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarC, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        ((xk2) this.i.n).a.adjustVolume(z ? -100 : 100, i);
    }

    @Override // defpackage.rk2
    public final cw4 E0() {
        return cw4.J;
    }

    @Override // defpackage.rk2
    public final hp0 F() {
        return ((lk3) this.p.a).s;
    }

    @Override // defpackage.rk2
    public final long F0() {
        return b0();
    }

    @Override // defpackage.rk2
    public final void G() {
        d0(1);
    }

    @Override // defpackage.rk2
    public final void G0(int i) {
        H(i, 1);
    }

    @Override // defpackage.rk2
    public final void H(int i, int i2) {
        hp0 hp0VarF = F();
        int i3 = hp0VarF.b;
        int i4 = hp0VarF.c;
        if (i3 <= i && (i4 == 0 || i <= i4)) {
            lk3 lk3VarC = ((lk3) this.p.a).c(i, y0());
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarC, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        ((xk2) this.i.n).a.setVolumeTo(i, i2);
    }

    @Override // defpackage.rk2
    public final void H0() {
        ((MediaController.TransportControls) this.i.A().o).skipToNext();
    }

    @Override // defpackage.rk2
    public final boolean I() {
        return this.l;
    }

    @Override // defpackage.rk2
    public final void I0() {
        ((MediaController.TransportControls) this.i.A().o).fastForward();
    }

    @Override // defpackage.rk2
    public final void J(int i) {
        int iJ = j();
        int i2 = F().c;
        if (i2 == 0 || iJ + 1 <= i2) {
            lk3 lk3VarC = ((lk3) this.p.a).c(iJ + 1, y0());
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarC, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        ((xk2) this.i.n).a.adjustVolume(1, i);
    }

    @Override // defpackage.rk2
    public final void J0() {
        ((MediaController.TransportControls) this.i.A().o).rewind();
    }

    @Override // defpackage.rk2
    public final int K() {
        return -1;
    }

    @Override // defpackage.rk2
    public final do2 K0() {
        gn2 gn2VarS = ((lk3) this.p.a).s();
        return gn2VarS == null ? do2.K : gn2VarS.d;
    }

    @Override // defpackage.rk2
    public final void L(int i, int i2, List list) {
        rr2.l(i >= 0 && i <= i2);
        int iO = ((xs3) ((lk3) this.p.a).j).o();
        if (i > iO) {
            return;
        }
        int iMin = Math.min(i2, iO);
        N0(list, iMin);
        P(i, iMin);
    }

    @Override // defpackage.rk2
    public final void L0(List list) {
        T(list, 0, -9223372036854775807L);
    }

    @Override // defpackage.rk2
    public final void M(cw4 cw4Var) {
    }

    @Override // defpackage.rk2
    public final long M0() {
        long jC = ju2.c((lk3) this.p.a, this.q, this.r, a1().g);
        this.q = jC;
        return jC;
    }

    @Override // defpackage.rk2
    public final void N(int i) {
        P(i, i + 1);
    }

    @Override // defpackage.rk2
    public final void N0(List list, int i) {
        rr2.l(i >= 0);
        if (list.isEmpty()) {
            return;
        }
        xs3 xs3Var = (xs3) ((lk3) this.p.a).j;
        if (xs3Var.p()) {
            T(list, 0, -9223372036854775807L);
            return;
        }
        int iMin = Math.min(i, x0().o());
        xs3 xs3VarQ = xs3Var.q(list, iMin);
        int iO0 = o0();
        int size = list.size();
        if (iO0 >= iMin) {
            iO0 += size;
        }
        lk3 lk3VarM = ((lk3) this.p.a).m(xs3VarQ, iO0);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarM, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (d1()) {
            W0(list, iMin);
        }
    }

    @Override // defpackage.rk2
    public final void O(long j) {
        f1(o0(), j);
    }

    @Override // defpackage.rk2
    public final long O0() {
        return ((lk3) this.p.a).C;
    }

    @Override // defpackage.rk2
    public final void P(int i, int i2) {
        rr2.l(i >= 0 && i2 >= i);
        int iO = x0().o();
        int iMin = Math.min(i2, iO);
        if (i >= iO || i == iMin) {
            return;
        }
        xs3 xs3Var = (xs3) ((lk3) this.p.a).j;
        xs3Var.getClass();
        uw1 uw1Var = new uw1(4);
        yw1 yw1Var = xs3Var.e;
        uw1Var.d(yw1Var.subList(0, i));
        uw1Var.d(yw1Var.subList(iMin, yw1Var.size()));
        xs3 xs3Var2 = new xs3(uw1Var.f(), xs3Var.f);
        int iO0 = o0();
        int i3 = iMin - i;
        if (iO0 >= i) {
            iO0 = iO0 < iMin ? -1 : iO0 - i3;
        }
        if (iO0 == -1) {
            iO0 = f35.j(i, 0, xs3Var2.o() - 1);
            l93.q0("MCImplLegacy", "Currently playing item is removed. Assumes item at " + iO0 + " is the new current item");
        }
        lk3 lk3VarM = ((lk3) this.p.a).m(xs3Var2, iO0);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarM, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (d1()) {
            while (i < iMin && i < this.m.a.size()) {
                this.i.I(((or2) this.m.a.get(i)).n);
                i++;
            }
        }
    }

    @Override // defpackage.rk2
    public wa4 P0() {
        return (wa4) this.p.b;
    }

    @Override // defpackage.rk2
    public final void Q(SurfaceHolder surfaceHolder) {
        l93.q0("MCImplLegacy", "Session doesn't support setting SurfaceHolder");
    }

    @Override // defpackage.rk2
    public final yw1 Q0() {
        return (yw1) this.p.d;
    }

    @Override // defpackage.rk2
    public final void R(float f) {
        l93.q0("MCImplLegacy", "Session doesn't support setting player volume");
    }

    @Override // defpackage.rk2
    public final void R0() {
        cb4 cb4Var = this.c;
        if (cb4Var.a.getType() != 0) {
            a1().a1(new dm2(this, 1));
            return;
        }
        Object objC = cb4Var.a.c();
        objC.getClass();
        a1().a1(new ws1(13, this, (pr2) objC));
        a1().f.postDelayed(new dm2(this, 0), 500L);
    }

    @Override // defpackage.rk2
    public final void S() {
        ((MediaController.TransportControls) this.i.A().o).skipToPrevious();
    }

    @Override // defpackage.rk2
    public final Bundle S0() {
        return this.g;
    }

    @Override // defpackage.rk2
    public final void T(List list, int i, long j) {
        if (list.isEmpty()) {
            r();
            return;
        }
        lk3 lk3VarN = ((lk3) this.p.a).n(xs3.g.q(list, 0), new za4(Z0(i, (gn2) list.get(i), j == -9223372036854775807L ? 0L : j, false), false, SystemClock.elapsedRealtime(), -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L), 0);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarN, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (d1()) {
            c1();
        }
    }

    @Override // defpackage.rk2
    public ic2 T0(va4 va4Var, Bundle bundle) {
        Bundle bundle2 = va4Var.c;
        if (this.i == null) {
            return new mw1(new ab4(-100));
        }
        if (bundle.isEmpty()) {
            bundle = bundle2;
        } else if (!bundle2.isEmpty()) {
            Bundle bundle3 = new Bundle(bundle2);
            bundle3.putAll(bundle);
            bundle = bundle3;
        }
        this.i.A().I(va4Var.b, bundle);
        return new mw1(new ab4(0));
    }

    @Override // defpackage.rk2
    public final PlaybackException U() {
        return ((lk3) this.p.a).a;
    }

    @Override // defpackage.rk2
    public final void U0(gn2 gn2Var) {
        N0(Collections.singletonList(gn2Var), Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final void V(boolean z) {
        lk3 lk3Var = (lk3) this.p.a;
        if (lk3Var.v == z) {
            return;
        }
        this.q = ju2.c(lk3Var, this.q, this.r, a1().g);
        this.r = SystemClock.elapsedRealtime();
        lk3 lk3VarD = ((lk3) this.p.a).d(1, 0, z);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarD, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (!d1() || ((lk3) this.p.a).j.p()) {
            return;
        }
        wo0 wo0Var = this.i;
        if (z) {
            ((MediaController.TransportControls) wo0Var.A().o).play();
        } else {
            ((MediaController.TransportControls) wo0Var.A().o).pause();
        }
    }

    @Override // defpackage.rk2
    public final void V0(List list) {
        L0(list);
    }

    @Override // defpackage.rk2
    public final void W(int i) {
        f1(i, 0L);
    }

    public final void W0(List list, int i) {
        ArrayList arrayList = new ArrayList();
        fm2 fm2Var = new fm2(this, new AtomicInteger(0), list, arrayList, i, 0);
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = ((gn2) list.get(i2)).d.k;
            if (bArr == null) {
                arrayList.add(null);
                fm2Var.run();
            } else {
                ic2 ic2VarJ = this.f.j(bArr);
                arrayList.add(ic2VarJ);
                Handler handler = a1().f;
                Objects.requireNonNull(handler);
                ic2VarJ.f(fm2Var, new ym(handler, 1));
            }
        }
    }

    @Override // defpackage.rk2
    public final long X() {
        return ((lk3) this.p.a).D;
    }

    @Override // defpackage.rk2
    public final boolean Y() {
        return this.l;
    }

    @Override // defpackage.rk2
    public final long Z() {
        return M0();
    }

    @Override // defpackage.rk2
    public void a() {
        if (this.k) {
            return;
        }
        this.k = true;
        jj2 jj2Var = this.j;
        if (jj2Var != null) {
            jj2Var.a();
            this.j = null;
        }
        wo0 wo0Var = this.i;
        if (wo0Var != null) {
            Set set = (Set) wo0Var.o;
            gm2 gm2Var = this.e;
            if (set.remove(gm2Var)) {
                try {
                    ((xk2) wo0Var.n).b(gm2Var);
                    gm2Var.d(null);
                } catch (Throwable th) {
                    gm2Var.d(null);
                    throw th;
                }
            } else {
                l93.q0("MediaControllerCompat", "the callback has never been registered");
            }
            gm2Var.d.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.l = false;
        this.d.d();
    }

    @Override // defpackage.rk2
    public final void a0() {
        l93.q0("MCImplLegacy", "Session doesn't support unmuting the player");
    }

    public sk2 a1() {
        return this.b;
    }

    @Override // defpackage.rk2
    public final void b() {
        lk3 lk3Var = (lk3) this.p.a;
        if (lk3Var.A != 1) {
            return;
        }
        lk3 lk3VarF = lk3Var.f(lk3Var.j.p() ? 4 : 2, null);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarF, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (((lk3) this.p.a).j.p()) {
            return;
        }
        c1();
    }

    @Override // defpackage.rk2
    public final long b0() {
        return ((lk3) this.p.a).c.e;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0273 A[PHI: r4 r6
  0x0273: PHI (r4v20 xs3) = (r4v14 xs3), (r4v17 xs3), (r4v25 xs3) binds: [B:140:0x028f, B:155:0x02c8, B:133:0x025b] A[DONT_GENERATE, DONT_INLINE]
  0x0273: PHI (r6v11 int) = (r6v8 int), (r6v8 int), (r6v15 int) binds: [B:140:0x028f, B:155:0x02c8, B:133:0x025b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x027f A[PHI: r4
  0x027f: PHI (r4v18 xs3) = (r4v13 xs3), (r4v21 xs3) binds: [B:138:0x0287, B:135:0x0279] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0289  */
    /* JADX WARN: Code duplicated, block: B:141:0x0291  */
    /* JADX WARN: Code duplicated, block: B:143:0x0297  */
    /* JADX WARN: Code duplicated, block: B:144:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:155:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:156:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:166:0x0334  */
    /* JADX WARN: Code duplicated, block: B:186:0x0376  */
    /* JADX WARN: Code duplicated, block: B:202:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:205:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:208:0x03da  */
    /* JADX WARN: Code duplicated, block: B:211:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:214:0x0403  */
    /* JADX WARN: Code duplicated, block: B:217:0x0414  */
    /* JADX WARN: Code duplicated, block: B:220:0x0422  */
    /* JADX WARN: Code duplicated, block: B:223:0x042c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0435  */
    /* JADX WARN: Code duplicated, block: B:227:0x0438  */
    /* JADX WARN: Code duplicated, block: B:230:0x0452  */
    /* JADX WARN: Code duplicated, block: B:232:0x045f  */
    /* JADX WARN: Code duplicated, block: B:234:0x0466  */
    /* JADX WARN: Code duplicated, block: B:236:0x046f  */
    /* JADX WARN: Code duplicated, block: B:239:0x047d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0495  */
    /* JADX WARN: Code duplicated, block: B:244:0x049e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:245:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:246:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:252:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:255:0x04dc A[LOOP:4: B:253:0x04d8->B:255:0x04dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:257:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:260:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:264:0x050f  */
    /* JADX WARN: Code duplicated, block: B:267:0x051b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0529  */
    /* JADX WARN: Code duplicated, block: B:273:0x0539  */
    /* JADX WARN: Code duplicated, block: B:274:0x0544  */
    /* JADX WARN: Code duplicated, block: B:277:0x0558  */
    /* JADX WARN: Code duplicated, block: B:279:0x0564  */
    /* JADX WARN: Code duplicated, block: B:280:0x0570  */
    /* JADX WARN: Code duplicated, block: B:283:0x0582  */
    /* JADX WARN: Code duplicated, block: B:284:0x0585  */
    /* JADX WARN: Code duplicated, block: B:287:0x0595  */
    /* JADX WARN: Code duplicated, block: B:289:0x059e  */
    /* JADX WARN: Code duplicated, block: B:290:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:292:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:294:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:296:0x05c0  */
    /* JADX WARN: Code duplicated, block: B:300:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:306:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:307:0x0600  */
    /* JADX WARN: Code duplicated, block: B:321:0x0652  */
    /* JADX WARN: Code duplicated, block: B:326:0x0661  */
    /* JADX WARN: Code duplicated, block: B:327:0x0664  */
    /* JADX WARN: Code duplicated, block: B:329:0x066d  */
    /* JADX WARN: Code duplicated, block: B:330:0x0674  */
    /* JADX WARN: Code duplicated, block: B:332:0x067e  */
    /* JADX WARN: Code duplicated, block: B:333:0x0681  */
    /* JADX WARN: Code duplicated, block: B:336:0x0687  */
    /* JADX WARN: Code duplicated, block: B:338:0x068b  */
    /* JADX WARN: Code duplicated, block: B:339:0x068d A[PHI: r24
  0x068d: PHI (r24v11 mi3) = (r24v3 mi3), (r24v12 mi3) binds: [B:358:0x06d2, B:338:0x068b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:342:0x069e  */
    /* JADX WARN: Code duplicated, block: B:347:0x06ac A[Catch: LegacyConversions$ConversionException -> 0x06d8, TRY_LEAVE, TryCatch #0 {LegacyConversions$ConversionException -> 0x06d8, blocks: (B:340:0x068f, B:346:0x06a9, B:347:0x06ac, B:343:0x06a0), top: B:440:0x068f }] */
    /* JADX WARN: Code duplicated, block: B:351:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:352:0x06c6  */
    /* JADX WARN: Code duplicated, block: B:353:0x06c8 A[PHI: r24
  0x06c8: PHI (r24v6 mi3) = (r24v5 mi3), (r24v7 mi3) binds: [B:355:0x06cc, B:352:0x06c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:354:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:356:0x06ce A[PHI: r24
  0x06ce: PHI (r24v4 mi3) = (r24v3 mi3), (r24v5 mi3) binds: [B:358:0x06d2, B:355:0x06cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:357:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:364:0x0707  */
    /* JADX WARN: Code duplicated, block: B:365:0x070a  */
    /* JADX WARN: Code duplicated, block: B:369:0x0713  */
    /* JADX WARN: Code duplicated, block: B:371:0x0718  */
    /* JADX WARN: Code duplicated, block: B:373:0x071f  */
    /* JADX WARN: Code duplicated, block: B:374:0x0721  */
    /* JADX WARN: Code duplicated, block: B:377:0x072f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:380:0x0734  */
    /* JADX WARN: Code duplicated, block: B:383:0x0741  */
    /* JADX WARN: Code duplicated, block: B:384:0x0744  */
    /* JADX WARN: Code duplicated, block: B:386:0x074a  */
    /* JADX WARN: Code duplicated, block: B:387:0x074d  */
    /* JADX WARN: Code duplicated, block: B:392:0x076d  */
    /* JADX WARN: Code duplicated, block: B:393:0x076f  */
    /* JADX WARN: Code duplicated, block: B:396:0x07ff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:399:0x0807 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:400:0x0809 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:402:0x080d  */
    /* JADX WARN: Code duplicated, block: B:404:0x081c  */
    /* JADX WARN: Code duplicated, block: B:407:0x0825  */
    /* JADX WARN: Code duplicated, block: B:410:0x082e  */
    /* JADX WARN: Code duplicated, block: B:413:0x083e A[LOOP:3: B:408:0x0826->B:413:0x083e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:416:0x0844  */
    /* JADX WARN: Code duplicated, block: B:417:0x084b  */
    /* JADX WARN: Code duplicated, block: B:419:0x0855  */
    /* JADX WARN: Code duplicated, block: B:421:0x0869  */
    /* JADX WARN: Code duplicated, block: B:424:0x0870  */
    /* JADX WARN: Code duplicated, block: B:426:0x087b  */
    /* JADX WARN: Code duplicated, block: B:428:0x0883  */
    /* JADX WARN: Code duplicated, block: B:430:0x0889  */
    /* JADX WARN: Code duplicated, block: B:433:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:435:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:436:0x08c3  */
    /* JADX WARN: Code duplicated, block: B:440:0x068f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x0841 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x083c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x050a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:461:? A[LOOP:5: B:258:0x04f7->B:461:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x052b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:467:0x05d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    public final void b1(boolean z, hm2 hm2Var) {
        long j;
        fg4 fg4Var;
        Bundle bundle;
        boolean z2;
        Bundle bundle2;
        xs3 xs3Var;
        long j2;
        long j3;
        int iO;
        do2 do2VarL;
        gn2 gn2Var;
        gn2 gn2VarK;
        yw1 yw1Var;
        int size;
        ws3 ws3Var;
        boolean z3;
        String str;
        do2 do2Var;
        fg4 fg4Var2;
        int i;
        long j4;
        long j5;
        boolean z4;
        long j6;
        mi3 mi3Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        do2 do2Var2;
        int iS;
        boolean zU;
        HashSet<va4> hashSet;
        gy3 gy3Var;
        int i2;
        Object[] objArrCopyOf;
        Iterator it;
        int i3;
        int i4;
        boolean z5;
        yw1 yw1VarK;
        Bundle bundle3;
        int i5;
        i60 i60Var;
        Bundle bundle4;
        String string;
        int iB;
        Uri uri;
        String scheme;
        wa4 wa4Var;
        Bundle bundle5;
        int i6;
        xa4 xa4Var;
        boolean z6;
        qh3 qh3Var;
        fg4 fg4Var3;
        il ilVar;
        boolean z7;
        int i7;
        int i8;
        long jD;
        boolean z8;
        boolean z9;
        int i9;
        boolean z10;
        hp0 hp0VarB;
        int i10;
        boolean z11;
        int i11;
        gn2 gn2Var2;
        lk3 lk3Var;
        hm2 hm2Var2;
        ml3 ml3Var;
        long j7;
        Integer num;
        boolean zP;
        gn2 gn2VarS;
        ws3 ws3Var2;
        int i12;
        yw1 yw1Var2;
        boolean z12;
        boolean z13;
        Integer num2;
        long jC;
        long jC2;
        Integer num3;
        sk2 sk2VarA1;
        boolean z14;
        int i13;
        Bundle bundle6;
        Bitmap bitmap;
        eo2 eo2Var;
        Bitmap bitmapB;
        Bitmap bitmapB2;
        if (this.k || !this.l) {
            return;
        }
        hm2 hm2Var3 = this.m;
        ml3 ml3Var2 = this.p;
        String packageName = ((xk2) this.i.n).a.getPackageName();
        long flags = ((xk2) this.i.n).a.getFlags();
        boolean z15 = ((xk2) this.i.n).e.a() != null;
        int ratingType = ((xk2) this.i.n).a.getRatingType();
        long j8 = a1().g;
        boolean z16 = this.o;
        eo2 eo2Var2 = (eo2) hm2Var3.f;
        ei3 ei3Var = (ei3) hm2Var3.e;
        List list = hm2Var3.a;
        if (eo2Var2 == null || (eo2Var = (eo2) hm2Var.f) == null) {
            j = flags;
        } else {
            j = flags;
            if (eo2Var2.p != null && (bitmapB = eo2Var.b()) != null && (bitmapB2 = eo2Var2.b()) != null && bitmapB.sameAs(bitmapB2)) {
                eo2Var.p = eo2Var2.p;
            }
        }
        List list2 = hm2Var.a;
        Bundle bundle7 = (Bundle) hm2Var.h;
        ei3 ei3Var2 = (ei3) hm2Var.e;
        eo2 eo2Var3 = (eo2) hm2Var.f;
        boolean z17 = z15;
        fg4 fg4Var4 = (fg4) hm2Var.d;
        if (list != list2) {
            HashMap map = new HashMap();
            int i14 = 0;
            while (i14 < list.size()) {
                or2 or2Var = (or2) list.get(i14);
                if (or2Var.n.r != null) {
                    map.put(Long.valueOf(or2Var.o), or2Var);
                }
                i14++;
                bundle7 = bundle7;
                fg4Var4 = fg4Var4;
            }
            Bundle bundle8 = bundle7;
            fg4Var = fg4Var4;
            int i15 = 0;
            while (i15 < list2.size()) {
                or2 or2Var2 = (or2) list2.get(i15);
                if (or2Var2.n.r != null) {
                    bundle6 = bundle8;
                    or2 or2Var3 = (or2) map.get(Long.valueOf(or2Var2.o));
                    if (or2Var3 != null) {
                        pm2 pm2Var = or2Var2.n;
                        pm2 pm2Var2 = or2Var3.n;
                        pm2Var.getClass();
                        if (pm2Var2.s == null || (bitmap = pm2Var.r) == null) {
                            i13 = i15;
                        } else {
                            i13 = i15;
                            Bitmap bitmap2 = pm2Var2.r;
                            if (bitmap2 != null && bitmap.sameAs(bitmap2)) {
                                pm2Var.s = pm2Var2.s;
                            }
                        }
                    } else {
                        i13 = i15;
                    }
                } else {
                    i13 = i15;
                    bundle6 = bundle8;
                }
                i15 = i13 + 1;
                bundle8 = bundle6;
            }
            bundle = bundle8;
        } else {
            fg4Var = fg4Var4;
            bundle = bundle7;
        }
        boolean z18 = list != list2;
        if (z18) {
            xs3 xs3Var2 = xs3.g;
            uc5.f(4, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[4];
            int i16 = 0;
            int i17 = 0;
            while (i17 < list2.size()) {
                or2 or2Var4 = (or2) list2.get(i17);
                jx1 jx1Var = f92.a;
                boolean z19 = z18;
                Bundle bundle9 = bundle;
                ws3 ws3Var3 = new ws3(f92.j(or2Var4.n), or2Var4.o, -9223372036854775807L);
                int i18 = i16 + 1;
                int iB2 = qw1.b(objArrCopyOf2.length, i18);
                if (iB2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iB2);
                }
                objArrCopyOf2[i16] = ws3Var3;
                i17++;
                i16 = i18;
                z18 = z19;
                bundle = bundle9;
            }
            z2 = z18;
            bundle2 = bundle;
            xs3Var = new xs3(yw1.i(i16, objArrCopyOf2), null);
        } else {
            z2 = z18;
            bundle2 = bundle;
            xs3 xs3Var3 = (xs3) ((lk3) ml3Var2.a).j;
            xs3Var = new xs3(xs3Var3.e, xs3Var3.f);
        }
        boolean z20 = ((eo2) hm2Var3.f) != eo2Var3 || z;
        long j9 = ei3Var == null ? -1L : ei3Var.w;
        if (ei3Var2 == null) {
            j3 = -1;
            j2 = -1;
        } else {
            j2 = -1;
            j3 = ei3Var2.w;
        }
        boolean z21 = j9 != j3 || z;
        long jD2 = f92.d(eo2Var3);
        if (z20 || z21 || z2) {
            boolean z22 = z20;
            if (list2 == null || j3 == j2) {
                iO = -1;
                break;
            }
            long j10 = j3;
            iO = 0;
            while (true) {
                if (iO >= list2.size()) {
                    iO = -1;
                    break;
                } else if (((or2) list2.get(iO)).o == j10) {
                    break;
                } else {
                    iO++;
                }
            }
            boolean z23 = eo2Var3 != null;
            if (z23 && z22) {
                do2VarL = f92.m(eo2Var3, ratingType);
            } else if (z23 || !z21) {
                do2VarL = ((lk3) ml3Var2.a).B;
            } else {
                do2VarL = iO == -1 ? do2.K : f92.l(((or2) list2.get(iO)).n, ratingType);
            }
            yw1 yw1Var3 = xs3Var.e;
            int i19 = -1;
            if (iO != -1) {
                if (iO != i19) {
                    xs3Var = new xs3(yw1Var3, null);
                    if (z23) {
                        if (iO >= xs3Var.o()) {
                            gn2Var = null;
                        } else {
                            gn2Var = xs3Var.s(iO).a;
                        }
                        gn2Var.getClass();
                        gn2VarK = f92.k(gn2Var.a, eo2Var3, ratingType);
                        yw1Var = xs3Var.e;
                        size = yw1Var.size();
                        ws3Var = xs3Var.f;
                        if (iO >= size || (iO == yw1Var.size() && ws3Var != null)) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        rr2.l(z3);
                        if (iO == yw1Var.size()) {
                            xs3Var = new xs3(yw1Var, new ws3(gn2VarK, -1L, jD2));
                            str = "MCImplLegacy";
                        } else {
                            long j11 = ((ws3) yw1Var.get(iO)).b;
                            uw1 uw1Var = new uw1(4);
                            str = "MCImplLegacy";
                            uw1Var.d(yw1Var.subList(0, iO));
                            uw1Var.c(new ws3(gn2VarK, j11, jD2));
                            uw1Var.d(yw1Var.subList(iO + 1, yw1Var.size()));
                            xs3Var = new xs3(uw1Var.f(), ws3Var);
                        }
                    } else {
                        str = "MCImplLegacy";
                    }
                } else {
                    str = "MCImplLegacy";
                    iO = 0;
                }
            } else if (!z22) {
                i19 = -1;
                if (iO != i19) {
                    xs3Var = new xs3(yw1Var3, null);
                    if (z23) {
                        str = "MCImplLegacy";
                    } else {
                        if (iO >= xs3Var.o()) {
                            gn2Var = null;
                        } else {
                            gn2Var = xs3Var.s(iO).a;
                        }
                        gn2Var.getClass();
                        gn2VarK = f92.k(gn2Var.a, eo2Var3, ratingType);
                        yw1Var = xs3Var.e;
                        size = yw1Var.size();
                        ws3Var = xs3Var.f;
                        if (iO >= size) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        rr2.l(z3);
                        if (iO == yw1Var.size()) {
                            xs3Var = new xs3(yw1Var, new ws3(gn2VarK, -1L, jD2));
                            str = "MCImplLegacy";
                        } else {
                            long j12 = ((ws3) yw1Var.get(iO)).b;
                            uw1 uw1Var2 = new uw1(4);
                            str = "MCImplLegacy";
                            uw1Var2.d(yw1Var.subList(0, iO));
                            uw1Var2.c(new ws3(gn2VarK, j12, jD2));
                            uw1Var2.d(yw1Var.subList(iO + 1, yw1Var.size()));
                            xs3Var = new xs3(uw1Var2.f(), ws3Var);
                        }
                    }
                } else {
                    str = "MCImplLegacy";
                    iO = 0;
                }
            } else if (z23) {
                l93.q0("MCImplLegacy", "Adding a fake MediaItem at the end of the list because there's no QueueItem with the active queue id and current Timeline should have currently playing MediaItem.");
                CharSequence charSequence3 = eo2Var3.n.getCharSequence("android.media.metadata.MEDIA_ID");
                xs3Var = new xs3(yw1Var3, new ws3(f92.k(charSequence3 != null ? charSequence3.toString() : null, eo2Var3, ratingType), -1L, jD2));
                iO = xs3Var.o() - 1;
                str = "MCImplLegacy";
            } else {
                xs3Var = new xs3(yw1Var3, null);
                str = "MCImplLegacy";
                iO = 0;
            }
            do2Var = do2VarL;
        } else {
            lk3 lk3Var2 = (lk3) ml3Var2.a;
            iO = lk3Var2.c.a.b;
            do2Var = lk3Var2.B;
            str = "MCImplLegacy";
        }
        if (fg4Var != null) {
            fg4Var2 = fg4Var;
            i = fg4Var2.c;
        } else {
            fg4Var2 = fg4Var;
            i = 0;
        }
        xk0 xk0Var = new xk0(2);
        if (ei3Var2 == null) {
            j5 = 0;
            j4 = 0;
        } else {
            j4 = 0;
            j5 = ei3Var2.r;
        }
        if (ei3Var2 != null) {
            switch (ei3Var2.n) {
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z4 = true;
                    break;
                case 7:
                case 8:
                default:
                    z4 = false;
                    break;
            }
        } else {
            z4 = false;
        }
        if (!f92.y(j5, 4L) || z4) {
            j6 = 4;
            if ((f92.y(j5, 2L) && z4) || f92.y(j5, 512L)) {
            }
            if (f92.y(j5, 16384L)) {
                xk0Var.b(2);
            }
            if ((f92.y(j5, 32768L) && f92.y(j5, 1024L)) || ((f92.y(j5, 65536L) && f92.y(j5, 2048L)) || (f92.y(j5, 131072L) && f92.y(j5, 8192L)))) {
                xk0Var.d(31, 2);
            }
            if (f92.y(j5, 8L)) {
                xk0Var.b(11);
            }
            if (f92.y(j5, 64L)) {
                xk0Var.b(12);
            }
            if (f92.y(j5, 256L)) {
                xk0Var.d(5, 4);
            }
            if (f92.y(j5, 32L)) {
                xk0Var.d(9, 8);
            }
            if (f92.y(j5, 16L)) {
                xk0Var.d(7, 6);
            }
            if (f92.y(j5, 4194304L)) {
                xk0Var.b(13);
            }
            if (f92.y(j5, 1L)) {
                xk0Var.b(3);
            }
            if (i == 1) {
                xk0Var.d(26, 34);
            } else if (i == 2) {
                xk0Var.d(26, 34, 25, 33);
            }
            xk0Var.d(23, 17, 18, 16, 21, 32);
            if ((j & j6) != j4) {
                xk0Var.b(20);
                if (f92.y(j5, 4096L)) {
                    xk0Var.b(10);
                }
            }
            if (z17) {
                if (f92.y(j5, 262144L)) {
                    xk0Var.b(15);
                }
                if (f92.y(j5, 2097152L)) {
                    xk0Var.b(14);
                }
            }
            mi3Var = new mi3(xk0Var.f());
            charSequence = (CharSequence) hm2Var3.g;
            charSequence2 = (CharSequence) hm2Var.g;
            if (charSequence == charSequence2) {
                do2Var2 = ((lk3) ml3Var2.a).m;
            } else if (charSequence2 == null) {
                do2Var2 = do2.K;
            } else {
                co2 co2Var = new co2();
                co2Var.a = charSequence2;
                do2Var2 = new do2(co2Var);
            }
            do2 do2Var3 = do2Var2;
            iS = f92.s(hm2Var.b);
            zU = f92.u(hm2Var.c);
            if (ei3Var == ei3Var2 || z16) {
                hashSet = new HashSet();
                gy3Var = va4.d;
                for (i2 = 0; i2 < gy3Var.q; i2++) {
                    hashSet.add(new va4(((Integer) gy3Var.get(i2)).intValue()));
                }
                if (!z17) {
                    for (va4 va4Var : hashSet) {
                        if (va4Var.a == 40010) {
                            hashSet.remove(va4Var);
                        }
                    }
                }
                if (ei3Var2 != null) {
                    for (di3 di3Var : ei3Var2.v) {
                        String str2 = di3Var.n;
                        bundle5 = di3Var.q;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        hashSet.add(new va4(str2, bundle5));
                    }
                }
                wa4 wa4Var2 = new wa4(hashSet);
                if (ei3Var2 == null) {
                    vw1 vw1Var = yw1.o;
                    i4 = iS;
                    z5 = zU;
                    yw1VarK = gy3.r;
                } else {
                    List list3 = ei3Var2.v;
                    uc5.f(4, "initialCapacity");
                    objArrCopyOf = new Object[4];
                    it = list3.iterator();
                    i3 = 0;
                    while (it.hasNext()) {
                        di3 di3Var2 = (di3) it.next();
                        String str3 = di3Var2.n;
                        bundle3 = di3Var2.q;
                        if (bundle3 != null) {
                            i5 = bundle3.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                        } else {
                            i5 = 0;
                        }
                        Iterator it2 = it;
                        i60Var = new i60(i5, di3Var2.p);
                        if (bundle3 == null) {
                            bundle4 = Bundle.EMPTY;
                        } else {
                            bundle4 = bundle3;
                        }
                        i60Var.d(new va4(str3, bundle4));
                        i60Var.f = di3Var2.o;
                        i60Var.h = true;
                        if (bundle3 != null) {
                            i60Var.g = new Bundle(bundle3);
                        }
                        if (bundle3 != null) {
                            string = bundle3.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                        } else {
                            string = null;
                        }
                        if (string != null) {
                            uri = Uri.parse(string);
                            scheme = uri.getScheme();
                            if (Objects.equals(scheme, "content") || Objects.equals(scheme, "android.resource")) {
                                i60Var.b(uri);
                            }
                        }
                        j60 j60VarA = i60Var.a();
                        int i20 = i3 + 1;
                        iB = qw1.b(objArrCopyOf.length, i20);
                        if (iB > objArrCopyOf.length) {
                            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                        }
                        objArrCopyOf[i3] = j60VarA;
                        i3 = i20;
                        iS = iS;
                        zU = zU;
                        it = it2;
                    }
                    i4 = iS;
                    z5 = zU;
                    yw1VarK = j60.k(yw1.i(i3, objArrCopyOf), mi3Var, bundle2);
                }
                wa4Var = wa4Var2;
            } else {
                wa4Var = (wa4) ml3Var2.b;
                yw1VarK = (yw1) ml3Var2.d;
                i4 = iS;
                z5 = zU;
            }
            Context context = this.a;
            PlaybackException playbackExceptionO = f92.o(ei3Var2, context);
            if (ei3Var2 == null) {
                xa4Var = null;
            } else {
                i6 = ei3Var2.n;
                int i21 = ei3Var2.s;
                CharSequence charSequence4 = ei3Var2.t;
                Bundle bundle10 = ei3Var2.x;
                if (i6 != 7 || i21 == 0) {
                    xa4Var = null;
                } else {
                    int iT = f92.t(i21);
                    String string2 = charSequence4 != null ? charSequence4.toString() : f92.x(context, iT);
                    if (bundle10 == null) {
                        bundle10 = Bundle.EMPTY;
                    }
                    xa4Var = new xa4(string2, iT, bundle10);
                }
            }
            long jC3 = f92.c(ei3Var2, eo2Var3, j8);
            long jB = f92.b(ei3Var2, eo2Var3, j8);
            wa4 wa4Var3 = wa4Var;
            yw1 yw1Var4 = yw1VarK;
            xa4 xa4Var2 = xa4Var;
            int iB3 = ju2.b(f92.b(ei3Var2, eo2Var3, j8), f92.d(eo2Var3));
            long jB2 = f92.b(ei3Var2, eo2Var3, j8) - f92.c(ei3Var2, eo2Var3, j8);
            if (eo2Var3 == null && eo2Var3.a("android.media.metadata.ADVERTISEMENT") != j4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (ei3Var2 == null) {
                qh3Var = qh3.d;
            } else {
                qh3Var = new qh3(ei3Var2.q);
            }
            if (fg4Var2 == 0) {
                ilVar = il.i;
                fg4Var3 = fg4Var2;
            } else {
                fg4Var3 = fg4Var2;
                ilVar = (il) fg4Var3.f;
            }
            if (ei3Var2 == null) {
                switch (ei3Var2.n) {
                    case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    case 4:
                    case 5:
                    case 6:
                    case 9:
                    case 10:
                    case 11:
                        z7 = true;
                        break;
                    case 7:
                    case 8:
                    default:
                        z7 = false;
                        break;
                }
            } else {
                z7 = false;
            }
            if (ei3Var2 == null) {
                mi3Var = mi3Var;
                i7 = 1;
            } else {
                try {
                    i8 = ei3Var2.n;
                    jD = f92.d(eo2Var3);
                    if (jD == -9223372036854775807L && f92.c(ei3Var2, eo2Var3, j8) >= jD) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    switch (i8) {
                        case 0:
                        case 7:
                        case 8:
                            mi3Var = mi3Var;
                            i7 = 1;
                            break;
                        case 1:
                            mi3Var = mi3Var;
                            if (z8) {
                                i7 = 4;
                            } else {
                                i7 = 1;
                            }
                            break;
                        case 2:
                            mi3Var = mi3Var;
                            if (z8) {
                                i7 = 4;
                            } else {
                                i7 = 3;
                            }
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            mi3Var = mi3Var;
                            i7 = 3;
                            break;
                        case 4:
                        case 5:
                        case 6:
                        case 9:
                        case 10:
                        case 11:
                            mi3Var = mi3Var;
                            i7 = 2;
                            break;
                        default:
                            try {
                                throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i8);
                            } catch (LegacyConversions$ConversionException unused) {
                                l93.F(str, "Received invalid playback state " + ei3Var2.n + " from package " + packageName + ". Keeping the previous state.");
                                i7 = ((lk3) ml3Var2.a).A;
                                int i22 = i7;
                                if (ei3Var2 == null) {
                                    z9 = false;
                                } else {
                                    z9 = true;
                                }
                                if (fg4Var3 == null) {
                                    hp0VarB = hp0.e;
                                } else {
                                    if (fg4Var3.b == 2) {
                                        i9 = 1;
                                    } else {
                                        i9 = 0;
                                    }
                                    x20 x20Var = new x20(i9);
                                    x20Var.c = fg4Var3.d;
                                    String str4 = (String) fg4Var3.g;
                                    if (i9 == 0) {
                                        z10 = true;
                                    } else {
                                        z10 = true;
                                    }
                                    rr2.l(z10);
                                    x20Var.d = str4;
                                    hp0VarB = x20Var.b();
                                }
                                hp0 hp0Var = hp0VarB;
                                if (fg4Var3 == null) {
                                    i10 = 0;
                                } else {
                                    i10 = fg4Var3.e;
                                }
                                if (fg4Var3 == null) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                lk3 lk3Var3 = (lk3) ml3Var2.a;
                                long j13 = lk3Var3.C;
                                long j14 = lk3Var3.D;
                                long j15 = lk3Var3.E;
                                Bundle bundle11 = (Bundle) hm2Var.h;
                                i11 = iO;
                                if (i11 >= xs3Var.o()) {
                                    gn2Var2 = null;
                                } else {
                                    gn2Var2 = xs3Var.s(i11).a;
                                }
                                za4 za4Var = new za4(Z0(i11, gn2Var2, jC3, z6), z6, SystemClock.elapsedRealtime(), jD2, jB, iB3, jB2, -9223372036854775807L, jD2, jB);
                                pi3 pi3Var = za4.k;
                                int i23 = i4;
                                lk3Var = new lk3(playbackExceptionO, 0, za4Var, pi3Var, pi3Var, 0, qh3Var, i23, z5, s55.d, xs3Var, 0, do2Var3, 1.0f, 1.0f, ilVar, 0, jg0.d, hp0Var, i10, z11, z7, 1, 0, i22, z9, false, do2Var, j13, j14, j15, jw4.b, cw4.J);
                                ml3 ml3Var3 = new ml3(lk3Var, wa4Var3, mi3Var, yw1Var4, bundle11, xa4Var2);
                                hm2Var2 = this.m;
                                ml3Var = this.p;
                                j7 = a1().g;
                                num = 3;
                                zP = ((lk3) ml3Var.a).j.p();
                                boolean zP2 = xs3Var.p();
                                if (!zP) {
                                    if (zP) {
                                        gn2VarS = ((lk3) ml3Var.a).s();
                                        gn2VarS.getClass();
                                        ws3Var2 = xs3Var.f;
                                        if (ws3Var2 == null) {
                                            i12 = 0;
                                            while (true) {
                                                yw1Var2 = xs3Var.e;
                                                if (i12 >= yw1Var2.size()) {
                                                    z12 = false;
                                                } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                    z12 = true;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        } else {
                                            i12 = 0;
                                            while (true) {
                                                yw1Var2 = xs3Var.e;
                                                if (i12 >= yw1Var2.size()) {
                                                    z12 = false;
                                                } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                    z12 = true;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (z12) {
                                            num2 = 4;
                                        } else if (gn2VarS.equals(lk3Var.s())) {
                                            jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                                            jC2 = f92.c(ei3Var2, eo2Var3, j7);
                                            if (jC2 == j4) {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z13 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z13 = true;
                                    } else {
                                        gn2VarS = ((lk3) ml3Var.a).s();
                                        gn2VarS.getClass();
                                        ws3Var2 = xs3Var.f;
                                        if (ws3Var2 == null) {
                                            i12 = 0;
                                            while (true) {
                                                yw1Var2 = xs3Var.e;
                                                if (i12 >= yw1Var2.size()) {
                                                    z12 = false;
                                                } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                    z12 = true;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        } else {
                                            i12 = 0;
                                            while (true) {
                                                yw1Var2 = xs3Var.e;
                                                if (i12 >= yw1Var2.size()) {
                                                    z12 = false;
                                                } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                    z12 = true;
                                                } else {
                                                    i12++;
                                                }
                                            }
                                        }
                                        if (z12) {
                                            num2 = 4;
                                        } else if (gn2VarS.equals(lk3Var.s())) {
                                            jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                                            jC2 = f92.c(ei3Var2, eo2Var3, j7);
                                            if (jC2 == j4) {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            } else {
                                                if (Math.abs(jC - jC2) > 100) {
                                                    num2 = 5;
                                                } else {
                                                    num2 = null;
                                                }
                                                num3 = null;
                                            }
                                            num = num3;
                                        } else {
                                            z13 = true;
                                            num = 1;
                                            num2 = 0;
                                        }
                                        z13 = true;
                                    }
                                } else if (zP) {
                                    gn2VarS = ((lk3) ml3Var.a).s();
                                    gn2VarS.getClass();
                                    ws3Var2 = xs3Var.f;
                                    if (ws3Var2 == null) {
                                        i12 = 0;
                                        while (true) {
                                            yw1Var2 = xs3Var.e;
                                            if (i12 >= yw1Var2.size()) {
                                                z12 = false;
                                            } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                z12 = true;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    } else {
                                        i12 = 0;
                                        while (true) {
                                            yw1Var2 = xs3Var.e;
                                            if (i12 >= yw1Var2.size()) {
                                                z12 = false;
                                            } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                z12 = true;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    if (z12) {
                                        num2 = 4;
                                    } else if (gn2VarS.equals(lk3Var.s())) {
                                        jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                                        jC2 = f92.c(ei3Var2, eo2Var3, j7);
                                        if (jC2 == j4) {
                                            if (Math.abs(jC - jC2) > 100) {
                                                num2 = 5;
                                            } else {
                                                num2 = null;
                                            }
                                            num3 = null;
                                        } else {
                                            if (Math.abs(jC - jC2) > 100) {
                                                num2 = 5;
                                            } else {
                                                num2 = null;
                                            }
                                            num3 = null;
                                        }
                                        num = num3;
                                    } else {
                                        z13 = true;
                                        num = 1;
                                        num2 = 0;
                                    }
                                    z13 = true;
                                } else {
                                    gn2VarS = ((lk3) ml3Var.a).s();
                                    gn2VarS.getClass();
                                    ws3Var2 = xs3Var.f;
                                    if (ws3Var2 == null) {
                                        i12 = 0;
                                        while (true) {
                                            yw1Var2 = xs3Var.e;
                                            if (i12 >= yw1Var2.size()) {
                                                z12 = false;
                                            } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                z12 = true;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    } else {
                                        i12 = 0;
                                        while (true) {
                                            yw1Var2 = xs3Var.e;
                                            if (i12 >= yw1Var2.size()) {
                                                z12 = false;
                                            } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                                                z12 = true;
                                            } else {
                                                i12++;
                                            }
                                        }
                                    }
                                    if (z12) {
                                        num2 = 4;
                                    } else if (gn2VarS.equals(lk3Var.s())) {
                                        jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                                        jC2 = f92.c(ei3Var2, eo2Var3, j7);
                                        if (jC2 == j4) {
                                            if (Math.abs(jC - jC2) > 100) {
                                                num2 = 5;
                                            } else {
                                                num2 = null;
                                            }
                                            num3 = null;
                                        } else {
                                            if (Math.abs(jC - jC2) > 100) {
                                                num2 = 5;
                                            } else {
                                                num2 = null;
                                            }
                                            num3 = null;
                                        }
                                        num = num3;
                                    } else {
                                        z13 = true;
                                        num = 1;
                                        num2 = 0;
                                    }
                                    z13 = true;
                                }
                                Pair pairCreate = Pair.create(num2, num);
                                g1(z, hm2Var, true, ml3Var3, (Integer) pairCreate.first, (Integer) pairCreate.second);
                                if (this.o) {
                                    this.o = false;
                                    sk2VarA1 = a1();
                                    sk2VarA1.getClass();
                                    if (Looper.myLooper() == sk2VarA1.f.getLooper()) {
                                        z14 = z13;
                                    } else {
                                        z14 = false;
                                    }
                                    rr2.w(z14);
                                    sk2VarA1.e.getClass();
                                }
                            }
                    }
                } catch (LegacyConversions$ConversionException unused2) {
                }
            }
            int i24 = i7;
            if (ei3Var2 == null && ei3Var2.n == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (fg4Var3 == null) {
                hp0VarB = hp0.e;
            } else {
                if (fg4Var3.b == 2) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                x20 x20Var2 = new x20(i9);
                x20Var2.c = fg4Var3.d;
                String str5 = (String) fg4Var3.g;
                if (i9 == 0 || str5 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rr2.l(z10);
                x20Var2.d = str5;
                hp0VarB = x20Var2.b();
            }
            hp0 hp0Var2 = hp0VarB;
            if (fg4Var3 == null) {
                i10 = 0;
            } else {
                i10 = fg4Var3.e;
            }
            if (fg4Var3 == null && fg4Var3.e == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            lk3 lk3Var4 = (lk3) ml3Var2.a;
            long j16 = lk3Var4.C;
            long j17 = lk3Var4.D;
            long j18 = lk3Var4.E;
            Bundle bundle12 = (Bundle) hm2Var.h;
            i11 = iO;
            if (i11 >= xs3Var.o()) {
                gn2Var2 = null;
            } else {
                gn2Var2 = xs3Var.s(i11).a;
            }
            za4 za4Var2 = new za4(Z0(i11, gn2Var2, jC3, z6), z6, SystemClock.elapsedRealtime(), jD2, jB, iB3, jB2, -9223372036854775807L, jD2, jB);
            pi3 pi3Var2 = za4.k;
            int i25 = i4;
            lk3Var = new lk3(playbackExceptionO, 0, za4Var2, pi3Var2, pi3Var2, 0, qh3Var, i25, z5, s55.d, xs3Var, 0, do2Var3, 1.0f, 1.0f, ilVar, 0, jg0.d, hp0Var2, i10, z11, z7, 1, 0, i24, z9, false, do2Var, j16, j17, j18, jw4.b, cw4.J);
            ml3 ml3Var4 = new ml3(lk3Var, wa4Var3, mi3Var, yw1Var4, bundle12, xa4Var2);
            hm2Var2 = this.m;
            ml3Var = this.p;
            j7 = a1().g;
            num = 3;
            zP = ((lk3) ml3Var.a).j.p();
            boolean zP3 = xs3Var.p();
            if (!zP && zP3) {
                num2 = null;
                num = null;
            } else if (zP || zP3) {
                gn2VarS = ((lk3) ml3Var.a).s();
                gn2VarS.getClass();
                ws3Var2 = xs3Var.f;
                if (ws3Var2 == null && gn2VarS.equals(ws3Var2.a)) {
                    z12 = true;
                } else {
                    i12 = 0;
                    while (true) {
                        yw1Var2 = xs3Var.e;
                        if (i12 >= yw1Var2.size()) {
                            z12 = false;
                        } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    }
                }
                if (z12) {
                    if (gn2VarS.equals(lk3Var.s())) {
                        jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                        jC2 = f92.c(ei3Var2, eo2Var3, j7);
                        if (jC2 == j4 || i25 != 1) {
                            if (Math.abs(jC - jC2) > 100) {
                                num2 = 5;
                            } else {
                                num2 = null;
                            }
                            num3 = null;
                        } else {
                            num2 = 0;
                            num3 = null;
                        }
                        num = num3;
                    } else {
                        z13 = true;
                        num = 1;
                        num2 = 0;
                    }
                    Pair pairCreate2 = Pair.create(num2, num);
                    g1(z, hm2Var, true, ml3Var4, (Integer) pairCreate2.first, (Integer) pairCreate2.second);
                    if (this.o) {
                        this.o = false;
                        sk2VarA1 = a1();
                        sk2VarA1.getClass();
                        if (Looper.myLooper() == sk2VarA1.f.getLooper()) {
                            z14 = z13;
                        } else {
                            z14 = false;
                        }
                        rr2.w(z14);
                        sk2VarA1.e.getClass();
                    }
                }
                num2 = 4;
            } else {
                num2 = 0;
            }
            z13 = true;
            Pair pairCreate3 = Pair.create(num2, num);
            g1(z, hm2Var, true, ml3Var4, (Integer) pairCreate3.first, (Integer) pairCreate3.second);
            if (this.o) {
                this.o = false;
                sk2VarA1 = a1();
                sk2VarA1.getClass();
                if (Looper.myLooper() == sk2VarA1.f.getLooper()) {
                    z14 = z13;
                } else {
                    z14 = false;
                }
                rr2.w(z14);
                sk2VarA1.e.getClass();
            }
        }
        j6 = 4;
        xk0Var.b(1);
        if (f92.y(j5, 16384L)) {
            xk0Var.b(2);
        }
        if (f92.y(j5, 32768L)) {
            xk0Var.d(31, 2);
        } else {
            xk0Var.d(31, 2);
        }
        if (f92.y(j5, 8L)) {
            xk0Var.b(11);
        }
        if (f92.y(j5, 64L)) {
            xk0Var.b(12);
        }
        if (f92.y(j5, 256L)) {
            xk0Var.d(5, 4);
        }
        if (f92.y(j5, 32L)) {
            xk0Var.d(9, 8);
        }
        if (f92.y(j5, 16L)) {
            xk0Var.d(7, 6);
        }
        if (f92.y(j5, 4194304L)) {
            xk0Var.b(13);
        }
        if (f92.y(j5, 1L)) {
            xk0Var.b(3);
        }
        if (i == 1) {
            xk0Var.d(26, 34);
        } else if (i == 2) {
            xk0Var.d(26, 34, 25, 33);
        }
        xk0Var.d(23, 17, 18, 16, 21, 32);
        if ((j & j6) != j4) {
            xk0Var.b(20);
            if (f92.y(j5, 4096L)) {
                xk0Var.b(10);
            }
        }
        if (z17) {
            if (f92.y(j5, 262144L)) {
                xk0Var.b(15);
            }
            if (f92.y(j5, 2097152L)) {
                xk0Var.b(14);
            }
        }
        mi3Var = new mi3(xk0Var.f());
        charSequence = (CharSequence) hm2Var3.g;
        charSequence2 = (CharSequence) hm2Var.g;
        if (charSequence == charSequence2) {
            do2Var2 = ((lk3) ml3Var2.a).m;
        } else if (charSequence2 == null) {
            do2Var2 = do2.K;
        } else {
            co2 co2Var2 = new co2();
            co2Var2.a = charSequence2;
            do2Var2 = new do2(co2Var2);
        }
        do2 do2Var4 = do2Var2;
        iS = f92.s(hm2Var.b);
        zU = f92.u(hm2Var.c);
        if (ei3Var == ei3Var2) {
            hashSet = new HashSet();
            gy3Var = va4.d;
            while (i2 < gy3Var.q) {
                hashSet.add(new va4(((Integer) gy3Var.get(i2)).intValue()));
            }
            if (!z17) {
                while (r10.hasNext()) {
                    if (va4Var.a == 40010) {
                        hashSet.remove(va4Var);
                    }
                }
            }
            if (ei3Var2 != null) {
                while (r10.hasNext()) {
                    String str6 = di3Var.n;
                    bundle5 = di3Var.q;
                    if (bundle5 == null) {
                        bundle5 = Bundle.EMPTY;
                    }
                    hashSet.add(new va4(str6, bundle5));
                }
            }
            wa4 wa4Var4 = new wa4(hashSet);
            if (ei3Var2 == null) {
                vw1 vw1Var2 = yw1.o;
                i4 = iS;
                z5 = zU;
                yw1VarK = gy3.r;
            } else {
                List list4 = ei3Var2.v;
                uc5.f(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list4.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    di3 di3Var3 = (di3) it.next();
                    String str7 = di3Var3.n;
                    bundle3 = di3Var3.q;
                    if (bundle3 != null) {
                        i5 = bundle3.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i5 = 0;
                    }
                    Iterator it3 = it;
                    i60Var = new i60(i5, di3Var3.p);
                    if (bundle3 == null) {
                        bundle4 = Bundle.EMPTY;
                    } else {
                        bundle4 = bundle3;
                    }
                    i60Var.d(new va4(str7, bundle4));
                    i60Var.f = di3Var3.o;
                    i60Var.h = true;
                    if (bundle3 != null) {
                        i60Var.g = new Bundle(bundle3);
                    }
                    if (bundle3 != null) {
                        string = bundle3.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            i60Var.b(uri);
                        } else {
                            i60Var.b(uri);
                        }
                    }
                    j60 j60VarA2 = i60Var.a();
                    int i26 = i3 + 1;
                    iB = qw1.b(objArrCopyOf.length, i26);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i3] = j60VarA2;
                    i3 = i26;
                    iS = iS;
                    zU = zU;
                    it = it3;
                }
                i4 = iS;
                z5 = zU;
                yw1VarK = j60.k(yw1.i(i3, objArrCopyOf), mi3Var, bundle2);
            }
            wa4Var = wa4Var4;
        } else {
            hashSet = new HashSet();
            gy3Var = va4.d;
            while (i2 < gy3Var.q) {
                hashSet.add(new va4(((Integer) gy3Var.get(i2)).intValue()));
            }
            if (!z17) {
                while (r10.hasNext()) {
                    if (va4Var.a == 40010) {
                        hashSet.remove(va4Var);
                    }
                }
            }
            if (ei3Var2 != null) {
                while (r10.hasNext()) {
                    String str8 = di3Var.n;
                    bundle5 = di3Var.q;
                    if (bundle5 == null) {
                        bundle5 = Bundle.EMPTY;
                    }
                    hashSet.add(new va4(str8, bundle5));
                }
            }
            wa4 wa4Var5 = new wa4(hashSet);
            if (ei3Var2 == null) {
                vw1 vw1Var3 = yw1.o;
                i4 = iS;
                z5 = zU;
                yw1VarK = gy3.r;
            } else {
                List list5 = ei3Var2.v;
                uc5.f(4, "initialCapacity");
                objArrCopyOf = new Object[4];
                it = list5.iterator();
                i3 = 0;
                while (it.hasNext()) {
                    di3 di3Var4 = (di3) it.next();
                    String str9 = di3Var4.n;
                    bundle3 = di3Var4.q;
                    if (bundle3 != null) {
                        i5 = bundle3.getInt("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_COMPAT", 0);
                    } else {
                        i5 = 0;
                    }
                    Iterator it4 = it;
                    i60Var = new i60(i5, di3Var4.p);
                    if (bundle3 == null) {
                        bundle4 = Bundle.EMPTY;
                    } else {
                        bundle4 = bundle3;
                    }
                    i60Var.d(new va4(str9, bundle4));
                    i60Var.f = di3Var4.o;
                    i60Var.h = true;
                    if (bundle3 != null) {
                        i60Var.g = new Bundle(bundle3);
                    }
                    if (bundle3 != null) {
                        string = bundle3.getString("androidx.media3.session.EXTRAS_KEY_COMMAND_BUTTON_ICON_URI_COMPAT");
                    } else {
                        string = null;
                    }
                    if (string != null) {
                        uri = Uri.parse(string);
                        scheme = uri.getScheme();
                        if (Objects.equals(scheme, "content")) {
                            i60Var.b(uri);
                        } else {
                            i60Var.b(uri);
                        }
                    }
                    j60 j60VarA3 = i60Var.a();
                    int i27 = i3 + 1;
                    iB = qw1.b(objArrCopyOf.length, i27);
                    if (iB > objArrCopyOf.length) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                    }
                    objArrCopyOf[i3] = j60VarA3;
                    i3 = i27;
                    iS = iS;
                    zU = zU;
                    it = it4;
                }
                i4 = iS;
                z5 = zU;
                yw1VarK = j60.k(yw1.i(i3, objArrCopyOf), mi3Var, bundle2);
            }
            wa4Var = wa4Var5;
        }
        Context context2 = this.a;
        PlaybackException playbackExceptionO2 = f92.o(ei3Var2, context2);
        if (ei3Var2 == null) {
            xa4Var = null;
        } else {
            i6 = ei3Var2.n;
            int i28 = ei3Var2.s;
            CharSequence charSequence5 = ei3Var2.t;
            Bundle bundle13 = ei3Var2.x;
            if (i6 != 7) {
                xa4Var = null;
            } else {
                xa4Var = null;
            }
        }
        long jC4 = f92.c(ei3Var2, eo2Var3, j8);
        long jB3 = f92.b(ei3Var2, eo2Var3, j8);
        wa4 wa4Var6 = wa4Var;
        yw1 yw1Var5 = yw1VarK;
        xa4 xa4Var3 = xa4Var;
        int iB4 = ju2.b(f92.b(ei3Var2, eo2Var3, j8), f92.d(eo2Var3));
        long jB4 = f92.b(ei3Var2, eo2Var3, j8) - f92.c(ei3Var2, eo2Var3, j8);
        if (eo2Var3 == null) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (ei3Var2 == null) {
            qh3Var = qh3.d;
        } else {
            qh3Var = new qh3(ei3Var2.q);
        }
        if (fg4Var2 == 0) {
            ilVar = il.i;
            fg4Var3 = fg4Var2;
        } else {
            fg4Var3 = fg4Var2;
            ilVar = (il) fg4Var3.f;
        }
        if (ei3Var2 == null) {
            switch (ei3Var2.n) {
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    z7 = true;
                    break;
                case 7:
                case 8:
                default:
                    z7 = false;
                    break;
            }
        } else {
            z7 = false;
        }
        if (ei3Var2 == null) {
            mi3Var = mi3Var;
            i7 = 1;
        } else {
            i8 = ei3Var2.n;
            jD = f92.d(eo2Var3);
            if (jD == -9223372036854775807L) {
                z8 = false;
            } else {
                z8 = true;
            }
            switch (i8) {
                case 0:
                case 7:
                case 8:
                    mi3Var = mi3Var;
                    i7 = 1;
                    break;
                case 1:
                    mi3Var = mi3Var;
                    if (z8) {
                        i7 = 4;
                    } else {
                        i7 = 1;
                    }
                    break;
                case 2:
                    mi3Var = mi3Var;
                    if (z8) {
                        i7 = 4;
                    } else {
                        i7 = 3;
                    }
                    break;
                case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                    mi3Var = mi3Var;
                    i7 = 3;
                    break;
                case 4:
                case 5:
                case 6:
                case 9:
                case 10:
                case 11:
                    mi3Var = mi3Var;
                    i7 = 2;
                    break;
                default:
                    throw new LegacyConversions$ConversionException("Invalid state of PlaybackStateCompat: " + i8);
            }
        }
        int i29 = i7;
        if (ei3Var2 == null) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (fg4Var3 == null) {
            hp0VarB = hp0.e;
        } else {
            if (fg4Var3.b == 2) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            x20 x20Var3 = new x20(i9);
            x20Var3.c = fg4Var3.d;
            String str10 = (String) fg4Var3.g;
            if (i9 == 0) {
                z10 = true;
            } else {
                z10 = true;
            }
            rr2.l(z10);
            x20Var3.d = str10;
            hp0VarB = x20Var3.b();
        }
        hp0 hp0Var3 = hp0VarB;
        if (fg4Var3 == null) {
            i10 = 0;
        } else {
            i10 = fg4Var3.e;
        }
        if (fg4Var3 == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        lk3 lk3Var5 = (lk3) ml3Var2.a;
        long j19 = lk3Var5.C;
        long j110 = lk3Var5.D;
        long j111 = lk3Var5.E;
        Bundle bundle14 = (Bundle) hm2Var.h;
        i11 = iO;
        if (i11 >= xs3Var.o()) {
            gn2Var2 = null;
        } else {
            gn2Var2 = xs3Var.s(i11).a;
        }
        za4 za4Var3 = new za4(Z0(i11, gn2Var2, jC4, z6), z6, SystemClock.elapsedRealtime(), jD2, jB3, iB4, jB4, -9223372036854775807L, jD2, jB3);
        pi3 pi3Var3 = za4.k;
        int i210 = i4;
        lk3Var = new lk3(playbackExceptionO2, 0, za4Var3, pi3Var3, pi3Var3, 0, qh3Var, i210, z5, s55.d, xs3Var, 0, do2Var4, 1.0f, 1.0f, ilVar, 0, jg0.d, hp0Var3, i10, z11, z7, 1, 0, i29, z9, false, do2Var, j19, j110, j111, jw4.b, cw4.J);
        ml3 ml3Var5 = new ml3(lk3Var, wa4Var6, mi3Var, yw1Var5, bundle14, xa4Var3);
        hm2Var2 = this.m;
        ml3Var = this.p;
        j7 = a1().g;
        num = 3;
        zP = ((lk3) ml3Var.a).j.p();
        boolean zP4 = xs3Var.p();
        if (!zP) {
            if (zP) {
                gn2VarS = ((lk3) ml3Var.a).s();
                gn2VarS.getClass();
                ws3Var2 = xs3Var.f;
                if (ws3Var2 == null) {
                    i12 = 0;
                    while (true) {
                        yw1Var2 = xs3Var.e;
                        if (i12 >= yw1Var2.size()) {
                            z12 = false;
                        } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    }
                } else {
                    i12 = 0;
                    while (true) {
                        yw1Var2 = xs3Var.e;
                        if (i12 >= yw1Var2.size()) {
                            z12 = false;
                        } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    }
                }
                if (z12) {
                    num2 = 4;
                } else if (gn2VarS.equals(lk3Var.s())) {
                    jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                    jC2 = f92.c(ei3Var2, eo2Var3, j7);
                    if (jC2 == j4) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z13 = true;
                    num = 1;
                    num2 = 0;
                }
                z13 = true;
            } else {
                gn2VarS = ((lk3) ml3Var.a).s();
                gn2VarS.getClass();
                ws3Var2 = xs3Var.f;
                if (ws3Var2 == null) {
                    i12 = 0;
                    while (true) {
                        yw1Var2 = xs3Var.e;
                        if (i12 >= yw1Var2.size()) {
                            z12 = false;
                        } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    }
                } else {
                    i12 = 0;
                    while (true) {
                        yw1Var2 = xs3Var.e;
                        if (i12 >= yw1Var2.size()) {
                            z12 = false;
                        } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                            z12 = true;
                        } else {
                            i12++;
                        }
                    }
                }
                if (z12) {
                    num2 = 4;
                } else if (gn2VarS.equals(lk3Var.s())) {
                    jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                    jC2 = f92.c(ei3Var2, eo2Var3, j7);
                    if (jC2 == j4) {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    } else {
                        if (Math.abs(jC - jC2) > 100) {
                            num2 = 5;
                        } else {
                            num2 = null;
                        }
                        num3 = null;
                    }
                    num = num3;
                } else {
                    z13 = true;
                    num = 1;
                    num2 = 0;
                }
                z13 = true;
            }
        } else if (zP) {
            gn2VarS = ((lk3) ml3Var.a).s();
            gn2VarS.getClass();
            ws3Var2 = xs3Var.f;
            if (ws3Var2 == null) {
                i12 = 0;
                while (true) {
                    yw1Var2 = xs3Var.e;
                    if (i12 >= yw1Var2.size()) {
                        z12 = false;
                    } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                }
            } else {
                i12 = 0;
                while (true) {
                    yw1Var2 = xs3Var.e;
                    if (i12 >= yw1Var2.size()) {
                        z12 = false;
                    } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                }
            }
            if (z12) {
                num2 = 4;
            } else if (gn2VarS.equals(lk3Var.s())) {
                jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                jC2 = f92.c(ei3Var2, eo2Var3, j7);
                if (jC2 == j4) {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z13 = true;
                num = 1;
                num2 = 0;
            }
            z13 = true;
        } else {
            gn2VarS = ((lk3) ml3Var.a).s();
            gn2VarS.getClass();
            ws3Var2 = xs3Var.f;
            if (ws3Var2 == null) {
                i12 = 0;
                while (true) {
                    yw1Var2 = xs3Var.e;
                    if (i12 >= yw1Var2.size()) {
                        z12 = false;
                    } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                }
            } else {
                i12 = 0;
                while (true) {
                    yw1Var2 = xs3Var.e;
                    if (i12 >= yw1Var2.size()) {
                        z12 = false;
                    } else if (gn2VarS.equals(((ws3) yw1Var2.get(i12)).a)) {
                        z12 = true;
                    } else {
                        i12++;
                    }
                }
            }
            if (z12) {
                num2 = 4;
            } else if (gn2VarS.equals(lk3Var.s())) {
                jC = f92.c((ei3) hm2Var2.e, (eo2) hm2Var2.f, j7);
                jC2 = f92.c(ei3Var2, eo2Var3, j7);
                if (jC2 == j4) {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                } else {
                    if (Math.abs(jC - jC2) > 100) {
                        num2 = 5;
                    } else {
                        num2 = null;
                    }
                    num3 = null;
                }
                num = num3;
            } else {
                z13 = true;
                num = 1;
                num2 = 0;
            }
            z13 = true;
        }
        Pair pairCreate4 = Pair.create(num2, num);
        g1(z, hm2Var, true, ml3Var5, (Integer) pairCreate4.first, (Integer) pairCreate4.second);
        if (this.o) {
            this.o = false;
            sk2VarA1 = a1();
            sk2VarA1.getClass();
            if (Looper.myLooper() == sk2VarA1.f.getLooper()) {
                z14 = z13;
            } else {
                z14 = false;
            }
            rr2.w(z14);
            sk2VarA1.e.getClass();
        }
    }

    @Override // defpackage.rk2
    public final void c() {
        V(false);
    }

    @Override // defpackage.rk2
    public final void c0() {
        ((MediaController.TransportControls) this.i.A().o).skipToNext();
    }

    public final void c1() {
        bu4 bu4Var = new bu4();
        rr2.w(d1() && !((lk3) this.p.a).j.p());
        lk3 lk3Var = (lk3) this.p.a;
        xs3 xs3Var = (xs3) lk3Var.j;
        int i = lk3Var.c.a.b;
        xs3Var.m(i, bu4Var, 0L);
        gn2 gn2Var = bu4Var.b;
        if (xs3Var.r(i) != -1) {
            boolean z = ((lk3) this.p.a).v;
            wo0 wo0Var = this.i;
            if (z) {
                ((MediaController.TransportControls) wo0Var.A().o).play();
            } else {
                ((MediaController.TransportControls) wo0Var.A().o).prepare();
            }
        } else {
            cn2 cn2Var = gn2Var.f;
            String str = gn2Var.a;
            if (cn2Var.a != null) {
                boolean z2 = ((lk3) this.p.a).v;
                wo0 wo0Var2 = this.i;
                if (z2) {
                    pz1 pz1VarA = wo0Var2.A();
                    Uri uri = cn2Var.a;
                    Bundle bundle = cn2Var.c;
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) pz1VarA.o).playFromUri(uri, bundle);
                } else {
                    pz1 pz1VarA2 = wo0Var2.A();
                    Uri uri2 = cn2Var.a;
                    Bundle bundle2 = cn2Var.c;
                    if (bundle2 == null) {
                        bundle2 = Bundle.EMPTY;
                    }
                    ((MediaController.TransportControls) pz1VarA2.o).prepareFromUri(uri2, bundle2);
                }
            } else {
                String str2 = cn2Var.b;
                ml3 ml3Var = this.p;
                if (str2 != null) {
                    boolean z3 = ((lk3) ml3Var.a).v;
                    wo0 wo0Var3 = this.i;
                    if (z3) {
                        pz1 pz1VarA3 = wo0Var3.A();
                        String str3 = cn2Var.b;
                        Bundle bundle3 = cn2Var.c;
                        if (bundle3 == null) {
                            bundle3 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) pz1VarA3.o).playFromSearch(str3, bundle3);
                    } else {
                        pz1 pz1VarA4 = wo0Var3.A();
                        String str4 = cn2Var.b;
                        Bundle bundle4 = cn2Var.c;
                        if (bundle4 == null) {
                            bundle4 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) pz1VarA4.o).prepareFromSearch(str4, bundle4);
                    }
                } else {
                    boolean z4 = ((lk3) ml3Var.a).v;
                    wo0 wo0Var4 = this.i;
                    if (z4) {
                        pz1 pz1VarA5 = wo0Var4.A();
                        Bundle bundle5 = cn2Var.c;
                        if (bundle5 == null) {
                            bundle5 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) pz1VarA5.o).playFromMediaId(str, bundle5);
                    } else {
                        pz1 pz1VarA6 = wo0Var4.A();
                        Bundle bundle6 = cn2Var.c;
                        if (bundle6 == null) {
                            bundle6 = Bundle.EMPTY;
                        }
                        ((MediaController.TransportControls) pz1VarA6.o).prepareFromMediaId(str, bundle6);
                    }
                }
            }
        }
        if (((lk3) this.p.a).c.a.f != 0) {
            ((MediaController.TransportControls) this.i.A().o).seekTo(((lk3) this.p.a).c.a.f);
        }
        if (((mi3) this.p.c).a(20)) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < xs3Var.o(); i2++) {
                if (i2 != i && xs3Var.r(i2) == -1) {
                    xs3Var.m(i2, bu4Var, 0L);
                    arrayList.add(bu4Var.b);
                }
            }
            W0(arrayList, 0);
        }
    }

    @Override // defpackage.rk2
    public final void d(qh3 qh3Var) {
        if (!qh3Var.equals(i())) {
            lk3 lk3VarE = ((lk3) this.p.a).e(qh3Var);
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarE, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        this.i.A().J(qh3Var.a);
    }

    @Override // defpackage.rk2
    public final void d0(int i) {
        int iJ = j() - 1;
        if (iJ >= F().b) {
            lk3 lk3VarC = ((lk3) this.p.a).c(iJ, y0());
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarC, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        ((xk2) this.i.n).a.adjustVolume(-1, i);
    }

    public final boolean d1() {
        return ((lk3) this.p.a).A != 1;
    }

    @Override // defpackage.rk2
    public final void e(float f) {
        if (f != i().a) {
            lk3 lk3VarE = ((lk3) this.p.a).e(new qh3(f));
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarE, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        this.i.A().J(f);
    }

    @Override // defpackage.rk2
    public final jw4 e0() {
        return jw4.b;
    }

    public final void e1() {
        eo2 eo2VarCreateFromParcel;
        int iV;
        if (this.k || this.l) {
            return;
        }
        this.l = true;
        fg4 fg4VarY = this.i.y();
        ei3 ei3VarY0 = Y0(this.i.z());
        MediaMetadata metadata = ((xk2) this.i.n).a.getMetadata();
        if (metadata != null) {
            oi oiVar = eo2.q;
            Parcel parcelObtain = Parcel.obtain();
            metadata.writeToParcel(parcelObtain, 0);
            parcelObtain.setDataPosition(0);
            eo2VarCreateFromParcel = eo2.CREATOR.createFromParcel(parcelObtain);
            parcelObtain.recycle();
            eo2VarCreateFromParcel.o = metadata;
        } else {
            eo2VarCreateFromParcel = null;
        }
        List<MediaSession.QueueItem> queue = ((xk2) this.i.n).a.getQueue();
        List listX0 = X0(queue != null ? or2.a(queue) : null);
        CharSequence queueTitle = ((xk2) this.i.n).a.getQueueTitle();
        qu1 qu1VarA = ((xk2) this.i.n).e.a();
        int iH = -1;
        if (qu1VarA != null) {
            try {
                iH = qu1VarA.h();
            } catch (RemoteException | SecurityException e) {
                l93.G("MediaControllerCompat", "Dead object in getRepeatMode.", e);
            }
        }
        qu1 qu1VarA2 = ((xk2) this.i.n).e.a();
        if (qu1VarA2 != null) {
            try {
                iV = qu1VarA2.V();
            } catch (RemoteException | SecurityException e2) {
                l93.G("MediaControllerCompat", "Dead object in getShuffleMode.", e2);
                iV = -1;
            }
        } else {
            iV = -1;
        }
        b1(true, new hm2(fg4VarY, ei3VarY0, eo2VarCreateFromParcel, listX0, queueTitle, iH, iV, f35.n(((xk2) this.i.n).a.getExtras())));
    }

    @Override // defpackage.rk2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.rk2
    public final boolean f0() {
        return this.l;
    }

    public final void f1(int i, long j) {
        Integer num;
        Integer num2;
        int i2;
        long j2;
        long j3;
        long j4;
        int i3 = i;
        long j5 = j;
        rr2.l(i3 >= 0);
        int iO0 = o0();
        cu4 cu4Var = ((lk3) this.p.a).j;
        if ((cu4Var.p() || i3 < cu4Var.o()) && !k()) {
            if (i3 != iO0) {
                long jR = ((xs3) ((lk3) this.p.a).j).r(i3);
                if (jR != -1) {
                    ((MediaController.TransportControls) this.i.A().o).skipToQueueItem(jR);
                    num = 2;
                } else {
                    xa3.m(i3, "Cannot seek to new media item due to the missing queue Id at media item, mediaItemIndex=", "MCImplLegacy");
                    i3 = iO0;
                    num = null;
                }
            } else {
                i3 = iO0;
                num = null;
            }
            long jM0 = M0();
            if (j5 == -9223372036854775807L) {
                j5 = jM0;
                num2 = null;
            } else {
                ((MediaController.TransportControls) this.i.A().o).seekTo(j5);
                num2 = 1;
            }
            if (num == null) {
                long jB0 = b0();
                long duration = getDuration();
                long jMax = j5 < jM0 ? j5 : Math.max(j5, jB0);
                j2 = jMax;
                i2 = duration == -9223372036854775807L ? 0 : (int) ((100 * jMax) / duration);
                j3 = jMax - j5;
                j4 = duration;
            } else {
                i2 = 0;
                j2 = 0;
                j3 = 0;
                j4 = -9223372036854775807L;
            }
            lk3 lk3VarJ = ((lk3) this.p.a).j(new za4(Z0(i3, !cu4Var.p() ? cu4Var.m(i3, new bu4(), 0L).b : null, j5, false), false, SystemClock.elapsedRealtime(), j4, j2, i2, j3, -9223372036854775807L, j4, j2));
            if (lk3VarJ.A != 1) {
                lk3VarJ = lk3VarJ.f(2, null);
            }
            lk3 lk3Var = lk3VarJ;
            ml3 ml3Var = this.p;
            h1(new ml3(lk3Var, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), num2, num);
        }
    }

    @Override // defpackage.rk2
    public final int g() {
        return ((lk3) this.p.a).A;
    }

    @Override // defpackage.rk2
    public final do2 g0() {
        return ((lk3) this.p.a).m;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(boolean z, hm2 hm2Var, boolean z2, final ml3 ml3Var, Integer num, Integer num2) {
        PlaybackException playbackExceptionO;
        final int i;
        final int i2;
        final int i3;
        yw1 yw1Var = (yw1) ml3Var.d;
        hm2 hm2Var2 = this.m;
        ml3 ml3Var2 = this.p;
        if (hm2Var2 != hm2Var) {
            this.m = new hm2(hm2Var);
        }
        if (z2) {
            this.n = this.m;
        }
        this.p = ml3Var;
        if (z) {
            a1().X0();
            if (((yw1) ml3Var2.d).equals(yw1Var)) {
                return;
            }
            a1().f.post(new dm2(this, ml3Var));
            return;
        }
        lk3 lk3Var = (lk3) ml3Var2.a;
        cu4 cu4Var = lk3Var.j;
        lk3 lk3Var2 = (lk3) ml3Var.a;
        xa4 xa4Var = (xa4) ml3Var.f;
        boolean zEquals = cu4Var.equals(lk3Var2.j);
        final int i4 = 4;
        tc2 tc2Var = this.d;
        if (!zEquals) {
            tc2Var.c(0, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i5 = i4;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i5) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        CharSequence charSequence = (CharSequence) hm2Var2.g;
        CharSequence charSequence2 = (CharSequence) hm2Var.g;
        ei3 ei3Var = (ei3) hm2Var.e;
        boolean zEquals2 = TextUtils.equals(charSequence, charSequence2);
        final int i5 = 5;
        if (!zEquals2) {
            tc2Var.c(15, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i6 = i5;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i6) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (num != null) {
            tc2Var.c(11, new eg0(ml3Var2, ml3Var, num, i5));
        }
        if (num2 != null) {
            tc2Var.c(1, new ef0(17, ml3Var, num2));
        }
        ei3 ei3Var2 = (ei3) hm2Var2.e;
        hd5 hd5Var = ju2.a;
        boolean z3 = ei3Var2 != null && ei3Var2.n == 7;
        boolean z4 = ei3Var != null && ei3Var.n == 7;
        final int i6 = 3;
        final int i7 = 10;
        if (z3 && z4) {
            String str = f35.a;
            if (ei3Var2.s != ei3Var.s || !TextUtils.equals(ei3Var2.t, ei3Var.t)) {
                playbackExceptionO = f92.o(ei3Var, this.a);
                tc2Var.c(10, new hj0(3, playbackExceptionO));
                if (playbackExceptionO != null) {
                    tc2Var.c(10, new hj0(4, playbackExceptionO));
                }
            }
        } else if (z3 != z4) {
            playbackExceptionO = f92.o(ei3Var, this.a);
            tc2Var.c(10, new hj0(3, playbackExceptionO));
            if (playbackExceptionO != null) {
                tc2Var.c(10, new hj0(4, playbackExceptionO));
            }
        }
        if (((eo2) hm2Var2.f) != ((eo2) hm2Var.f)) {
            tc2Var.c(14, new em2(this));
        }
        if (lk3Var.A != lk3Var2.A) {
            final int i8 = 6;
            tc2Var.c(4, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i9 = i8;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i9) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (lk3Var.v != lk3Var2.v) {
            i = 7;
            tc2Var.c(5, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i9 = i;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i9) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        } else {
            i = 7;
        }
        final int i9 = 8;
        if (lk3Var.x != lk3Var2.x) {
            tc2Var.c(i, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i10 = i9;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i10) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        final int i10 = 9;
        final int i11 = 12;
        if (!lk3Var.g.equals(lk3Var2.g)) {
            tc2Var.c(12, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i12 = i10;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i12) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (lk3Var.h != lk3Var2.h) {
            tc2Var.c(8, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i12 = i7;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i12) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (lk3Var.i != lk3Var2.i) {
            final int i12 = 11;
            tc2Var.c(9, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i13 = i12;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i13) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!lk3Var.q.equals(lk3Var2.q)) {
            tc2Var.c(20, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i13 = i11;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i13) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (lk3Var.p != lk3Var2.p) {
            i2 = 0;
            tc2Var.c(21, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i13 = i2;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i13) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        } else {
            i2 = 0;
        }
        if (lk3Var.s.equals(lk3Var2.s)) {
            i3 = 1;
        } else {
            i3 = 1;
            tc2Var.c(29, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i13 = i3;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i13) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (lk3Var.t != lk3Var2.t || lk3Var.u != lk3Var2.u) {
            final int i13 = 2;
            tc2Var.c(30, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i14 = i13;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i14) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!((mi3) ml3Var2.c).equals((mi3) ml3Var.c)) {
            tc2Var.c(13, new qc2() { // from class: cm2
                @Override // defpackage.qc2
                public final void invoke(Object obj) {
                    int i14 = i6;
                    ml3 ml3Var3 = ml3Var;
                    oi3 oi3Var = (oi3) obj;
                    switch (i14) {
                        case 0:
                            oi3Var.b(((lk3) ml3Var3.a).p);
                            break;
                        case 1:
                            oi3Var.Q(((lk3) ml3Var3.a).s);
                            break;
                        case 2:
                            lk3 lk3Var3 = (lk3) ml3Var3.a;
                            oi3Var.C(lk3Var3.t, lk3Var3.u);
                            break;
                        case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                            oi3Var.O((mi3) ml3Var3.c);
                            break;
                        case 4:
                            lk3 lk3Var4 = (lk3) ml3Var3.a;
                            oi3Var.I(lk3Var4.j, lk3Var4.k);
                            break;
                        case 5:
                            oi3Var.G(((lk3) ml3Var3.a).m);
                            break;
                        case 6:
                            oi3Var.v(((lk3) ml3Var3.a).A);
                            break;
                        case 7:
                            oi3Var.r(4, ((lk3) ml3Var3.a).v);
                            break;
                        case 8:
                            oi3Var.V(((lk3) ml3Var3.a).x);
                            break;
                        case 9:
                            oi3Var.N(((lk3) ml3Var3.a).g);
                            break;
                        case 10:
                            oi3Var.f(((lk3) ml3Var3.a).h);
                            break;
                        case 11:
                            oi3Var.x(((lk3) ml3Var3.a).i);
                            break;
                        default:
                            oi3Var.n(((lk3) ml3Var3.a).q);
                            break;
                    }
                }
            });
        }
        if (!((wa4) ml3Var2.b).equals((wa4) ml3Var.b)) {
            sk2 sk2VarA1 = a1();
            sk2VarA1.getClass();
            rr2.w(Looper.myLooper() == sk2VarA1.f.getLooper() ? i3 : i2);
            sk2VarA1.e.l();
        }
        if (!((yw1) ml3Var2.d).equals(yw1Var)) {
            sk2 sk2VarA2 = a1();
            sk2VarA2.getClass();
            rr2.w(Looper.myLooper() == sk2VarA2.f.getLooper() ? i3 : i2);
            qk2 qk2Var = sk2VarA2.e;
            qk2Var.getClass();
            new ab4(-6);
            qk2Var.u();
        }
        if (xa4Var != null) {
            sk2 sk2VarA3 = a1();
            sk2VarA3.getClass();
            rr2.w(Looper.myLooper() == sk2VarA3.f.getLooper() ? i3 : i2);
            sk2VarA3.e.getClass();
        }
        tc2Var.b();
    }

    @Override // defpackage.rk2
    public final long getDuration() {
        return ((lk3) this.p.a).c.d;
    }

    @Override // defpackage.rk2
    public final int h() {
        return ((lk3) this.p.a).h;
    }

    @Override // defpackage.rk2
    public final boolean h0() {
        return ((lk3) this.p.a).x;
    }

    public final void h1(ml3 ml3Var, Integer num, Integer num2) {
        g1(false, this.m, false, ml3Var, num, num2);
    }

    @Override // defpackage.rk2
    public final qh3 i() {
        return ((lk3) this.p.a).g;
    }

    @Override // defpackage.rk2
    public final jg0 i0() {
        l93.q0("MCImplLegacy", "Session doesn't support getting Cue");
        return jg0.d;
    }

    @Override // defpackage.rk2
    public final int j() {
        lk3 lk3Var = (lk3) this.p.a;
        if (lk3Var.s.a == 1) {
            return lk3Var.t;
        }
        wo0 wo0Var = this.i;
        if (wo0Var == null) {
            return 0;
        }
        fg4 fg4VarY = wo0Var.y();
        jx1 jx1Var = f92.a;
        if (fg4VarY == null) {
            return 0;
        }
        return fg4VarY.e;
    }

    @Override // defpackage.rk2
    public final int j0() {
        return -1;
    }

    @Override // defpackage.rk2
    public final boolean k() {
        return ((lk3) this.p.a).c.b;
    }

    @Override // defpackage.rk2
    public final void k0(il ilVar, boolean z) {
        l93.q0("MCImplLegacy", "Legacy session doesn't support setting audio attributes remotely");
    }

    @Override // defpackage.rk2
    public final long l() {
        return -9223372036854775807L;
    }

    @Override // defpackage.rk2
    public final void l0(do2 do2Var) {
        l93.q0("MCImplLegacy", "Session doesn't support setting playlist metadata");
    }

    @Override // defpackage.rk2
    public final long m() {
        return ((lk3) this.p.a).c.g;
    }

    @Override // defpackage.rk2
    public final void m0() {
        V(true);
    }

    @Override // defpackage.rk2
    public final void n(int i, long j) {
        f1(i, j);
    }

    @Override // defpackage.rk2
    public final int n0() {
        return -1;
    }

    @Override // defpackage.rk2
    public final mi3 o() {
        return (mi3) this.p.c;
    }

    @Override // defpackage.rk2
    public final int o0() {
        return ((lk3) this.p.a).c.a.b;
    }

    @Override // defpackage.rk2
    public final void p(gn2 gn2Var, long j) {
        T(yw1.o(gn2Var), 0, j);
    }

    @Override // defpackage.rk2
    public final void p0(int i) {
        if (i != h()) {
            lk3 lk3VarI = ((lk3) this.p.a).i(i);
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarI, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        pz1 pz1VarA = this.i.A();
        int iP = f92.p(i);
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE", iP);
        pz1VarA.I("android.support.v4.media.session.action.SET_REPEAT_MODE", bundle);
    }

    @Override // defpackage.rk2
    public final boolean q() {
        return ((lk3) this.p.a).v;
    }

    @Override // defpackage.rk2
    public final void q0(boolean z) {
        E(1, z);
    }

    @Override // defpackage.rk2
    public final void r() {
        P(0, Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final void r0(oi3 oi3Var) {
        this.d.e(oi3Var);
    }

    @Override // defpackage.rk2
    public final void s(boolean z) {
        if (z != D0()) {
            lk3 lk3VarK = ((lk3) this.p.a).k(z);
            ml3 ml3Var = this.p;
            h1(new ml3(lk3VarK, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        }
        pz1 pz1VarA = this.i.A();
        jx1 jx1Var = f92.a;
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE", z ? 1 : 0);
        pz1VarA.I("android.support.v4.media.session.action.SET_SHUFFLE_MODE", bundle);
    }

    @Override // defpackage.rk2
    public final void s0(gn2 gn2Var) {
        p(gn2Var, -9223372036854775807L);
    }

    @Override // defpackage.rk2
    public final void stop() {
        lk3 lk3Var = (lk3) this.p.a;
        if (lk3Var.A == 1) {
            return;
        }
        za4 za4Var = lk3Var.c;
        pi3 pi3Var = za4Var.a;
        boolean z = za4Var.b;
        long j = za4Var.d;
        long j2 = pi3Var.f;
        lk3 lk3VarJ = lk3Var.j(new za4(pi3Var, z, SystemClock.elapsedRealtime(), j, j2, ju2.b(j2, j), 0L, -9223372036854775807L, j, j2));
        lk3 lk3Var2 = (lk3) this.p.a;
        if (lk3Var2.A != 1) {
            lk3VarJ = lk3VarJ.f(1, lk3Var2.a);
        }
        lk3 lk3Var3 = lk3VarJ;
        ml3 ml3Var = this.p;
        h1(new ml3(lk3Var3, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        ((MediaController.TransportControls) this.i.A().o).stop();
    }

    @Override // defpackage.rk2
    public final int t() {
        return ((lk3) this.p.a).c.f;
    }

    @Override // defpackage.rk2
    public final void t0(int i, int i2) {
        u0(i, i + 1, i2);
    }

    @Override // defpackage.rk2
    public final long u() {
        return ((lk3) this.p.a).E;
    }

    @Override // defpackage.rk2
    public final void u0(int i, int i2, int i3) {
        rr2.l(i >= 0 && i <= i2 && i3 >= 0);
        xs3 xs3Var = (xs3) ((lk3) this.p.a).j;
        int iO = xs3Var.o();
        int iMin = Math.min(i2, iO);
        int i4 = iMin - i;
        int i5 = iO - i4;
        int i6 = i5 - 1;
        int iMin2 = Math.min(i3, i5);
        if (i >= iO || i == iMin || i == iMin2) {
            return;
        }
        int iO0 = o0();
        if (iO0 >= i) {
            iO0 = iO0 < iMin ? -1 : iO0 - i4;
        }
        if (iO0 == -1) {
            iO0 = f35.j(i, 0, i6);
            l93.q0("MCImplLegacy", "Currently playing item will be removed and added back to mimic move. Assumes item at " + iO0 + " would be the new current item");
        }
        if (iO0 >= iMin2) {
            iO0 += i4;
        }
        ArrayList arrayList = new ArrayList(xs3Var.e);
        f35.P(arrayList, i, iMin, iMin2);
        lk3 lk3VarM = ((lk3) this.p.a).m(new xs3(yw1.k(arrayList), xs3Var.f), iO0);
        ml3 ml3Var = this.p;
        h1(new ml3(lk3VarM, (wa4) ml3Var.b, (mi3) ml3Var.c, (yw1) ml3Var.d, (Bundle) ml3Var.e, (xa4) null), null, null);
        if (d1()) {
            ArrayList arrayList2 = new ArrayList();
            for (int i7 = 0; i7 < i4; i7++) {
                arrayList2.add((or2) this.m.a.get(i));
                this.i.I(((or2) this.m.a.get(i)).n);
            }
            for (int i8 = 0; i8 < arrayList2.size(); i8++) {
                this.i.a(((or2) arrayList2.get(i8)).n, i8 + iMin2);
            }
        }
    }

    @Override // defpackage.rk2
    public final void v(oi3 oi3Var) {
        this.d.a(oi3Var);
    }

    @Override // defpackage.rk2
    public final int v0() {
        return 0;
    }

    @Override // defpackage.rk2
    public final int w() {
        return -1;
    }

    @Override // defpackage.rk2
    public final void w0(List list) {
        N0(list, Integer.MAX_VALUE);
    }

    @Override // defpackage.rk2
    public final long x() {
        return getDuration();
    }

    @Override // defpackage.rk2
    public final cu4 x0() {
        return ((lk3) this.p.a).j;
    }

    @Override // defpackage.rk2
    public final int y() {
        return o0();
    }

    @Override // defpackage.rk2
    public final boolean y0() {
        lk3 lk3Var = (lk3) this.p.a;
        if (lk3Var.s.a == 1) {
            return lk3Var.u;
        }
        wo0 wo0Var = this.i;
        if (wo0Var == null) {
            return false;
        }
        fg4 fg4VarY = wo0Var.y();
        jx1 jx1Var = f92.a;
        return fg4VarY != null && fg4VarY.e == 0;
    }

    @Override // defpackage.rk2
    public final s55 z() {
        l93.q0("MCImplLegacy", "Session doesn't support getting VideoSize");
        return s55.d;
    }

    @Override // defpackage.rk2
    public final void z0(int i, gn2 gn2Var) {
        L(i, i + 1, yw1.o(gn2Var));
    }
}
