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
    public static final int q = 0;
    public final Calendar n;
    public final int o;
    public final int p;

    static {
        if (Build.VERSION.SDK_INT < 26) goto L5;
        int r0 = 4;
    L6:
        q = r0;
        return;
    L5:
        r0 = 1;
        goto L6
    }

    public qi0() {
        Calendar r0 = a35.e(null);
        this.n = r0;
        this.o = r0.getMaximum(7);
        this.p = r0.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.o;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int r2) {
        int r0 = this.o;
        if (r2 < r0) goto L6;
        return null;
    L6:
        int r3 = r2 + this.p;
        if (r3 <= r0) goto L10;
        r3 = r3 - r0;
    L10:
        return Integer.valueOf(r3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int r3, View r4, ViewGroup r5) {
        TextView r0 = (TextView) r4;
        if (r4 != null) goto L5;
        r0 = (TextView) b11.i(r5, R.layout.mtrl_calendar_day_of_week, r5, false);
    L5:
        int r6 = r3 + this.p;
        int r7 = this.o;
        if (r6 <= r7) goto L8;
        r6 = r6 - r7;
    L8:
        Calendar r2 = this.n;
        r2.set(7, r6);
        Locale r8 = r0.getResources().getConfiguration().locale;
        r0.setText(r2.getDisplayName(7, q, r8));
        r0.setContentDescription(String.format(r5.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), new Object[]{r2.getDisplayName(7, 2, Locale.getDefault())}));
        return r0;
    }

    public qi0(int r3) {
        Calendar r0 = a35.e(null);
        this.n = r0;
        this.o = r0.getMaximum(7);
        this.p = r3;
    }
}
