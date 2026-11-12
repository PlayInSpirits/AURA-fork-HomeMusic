package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e5 {
    public final Context a;
    public om1 b;

    public e5(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(tu2 tu2Var) {
        return c();
    }

    public abstract boolean e();

    public void f(en4 en4Var) {
    }

    public boolean g() {
        return false;
    }

    public void h(om1 om1Var) {
        if (this.b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.b = om1Var;
    }
}
