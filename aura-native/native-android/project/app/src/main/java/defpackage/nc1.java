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

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class nc1 extends l70 {
    public boolean J;
    public boolean K;
    public final d34 H = new d34(26, new mc1(this));
    public final ea2 I = new ea2(this, true);
    public boolean L = true;

    public nc1() {
        ((rm3) this.q.p).L("android:support:lifecycle", new f70(this, 1));
        final int i = 0;
        this.v.add(new xc0(this) { // from class: lc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i2 = i;
                nc1 nc1Var = this.b;
                switch (i2) {
                    case 0:
                        nc1Var.H.F();
                        break;
                    default:
                        nc1Var.H.F();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.x.add(new xc0(this) { // from class: lc1
            public final /* synthetic */ nc1 b;

            {
                this.b = this;
            }

            @Override // defpackage.xc0
            public final void accept(Object obj) {
                int i3 = i2;
                nc1 nc1Var = this.b;
                switch (i3) {
                    case 0:
                        nc1Var.H.F();
                        break;
                    default:
                        nc1Var.H.F();
                        break;
                }
            }
        });
        g(new g70(this, 1));
    }

    public static boolean l(ld1 ld1Var) {
        boolean zL = false;
        for (kc1 kc1Var : ld1Var.c.x()) {
            if (kc1Var != null) {
                mc1 mc1Var = kc1Var.G;
                if ((mc1Var == null ? null : mc1Var.E) != null) {
                    zL |= l(kc1Var.m());
                }
                le1 le1Var = kc1Var.d0;
                r92 r92Var = r92.q;
                r92 r92Var2 = r92.p;
                if (le1Var != null) {
                    le1Var.e();
                    if (le1Var.r.h.compareTo(r92Var) >= 0) {
                        kc1Var.d0.r.g(r92Var2);
                        zL = true;
                    }
                }
                if (kc1Var.c0.h.compareTo(r92Var) >= 0) {
                    kc1Var.c0.g(r92Var2);
                    zL = true;
                }
            }
        }
        return zL;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                    }
                    break;
            }
            return;
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.J);
        printWriter.print(" mResumed=");
        printWriter.print(this.K);
        printWriter.print(" mStopped=");
        printWriter.print(this.L);
        if (getApplication() != null) {
            new qr2(this, d()).g(str3, printWriter);
        }
        ((mc1) this.H.o).D.v(str, fileDescriptor, printWriter, strArr);
    }

    public final md1 k() {
        return ((mc1) this.H.o).D;
    }

    @Override // defpackage.l70, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.H.F();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.l70, defpackage.k70, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I.d(q92.ON_CREATE);
        md1 md1Var = ((mc1) this.H.o).D;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((mc1) this.H.o).D.f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() throws Exception {
        super.onDestroy();
        ((mc1) this.H.o).D.k();
        this.I.d(q92.ON_DESTROY);
    }

    @Override // defpackage.l70, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((mc1) this.H.o).D.i();
        }
        return false;
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
        md1 md1Var = ((mc1) this.H.o).D;
        md1Var.G = false;
        md1Var.H = false;
        md1Var.N.g = false;
        md1Var.t(7);
    }

    @Override // defpackage.l70, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.H.F();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        d34 d34Var = this.H;
        d34Var.F();
        super.onResume();
        this.K = true;
        ((mc1) d34Var.o).D.y(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        d34 d34Var = this.H;
        d34Var.F();
        mc1 mc1Var = (mc1) d34Var.o;
        super.onStart();
        this.L = false;
        if (!this.J) {
            this.J = true;
            md1 md1Var = mc1Var.D;
            md1Var.G = false;
            md1Var.H = false;
            md1Var.N.g = false;
            md1Var.t(4);
        }
        mc1Var.D.y(true);
        this.I.d(q92.ON_START);
        md1 md1Var2 = mc1Var.D;
        md1Var2.G = false;
        md1Var2.H = false;
        md1Var2.N.g = false;
        md1Var2.t(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.H.F();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.L = true;
        while (l(k())) {
        }
        md1 md1Var = ((mc1) this.H.o).D;
        md1Var.H = true;
        md1Var.N.g = true;
        md1Var.t(4);
        this.I.d(q92.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((mc1) this.H.o).D.f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }
}
