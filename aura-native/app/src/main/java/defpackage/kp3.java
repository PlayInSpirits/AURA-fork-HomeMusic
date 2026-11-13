package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.homemusic.R;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class kp3 extends kc1 {
    public pp3 m0;
    public RecyclerView n0;
    public boolean o0;
    public boolean p0;
    public final jp3 l0 = new jp3(this);
    public int q0 = app.homemusic.R.layout.preference_list_fragment;
    public final zk r0 = new zk(this, Looper.getMainLooper(), 11);
    public final g5 s0 = new g5(23, this);

    @Override // defpackage.kc1
    public void F(Bundle bundle) {
        super.F(bundle);
        TypedValue typedValue = new TypedValue();
        Z().getTheme().resolveAttribute(app.homemusic.R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = app.homemusic.R.style.PreferenceThemeOverlay;
        }
        Z().getTheme().applyStyle(i, false);
        pp3 pp3Var = new pp3(Z());
        this.m0 = pp3Var;
        pp3Var.j = this;
        Bundle bundle2 = this.s;
        i0(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // defpackage.kc1
    public View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray obtainStyledAttributes = Z().obtainStyledAttributes(null, bt3.h, app.homemusic.R.attr.preferenceFragmentCompatStyle, 0);
        this.q0 = obtainStyledAttributes.getResourceId(0, this.q0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(Z());
        View inflate = cloneInContext.inflate(this.q0, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            kf2.o("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!Z().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(app.homemusic.R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(app.homemusic.R.layout.preference_recyclerview, viewGroup2, false);
            Z();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new qp3(recyclerView));
        }
        this.n0 = recyclerView;
        jp3 jp3Var = this.l0;
        recyclerView.i(jp3Var);
        if (drawable != null) {
            jp3Var.getClass();
            jp3Var.b = drawable.getIntrinsicHeight();
        } else {
            jp3Var.b = 0;
        }
        jp3Var.a = drawable;
        kp3 kp3Var = jp3Var.d;
        RecyclerView recyclerView2 = kp3Var.n0;
        if (recyclerView2.C.size() != 0) {
            mw3 mw3Var = recyclerView2.A;
            if (mw3Var != null) {
                mw3Var.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView2.T();
            recyclerView2.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            jp3Var.b = dimensionPixelSize;
            RecyclerView recyclerView3 = kp3Var.n0;
            if (recyclerView3.C.size() != 0) {
                mw3 mw3Var2 = recyclerView3.A;
                if (mw3Var2 != null) {
                    mw3Var2.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView3.T();
                recyclerView3.requestLayout();
            }
        }
        jp3Var.c = z;
        if (this.n0.getParent() == null) {
            viewGroup2.addView(this.n0);
        }
        this.r0.post(this.s0);
        return inflate;
    }

    @Override // defpackage.kc1
    public void J() {
        g5 g5Var = this.s0;
        zk zkVar = this.r0;
        zkVar.removeCallbacks(g5Var);
        zkVar.removeMessages(1);
        if (this.o0) {
            this.n0.setAdapter(null);
            PreferenceScreen preferenceScreen = (PreferenceScreen) this.m0.g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.n0 = null;
        this.R = true;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        PreferenceScreen preferenceScreen = (PreferenceScreen) this.m0.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.kc1
    public void R() {
        this.R = true;
        pp3 pp3Var = this.m0;
        pp3Var.h = this;
        pp3Var.i = this;
    }

    @Override // defpackage.kc1
    public void S() {
        this.R = true;
        pp3 pp3Var = this.m0;
        pp3Var.h = null;
        pp3Var.i = null;
    }

    @Override // defpackage.kc1
    public void T(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = (PreferenceScreen) this.m0.g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.o0 && (preferenceScreen = (PreferenceScreen) this.m0.g) != null) {
            this.n0.setAdapter(new np3(preferenceScreen));
            preferenceScreen.j();
        }
        this.p0 = true;
    }

    public final Preference h0(String str) {
        PreferenceScreen preferenceScreen;
        pp3 pp3Var = this.m0;
        if (pp3Var == null || (preferenceScreen = (PreferenceScreen) pp3Var.g) == null) {
            return null;
        }
        return preferenceScreen.F(str);
    }

    public abstract void i0(String str);

    public final void j0(int i, String str) {
        pp3 pp3Var = this.m0;
        if (pp3Var == null) {
            tb4.e("This should be called after super.onCreate.");
            return;
        }
        Context Z = Z();
        pp3Var.a = true;
        op3 op3Var = new op3(Z, pp3Var);
        XmlResourceParser xml = Z.getResources().getXml(i);
        try {
            PreferenceGroup c = op3Var.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) c;
            preferenceScreen.k(pp3Var);
            SharedPreferences.Editor editor = (SharedPreferences.Editor) pp3Var.e;
            if (editor != null) {
                editor.apply();
            }
            pp3Var.a = false;
            Preference preference = preferenceScreen;
            if (str != null) {
                Preference F = preferenceScreen.F(str);
                boolean z = F instanceof PreferenceScreen;
                preference = F;
                if (!z) {
                    kf2.n(xa3.h("Preference object with key ", str, " is not a PreferenceScreen"));
                    return;
                }
            }
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preference;
            pp3 pp3Var2 = this.m0;
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) pp3Var2.g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.n();
                }
                pp3Var2.g = preferenceScreen2;
                this.o0 = true;
                if (this.p0) {
                    zk zkVar = this.r0;
                    if (zkVar.hasMessages(1)) {
                        return;
                    }
                    zkVar.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
