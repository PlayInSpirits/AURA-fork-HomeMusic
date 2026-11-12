package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ar1 implements uw2 {
    public static final ab3 b = ab3.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");
    public final si1 a;

    public ar1(si1 si1Var) {
        this.a = si1Var;
    }

    @Override // defpackage.uw2
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return true;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        qi1 qi1Var = (qi1) obj;
        si1 si1Var = this.a;
        if (si1Var != null) {
            rw2 rw2Var = (rw2) si1Var.o;
            sw2 sw2VarA = sw2.a(qi1Var);
            Object objA = rw2Var.a(sw2VarA);
            ArrayDeque arrayDeque = sw2.b;
            synchronized (arrayDeque) {
                arrayDeque.offer(sw2VarA);
            }
            qi1 qi1Var2 = (qi1) objA;
            if (qi1Var2 == null) {
                rw2Var.d(sw2.a(qi1Var), qi1Var);
            } else {
                qi1Var = qi1Var2;
            }
        }
        return new tw2(qi1Var, new hr1(qi1Var, ((Integer) db3Var.c(b)).intValue()));
    }
}
