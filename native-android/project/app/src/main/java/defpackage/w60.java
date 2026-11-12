package defpackage;

import com.eddyizm.tempus.subsonic.models.AlbumID3;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w60 implements Comparator {
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;

    public /* synthetic */ w60(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String lowerCase;
        int i = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                int iCompare = ((ca1) obj3).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String name = ((AlbumID3) obj).getName();
                String lowerCase2 = "";
                if (name != null) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    lowerCase = name.toLowerCase(locale);
                    lowerCase.getClass();
                } else {
                    lowerCase = "";
                }
                String name2 = ((AlbumID3) obj2).getName();
                if (name2 != null) {
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    lowerCase2 = name2.toLowerCase(locale2);
                    lowerCase2.getClass();
                }
                return fu.l(lowerCase, lowerCase2);
            case 1:
                for (if1 if1Var : (if1[]) obj3) {
                    int iL = fu.l((Comparable) if1Var.invoke(obj), (Comparable) if1Var.invoke(obj2));
                    if (iL != 0) {
                        return iL;
                    }
                }
                return 0;
            default:
                ik2 ik2Var = (ik2) obj3;
                return ik2Var.e(obj2) - ik2Var.e(obj);
        }
    }
}
