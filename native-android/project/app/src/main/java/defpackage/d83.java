package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class d83 {
    public final q12 a;
    public final int[] b;
    public final String[] c;
    public final Set d;

    public d83(q12 q12Var, int[] iArr, String[] strArr) {
        q12Var.getClass();
        iArr.getClass();
        strArr.getClass();
        this.a = q12Var;
        this.b = iArr;
        this.c = strArr;
        if (iArr.length == strArr.length) {
            this.d = !(strArr.length == 0) ? kb4.S(strArr[0]) : z01.n;
        } else {
            kf2.o("Check failed.");
            throw null;
        }
    }
}
