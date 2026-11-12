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

    public static void a(kn3 r3) {
        List r4 = r3.a;
        int r0 = r4.size();
        int r1 = 0;
    L3:
        if (r1 >= r0) goto L5;
        ((on3) r4.get(r1)).a();
        r1 = r1 + 1;
        goto L3
    }

    public void A() {
    }

    public void B(long r1) {
    }

    public void C() {
    }

    public Object D(wf1 r5, wd0 r6) {
        if ((r6 instanceof m63) == false) goto L7;
        m63 r0 = (m63) r6;
        int r1 = r0.p;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.p = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.n;
        int r2 = r0.p;
        vd0 r3 = null;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        kb4.X(r7);
    L17:
        this.a = false;
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r7);
        this.a = true;
        p r8 = new p(this, r5, r3, 14);
        r0.p = 1;
        eo4 r9 = new eo4(r0, r0.getContext());
        Object r10 = h12.O(r9, r9, r8);
        xe0 r11 = xe0.n;
        if (r10 != r11) goto L17;
        return r11;
    L7:
        r0 = new m63(this, r6);
        goto L8
    }

    public void b(kr2 r9, Handler r10) {
        if (this.a == false) goto L31;
        boolean r0 = false;
        this.a = false;
        r10.removeMessages(1);
        ei3 r11 = r9.g;
        if (r11 != null) goto L8;
        long r4 = 0;
    L9:
        if (r11 != null) goto L11;
    L13:
        boolean r12 = false;
    L15:
        if ((516 & r4) == 0) goto L17;
        boolean r13 = true;
    L19:
        if ((r4 & 514) == 0) goto L21;
        r0 = true;
    L21:
        if (r12 == false) goto L25;
        if (r0 == false) goto L25;
        i();
        return;
    L25:
        if (r12 == true) goto L29;
        if (r13 == false) goto L30;
        j();
        return;
    L30:
        return;
    L29:
        return;
    L17:
        r13 = false;
        goto L19
    L11:
        if (r11.n != 3) goto L13;
        r12 = true;
        goto L15
    L8:
        r4 = r11.r;
        goto L9
    }

    public void c(pm2 r1) {
    }

    public void d(pm2 r1, int r2) {
    }

    public void e(String r1, Bundle r2, ResultReceiver r3) {
    }

    public void f(String r1, Bundle r2) {
    }

    public void g() {
    }

    public boolean h(Intent r8) {
        if (Build.VERSION.SDK_INT >= 27) goto L39;
        Object r0 = this.b;
        monitor-enter(r0);
        kr2 r1 = (kr2) ((WeakReference) this.d).get();     // Catch: Throwable -> L40
        zk r3 = (zk) this.e;     // Catch: Throwable -> L40
        monitor-exit(r0);     // Catch: Throwable -> L40
        if (r1 == null) goto L39;
        if (r3 == null) goto L39;
        KeyEvent r9 = (KeyEvent) r8.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (r9 == null) goto L39;
        if (r9.getAction() != 0) goto L39;
        ms2 r2 = r1.b();
        int r4 = r9.getKeyCode();
        if (r4 == 79) goto L24;
        if (r4 == 85) goto L24;
        b(r1, r3);
        return false;
    L24:
        if (r9.getRepeatCount() == 0) goto L26;
        b(r1, r3);
        return true;
    L26:
        if (this.a == false) goto L35;
        r3.removeMessages(1);
        this.a = false;
        ei3 r10 = r1.g;
        if (r10 != null) goto L30;
        long r5 = 0;
    L32:
        if ((r5 & 32) == 0) goto L34;
        z();
    L34:
        return true;
    L30:
        r5 = r10.r;
        goto L32
    L35:
        this.a = true;
        r3.sendMessageDelayed(r3.obtainMessage(1, r2), ViewConfiguration.getDoubleTapTimeout());
        return true;
    L40:
        th = move-exception;
        throw th;
    L39:
        return false;
    }

    public void i() {
    }

    public void j() {
    }

    public void k(String r1, Bundle r2) {
    }

    public void l(String r1, Bundle r2) {
    }

    public void m(Uri r1, Bundle r2) {
    }

    public void n() {
    }

    public void o(String r1, Bundle r2) {
    }

    public void p(String r1, Bundle r2) {
    }

    public void q(Uri r1, Bundle r2) {
    }

    public void r(pm2 r1) {
    }

    public void s() {
    }

    public void t(long r1) {
    }

    public void u(float r1) {
    }

    public void v(mu3 r1) {
    }

    public void w(mu3 r1) {
    }

    public void x(int r1) {
    }

    public void y(int r1) {
    }

    public void z() {
    }

    public ir2(g74 r1, wf1 r2, oo0 r3) {
        this.b = r1;
        this.c = r2;
        this.d = r3;
        this.e = new rf2(7);
    }
}
