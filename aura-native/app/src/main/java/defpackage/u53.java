package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u53 {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ v53 c;

    public u53(v53 v53Var, uj0 uj0Var, Executor executor) {
        this.c = v53Var;
        this.a = new WeakReference(uj0Var);
        this.b = executor;
    }
}
