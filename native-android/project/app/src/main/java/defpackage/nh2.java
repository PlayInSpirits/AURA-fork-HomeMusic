package defpackage;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
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

    public nh2() {
    }

    @Override // defpackage.kc1
    public final void F(Bundle r2) {
        super.F(r2);
        if (r2 != null) goto L5;
        r2 = this.s;
    L5:
        this.m0 = r2.getInt("THEME_RES_ID_KEY");
        this.n0 = (ze4) r2.getParcelable("GRID_SELECTOR_KEY");
        this.o0 = (dy) r2.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (r2.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) goto L9;
        this.p0 = (ix2) r2.getParcelable("CURRENT_MONTH_KEY");
        return;
    L9:
        kf2.k();
    }

    @Override // defpackage.kc1
    public final View H(LayoutInflater r11, ViewGroup r12, Bundle r13) {
        ContextThemeWrapper r14 = new ContextThemeWrapper(n(), this.m0);
        this.r0 = new ey(r14);
        LayoutInflater r15 = r11.cloneInContext(r14);
        ix2 r0 = this.o0.n;
        int r3 = 0;
        int r4 = 1;
        if (xh2.q0(r14, R.attr.windowFullscreen) == false) goto L5;
        int r2 = app.homemusic.R.layout.mtrl_calendar_vertical;
        int r5 = 1;
    L6:
        View r16 = r15.inflate(r2, r12, false);
        Resources r17 = Z().getResources();
        int r6 = r17.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_navigation_bottom_padding) + (r17.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_navigation_top_padding) + r17.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_navigation_height));
        int r7 = r17.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_days_of_week_height);
        int r8 = jx2.s;
        int r9 = r6 + r7;
        r16.setMinimumHeight((r9 + ((r17.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_month_vertical_padding) * (r8 - 1)) + (r17.getDimensionPixelSize(app.homemusic.R.dimen.mtrl_calendar_day_height) * r8))) + r17.getDimensionPixelOffset(app.homemusic.R.dimen.mtrl_calendar_bottom_padding));
        GridView r18 = (GridView) r16.findViewById(app.homemusic.R.id.mtrl_calendar_days_of_week);
        j65.o(r18, new fw0(r4));
        int r10 = this.o0.r;
        if (r10 <= 0) goto L9;
        qi0 r19 = new qi0(r10);
    L10:
        r18.setAdapter(r19);
        r18.setNumColumns(r0.q);
        r18.setEnabled(false);
        this.t0 = (RecyclerView) r16.findViewById(app.homemusic.R.id.mtrl_calendar_months);
        this.t0.setLayoutManager(new kh2(this, r5, r5));
        this.t0.setTag("MONTHS_VIEW_GROUP_TAG");
        lx2 r110 = new lx2(r14, this.n0, this.o0, new om1(6, this));
        this.t0.setAdapter(r110);
        int r1 = r14.getResources().getInteger(app.homemusic.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView r20 = (RecyclerView) r16.findViewById(app.homemusic.R.id.mtrl_calendar_year_selector_frame);
        this.s0 = r20;
        if (r20 == null) goto L14;
        r20.setHasFixedSize(true);
        this.s0.setLayoutManager(new GridLayoutManager(r1, 1));
        this.s0.setAdapter(new ke5(this));
        this.s0.i(new lh2(this));
    L14:
        if (r16.findViewById(app.homemusic.R.id.month_navigation_fragment_toggle) == null) goto L17;
        MaterialButton r21 = (MaterialButton) r16.findViewById(app.homemusic.R.id.month_navigation_fragment_toggle);
        r21.setTag("SELECTOR_TOGGLE_TAG");
        int r22 = 5;
        j65.o(r21, new ar(r22, this));
        View r23 = r16.findViewById(app.homemusic.R.id.month_navigation_previous);
        this.u0 = r23;
        r23.setTag("NAVIGATION_PREV_TAG");
        View r24 = r16.findViewById(app.homemusic.R.id.month_navigation_next);
        this.v0 = r24;
        r24.setTag("NAVIGATION_NEXT_TAG");
        this.w0 = r16.findViewById(app.homemusic.R.id.mtrl_calendar_year_selector_frame);
        this.x0 = r16.findViewById(app.homemusic.R.id.mtrl_calendar_day_selector_frame);
        j0(1);
        r21.setText(this.p0.d());
        this.t0.j(new mh2(this, r110, r21));
        r21.setOnClickListener(new i4(r22, this));
        this.v0.setOnClickListener(new jh2(this, r110, r4));
        this.u0.setOnClickListener(new jh2(this, r110, r3));
    L17:
        if (xh2.q0(r14, R.attr.windowFullscreen) == true) goto L19;
        new xg0(1).a(this.t0);
    L19:
        this.t0.j0(r110.q.n.e(this.p0));
        j65.o(this.t0, new fw0(2));
        return r16;
    L9:
        r19 = new qi0();
        goto L10
    L5:
        r2 = app.homemusic.R.layout.mtrl_calendar_horizontal;
        r5 = 0;
        goto L6
    }

    @Override // defpackage.kc1
    public final void Q(Bundle r3) {
        r3.putInt("THEME_RES_ID_KEY", this.m0);
        r3.putParcelable("GRID_SELECTOR_KEY", this.n0);
        r3.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.o0);
        r3.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        r3.putParcelable("CURRENT_MONTH_KEY", this.p0);
    }

    @Override // defpackage.cg3
    public final void h0(wh2 r1) {
        this.l0.add(r1);
    }

    public final void i0(ix2 r7) {
        lx2 r0 = (lx2) this.t0.getAdapter();
        int r1 = r0.q.n.e(r7);
        int r2 = r1 - r0.q.n.e(this.p0);
        boolean r3 = false;
        int r5 = 3;
        if (Math.abs(r2) <= 3) goto L5;
        boolean r4 = true;
    L6:
        if (r2 <= 0) goto L8;
        r3 = true;
    L8:
        this.p0 = r7;
        if (r4 == false) goto L13;
        if (r3 == false) goto L13;
        this.t0.j0(r1 - 3);
        this.t0.post(new rq(r1, r5, this));
        return;
    L13:
        RecyclerView r8 = this.t0;
        if (r4 == false) goto L17;
        r8.j0(r1 + 3);
        this.t0.post(new rq(r1, r5, this));
        return;
    L17:
        r8.post(new rq(r1, r5, this));
        return;
    L5:
        r4 = false;
        goto L6
    }

    public final void j0(int r5) {
        this.q0 = r5;
        if (r5 != 2) goto L7;
        mw3 r6 = this.s0.getLayoutManager();
        ke5 r0 = (ke5) this.s0.getAdapter();
        r6.s0(this.p0.p - r0.q.o0.n.p);
        this.w0.setVisibility(0);
        this.x0.setVisibility(8);
        this.u0.setVisibility(8);
        this.v0.setVisibility(8);
        return;
    L7:
        if (r5 != 1) goto L10;
        this.w0.setVisibility(8);
        this.x0.setVisibility(0);
        this.u0.setVisibility(0);
        this.v0.setVisibility(0);
        i0(this.p0);
        return;
    }
}
