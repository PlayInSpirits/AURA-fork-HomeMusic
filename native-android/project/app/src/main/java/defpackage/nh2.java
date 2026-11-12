package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class nh2<S> extends cg3 {
    public int m0;
    public ze4 n0;
    public dy o0;
    public ix2 p0;
    public int q0;
    public ey r0;
    public RecyclerView s0;
    public RecyclerView t0;
    public View u0;
    public View v0;
    public View w0;
    public View x0;

    @Override // defpackage.kc1
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            bundle = this.s;
        }
        this.m0 = bundle.getInt("THEME_RES_ID_KEY");
        this.n0 = (ze4) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.o0 = (dy) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") == null) {
            this.p0 = (ix2) bundle.getParcelable("CURRENT_MONTH_KEY");
        } else {
            kf2.k();
        }
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(n(), this.m0);
        this.r0 = new ey(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        ix2 ix2Var = this.o0.n;
        int i3 = 0;
        int i4 = 1;
        if (xh2.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = app.homemusic.R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = app.homemusic.R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = Z().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = jx2.s;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(app.homemusic.R.id.mtrl_calendar_days_of_week);
        j65.o(gridView, new fw0(i4));
        int i6 = this.o0.r;
        gridView.setAdapter((ListAdapter) (i6 > 0 ? new qi0(i6) : new qi0()));
        gridView.setNumColumns(ix2Var.q);
        gridView.setEnabled(false);
        this.t0 = (RecyclerView) viewInflate.findViewById(app.homemusic.R.id.mtrl_calendar_months);
        this.t0.setLayoutManager(new kh2(this, i2, i2));
        this.t0.setTag("MONTHS_VIEW_GROUP_TAG");
        lx2 lx2Var = new lx2(contextThemeWrapper, this.n0, this.o0, new om1(6, this));
        this.t0.setAdapter(lx2Var);
        int integer = contextThemeWrapper.getResources().getInteger(app.homemusic.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(app.homemusic.R.id.mtrl_calendar_year_selector_frame);
        this.s0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.s0.setLayoutManager(new GridLayoutManager(integer, 1));
            this.s0.setAdapter(new ke5(this));
            this.s0.i(new lh2(this));
        }
        if (viewInflate.findViewById(app.homemusic.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(app.homemusic.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            int i7 = 5;
            j65.o(materialButton, new ar(i7, this));
            View viewFindViewById = viewInflate.findViewById(app.homemusic.R.id.month_navigation_previous);
            this.u0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(app.homemusic.R.id.month_navigation_next);
            this.v0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.w0 = viewInflate.findViewById(app.homemusic.R.id.mtrl_calendar_year_selector_frame);
            this.x0 = viewInflate.findViewById(app.homemusic.R.id.mtrl_calendar_day_selector_frame);
            j0(1);
            materialButton.setText(this.p0.d());
            this.t0.j(new mh2(this, lx2Var, materialButton));
            materialButton.setOnClickListener(new i4(i7, this));
            this.v0.setOnClickListener(new jh2(this, lx2Var, i4));
            this.u0.setOnClickListener(new jh2(this, lx2Var, i3));
        }
        if (!xh2.q0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new xg0(1).a(this.t0);
        }
        this.t0.j0(lx2Var.q.n.e(this.p0));
        j65.o(this.t0, new fw0(2));
        return viewInflate;
    }

    @Override // defpackage.kc1
    public final void Q(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.n0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.o0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.p0);
    }

    @Override // defpackage.cg3
    public final void h0(wh2 wh2Var) {
        this.l0.add(wh2Var);
    }

    public final void i0(ix2 ix2Var) {
        lx2 lx2Var = (lx2) this.t0.getAdapter();
        int iE = lx2Var.q.n.e(ix2Var);
        int iE2 = iE - lx2Var.q.n.e(this.p0);
        int i = 3;
        boolean z = Math.abs(iE2) > 3;
        boolean z2 = iE2 > 0;
        this.p0 = ix2Var;
        if (z && z2) {
            this.t0.j0(iE - 3);
            this.t0.post(new rq(iE, i, this));
            return;
        }
        RecyclerView recyclerView = this.t0;
        if (!z) {
            recyclerView.post(new rq(iE, i, this));
        } else {
            recyclerView.j0(iE + 3);
            this.t0.post(new rq(iE, i, this));
        }
    }

    public final void j0(int i) {
        this.q0 = i;
        if (i == 2) {
            this.s0.getLayoutManager().s0(this.p0.p - ((ke5) this.s0.getAdapter()).q.o0.n.p);
            this.w0.setVisibility(0);
            this.x0.setVisibility(8);
            this.u0.setVisibility(8);
            this.v0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.w0.setVisibility(8);
            this.x0.setVisibility(0);
            this.u0.setVisibility(0);
            this.v0.setVisibility(0);
            i0(this.p0);
        }
    }
}
