package defpackage;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class y8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ y8(int r1, Object r2, Object r3) {
        this.n = r1;
        this.p = r2;
        this.o = r3;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView r1, View r2, int r3, long r4) {
        int r5 = this.n;
        Object r6 = this.p;
        Object r0 = this.o;
        switch(r5) {
            case 0: goto L18;
            default: goto L4;
        };
    L4:
        MaterialCalendarGridView r7 = (MaterialCalendarGridView) r0;
        jx2 r8 = r7.a();
        if (r3 >= r8.a()) goto L7;
        return;
    L7:
        if (r3 > r8.c()) goto L24;
        om1 r9 = ((lx2) r6).s;
        Long r10 = r7.a().b(r3);
        long r11 = r10.longValue();
        nh2 r12 = (nh2) r9.o;
        if (r11 < r12.o0.p.n) goto L25;
        r12.n0.n = r10;
        Iterator r13 = r12.l0.iterator();
    L12:
        if (r13.hasNext() == false) goto L14;
        ((wh2) r13.next()).b(r12.n0.n);
        goto L12
    L14:
        r12.t0.getAdapter().d();
        RecyclerView r14 = r12.s0;
        if (r14 == null) goto L26;
        r14.getAdapter().d();
        return;
    L26:
        return;
    L25:
        return;
    L24:
        return;
    L18:
        a9 r15 = (a9) r6;
        d9 r16 = (d9) r0;
        r15.r.onClick(r16.b, r3);
        if (r15.v == true) goto L27;
        r16.b.dismiss();
        return;
    }
}
