package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.eddyizm.tempus.homemusic.HubFavoriteSubject;
import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.subsonic.models.AlbumID3;
import com.eddyizm.tempus.subsonic.models.Artist;
import com.eddyizm.tempus.subsonic.models.ArtistID3;
import com.eddyizm.tempus.subsonic.models.Child;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ca1 implements Comparator {
    public static final ca1 o = new ca1(0);
    public static final ca1 p = new ca1(1);
    public static final ca1 q = new ca1(2);
    public static final ca1 r = new ca1(3);
    public static final ca1 s = new ca1(4);
    public static final ca1 t = new ca1(5);
    public static final ca1 u = new ca1(6);
    public static final ca1 v = new ca1(7);
    public static final /* synthetic */ ca1 w = new ca1(8);
    public final /* synthetic */ int n;

    public /* synthetic */ ca1(int i) {
        this.n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String lowerCase6 = "";
        switch (this.n) {
            case 0:
                ba1 ba1Var = (ba1) obj;
                ba1 ba1Var2 = (ba1) obj2;
                if (te5.B(ba1Var) && te5.B(ba1Var2)) {
                    c72 c72VarO = j51.O(ba1Var);
                    c72 c72VarO2 = j51.O(ba1Var2);
                    if (!h12.c(c72VarO, c72VarO2)) {
                        Object[] objArr = new c72[16];
                        int i = 0;
                        while (c72VarO != null) {
                            int i2 = i + 1;
                            if (objArr.length < i2) {
                                int length = objArr.length;
                                Object[] objArr2 = new Object[Math.max(i2, length * 2)];
                                System.arraycopy(objArr, 0, objArr2, 0, length);
                                objArr = objArr2;
                            }
                            if (i != 0) {
                                System.arraycopy(objArr, 0, objArr, 0 + 1, i + 0);
                            }
                            objArr[0] = c72VarO;
                            i++;
                            c72VarO = c72VarO.t();
                        }
                        Object[] objArr3 = new c72[16];
                        int i3 = 0;
                        while (c72VarO2 != null) {
                            int i4 = i3 + 1;
                            if (objArr3.length < i4) {
                                int length2 = objArr3.length;
                                Object[] objArr4 = new Object[Math.max(i4, length2 * 2)];
                                System.arraycopy(objArr3, 0, objArr4, 0, length2);
                                objArr3 = objArr4;
                            }
                            if (i3 != 0) {
                                System.arraycopy(objArr3, 0, objArr3, 0 + 1, i3 + 0);
                            }
                            objArr3[0] = c72VarO2;
                            i3++;
                            c72VarO2 = c72VarO2.t();
                        }
                        int iMin = Math.min(i - 1, i3 - 1);
                        if (iMin >= 0) {
                            int i5 = 0;
                            while (h12.c(objArr[i5], objArr3[i5])) {
                                if (i5 != iMin) {
                                    i5++;
                                }
                            }
                            return h12.j(((c72) objArr[i5]).u(), ((c72) objArr3[i5]).u());
                        }
                        kf2.o("Could not find a common ancestor between the two FocusModifiers.");
                    }
                } else {
                    if (te5.B(ba1Var)) {
                        return -1;
                    }
                    if (te5.B(ba1Var2)) {
                        return 1;
                    }
                }
                return 0;
            case 1:
                wv3 wv3VarH = ((i94) obj).h();
                wv3 wv3VarH2 = ((i94) obj2).h();
                int iCompare = Float.compare(wv3VarH.a, wv3VarH2.a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(wv3VarH.b, wv3VarH2.b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(wv3VarH.d, wv3VarH2.d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(wv3VarH.c, wv3VarH2.c);
            case 2:
                return ((wq2) obj).d.compareToIgnoreCase(((wq2) obj2).d);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return ((wq2) obj).d.compareToIgnoreCase(((wq2) obj2).d);
            case 4:
                return ((wq2) obj).d.compareToIgnoreCase(((wq2) obj2).d);
            case 5:
                c72 c72Var = (c72) obj;
                c72 c72Var2 = (c72) obj2;
                int iJ = h12.j(c72Var2.B, c72Var.B);
                return iJ != 0 ? iJ : h12.j(c72Var.hashCode(), c72Var2.hashCode());
            case 6:
                wv3 wv3VarH3 = ((i94) obj).h();
                wv3 wv3VarH4 = ((i94) obj2).h();
                int iCompare4 = Float.compare(wv3VarH4.c, wv3VarH3.c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(wv3VarH3.b, wv3VarH4.b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(wv3VarH3.d, wv3VarH4.d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(wv3VarH4.a, wv3VarH3.a);
            case 7:
                kd3 kd3Var = (kd3) obj;
                kd3 kd3Var2 = (kd3) obj2;
                int iCompare7 = Float.compare(((wv3) kd3Var.n).b, ((wv3) kd3Var2.n).b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((wv3) kd3Var.n).d, ((wv3) kd3Var2.n).d);
            case 8:
                return ((Scope) obj).o.compareTo(((Scope) obj2).o);
            case 9:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 10:
                return fu.l(Integer.valueOf(((ge) obj).b), Integer.valueOf(((ge) obj2).b));
            case 11:
                return fu.l(Integer.valueOf(((ge) obj).b), Integer.valueOf(((ge) obj2).b));
            case 12:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int iMin2 = Math.min(str.length(), str2.length());
                for (int i6 = 4; i6 < iMin2; i6++) {
                    char cCharAt = str.charAt(i6);
                    char cCharAt2 = str2.charAt(i6);
                    if (cCharAt != cCharAt2) {
                        if (h12.j(cCharAt, cCharAt2) < 0) {
                            return -1;
                        }
                        return 1;
                    }
                }
                int length3 = str.length();
                int length4 = str2.length();
                if (length3 == length4) {
                    return 0;
                }
                if (length3 < length4) {
                    return -1;
                }
                return 1;
            case 13:
                return ((y40) obj2).b() - ((y40) obj).b();
            case 14:
                return ((j50) obj).c - ((j50) obj2).c;
            case 15:
                WeakHashMap weakHashMap = j65.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case WaveRetry.MAX_FAILURES /* 16 */:
                c72 c72Var3 = (c72) obj;
                c72 c72Var4 = (c72) obj2;
                int iJ2 = h12.j(c72Var3.B, c72Var4.B);
                return iJ2 != 0 ? iJ2 : h12.j(c72Var3.hashCode(), c72Var4.hashCode());
            case 17:
                return ((wp0) obj).a - ((wp0) obj2).a;
            case 18:
                xg1 xg1Var = (xg1) obj;
                xg1 xg1Var2 = (xg1) obj2;
                RecyclerView recyclerView = xg1Var.d;
                if ((recyclerView == null) == (xg1Var2.d == null)) {
                    boolean z3 = xg1Var.a;
                    if (z3 == xg1Var2.a) {
                        int i7 = xg1Var2.b - xg1Var.b;
                        if (i7 != 0) {
                            return i7;
                        }
                        int i8 = xg1Var.c - xg1Var2.c;
                        if (i8 != 0) {
                            return i8;
                        }
                        return 0;
                    }
                    if (z3) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case 19:
                String artist = ((AlbumID3) obj).getArtist();
                if (artist != null) {
                    Locale locale = Locale.ROOT;
                    locale.getClass();
                    lowerCase = artist.toLowerCase(locale);
                    lowerCase.getClass();
                } else {
                    lowerCase = "";
                }
                String artist2 = ((AlbumID3) obj2).getArtist();
                if (artist2 != null) {
                    Locale locale2 = Locale.ROOT;
                    locale2.getClass();
                    lowerCase6 = artist2.toLowerCase(locale2);
                    lowerCase6.getClass();
                }
                return fu.l(lowerCase, lowerCase6);
            case 20:
                return fu.l(Integer.valueOf(((AlbumID3) obj).getYear()), Integer.valueOf(((AlbumID3) obj2).getYear()));
            case 21:
                return fu.l(Integer.valueOf(((AlbumID3) obj).getYear()), Integer.valueOf(((AlbumID3) obj2).getYear()));
            case 22:
                return fu.l(((AlbumID3) obj2).getCreated(), ((AlbumID3) obj).getCreated());
            case 23:
                String name = ((ArtistID3) obj).getName();
                if (name != null) {
                    Locale locale3 = Locale.ROOT;
                    locale3.getClass();
                    lowerCase2 = name.toLowerCase(locale3);
                    lowerCase2.getClass();
                } else {
                    lowerCase2 = "";
                }
                String name2 = ((ArtistID3) obj2).getName();
                if (name2 != null) {
                    Locale locale4 = Locale.ROOT;
                    locale4.getClass();
                    lowerCase6 = name2.toLowerCase(locale4);
                    lowerCase6.getClass();
                }
                return fu.l(lowerCase2, lowerCase6);
            case 24:
                String title = ((Child) obj).getTitle();
                if (title != null) {
                    Locale locale5 = Locale.ROOT;
                    locale5.getClass();
                    lowerCase3 = title.toLowerCase(locale5);
                    lowerCase3.getClass();
                } else {
                    lowerCase3 = "";
                }
                String title2 = ((Child) obj2).getTitle();
                if (title2 != null) {
                    Locale locale6 = Locale.ROOT;
                    locale6.getClass();
                    lowerCase6 = title2.toLowerCase(locale6);
                    lowerCase6.getClass();
                }
                return fu.l(lowerCase3, lowerCase6);
            case 25:
                String name3 = ((Artist) obj).getName();
                if (name3 != null) {
                    Locale locale7 = Locale.ROOT;
                    locale7.getClass();
                    lowerCase4 = name3.toLowerCase(locale7);
                    lowerCase4.getClass();
                } else {
                    lowerCase4 = "";
                }
                String name4 = ((Artist) obj2).getName();
                if (name4 != null) {
                    Locale locale8 = Locale.ROOT;
                    locale8.getClass();
                    lowerCase6 = name4.toLowerCase(locale8);
                    lowerCase6.getClass();
                }
                return fu.l(lowerCase4, lowerCase6);
            case 26:
                String name5 = ((AlbumID3) obj).getName();
                if (name5 != null) {
                    Locale locale9 = Locale.ROOT;
                    locale9.getClass();
                    lowerCase5 = name5.toLowerCase(locale9);
                    lowerCase5.getClass();
                } else {
                    lowerCase5 = "";
                }
                String name6 = ((AlbumID3) obj2).getName();
                if (name6 != null) {
                    Locale locale10 = Locale.ROOT;
                    locale10.getClass();
                    lowerCase6 = name6.toLowerCase(locale10);
                    lowerCase6.getClass();
                }
                return fu.l(lowerCase5, lowerCase6);
            case 27:
                return fu.l(Boolean.valueOf(!h12.c(((HubFavoriteSubject) obj).getProvenance(), "own")), Boolean.valueOf(!h12.c(((HubFavoriteSubject) obj2).getProvenance(), "own")));
            case 28:
                String str3 = (String) ((kd3) obj).o;
                Locale locale11 = Locale.ROOT;
                String lowerCase7 = str3.toLowerCase(locale11);
                lowerCase7.getClass();
                String lowerCase8 = ((String) ((kd3) obj2).o).toLowerCase(locale11);
                lowerCase8.getClass();
                return fu.l(lowerCase7, lowerCase8);
            default:
                return fu.l(((h52) obj).a, ((h52) obj2).a);
        }
    }
}
