package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class zq3 implements du0 {
    public final Executor a;
    public final ii0 b;
    public final lx c;
    public final ux d;
    public kt0 e;
    public volatile yq3 f;
    public volatile boolean g;

    public zq3(gn2 gn2Var, kx kxVar, Executor executor, long j, long j2) {
        executor.getClass();
        this.a = executor;
        bn2 bn2Var = gn2Var.b;
        bn2Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = bn2Var.a;
        String str = bn2Var.f;
        rr2.s(uri, "The uri must be set.");
        ii0 ii0Var = new ii0(uri, 0L, 1, null, map, j, j2, str, 4);
        this.b = ii0Var;
        lx lxVarB = kxVar.b();
        this.c = lxVarB;
        this.d = new ux(lxVarB, ii0Var, null, new ss2(9, this));
    }

    @Override // defpackage.du0
    public final void a(kt0 kt0Var) {
        this.e = kt0Var;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new yq3(this);
                this.a.execute(this.f);
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = f35.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                yq3 yq3Var = this.f;
                yq3Var.getClass();
                yq3Var.a();
                throw th;
            }
        }
        yq3 yq3Var2 = this.f;
        yq3Var2.getClass();
        yq3Var2.a();
    }

    @Override // defpackage.du0
    public final void cancel() {
        this.g = true;
        yq3 yq3Var = this.f;
        if (yq3Var != null) {
            yq3Var.cancel(true);
        }
    }

    @Override // defpackage.du0
    public final void remove() {
        lx lxVar = this.c;
        lxVar.n.m(lxVar.r.d(this.b));
    }
}
