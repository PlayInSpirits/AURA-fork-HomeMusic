package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import app.homemusic.R;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qi0 extends BaseAdapter {
    public static final int q;
    public final Calendar n;
    public final int o;
    public final int p;

    static {
        q = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public qi0() {
        Calendar calendarE = a35.e(null);
        this.n = calendarE;
        this.o = calendarE.getMaximum(7);
        this.p = calendarE.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.o;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.p;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) b11.i(viewGroup, R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.p;
        int i3 = this.o;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.n;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, q, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public qi0(int i) {
        Calendar calendarE = a35.e(null);
        this.n = calendarE;
        this.o = calendarE.getMaximum(7);
        this.p = i;
    }
}
