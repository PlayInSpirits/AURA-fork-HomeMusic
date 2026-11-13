package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class jd1 implements id1 {
    public final String a;
    public final int b;
    public final /* synthetic */ ld1 c;

    public jd1(ld1 ld1Var, String str, int i) {
        this.c = ld1Var;
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.id1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        kc1 kc1Var = this.c.y;
        if (kc1Var != null && this.b < 0 && this.a == null && kc1Var.m().R(-1, 0)) {
            return false;
        }
        return this.c.S(arrayList, arrayList2, this.a, this.b, 1);
    }
}
