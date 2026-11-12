package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface wi2 extends oo0 {
    boolean K();

    vi2 T(int r1, int r2, Map r3, if1 r4, if1 r5);

    r62 getLayoutDirection();

    default vi2 v(int r7, int r8, Map r9, if1 r10) {
        return T(r7, r8, r9, null, r10);
    }
}
