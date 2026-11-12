package defpackage;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class po4 implements x34 {
    public final we1 n;

    public po4(we1 we1Var) {
        we1Var.getClass();
        this.n = we1Var;
    }

    @Override // defpackage.x34
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zo4 U(String str) {
        str.getClass();
        we1 we1Var = this.n;
        we1Var.getClass();
        String string = qm4.K0(str).toString();
        if (string.length() >= 3) {
            String upperCase = string.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int iHashCode = upperCase.hashCode();
            if (iHashCode == 79487 ? upperCase.equals("PRA") : !(iHashCode == 81978 ? !upperCase.equals("SEL") : !(iHashCode == 85954 && upperCase.equals("WIT")))) {
                xo4 xo4Var = new xo4(we1Var, str);
                xo4Var.q = new int[0];
                xo4Var.r = new long[0];
                xo4Var.s = new double[0];
                xo4Var.t = new String[0];
                xo4Var.u = new byte[0][];
                return xo4Var;
            }
        }
        return new yo4(we1Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        this.n.close();
    }
}
