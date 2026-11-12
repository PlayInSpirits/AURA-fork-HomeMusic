package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class fz3 implements Comparable {
    public final ArrayList n;
    public long o;

    public fz3() {
        this.o = -9223372036854775807L;
        this.n = new ArrayList();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object r3) {
        return Long.compare(this.o, ((fz3) r3).o);
    }
}
