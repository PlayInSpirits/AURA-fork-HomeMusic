package defpackage;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import app.homemusic.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.ArrayList;
import java.util.Calendar;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class lx2 extends dw3 {
    public final dy q;
    public final ze4 r;
    public final om1 s;
    public final int t;

    public lx2(ContextThemeWrapper contextThemeWrapper, ze4 ze4Var, dy dyVar, om1 om1Var) {
        ix2 ix2Var = dyVar.n;
        ix2 ix2Var2 = dyVar.o;
        ix2 ix2Var3 = dyVar.q;
        if (ix2Var.compareTo(ix2Var3) > 0) {
            kf2.n("firstPage cannot be after currentPage");
            throw null;
        }
        if (ix2Var3.compareTo(ix2Var2) > 0) {
            kf2.n("currentPage cannot be after lastPage");
            throw null;
        }
        this.t = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * jx2.s) + (xh2.q0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.q = dyVar;
        this.r = ze4Var;
        this.s = om1Var;
        o(true);
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.t;
    }

    @Override // defpackage.dw3
    public final long b(int i) {
        Calendar c = a35.c(this.q.n.n);
        c.add(2, i);
        c.set(5, 1);
        Calendar c2 = a35.c(c);
        c2.get(2);
        c2.get(1);
        c2.getMaximum(7);
        c2.getActualMaximum(5);
        c2.getTimeInMillis();
        return c2.getTimeInMillis();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        kx2 kx2Var = (kx2) cx3Var;
        dy dyVar = this.q;
        Calendar c = a35.c(dyVar.n.n);
        c.add(2, i);
        ix2 ix2Var = new ix2(c);
        kx2Var.u.setText(ix2Var.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) kx2Var.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !ix2Var.equals(materialCalendarGridView.a().n)) {
            jx2 jx2Var = new jx2(ix2Var, this.r, dyVar);
            materialCalendarGridView.setNumColumns(ix2Var.q);
            materialCalendarGridView.setAdapter((ListAdapter) jx2Var);
        } else {
            materialCalendarGridView.invalidate();
            jx2 a = materialCalendarGridView.a();
            ze4 ze4Var = a.o;
            ArrayList arrayList = a.p;
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                a.e(materialCalendarGridView, ((Long) obj).longValue());
            }
            if (ze4Var != null) {
                ArrayList a2 = ze4Var.a();
                int size2 = a2.size();
                while (i2 < size2) {
                    Object obj2 = a2.get(i2);
                    i2++;
                    a.e(materialCalendarGridView, ((Long) obj2).longValue());
                }
                a.p = ze4Var.a();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new y8(1, this, materialCalendarGridView));
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) b11.i(viewGroup, R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!xh2.q0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new kx2(linearLayout, false);
        }
        linearLayout.setLayoutParams(new nw3(-1, this.t));
        return new kx2(linearLayout, true);
    }
}
