package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ir2 {
    public boolean a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;

    public ir2() {
        this.b = new Object();
        this.c = new y52(1, this);
        this.d = new WeakReference(null);
    }

    public static void a(kn3 kn3Var) {
        List list = kn3Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((on3) list.get(i)).a();
        }
    }

    public void A() {
    }

    public void B(long j) {
    }

    public void C() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object D(wf1 wf1Var, wd0 wd0Var) throws Throwable {
        m63 m63Var;
        if (wd0Var instanceof m63) {
            m63Var = (m63) wd0Var;
            int i = m63Var.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                m63Var.p = i - Integer.MIN_VALUE;
            } else {
                m63Var = new m63(this, wd0Var);
            }
        } else {
            m63Var = new m63(this, wd0Var);
        }
        Object obj = m63Var.n;
        int i2 = m63Var.p;
        vd0 vd0Var = null;
        if (i2 == 0) {
            kb4.X(obj);
            this.a = true;
            p pVar = new p(this, wf1Var, vd0Var, 14);
            m63Var.p = 1;
            eo4 eo4Var = new eo4(m63Var, m63Var.getContext());
            Object objO = h12.O(eo4Var, eo4Var, pVar);
            xe0 xe0Var = xe0.n;
            if (objO == xe0Var) {
                return xe0Var;
            }
        } else {
            if (i2 != 1) {
                kf2.o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kb4.X(obj);
        }
        this.a = false;
        return j15.a;
    }

    public void b(kr2 kr2Var, Handler handler) {
        if (this.a) {
            this.a = false;
            handler.removeMessages(1);
            ei3 ei3Var = kr2Var.g;
            long j = ei3Var == null ? 0L : ei3Var.r;
            boolean z = ei3Var != null && ei3Var.n == 3;
            boolean z2 = (516 & j) != 0;
            boolean z3 = (j & 514) != 0;
            if (z && z3) {
                i();
            } else {
                if (z || !z2) {
                    return;
                }
                j();
            }
        }
    }

    public void c(pm2 pm2Var) {
    }

    public void d(pm2 pm2Var, int i) {
    }

    public void e(String str, Bundle bundle, ResultReceiver resultReceiver) {
    }

    public void f(String str, Bundle bundle) {
    }

    public void g() {
    }

    public boolean h(Intent intent) {
        kr2 kr2Var;
        zk zkVar;
        KeyEvent keyEvent;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.b) {
                kr2Var = (kr2) ((WeakReference) this.d).get();
                zkVar = (zk) this.e;
            }
            if (kr2Var != null && zkVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                ms2 ms2VarB = kr2Var.b();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    b(kr2Var, zkVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    b(kr2Var, zkVar);
                    return true;
                }
                if (!this.a) {
                    this.a = true;
                    zkVar.sendMessageDelayed(zkVar.obtainMessage(1, ms2VarB), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                zkVar.removeMessages(1);
                this.a = false;
                ei3 ei3Var = kr2Var.g;
                if (((ei3Var == null ? 0L : ei3Var.r) & 32) != 0) {
                    z();
                }
                return true;
            }
        }
        return false;
    }

    public void i() {
    }

    public void j() {
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(String str, Bundle bundle) {
    }

    public void m(Uri uri, Bundle bundle) {
    }

    public void n() {
    }

    public void o(String str, Bundle bundle) {
    }

    public void p(String str, Bundle bundle) {
    }

    public void q(Uri uri, Bundle bundle) {
    }

    public void r(pm2 pm2Var) {
    }

    public void s() {
    }

    public void t(long j) {
    }

    public void u(float f) {
    }

    public void v(mu3 mu3Var) {
    }

    public void w(mu3 mu3Var) {
    }

    public void x(int i) {
    }

    public void y(int i) {
    }

    public void z() {
    }

    public ir2(g74 g74Var, wf1 wf1Var, oo0 oo0Var) {
        this.b = g74Var;
        this.c = wf1Var;
        this.d = oo0Var;
        this.e = new rf2(7);
    }
}
