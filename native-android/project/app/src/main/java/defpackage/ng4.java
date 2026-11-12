package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ng4 implements pv2 {
    public final ArrayList a;

    public ng4(ArrayList r7) {
        this.a = r7;
        boolean r1 = false;
        if (r7.isEmpty() == true) goto L12;
        long r2 = ((mg4) r7.get(0)).b;
        int r6 = 1;
    L7:
        if (r6 >= r7.size()) goto L12;
        if (((mg4) r7.get(r6)).a < r2) goto L10;
        r2 = ((mg4) r7.get(r6)).b;
        r6 = r6 + 1;
        goto L7
    L10:
        r1 = true;
    L12:
        rr2.l(!r1);
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L7;
        return false;
    L7:
        if (ng4.class == r3.getClass()) goto L10;
        return false;
    L10:
        return this.a.equals(((ng4) r3).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
