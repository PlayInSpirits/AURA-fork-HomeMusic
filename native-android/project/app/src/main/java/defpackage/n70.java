package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import app.homemusic.R;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class n70 extends Dialog implements ba2, j54 {
    public ea2 n;
    public final gp3 o;
    public final rp4 p;
    public final rp4 q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n70(Context context, int i) {
        super(context, i);
        context.getClass();
        this.o = new gp3(new xm2(this, new wc(22, this)));
        final int i2 = 0;
        this.p = new rp4(new gf1(this) { // from class: m70
            public final /* synthetic */ n70 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                int i3 = i2;
                n70 n70Var = this.o;
                switch (i3) {
                    case 0:
                        iq0 iq0Var = new iq0();
                        n70Var.c().b().c.e(iq0Var);
                        return iq0Var;
                    default:
                        return new a93(new a0(14, n70Var));
                }
            }
        });
        final int i3 = 1;
        this.q = new rp4(new gf1(this) { // from class: m70
            public final /* synthetic */ n70 o;

            {
                this.o = this;
            }

            @Override // defpackage.gf1
            public final Object invoke() {
                int i4 = i3;
                n70 n70Var = this.o;
                switch (i4) {
                    case 0:
                        iq0 iq0Var = new iq0();
                        n70Var.c().b().c.e(iq0Var);
                        return iq0Var;
                    default:
                        return new a93(new a0(14, n70Var));
                }
            }
        });
    }

    public static void a(n70 n70Var) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.addContentView(view, layoutParams);
    }

    public final ea2 b() {
        ea2 ea2Var = this.n;
        if (ea2Var != null) {
            return ea2Var;
        }
        ea2 ea2Var2 = new ea2(this, true);
        this.n = ea2Var2;
        return ea2Var2;
    }

    public final a93 c() {
        return (a93) this.q.getValue();
    }

    public final void d() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // defpackage.j54
    public final rm3 f() {
        return (rm3) this.o.p;
    }

    @Override // defpackage.ba2
    public final ea2 h() {
        return b();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((iq0) this.p.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            a93 a93VarC = c();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            a93VarC.c(onBackInvokedDispatcher);
        }
        this.o.s(bundle);
        b().d(q92.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.o.t(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().d(q92.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().d(q92.ON_DESTROY);
        this.n = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        d();
        super.setContentView(view, layoutParams);
    }
}
