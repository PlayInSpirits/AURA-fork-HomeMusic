package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class eq0 extends yo0 {
    public int m;

    public eq0(ba5 ba5Var) {
        super(ba5Var);
        if (ba5Var instanceof up1) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.yo0
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            uo0 uo0Var = (uo0) obj;
            uo0Var.a(uo0Var);
        }
    }
}
