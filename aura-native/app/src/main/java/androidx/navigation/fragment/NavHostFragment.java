package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import app.homemusic.R;
import defpackage.at3;
import defpackage.gb;
import defpackage.kc1;
import defpackage.nz2;
import defpackage.po;
import defpackage.rp4;
import defpackage.rt3;
import defpackage.v23;
import defpackage.zf0;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class NavHostFragment extends kc1 {
    public final rp4 l0 = new rp4(new zf0(5, this));
    public View m0;
    public int n0;
    public boolean o0;

    @Override // defpackage.kc1
    public final void E(Context context) {
        context.getClass();
        super.E(context);
        if (this.o0) {
            po poVar = new po(q());
            poVar.l(this);
            poVar.e(false);
        }
    }

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        h0();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.o0 = true;
            po poVar = new po(q());
            poVar.l(this);
            poVar.e(false);
        }
        super.F(bundle);
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.J;
        if (i == 0 || i == -1) {
            i = app.homemusic.R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // defpackage.kc1
    public final void J() {
        this.R = true;
        View view = this.m0;
        if (view != null && gb.x(view) == h0()) {
            view.setTag(app.homemusic.R.id.nav_controller_view_tag, null);
        }
        this.m0 = null;
    }

    @Override // defpackage.kc1
    public final void M(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        super.M(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rt3.b);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.n0 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, at3.c);
        obtainStyledAttributes2.getClass();
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.o0 = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        if (this.o0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // defpackage.kc1
    public final void T(View view, Bundle bundle) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            nz2.z(view, " is not a ViewGroup", "created host view ");
            return;
        }
        view.setTag(app.homemusic.R.id.nav_controller_view_tag, h0());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.m0 = view2;
            if (view2.getId() == this.J) {
                View view3 = this.m0;
                view3.getClass();
                view3.setTag(app.homemusic.R.id.nav_controller_view_tag, h0());
            }
        }
    }

    public final v23 h0() {
        return (v23) this.l0.getValue();
    }
}
