package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mh2 extends rw3 {
    public final /* synthetic */ lx2 a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ nh2 c;

    public mh2(nh2 r1, lx2 r2, MaterialButton r3) {
        this.c = r1;
        this.a = r2;
        this.b = r3;
    }

    @Override // defpackage.rw3
    public final void a(RecyclerView r1, int r2) {
        if (r2 != 0) goto L5;
        r1.announceForAccessibility(this.b.getText());
        return;
    }

    @Override // defpackage.rw3
    public final void b(RecyclerView r4, int r5, int r6) {
        dy r7 = this.a.q;
        nh2 r8 = this.c;
        RecyclerView r0 = r8.t0;
        if (r5 >= 0) goto L5;
        int r9 = ((LinearLayoutManager) r0.getLayoutManager()).P0();
    L6:
        Calendar r1 = a35.c(r7.n.n);
        r1.add(2, r9);
        r8.p0 = new ix2(r1);
        Calendar r10 = a35.c(r7.n.n);
        r10.add(2, r9);
        r10.set(5, 1);
        Calendar r11 = a35.c(r10);
        r11.get(2);
        r11.get(1);
        r11.getMaximum(7);
        r11.getActualMaximum(5);
        r11.getTimeInMillis();
        long r12 = r11.getTimeInMillis();
        String r13 = a35.b("yMMMM", Locale.getDefault()).format(new Date(r12));
        this.b.setText(r13);
        return;
    L5:
        r9 = ((LinearLayoutManager) r0.getLayoutManager()).Q0();
        goto L6
    }
}
