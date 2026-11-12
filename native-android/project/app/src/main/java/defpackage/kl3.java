package defpackage;

import com.eddyizm.tempus.subsonic.models.Playlist;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kl3 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ kl3(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        int i = this.n;
        String str = null;
        Object obj2 = this.o;
        switch (i) {
            case 0:
                ml3 ml3Var = (ml3) obj2;
                Object obj3 = ml3Var.c;
                z34 z34VarU = ((x34) obj).U("SELECT * FROM playlist");
                try {
                    int iE = rr2.E(z34VarU, "id");
                    int iE2 = rr2.E(z34VarU, "name");
                    int iE3 = rr2.E(z34VarU, "duration");
                    int iE4 = rr2.E(z34VarU, "coverArt");
                    int iE5 = rr2.E(z34VarU, "comment");
                    int iE6 = rr2.E(z34VarU, "owner");
                    int iE7 = rr2.E(z34VarU, "isUniversal");
                    int iE8 = rr2.E(z34VarU, "songCount");
                    int iE9 = rr2.E(z34VarU, "created");
                    int iE10 = rr2.E(z34VarU, "changed");
                    int iE11 = rr2.E(z34VarU, "lastPlayed");
                    int iE12 = rr2.E(z34VarU, "allowedUsers");
                    ArrayList arrayList = new ArrayList();
                    while (z34VarU.O()) {
                        Playlist playlist = new Playlist(z34VarU.isNull(iE) ? str : z34VarU.D(iE), z34VarU.isNull(iE2) ? str : z34VarU.D(iE2), z34VarU.getLong(iE3), z34VarU.isNull(iE4) ? str : z34VarU.D(iE4));
                        playlist.setComment(z34VarU.isNull(iE5) ? null : z34VarU.D(iE5));
                        playlist.setOwner(z34VarU.isNull(iE6) ? null : z34VarU.D(iE6));
                        Integer numValueOf = z34VarU.isNull(iE7) ? null : Integer.valueOf((int) z34VarU.getLong(iE7));
                        if (numValueOf == null) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        }
                        playlist.setUniversal(boolValueOf);
                        playlist.setSongCount((int) z34VarU.getLong(iE8));
                        playlist.setCreated(i80.B(z34VarU.isNull(iE9) ? null : Long.valueOf(z34VarU.getLong(iE9))));
                        playlist.setChanged(i80.B(z34VarU.isNull(iE10) ? null : Long.valueOf(z34VarU.getLong(iE10))));
                        playlist.setLastPlayed(z34VarU.getLong(iE11));
                        playlist.setAllowedUsers(((si1) ml3Var.d).E(z34VarU.isNull(iE12) ? null : z34VarU.D(iE12)));
                        arrayList.add(playlist);
                        iE2 = iE2;
                        iE3 = iE3;
                        str = null;
                        iE = iE;
                        break;
                    }
                    return arrayList;
                } finally {
                    z34VarU.close();
                }
            case 1:
                ((z80) obj2).y(obj);
                return j15.a;
            case 2:
                tv3 tv3Var = (tv3) obj2;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (tv3Var.c) {
                    try {
                        s22 s22Var = tv3Var.d;
                        if (s22Var != null) {
                            nl4 nl4Var = tv3Var.u;
                            ov3 ov3Var = ov3.o;
                            nl4Var.getClass();
                            nl4Var.j(null, ov3Var);
                            s22Var.f(cancellationException);
                            tv3Var.r = null;
                            s22Var.M(new o(26, tv3Var, th));
                        } else {
                            tv3Var.e = cancellationException;
                            nl4 nl4Var2 = tv3Var.u;
                            ov3 ov3Var2 = ov3.n;
                            nl4Var2.getClass();
                            nl4Var2.j(null, ov3Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return j15.a;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                we1 we1Var = (we1) obj;
                we1Var.getClass();
                ((p24) obj2).g = we1Var;
                return j15.a;
            case 4:
                li0 li0Var = (li0) obj;
                li0Var.getClass();
                return ((s24) obj2).f(li0Var);
            case 5:
                x44 x44Var = ((w44) obj2).p;
                return Boolean.valueOf(x44Var != null ? x44Var.b(obj) : true);
            case 6:
                g74 g74Var = (g74) obj2;
                return new g83(g74Var.d(g74Var.k, ((g83) obj).a, g74Var.j));
            case 7:
                ((List) obj).add((Float) ((v82) obj2).invoke());
                return true;
            case 8:
                obj.getClass();
                return ((t5) obj2).invoke();
            case 9:
                we4 we4Var = (we4) obj2;
                b24 b24Var = (b24) obj;
                b24Var.c(we4Var.B);
                b24Var.e(we4Var.C);
                b24Var.b(we4Var.D);
                float f = we4Var.E;
                if (b24Var.t != f) {
                    b24Var.n |= 2048;
                    b24Var.t = f;
                }
                long j = we4Var.F;
                long j2 = b24Var.u;
                int i2 = tw4.b;
                if (j2 != j) {
                    b24Var.n |= 4096;
                    b24Var.u = j;
                }
                ac4 ac4Var = we4Var.G;
                if (!h12.c(b24Var.v, ac4Var)) {
                    b24Var.n |= 8192;
                    b24Var.v = ac4Var;
                }
                boolean z = we4Var.H;
                if (b24Var.w != z) {
                    b24Var.n |= 16384;
                    b24Var.w = z;
                }
                long j3 = we4Var.I;
                if (!x40.c(b24Var.r, j3)) {
                    b24Var.n |= 64;
                    b24Var.r = j3;
                }
                long j4 = we4Var.J;
                if (!x40.c(b24Var.s, j4)) {
                    b24Var.n |= 128;
                    b24Var.s = j4;
                }
                int i3 = we4Var.K;
                if (b24Var.B != i3) {
                    b24Var.n |= 524288;
                    b24Var.B = i3;
                }
                m62 m62Var = we4Var.L;
                if (!h12.c(b24Var.y, m62Var)) {
                    b24Var.n |= 1048576;
                    b24Var.y = m62Var;
                }
                return j15.a;
            case 10:
                jf4 jf4Var = (jf4) obj2;
                y94 y94Var = jf4Var.f;
                y94Var.getClass();
                if (!h12.c(jf4Var.f, y94Var)) {
                    oo3.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                x03 x03Var = jf4Var.e;
                Object obj4 = jf4Var.c;
                if (x03Var != null) {
                    if (obj4 != null) {
                        oo3.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    x03Var.a(obj);
                } else if (obj4 == null) {
                    jf4Var.c = obj;
                } else {
                    x03 x03Var2 = w54.a;
                    x03 x03Var3 = new x03();
                    x03Var3.a(obj4);
                    x03Var3.a(obj);
                    jf4Var.e = x03Var3;
                    jf4Var.c = null;
                }
                return j15.a;
            case 11:
                pp3 pp3Var = (pp3) obj2;
                synchronized (pp3Var.h) {
                    sh4 sh4Var = (sh4) pp3Var.j;
                    sh4Var.getClass();
                    Object obj5 = sh4Var.b;
                    obj5.getClass();
                    int i4 = sh4Var.d;
                    p03 p03Var = sh4Var.c;
                    if (p03Var == null) {
                        p03Var = new p03();
                        sh4Var.c = p03Var;
                        sh4Var.f.l(obj5, p03Var);
                    }
                    sh4Var.b(obj, i4, obj5, p03Var);
                }
                return j15.a;
            case 12:
                vd vdVar = (vd) obj;
                ((wf1) obj2).invoke(vdVar.e.getValue(), ((if1) p35.a.p).invoke(vdVar.f));
                return j15.a;
            default:
                ((lu2) obj2).k(obj);
                return j15.a;
        }
    }
}
