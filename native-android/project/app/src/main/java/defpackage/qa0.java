package defpackage;

import java.util.function.IntUnaryOperator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qa0 implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int r1) {
        if (r1 > 0) goto L4;
        return 0;
    L4:
        return r1 - 1;
    }
}
