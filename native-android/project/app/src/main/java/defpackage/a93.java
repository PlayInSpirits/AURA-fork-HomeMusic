package defpackage;

import android.window.OnBackInvokedDispatcher;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class a93 {
    public final Runnable a;
    public final rp4 b = new rp4(new wc(16, this));

    public a93(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(ba2 ba2Var, v83 v83Var) {
        ba2Var.getClass();
        v83Var.getClass();
        final ea2 ea2VarH = ba2Var.h();
        if (ea2VarH.h == r92.n) {
            return;
        }
        u83 u83Var = new u83(v83Var, new w83(ba2Var, v83Var));
        v83Var.a.add(u83Var);
        u83Var.b(false);
        bq4 bq4Var = b().c;
        bq4Var.getClass();
        if (((LinkedHashSet) bq4Var.p).add(u83Var)) {
            w33 w33Var = (w33) bq4Var.o;
            w33Var.getClass();
            if (u83Var.c != null) {
                nz2.k(u83Var, "' is already registered with a dispatcher", "Handler '");
                return;
            } else {
                w33Var.e.addFirst(u83Var);
                u83Var.c = bq4Var;
                w33Var.b();
            }
        }
        final tl0 tl0Var = new tl0(u83Var, this, ea2VarH);
        ea2VarH.a(tl0Var);
        v83Var.c.add(new AutoCloseable() { // from class: x83
            @Override // java.lang.AutoCloseable
            public final void close() {
                ea2VarH.f(tl0Var);
            }
        });
    }

    public final y83 b() {
        return (y83) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.f(new s83(onBackInvokedDispatcher, 0), 1);
        b().c.f(new s83(onBackInvokedDispatcher, 1000000), 0);
    }
}
