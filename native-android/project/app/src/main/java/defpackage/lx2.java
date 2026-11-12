package defpackage;

import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
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
        Calendar calendarC = a35.c(this.q.n.n);
        calendarC.add(2, i);
        calendarC.set(5, 1);
        Calendar calendarC2 = a35.c(calendarC);
        calendarC2.get(2);
        calendarC2.get(1);
        calendarC2.getMaximum(7);
        calendarC2.getActualMaximum(5);
        calendarC2.getTimeInMillis();
        return calendarC2.getTimeInMillis();
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        kx2 kx2Var = (kx2) cx3Var;
        dy dyVar = this.q;
        Calendar calendarC = a35.c(dyVar.n.n);
        calendarC.add(2, i);
        ix2 ix2Var = new ix2(calendarC);
        kx2Var.u.setText(ix2Var.d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) kx2Var.v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !ix2Var.equals(materialCalendarGridView.a().n)) {
            jx2 jx2Var = new jx2(ix2Var, this.r, dyVar);
            materialCalendarGridView.setNumColumns(ix2Var.q);
            materialCalendarGridView.setAdapter((ListAdapter) jx2Var);
        } else {
            materialCalendarGridView.invalidate();
            jx2 jx2VarA = materialCalendarGridView.a();
            ze4 ze4Var = jx2VarA.o;
            ArrayList arrayList = jx2VarA.p;
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                jx2VarA.e(materialCalendarGridView, ((Long) obj).longValue());
            }
            if (ze4Var != null) {
                ArrayList arrayListA = ze4Var.a();
                int size2 = arrayListA.size();
                while (i2 < size2) {
                    Object obj2 = arrayListA.get(i2);
                    i2++;
                    jx2VarA.e(materialCalendarGridView, ((Long) obj2).longValue());
                }
                jx2VarA.p = ze4Var.a();
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
