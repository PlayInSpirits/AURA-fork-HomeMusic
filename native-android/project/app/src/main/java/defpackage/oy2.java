package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class oy2 extends uv {
    public final long p;
    public final ArrayList q;
    public final ArrayList r;

    public oy2(int i, long j) {
        super(i, 2);
        this.p = j;
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public final oy2 r(int i) {
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            oy2 oy2Var = (oy2) arrayList.get(i2);
            if (oy2Var.o == i) {
                return oy2Var;
            }
        }
        return null;
    }

    public final py2 s(int i) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            py2 py2Var = (py2) arrayList.get(i2);
            if (py2Var.o == i) {
                return py2Var;
            }
        }
        return null;
    }

    @Override // defpackage.uv
    public final String toString() {
        return uv.c(this.o) + " leaves: " + Arrays.toString(this.q.toArray()) + " containers: " + Arrays.toString(this.r.toArray());
    }
}
