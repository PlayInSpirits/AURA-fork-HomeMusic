package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import app.homemusic.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ke5 extends dw3 {
    public final nh2 q;

    public ke5(nh2 r1) {
        this.q = r1;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.o0.s;
    }

    @Override // defpackage.dw3
    public final void g(cx3 r10, int r11) {
        nh2 r0 = this.q;
        int r1 = r0.o0.n.p + r11;
        TextView r12 = ((je5) r10).u;
        r12.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(r1)}));
        Context r13 = r12.getContext();
        if (a35.d().get(1) != r1) goto L5;
        String r14 = String.format(r13.getString(R.string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(r1)});
    L6:
        r12.setContentDescription(r14);
        ey r15 = r0.r0;
        Calendar r2 = a35.d();
        if (r2.get(1) != r1) goto L10;
        Object r4 = r15.f;
    L9:
        c6 r5 = (c6) r4;
        ArrayList r3 = r0.n0.a();
        int r6 = r3.size();
        int r7 = 0;
    L12:
        if (r7 >= r6) goto L16;
        Object r8 = r3.get(r7);
        r7 = r7 + 1;
        r2.setTimeInMillis(((Long) r8).longValue());
        if (r2.get(1) != r1) goto L12;
        r5 = (c6) r15.e;
        goto L12
    L16:
        r5.A(r12);
        r12.setOnClickListener(new ie5(this, r1));
        return;
    L10:
        r4 = r15.d;
        goto L9
    L5:
        r14 = String.format(r13.getString(R.string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(r1)});
        goto L6
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup r1, int r2) {
        return new je5((TextView) b11.i(r1, R.layout.mtrl_calendar_year, r1, false));
    }
}
