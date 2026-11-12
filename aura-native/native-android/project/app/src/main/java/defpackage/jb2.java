package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jb2 implements Comparator {
    public final /* synthetic */ int n;

    public /* synthetic */ jb2(int i) {
        this.n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.n) {
            case 0:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 1:
                return fu.l(Long.valueOf(((sp3) obj2).i), Long.valueOf(((sp3) obj).i));
            case 2:
                return fu.l(Long.valueOf(((sp3) ((Map.Entry) obj2).getValue()).i), Long.valueOf(((sp3) ((Map.Entry) obj).getValue()).i));
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((ai4) obj).o - ((ai4) obj2).o;
            case 4:
                return fu.l((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 5:
                return fu.l((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return fu.l(((oq4) obj).a, ((oq4) obj2).a);
            case 7:
                return fu.l(((qq4) obj).a, ((qq4) obj2).a);
            case 8:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 9:
                return fu.l(((ne5) obj).a, ((ne5) obj2).a);
            case 10:
                return ((Scope) obj).o.compareTo(((Scope) obj2).o);
            default:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Objects.requireNonNull(entry);
                Objects.requireNonNull(entry2);
                Comparable comparable = (Comparable) entry.getKey();
                Comparable comparable2 = (Comparable) entry2.getKey();
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
        }
    }
}
