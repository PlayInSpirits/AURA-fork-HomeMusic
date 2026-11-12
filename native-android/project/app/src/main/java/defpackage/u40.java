package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u40 extends t40 {
    public static void l0(List r2) {
        if (r2.size() <= 1) goto L6;
        Collections.sort(r2);
        return;
    }

    public static void m0(List r2, Comparator r3) {
        r2.getClass();
        r3.getClass();
        if (r2.size() <= 1) goto L6;
        Collections.sort(r2, r3);
        return;
    }
}
