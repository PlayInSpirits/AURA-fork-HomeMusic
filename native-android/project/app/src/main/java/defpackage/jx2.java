package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import app.homemusic.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jx2 extends BaseAdapter {
    public static final int s = a35.e(null).getMaximum(4);
    public static final int t = (a35.e(null).getMaximum(7) + a35.e(null).getMaximum(5)) - 1;
    public final ix2 n;
    public final ze4 o;
    public ArrayList p;
    public ey q;
    public final dy r;

    public jx2(ix2 ix2Var, ze4 ze4Var, dy dyVar) {
        this.n = ix2Var;
        this.o = ze4Var;
        this.r = dyVar;
        this.p = ze4Var.a();
    }

    public final int a() {
        int firstDayOfWeek = this.r.r;
        ix2 ix2Var = this.n;
        Calendar calendar = ix2Var.n;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + ix2Var.q : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < a() || i > c()) {
            return null;
        }
        int iA = (i - a()) + 1;
        Calendar calendarC = a35.c(this.n.n);
        calendarC.set(5, iA);
        return Long.valueOf(calendarC.getTimeInMillis());
    }

    public final int c() {
        return (a() + this.n.r) - 1;
    }

    public final void d(TextView textView, long j) {
        boolean z;
        boolean z2;
        c6 c6Var;
        boolean z3;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        boolean z4 = a35.d().getTimeInMillis() == j;
        ze4 ze4Var = this.o;
        ze4Var.getClass();
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((ld3) obj).a;
            if (obj2 != null && ((Long) obj2).longValue() == j) {
                z = true;
                break;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = false;
                break;
            }
            Object obj3 = arrayList2.get(i2);
            i2++;
            Object obj4 = ((ld3) obj3).b;
            if (obj4 != null && ((Long) obj4).longValue() == j) {
                z2 = true;
                break;
            }
        }
        Calendar calendarD = a35.d();
        Calendar calendarE = a35.e(null);
        calendarE.setTimeInMillis(j);
        String str = calendarD.get(1) == calendarE.get(1) ? a35.b("MMMMEEEEd", Locale.getDefault()).format(new Date(j)) : a35.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(j));
        if (z4) {
            str = String.format(context.getString(R.string.mtrl_picker_today_description), str);
        }
        if (z) {
            str = String.format(context.getString(R.string.mtrl_picker_start_date_description), str);
        } else if (z2) {
            str = String.format(context.getString(R.string.mtrl_picker_end_date_description), str);
        }
        textView.setContentDescription(str);
        if (j >= this.r.p.n) {
            textView.setEnabled(true);
            ArrayList arrayListA = ze4Var.a();
            int size3 = arrayListA.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size3) {
                    z3 = false;
                    break;
                }
                Object obj5 = arrayListA.get(i3);
                i3++;
                if (a35.a(j) == a35.a(((Long) obj5).longValue())) {
                    z3 = true;
                    break;
                }
            }
            textView.setSelected(z3);
            if (z3) {
                c6Var = (c6) this.q.b;
            } else {
                boolean z5 = a35.d().getTimeInMillis() == j;
                ey eyVar = this.q;
                c6Var = z5 ? (c6) eyVar.c : (c6) eyVar.a;
            }
        } else {
            textView.setEnabled(false);
            c6Var = (c6) this.q.g;
        }
        c6Var.A(textView);
    }

    public final void e(MaterialCalendarGridView materialCalendarGridView, long j) {
        ix2 ix2VarC = ix2.c(j);
        ix2 ix2Var = this.n;
        if (ix2VarC.equals(ix2Var)) {
            Calendar calendarC = a35.c(ix2Var.n);
            calendarC.setTimeInMillis(j);
            d((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.a().a() + (calendarC.get(5) - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return t;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.n.q;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055  */
    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        if (this.q == null) {
            this.q = new ey(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) b11.i(viewGroup, R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int iA = i - a();
        if (iA >= 0) {
            ix2 ix2Var = this.n;
            if (iA >= ix2Var.r) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                textView.setTag(ix2Var);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(iA + 1)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        d(textView, item.longValue());
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
