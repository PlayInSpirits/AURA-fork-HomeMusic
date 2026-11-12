package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k11 {
    public final cf4 a;
    public final Executor b;

    public k11(cf4 cf4Var, Executor executor) {
        this.a = cf4Var;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof k11) && this.a == ((k11) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
