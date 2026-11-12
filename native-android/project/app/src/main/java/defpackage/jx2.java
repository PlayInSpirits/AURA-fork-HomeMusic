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
    public static final int s = 0;
    public static final int t = 0;
    public final ix2 n;
    public final ze4 o;
    public ArrayList p;
    public ey q;
    public final dy r;

    static {
        s = a35.e(null).getMaximum(4);
        t = (a35.e(null).getMaximum(7) + a35.e(null).getMaximum(5)) - 1;
    }

    public jx2(ix2 r1, ze4 r2, dy r3) {
        this.n = r1;
        this.o = r2;
        this.r = r3;
        this.p = r2.a();
    }

    public final int a() {
        int r0 = this.r.r;
        ix2 r3 = this.n;
        Calendar r1 = r3.n;
        int r2 = r1.get(7);
        if (r0 > 0) goto L6;
        r0 = r1.getFirstDayOfWeek();
    L6:
        int r4 = r2 - r0;
        if (r4 < 0) goto L9;
        return r4;
    L9:
        return r4 + r3.q;
    }

    public final Long b(int r2) {
        if (r2 >= a()) goto L5;
        return null;
    L5:
        if (r2 > c()) goto L11;
        int r3 = (r2 - a()) + 1;
        Calendar r1 = a35.c(this.n.n);
        r1.set(5, r3);
        return Long.valueOf(r1.getTimeInMillis());
    L11:
        return null;
    }

    public final int c() {
        return (a() + this.n.r) - 1;
    }

    public final void d(TextView r12, long r13) {
        if (r12 != null) goto L4;
        return;
    L4:
        Context r0 = r12.getContext();
        boolean r2 = false;
        if (a35.d().getTimeInMillis() != r13) goto L7;
        boolean r1 = true;
    L8:
        ze4 r4 = this.o;
        r4.getClass();
        ArrayList r5 = new ArrayList();
        int r6 = r5.size();
        int r7 = 0;
    L9:
        if (r7 >= r6) goto L15;
        Object r8 = r5.get(r7);
        r7 = r7 + 1;
        Object r9 = ((ld3) r8).a;
        if (r9 == null) goto L9;
        if (((Long) r9).longValue() != r13) goto L9;
        boolean r10 = true;
    L16:
        ArrayList r11 = new ArrayList();
        int r14 = r11.size();
        int r15 = 0;
    L17:
        if (r15 >= r14) goto L23;
        Object r16 = r11.get(r15);
        r15 = r15 + 1;
        Object r17 = ((ld3) r16).b;
        if (r17 == null) goto L17;
        if (((Long) r17).longValue() != r13) goto L17;
        boolean r18 = true;
    L24:
        Calendar r19 = a35.d();
        Calendar r20 = a35.e(null);
        r20.setTimeInMillis(r13);
        if (r19.get(1) != r20.get(1)) goto L27;
        String r21 = a35.b("MMMMEEEEd", Locale.getDefault()).format(new Date(r13));
    L28:
        if (r1 == false) goto L30;
        r21 = String.format(r0.getString(R.string.mtrl_picker_today_description), new Object[]{r21});
    L30:
        if (r10 == false) goto L32;
        r21 = String.format(r0.getString(R.string.mtrl_picker_start_date_description), new Object[]{r21});
    L34:
        r12.setContentDescription(r21);
        if (r13 < this.r.p.n) goto L52;
        r12.setEnabled(true);
        ArrayList r3 = r4.a();
        int r22 = r3.size();
        int r23 = 0;
    L37:
        if (r23 >= r22) goto L41;
        Object r24 = r3.get(r23);
        r23 = r23 + 1;
        if (a35.a(r13) != a35.a(((Long) r24).longValue())) goto L37;
        boolean r25 = true;
    L42:
        r12.setSelected(r25);
        if (r25 == false) goto L46;
        c6 r110 = (c6) this.q.b;
    L53:
        r110.A(r12);
        return;
    L46:
        if (a35.d().getTimeInMillis() != r13) goto L48;
        r2 = true;
    L48:
        ey r111 = this.q;
        if (r2 == false) goto L51;
        r110 = (c6) r111.c;
        goto L53
    L51:
        r110 = (c6) r111.a;
        goto L53
    L41:
        r25 = false;
        goto L42
    L52:
        r12.setEnabled(false);
        r110 = (c6) this.q.g;
        goto L53
    L32:
        if (r18 == false) goto L34;
        r21 = String.format(r0.getString(R.string.mtrl_picker_end_date_description), new Object[]{r21});
        goto L34
    L27:
        r21 = a35.b("yMMMMEEEEd", Locale.getDefault()).format(new Date(r13));
        goto L28
    L23:
        r18 = false;
        goto L24
    L15:
        r10 = false;
        goto L16
    L7:
        r1 = false;
        goto L8
    }

    public final void e(MaterialCalendarGridView r3, long r4) {
        ix2 r0 = ix2.c(r4);
        ix2 r1 = this.n;
        if (r0.equals(r1) == false) goto L6;
        Calendar r2 = a35.c(r1.n);
        r2.setTimeInMillis(r4);
        int r5 = r2.get(5);
        d((TextView) r3.getChildAt((r3.a().a() + (r5 - 1)) - r3.getFirstVisiblePosition()), r4);
        return;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return t;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r1) {
        return r1 / this.n.q;
    }

    @Override // android.widget.Adapter
    public final View getView(int r5, View r6, ViewGroup r7) {
        Context r0 = r7.getContext();
        if (this.q != null) goto L5;
        this.q = new ey(r0);
    L5:
        TextView r1 = (TextView) r6;
        if (r6 != null) goto L8;
        r1 = (TextView) b11.i(r7, R.layout.mtrl_calendar_day, r7, false);
    L8:
        int r8 = r5 - a();
        if (r8 < 0) goto L14;
        ix2 r9 = this.n;
        if (r8 >= r9.r) goto L14;
        r1.setTag(r9);
        r1.setText(String.format(r1.getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(r8 + 1)}));
        r1.setVisibility(0);
        r1.setEnabled(true);
    L15:
        Long r10 = b(r5);
        if (r10 != null) goto L18;
        return r1;
    L18:
        d(r1, r10.longValue());
        return r1;
    L14:
        r1.setVisibility(8);
        r1.setEnabled(false);
        goto L15
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
