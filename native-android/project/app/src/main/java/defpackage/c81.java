package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface c81 extends wd {
    @Override // defpackage.wd
    default g45 a() {
        return new ss0(this);
    }

    float b(long r1, float r3, float r4, float r5);

    long c(float r1, float r2, float r3);

    default float d(float r7, float r8, float r9) {
        return b(c(r7, r8, r9), r7, r8, r9);
    }

    float e(long r1, float r3, float r4, float r5);
}
