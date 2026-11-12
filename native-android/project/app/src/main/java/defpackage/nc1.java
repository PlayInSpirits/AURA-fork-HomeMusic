package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc1 extends l70 {
    public final d34 H;
    public final ea2 I;
    public boolean J;
    public boolean K;
    public boolean L;

    public nc1() {
        int r2 = 26;
        this.H = new d34(r2, new mc1(this));
        this.I = new ea2(this, true);
        this.L = true;
        ((rm3) this.q.p).L("android:support:lifecycle", new f70(this, 1));
        final int r1 = 0;
        xc0 r0 = new lc1(this, r1);
        this.v.add(r0);
        final int r3 = 1;
        xc0 r4 = new lc1(this, r3);
        this.x.add(r4);
        g(new g70(this, 1));
    }

    public static boolean l(ld1 r6) {
        Iterator r7 = r6.c.x().iterator();
        boolean r0 = false;
    L4:
        if (r7.hasNext() == false) goto L22;
        kc1 r1 = (kc1) r7.next();
        if (r1 == null) goto L4;
        mc1 r2 = r1.G;
        if (r2 != null) goto L11;
        nc1 r3 = null;
    L12:
        if (r3 == null) goto L14;
        r0 = r0 | l(r1.m());
    L14:
        le1 r4 = r1.d0;
        r92 r5 = r92.q;
        r92 r8 = r92.p;
        if (r4 == null) goto L20;
        r4.e();
        if (r4.r.h.compareTo(r5) < 0) goto L20;
        r1.d0.r.g(r8);
        r0 = true;
    L20:
        if (r1.c0.h.compareTo(r5) < 0) goto L4;
        r1.c0.g(r8);
        r0 = true;
        goto L4
    L11:
        r3 = r2.E;
        goto L12
    L22:
        return r0;
    }

    @Override // android.app.Activity
    public final void dump(String r4, FileDescriptor r5, PrintWriter r6, String[] r7) {
        super.dump(r4, r5, r6, r7);
        if (r7 != null) goto L5;
    L37:
        r6.print(r4);
        r6.print("Local FragmentActivity ");
        r6.print(Integer.toHexString(System.identityHashCode(this)));
        r6.println(" State:");
        String r0 = r4 + "  ";
        r6.print(r0);
        r6.print("mCreated=");
        r6.print(this.J);
        r6.print(" mResumed=");
        r6.print(this.K);
        r6.print(" mStopped=");
        r6.print(this.L);
        if (getApplication() == null) goto L40;
        new qr2(this, d()).g(r0, r6);
    L40:
        ((mc1) this.H.o).D.v(r4, r5, r6, r7);
        return;
    L5:
        if (r7.length == 0) goto L37;
        String r1 = r7[0];
        switch(r1.hashCode()) {
            case -645125871: goto L32;
            case 100470631: goto L26;
            case 472614934: goto L23;
            case 1159329357: goto L17;
            case 1455016274: goto L11;
            default: goto L37;
        };
    L11:
        if (r1.equals("--autofill") == false) goto L37;
        if (Build.VERSION.SDK_INT < 26) goto L37;
        return;
    L17:
        if (r1.equals("--contentcapture") == false) goto L37;
        if (Build.VERSION.SDK_INT < 29) goto L37;
        return;
    L23:
        if (r1.equals("--list-dumpables") == false) goto L37;
    L29:
        if (Build.VERSION.SDK_INT < 33) goto L37;
        return;
    L26:
        if (r1.equals("--dump-dumpable") == true) goto L29;
    L32:
        if (r1.equals("--translation") == false) goto L37;
        if (Build.VERSION.SDK_INT < 31) goto L37;
    }

    public final md1 k() {
        return ((mc1) this.H.o).D;
    }

    @Override // defpackage.l70, android.app.Activity
    public void onActivityResult(int r2, int r3, Intent r4) {
        this.H.F();
        super.onActivityResult(r2, r3, r4);
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public void onCreate(Bundle r2) {
        super.onCreate(r2);
        this.I.d(q92.ON_CREATE);
        md1 r1 = ((mc1) this.H.o).D;
        r1.G = false;
        r1.H = false;
        r1.N.g = false;
        r1.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String r3, Context r4, AttributeSet r5) {
        View r0 = ((mc1) this.H.o).D.f.onCreateView(null, r3, r4, r5);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r3, r4, r5);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((mc1) this.H.o).D.k();
        this.I.d(q92.ON_DESTROY);
    }

    @Override // defpackage.l70, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int r1, MenuItem r2) {
        if (super.onMenuItemSelected(r1, r2) == false) goto L7;
        return true;
    L7:
        if (r1 == 6) goto L9;
        return false;
    L9:
        return ((mc1) this.H.o).D.i();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.K = false;
        ((mc1) this.H.o).D.t(5);
        this.I.d(q92.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.I.d(q92.ON_RESUME);
        md1 r2 = ((mc1) this.H.o).D;
        r2.G = false;
        r2.H = false;
        r2.N.g = false;
        r2.t(7);
    }

    @Override // defpackage.l70, android.app.Activity
    public void onRequestPermissionsResult(int r2, String[] r3, int[] r4) {
        this.H.F();
        super.onRequestPermissionsResult(r2, r3, r4);
    }

    @Override // android.app.Activity
    public void onResume() {
        d34 r0 = this.H;
        r0.F();
        super.onResume();
        this.K = true;
        ((mc1) r0.o).D.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        d34 r0 = this.H;
        r0.F();
        mc1 r1 = (mc1) r0.o;
        super.onStart();
        this.L = false;
        if (this.J == true) goto L5;
        this.J = true;
        md1 r2 = r1.D;
        r2.G = false;
        r2.H = false;
        r2.N.g = false;
        r2.t(4);
    L5:
        r1.D.y(true);
        this.I.d(q92.ON_START);
        md1 r5 = r1.D;
        r5.G = false;
        r5.H = false;
        r5.N.g = false;
        r5.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.H.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.L = true;
    L4:
        if (l(k()) == true) goto L4;
        md1 r1 = ((mc1) this.H.o).D;
        r1.H = true;
        r1.N.g = true;
        r1.t(4);
        this.I.d(q92.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View r2, String r3, Context r4, AttributeSet r5) {
        View r0 = ((mc1) this.H.o).D.f.onCreateView(r2, r3, r4, r5);
        if (r0 == null) goto L5;
        return r0;
    L5:
        return super.onCreateView(r2, r3, r4, r5);
    }
}
