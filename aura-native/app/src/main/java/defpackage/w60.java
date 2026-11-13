package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.Comparator;
import java.util.Locale;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class w60 implements Comparator {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ w60(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str;
        int i = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                int compare = ((ca1) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                String name = ((AlbumID3) obj).getName();
                String str2 = "";
                if (name != null) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    str = name.toLowerCase(locale);
                    str.getClass();
                } else {
                    str = "";
                }
                String name2 = ((AlbumID3) obj2).getName();
                if (name2 != null) {
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    str2 = name2.toLowerCase(locale2);
                    str2.getClass();
                }
                return fu.l(str, str2);
            case 1:
                for (if1 if1Var : (if1[]) obj3) {
                    int l = fu.l((Comparable) if1Var.invoke(obj), (Comparable) if1Var.invoke(obj2));
                    if (l != 0) {
                        return l;
                    }
                }
                return 0;
            default:
                ik2 ik2Var = (ik2) obj3;
                return ik2Var.e(obj2) - ik2Var.e(obj);
        }
    }
}
