package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class u25 implements uw2 {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final t25 a;

    public u25(t25 t25Var) {
        this.a = t25Var;
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        sh0 fkVar;
        Uri uri = (Uri) obj;
        s73 s73Var = new s73(uri);
        t25 t25Var = this.a;
        switch (t25Var.a) {
            case 0:
                fkVar = new fk(t25Var.b, uri, 0);
                break;
            case 1:
                fkVar = new fk(t25Var.b, uri, 1);
                break;
            default:
                fkVar = new gm4(1, uri, t25Var.b);
                break;
        }
        return new tw2(s73Var, fkVar);
    }
}
