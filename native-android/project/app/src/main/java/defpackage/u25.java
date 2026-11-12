package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class u25 implements uw2 {
    public static final Set b = null;
    public final t25 a;

    static {
        b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "content", "android.resource"})));
    }

    public u25(t25 r1) {
        this.a = r1;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r1) {
        return b.contains(((Uri) r1).getScheme());
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r2, int r3, int r4, db3 r5) {
        Uri r6 = (Uri) r2;
        s73 r7 = new s73(r6);
        t25 r1 = this.a;
        switch(r1.a) {
            case 0: goto L6;
            case 1: goto L5;
            default: goto L4;
        };
    L4:
        sh0 r8 = new gm4(1, r6, r1.b);
    L8:
        return new tw2(r7, r8);
    L5:
        r8 = new fk(r1.b, r6, 1);
        goto L8
    L6:
        r8 = new fk(r1.b, r6, 0);
        goto L8
    }
}
