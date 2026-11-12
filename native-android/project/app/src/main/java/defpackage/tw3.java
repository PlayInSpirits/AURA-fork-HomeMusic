package defpackage;

import android.util.SparseArray;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tw3 {
    public SparseArray a;
    public int b;
    public Set c;

    public final sw3 a(int r2) {
        SparseArray r1 = this.a;
        sw3 r0 = (sw3) r1.get(r2);
        if (r0 != null) goto L6;
        sw3 r3 = new sw3();
        r1.put(r2, r3);
        return r3;
    L6:
        return r0;
    }
}
