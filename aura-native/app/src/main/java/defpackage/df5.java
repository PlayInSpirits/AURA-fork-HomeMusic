package defpackage;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class df5 extends LifecycleCallback implements DialogInterface.OnCancelListener {
    public volatile boolean o;
    public final AtomicReference p;
    public final zw2 q;
    public final ej1 r;
    public final qi s;
    public final ij1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df5(x92 x92Var, ij1 ij1Var) {
        super(x92Var);
        ej1 ej1Var = ej1.c;
        this.p = new AtomicReference(null);
        this.q = new zw2(Looper.getMainLooper(), 2);
        this.r = ej1Var;
        this.s = new qi(0);
        this.t = ij1Var;
        x92Var.g(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b(int i, int i2, Intent intent) {
        AtomicReference atomicReference = this.p;
        eg5 eg5Var = (eg5) atomicReference.get();
        ij1 ij1Var = this.t;
        if (i != 1) {
            if (i == 2) {
                int b = this.r.b(a(), fj1.a);
                if (b == 0) {
                    atomicReference.set(null);
                    zw2 zw2Var = ij1Var.A;
                    zw2Var.sendMessage(zw2Var.obtainMessage(3));
                    return;
                } else {
                    if (eg5Var == null) {
                        return;
                    }
                    if (eg5Var.b.o == 18 && b == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            atomicReference.set(null);
            zw2 zw2Var2 = ij1Var.A;
            zw2Var2.sendMessage(zw2Var2.obtainMessage(3));
            return;
        } else if (i2 == 0) {
            if (eg5Var != null) {
                ka0 ka0Var = new ka0(1, intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, eg5Var.b.toString());
                int i3 = eg5Var.a;
                atomicReference.set(null);
                ij1Var.g(ka0Var, i3);
                return;
            }
            return;
        }
        if (eg5Var != null) {
            ka0 ka0Var2 = eg5Var.b;
            int i4 = eg5Var.a;
            atomicReference.set(null);
            ij1Var.g(ka0Var2, i4);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c(Bundle bundle) {
        if (bundle != null) {
            this.p.set(bundle.getBoolean("resolving_error", false) ? new eg5(new ka0(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        if (this.s.isEmpty()) {
            return;
        }
        this.t.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(Bundle bundle) {
        eg5 eg5Var = (eg5) this.p.get();
        if (eg5Var == null) {
            return;
        }
        ka0 ka0Var = eg5Var.b;
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", eg5Var.a);
        bundle.putInt("failed_status", ka0Var.o);
        bundle.putParcelable("failed_resolution", ka0Var.p);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f() {
        this.o = true;
        if (this.s.isEmpty()) {
            return;
        }
        this.t.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void g() {
        this.o = false;
        ij1 ij1Var = this.t;
        ij1Var.getClass();
        synchronized (ij1.E) {
            try {
                if (ij1Var.x == this) {
                    ij1Var.x = null;
                    ij1Var.y.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        ka0 ka0Var = new ka0(13, null);
        AtomicReference atomicReference = this.p;
        eg5 eg5Var = (eg5) atomicReference.get();
        int i = eg5Var == null ? -1 : eg5Var.a;
        atomicReference.set(null);
        this.t.g(ka0Var, i);
    }
}
