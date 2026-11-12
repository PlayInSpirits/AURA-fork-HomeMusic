package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class x25 implements uw2 {
    public static final Set b = null;
    public final uw2 a;

    static {
        b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"http", "https"})));
    }

    public x25(uw2 r1) {
        this.a = r1;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r1) {
        return b.contains(((Uri) r1).getScheme());
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r2, int r3, int r4, db3 r5) {
        qi1 r0 = new qi1(((Uri) r2).toString());
        return this.a.b(r0, r3, r4, r5);
    }
}
