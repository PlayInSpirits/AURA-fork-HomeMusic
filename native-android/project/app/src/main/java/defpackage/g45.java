package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface g45 {
    boolean a();

    ce d(long r1, ce r3, ce r4, ce r5);

    ce k(long r1, ce r3, ce r4, ce r5);

    default ce l(ce r7, ce r8, ce r9) {
        return d(m(r7, r8, r9), r7, r8, r9);
    }

    long m(ce r1, ce r2, ce r3);
}
