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

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class nk3 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ qk3 o;

    public /* synthetic */ nk3(qk3 qk3Var, int i) {
        this.n = i;
        this.o = qk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long M0;
        List<Line> line;
        int max;
        Integer start;
        int i = this.n;
        qk3 qk3Var = this.o;
        switch (i) {
            case 0:
                try {
                    qk3Var.o0 = (bj2) qk3Var.n0.get();
                    qk3Var.m0.k.e(qk3Var.v(), new mk3(qk3Var, 4));
                    break;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                if (qk3Var.p0 != null) {
                    if (qk3Var.l0 != null) {
                        LyricsList lyricsList = (LyricsList) qk3Var.m0.k.d();
                        if (u52.c().a) {
                            M0 = u52.c().b(SystemClock.elapsedRealtime());
                        } else {
                            bj2 bj2Var = qk3Var.o0;
                            M0 = bj2Var != null ? bj2Var.M0() : 0L;
                        }
                        int i2 = (int) M0;
                        if (qk3.h0(lyricsList) && (line = lyricsList.getStructuredLyrics().get(0).getLine()) != null && !line.isEmpty()) {
                            int i3 = 0;
                            for (int i4 = 0; i4 < line.size() && ((start = line.get(i4).getStart()) == null || start.intValue() <= i2); i4++) {
                                i3 = i4;
                            }
                            Integer num = qk3Var.t0;
                            if (num == null || i3 != num.intValue()) {
                                qk3Var.t0 = Integer.valueOf(i3);
                                StringBuilder sb = new StringBuilder();
                                Iterator<Line> it = line.iterator();
                                while (it.hasNext()) {
                                    sb.append(it.next().getValue().trim());
                                    sb.append("\n\n");
                                }
                                SpannableString spannableString = new SpannableString(sb.toString());
                                int i5 = -1;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < line.size()) {
                                    boolean z = i6 == i3;
                                    if (z) {
                                        i5 = i7;
                                    }
                                    int length = line.get(i6).getValue().length() + 2 + i7;
                                    spannableString.setSpan(new pk3(qk3Var, line.get(i6).getStart().intValue(), z), i7, length, 33);
                                    i6++;
                                    i7 = length;
                                }
                                ((TextView) qk3Var.l0.d).setMovementMethod(LinkMovementMethod.getInstance());
                                ((TextView) qk3Var.l0.d).setText(spannableString);
                                if (i5 >= 0 && qk3Var.m0.s) {
                                    ml3 ml3Var = qk3Var.l0;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ml3Var.c;
                                    Layout layout = ((TextView) ml3Var.d).getLayout();
                                    if (layout == null) {
                                        max = 0;
                                    } else {
                                        int lineForOffset = layout.getLineForOffset(i5);
                                        max = Math.max(((layout.getLineBottom(lineForOffset) + layout.getLineTop(lineForOffset)) / 2) - (((NestedScrollView) qk3Var.l0.c).getHeight() / 2), 0);
                                    }
                                    nestedScrollView.u(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), false);
                                }
                            }
                        }
                    }
                    qk3Var.p0.postDelayed(qk3Var.q0, 250L);
                    break;
                }
                break;
        }
    }
}
