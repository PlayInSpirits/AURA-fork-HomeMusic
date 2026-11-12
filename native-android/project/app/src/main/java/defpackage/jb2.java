package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements Comparator {
    public final /* synthetic */ int n;

    public /* synthetic */ jb2(int r1) {
        this.n = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        switch(this.n) {
            case 0: goto L27;
            case 1: goto L25;
            case 2: goto L23;
            case 3: goto L21;
            case 4: goto L19;
            case 5: goto L17;
            case 6: goto L15;
            case 7: goto L13;
            case 8: goto L11;
            case 9: goto L9;
            case 10: goto L7;
            default: goto L4;
        };
    L4:
        Map.Entry r5 = (Map.Entry) r3;
        Map.Entry r6 = (Map.Entry) r4;
        Objects.requireNonNull(r5);
        Objects.requireNonNull(r6);
        Object r2 = r5.getKey();
        Comparable r7 = (Comparable) r2;
        Comparable r8 = (Comparable) r6.getKey();
        r7.getClass();
        r8.getClass();
        return r7.compareTo(r8);
    L7:
        return ((Scope) r3).o.compareTo(((Scope) r4).o);
    L9:
        return fu.l(((ne5) r3).a, ((ne5) r4).a);
    L11:
        return ((View) r3).getTop() - ((View) r4).getTop();
    L13:
        return fu.l(((qq4) r3).a, ((qq4) r4).a);
    L15:
        return fu.l(((oq4) r3).a, ((oq4) r4).a);
    L17:
        return fu.l((Integer) ((Map.Entry) r3).getKey(), (Integer) ((Map.Entry) r4).getKey());
    L19:
        return fu.l((Integer) ((Map.Entry) r3).getKey(), (Integer) ((Map.Entry) r4).getKey());
    L21:
        return ((ai4) r3).o - ((ai4) r4).o;
    L23:
        return fu.l(Long.valueOf(((sp3) ((Map.Entry) r4).getValue()).i), Long.valueOf(((sp3) ((Map.Entry) r3).getValue()).i));
    L25:
        return fu.l(Long.valueOf(((sp3) r4).i), Long.valueOf(((sp3) r3).i));
    L27:
        return ((Comparable) r3).compareTo((Comparable) r4);
    }
}
