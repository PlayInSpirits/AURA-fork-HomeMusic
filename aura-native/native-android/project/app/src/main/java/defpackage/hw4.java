package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hw4 extends ir2 {
    public final aw f;
    public sk4 g;

    public hw4(g74 g74Var, q70 q70Var, oo0 oo0Var) {
        super(g74Var, q70Var, oo0Var);
        this.f = su3.a(Integer.MAX_VALUE, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e2, code lost:
    
        if (r0.invoke(r3, r7) == r10) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(hw4 hw4Var, g74 g74Var, fw4 fw4Var, wd0 wd0Var) {
        gw4 gw4Var;
        hw4Var.getClass();
        rf2 rf2Var = (rf2) hw4Var.e;
        if (wd0Var instanceof gw4) {
            gw4Var = (gw4) wd0Var;
            int i = gw4Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gw4Var.p = i - Integer.MIN_VALUE;
            } else {
                gw4Var = new gw4(hw4Var, wd0Var);
            }
        } else {
            gw4Var = new gw4(hw4Var, wd0Var);
        }
        gw4 gw4Var2 = gw4Var;
        Object obj = gw4Var2.n;
        int i2 = gw4Var2.p;
        Object obj2 = xe0.n;
        if (i2 != 0) {
            if (i2 == 1) {
                kb4.X(obj);
            } else {
                if (i2 != 2) {
                    kf2.o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kb4.X(obj);
            }
            return j15.a;
        }
        kb4.X(obj);
        jx3 jx3Var = new jx3();
        jx3Var.n = fw4Var;
        long j = fw4Var.b;
        long j2 = fw4Var.a;
        ((m45) rf2Var.n).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
        ((m45) rf2Var.o).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
        fw4 fw4VarG = G(hw4Var.f);
        if (fw4VarG != null) {
            long j3 = fw4VarG.b;
            long j4 = fw4VarG.a;
            ((m45) rf2Var.n).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((m45) rf2Var.o).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            jx3Var.n = ((fw4) jx3Var.n).a(fw4VarG);
        }
        wf1 qv3Var = new qv3(hw4Var, g74Var, jx3Var, null, 2);
        gw4Var2.p = 1;
        if (hw4Var.D(qv3Var, gw4Var2) != obj2) {
        }
        return obj2;
        wf1 wf1Var = (wf1) hw4Var.c;
        k45 k45Var = new k45(e35.h(((m45) rf2Var.n).b(Float.MAX_VALUE), ((m45) rf2Var.o).b(Float.MAX_VALUE)));
        gw4Var2.p = 2;
    }

    public static fw4 G(aw awVar) {
        fw4 fw4Var = null;
        ba4 ba4VarC = si0.C(new kb1(new by2(awVar, 1), null));
        while (ba4VarC.hasNext()) {
            fw4 fw4VarA = (fw4) ba4VarC.next();
            if (fw4Var != null) {
                fw4VarA = fw4Var.a(fw4VarA);
            }
            fw4Var = fw4VarA;
        }
        return fw4Var;
    }

    public final boolean F(kn3 kn3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        aw awVar;
        g74 g74Var = (g74) this.b;
        on3 on3Var = (on3) q40.x0(kn3Var.a);
        if (on3Var != null) {
            List listB = on3Var.b();
            int size = listB.size();
            int i = 0;
            z3 = false;
            while (true) {
                awVar = this.f;
                if (i >= size) {
                    break;
                }
                bm1 bm1Var = (bm1) listB.get(i);
                long j = bm1Var.d ^ (-9223372034707292160L);
                if (!(g74Var.j(g74Var.f(j)) == 0.0f)) {
                    z3 = !(awVar.d(new fw4(j, bm1Var.a, false)) instanceof i10) || z3;
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = on3Var.l ^ (-9223372034707292160L);
            boolean z4 = kn3Var.c == 12;
            if (!(g74Var.j(g74Var.f(j2)) == 0.0f) || z4) {
                if (!(awVar.d(new fw4(j2, on3Var.b, z4)) instanceof i10) || z3) {
                    z3 = true;
                }
            }
            return (!z3 || this.a) ? z : z2;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
    }
}
