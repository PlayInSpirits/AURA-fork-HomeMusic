package defpackage;

import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.eddyizm.tempus.subsonic.models.Line;
import com.eddyizm.tempus.subsonic.models.LyricsList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qk3 o;

    public /* synthetic */ nk3(qk3 r1, int r2) {
        this.n = r2;
        this.o = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        qk3 r12 = this.o;
        switch(r0) {
            case 0: goto L65;
            default: goto L5;
        };
    L65:
        r12.o0 = (bj2) r12.n0.get();     // Catch: Exception -> L62
        r12.m0.k.e(r12.v(), new mk3(r12, 4));     // Catch: Exception -> L62
        return;
    L62:
        e = move-exception;
        e.printStackTrace();
        return;
    L5:
        if (r12.p0 != null) goto L7;
        return;
    L7:
        if (r12.l0 == null) goto L58;
        LyricsList r1 = (LyricsList) r12.m0.k.d();
        if (u52.c().a == false) goto L11;
        long r2 = u52.c().b(SystemClock.elapsedRealtime());
    L15:
        int r3 = (int) r2;
        if (qk3.h0(r1) == false) goto L58;
        List<Line> r4 = r1.getStructuredLyrics().get(0).getLine();
        if (r4 == null) goto L58;
        if (r4.isEmpty() == true) goto L58;
        int r5 = 0;
        int r6 = 0;
    L24:
        if (r5 >= r4.size()) goto L31;
        Integer r7 = r4.get(r5).getStart();
        if (r7 == null) goto L30;
        if (r7.intValue() > r3) goto L31;
    L30:
        r6 = r5;
        r5 = r5 + 1;
    L31:
        Integer r8 = r12.t0;
        if (r8 != null) goto L34;
    L36:
        r12.t0 = Integer.valueOf(r6);
        StringBuilder r9 = new StringBuilder();
        Iterator<Line> r10 = r4.iterator();
    L38:
        if (r10.hasNext() == false) goto L40;
        r9.append(r10.next().getValue().trim());
        r9.append("\n\n");
        goto L38
    L40:
        SpannableString r11 = new SpannableString(r9.toString());
        int r13 = -1;
        int r14 = 0;
        int r15 = 0;
    L42:
        if (r14 >= r4.size()) goto L49;
        if (r14 != r6) goto L45;
        boolean r16 = true;
    L46:
        if (r16 == false) goto L48;
        r13 = r15;
    L48:
        int r17 = (r4.get(r14).getValue().length() + 2) + r15;
        r11.setSpan(new pk3(r12, r4.get(r14).getStart().intValue(), r16), r15, r17, 33);
        r14 = r14 + 1;
        r15 = r17;
        goto L42
    L45:
        r16 = false;
        goto L46
    L49:
        ((TextView) r12.l0.d).setMovementMethod(LinkMovementMethod.getInstance());
        ((TextView) r12.l0.d).setText(r11);
        if (r13 < 0) goto L58;
        if (r12.m0.s == false) goto L58;
        ml3 r18 = r12.l0;
        NestedScrollView r19 = (NestedScrollView) r18.c;
        Layout r20 = ((TextView) r18.d).getLayout();
        if (r20 != null) goto L56;
        int r21 = 0;
    L57:
        r19.u(0 - r19.getScrollX(), r21 - r19.getScrollY(), false);
        goto L58
    L56:
        int r22 = r20.getLineForOffset(r13);
        r21 = Math.max(((r20.getLineBottom(r22) + r20.getLineTop(r22)) / 2) - (((NestedScrollView) r12.l0.c).getHeight() / 2), 0);
        goto L57
    L34:
        if (r6 != r8.intValue()) goto L36;
    L11:
        bj2 r23 = r12.o0;
        if (r23 == null) goto L14;
        r2 = r23.M0();
        goto L15
    L14:
        r2 = 0;
    L58:
        r12.p0.postDelayed(r12.q0, 250);
    }
}
