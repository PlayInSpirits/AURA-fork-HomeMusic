package androidx.fragment.app.strictmode;

import defpackage.kc1;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Violation extends RuntimeException {
    public final kc1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(kc1 kc1Var, String str) {
        super(str);
        kc1Var.getClass();
        this.n = kc1Var;
    }
}
