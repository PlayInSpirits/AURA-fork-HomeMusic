package defpackage;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class ns4 {
    public static final ThreadLocal a = new ThreadLocal();
    public static final long b = a(0, 0);

    public static final long a(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final TextDirectionHeuristic b(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.LOCALE : TextDirectionHeuristics.ANYRTL_LTR : TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
