package defpackage;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.homemusic.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.ArrayList;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class lx2 extends dw3 {
    public final dy q;
    public final ze4 r;
    public final om1 s;
    public final int t;

    public lx2(ContextThemeWrapper r5, ze4 r6, dy r7, om1 r8) {
        ix2 r0 = r7.n;
        ix2 r1 = r7.o;
        ix2 r2 = r7.q;
        if (r0.a(r2) <= 0) goto L5;
        kf2.n("firstPage cannot be after currentPage");
        throw null;
    L5:
        if (r2.a(r1) > 0) goto L12;
        int r3 = jx2.s;
        int r4 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * r3;
        if (xh2.q0(r5, android.R.attr.windowFullscreen) == false) goto L9;
        int r9 = r5.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
    L10:
        this.t = r4 + r9;
        this.q = r7;
        this.r = r6;
        this.s = r8;
        o(true);
        return;
    L9:
        r9 = 0;
        goto L10
    L12:
        kf2.n("currentPage cannot be after lastPage");
        throw null;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.t;
    }

    @Override // defpackage.dw3
    public final long b(int r3) {
        Calendar r2 = a35.c(this.q.n.n);
        r2.add(2, r3);
        r2.set(5, 1);
        Calendar r4 = a35.c(r2);
        r4.get(2);
        r4.get(1);
        r4.getMaximum(7);
        r4.getActualMaximum(5);
        r4.getTimeInMillis();
        return r4.getTimeInMillis();
    }

    @Override // defpackage.dw3
    public final void g(cx3 r8, int r9) {
        kx2 r10 = (kx2) r8;
        dy r0 = this.q;
        Calendar r1 = a35.c(r0.n.n);
        r1.add(2, r9);
        ix2 r11 = new ix2(r1);
        r10.u.setText(r11.d());
        MaterialCalendarGridView r12 = (MaterialCalendarGridView) r10.v.findViewById(R.id.month_grid);
        if (r12.a() != null) goto L5;
    L14:
        jx2 r2 = new jx2(r11, this.r, r0);
        r12.setNumColumns(r11.q);
        r12.setAdapter(r2);
    L15:
        r12.setOnItemClickListener(new y8(1, this, r12));
        return;
    L5:
        if (r11.equals(r12.a().n) == false) goto L14;
        r12.invalidate();
        jx2 r13 = r12.a();
        ze4 r3 = r13.o;
        ArrayList r4 = r13.p;
        int r5 = r4.size();
        int r6 = 0;
        int r7 = 0;
    L7:
        if (r7 >= r5) goto L9;
        Object r14 = r4.get(r7);
        r7 = r7 + 1;
        r13.e(r12, ((Long) r14).longValue());
        goto L7
    L9:
        if (r3 == null) goto L15;
        ArrayList r15 = r3.a();
        int r16 = r15.size();
    L11:
        if (r6 >= r16) goto L13;
        Object r17 = r15.get(r6);
        r6 = r6 + 1;
        r13.e(r12, ((Long) r17).longValue());
        goto L11
    L13:
        r13.p = r3.a();
        goto L15
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r3, int r4) {
        LinearLayout r5 = (LinearLayout) b11.i(r3, R.layout.mtrl_calendar_month_labeled, r3, false);
        if (xh2.q0(r3.getContext(), android.R.attr.windowFullscreen) == false) goto L7;
        r5.setLayoutParams(new nw3(-1, this.t));
        return new kx2(r5, true);
    L7:
        return new kx2(r5, false);
    }
}
