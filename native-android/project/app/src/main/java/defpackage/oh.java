package defpackage;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public class oh extends qh {
    public oh() {
    }

    @Override // defpackage.qh
    public void a(StaticLayout.Builder r2, TextView r3) {
        r2.setTextDirection((TextDirectionHeuristic) rh.e(r3, TextDirectionHeuristics.FIRSTSTRONG_LTR, "getTextDirectionHeuristic"));
    }
}
