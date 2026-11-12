package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a52 extends qe4 {
    /* JADX WARN: Code duplicated, block: B:17:0x0037  */
    @Override // defpackage.qe4
    public final pe4 i1() {
        int i;
        long jIntValue;
        v52 v52VarC = u52.c();
        boolean z = v52VarC.k;
        boolean z2 = v52VarC.b;
        List listL = u52.k() ? u52.l() : u01.n;
        List listO = (!listL.isEmpty() || v52VarC.p <= 0) ? listL : gb.O(u52.d());
        if (listO.isEmpty()) {
            i = -1;
        } else if (listL.isEmpty()) {
            i = 0;
        } else {
            i = v52VarC.o;
            j02 j02VarC = gb.C(listO);
            int i2 = j02VarC.o;
            if (j02VarC.isEmpty()) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: " + j02VarC + '.');
            }
            if (i < 0) {
                i = 0;
            } else if (i > i2) {
                i = i2;
            }
        }
        ArrayList arrayList = new ArrayList(r40.k0(listO, 10));
        Iterator it = listO.iterator();
        int i3 = 0;
        while (true) {
            if (!it.hasNext()) {
                int i4 = 2;
                xk0 xk0Var = new xk0(2);
                xk0Var.d(17, 18, 16, 22);
                if (z2) {
                    xk0Var.d(1, 15, 14, 24, 13);
                }
                if (z2 && !listL.isEmpty()) {
                    xk0Var.d(5, 10);
                    xk0Var.b(7);
                    if (v52VarC.v) {
                        xk0Var.d(8, 9);
                    }
                    if (v52VarC.w) {
                        xk0Var.b(6);
                    }
                }
                mi3 mi3Var = new mi3(xk0Var.f());
                oe4 oe4Var = new oe4();
                oe4Var.a = mi3Var;
                oe4Var.b(arrayList);
                oe4Var.B = i;
                oe4Var.b = z;
                oe4Var.c = 1;
                if (listO.isEmpty()) {
                    i4 = 1;
                } else if (z2) {
                    i4 = 3;
                }
                oe4Var.d = i4;
                oe4Var.e = (!z || v52VarC.j) ? 0 : 1;
                oe4Var.g = v52VarC.u;
                oe4Var.h = v52VarC.t;
                oe4Var.c(v52VarC.l);
                oe4Var.l = new qh3(v52VarC.y, v52VarC.z);
                cn cnVar = new cn(19, v52VarC);
                oe4Var.E = null;
                oe4Var.F = cnVar;
                return new pe4(oe4Var);
            }
            Object next = it.next();
            int i5 = i3 + 1;
            if (i3 < 0) {
                gb.c0();
                throw null;
            }
            Child child = (Child) next;
            Iterator it2 = it;
            if (i3 == i) {
                jIntValue = v52VarC.i;
            } else {
                Integer duration = child.getDuration();
                jIntValue = ((long) (duration != null ? duration.intValue() : 0)) * 1000;
            }
            ge4 ge4Var = new ge4(v52VarC.s + ":" + i3);
            um2 um2Var = new um2();
            vw1 vw1Var = yw1.o;
            gy3 gy3Var = gy3.r;
            List list = Collections.EMPTY_LIST;
            gy3 gy3Var2 = gy3.r;
            zm2 zm2Var = new zm2();
            cn2 cn2Var = cn2.d;
            String id = child.getId();
            id.getClass();
            ge4Var.c = new gn2(id, new wm2(um2Var), null, new an2(zm2Var), si0.E(child), cn2Var);
            ge4Var.j = jIntValue > 0;
            ge4Var.a(jIntValue > 0 ? jIntValue * 1000 : -9223372036854775807L);
            arrayList.add(new he4(ge4Var));
            i3 = i5;
            it = it2;
        }
    }

    @Override // defpackage.qe4
    public final ic2 r1(int i, int i2, long j) throws JSONException {
        switch (i2) {
            case 6:
            case 7:
                u52.a("previous", 0L);
                break;
            case 8:
            case 9:
                u52.a("next", 0L);
                break;
            default:
                if (i == u52.c().o) {
                    if (j == -9223372036854775807L) {
                        j = 0;
                    }
                    u52.a("seek", j);
                } else {
                    u52.q("select", i, i);
                }
                break;
        }
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 t1(boolean z) {
        u52.a(z ? "play" : "pause", 0L);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 u1(qh3 qh3Var) throws JSONException {
        u52.j(qh3Var.a, qh3Var.b);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 v1(int i) {
        u52.a("repeat", i);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 w1(boolean z) {
        u52.a("shuffle", z ? 1L : 0L);
        return mw1.o;
    }

    @Override // defpackage.qe4
    public final ic2 x1(float f) {
        u52.a("volume", (long) (f * 100.0f));
        return mw1.o;
    }
}
