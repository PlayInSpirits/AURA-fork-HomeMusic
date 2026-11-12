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

    public ke5(nh2 nh2Var) {
        this.q = nh2Var;
    }

    @Override // defpackage.dw3
    public final int a() {
        return this.q.o0.s;
    }

    @Override // defpackage.dw3
    public final void g(cx3 cx3Var, int i) {
        nh2 nh2Var = this.q;
        int i2 = nh2Var.o0.n.p + i;
        TextView textView = ((je5) cx3Var).u;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(a35.d().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        ey eyVar = nh2Var.r0;
        Calendar calendarD = a35.d();
        c6 c6Var = (c6) (calendarD.get(1) == i2 ? eyVar.f : eyVar.d);
        ArrayList arrayListA = nh2Var.n0.a();
        int size = arrayListA.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayListA.get(i3);
            i3++;
            calendarD.setTimeInMillis(((Long) obj).longValue());
            if (calendarD.get(1) == i2) {
                c6Var = (c6) eyVar.e;
            }
        }
        c6Var.A(textView);
        textView.setOnClickListener(new ie5(this, i2));
    }

    @Override // defpackage.dw3
    public final cx3 i(ViewGroup viewGroup, int i) {
        return new je5((TextView) b11.i(viewGroup, R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
