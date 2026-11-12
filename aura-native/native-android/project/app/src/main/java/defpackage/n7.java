package defpackage;

import com.eddyizm.tempus.homemusic.WaveRetry;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n7 implements Comparator {
    public final /* synthetic */ int n;

    public /* synthetic */ n7(int i) {
        this.n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.n) {
            case 0:
                return ((Date) obj).compareTo((Date) obj2);
            case 1:
                return h12.j(((gq3) obj2).a, ((gq3) obj).a);
            case 2:
                return ((tb1) obj2).j - ((tb1) obj).j;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Integer.compare(((f00) obj2).b, ((f00) obj).b);
            case 4:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 5:
                return Integer.compare(((gn0) ((List) obj).get(0)).s, ((gn0) ((List) obj2).get(0)).s);
            case 6:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i = 9;
                int i2 = 10;
                return t60.f(on0.c((on0) Collections.max(list, new n7(i)), (on0) Collections.max(list2, new n7(i)))).a(list.size(), list2.size()).b((on0) Collections.max(list, new n7(i2)), (on0) Collections.max(list2, new n7(i2)), new n7(i2)).e();
            case 7:
                return ((fn0) Collections.max((List) obj)).compareTo((fn0) Collections.max((List) obj2));
            case 8:
                return ((ln0) ((List) obj).get(0)).compareTo((ln0) ((List) obj2).get(0));
            case 9:
                return on0.c((on0) obj, (on0) obj2);
            case 10:
                on0 on0Var = (on0) obj;
                on0 on0Var2 = (on0) obj2;
                boolean z = on0Var.r;
                int i3 = on0Var.w;
                gb3 gb3VarA = (z && on0Var.u) ? pn0.k : pn0.k.a();
                boolean z2 = on0Var.s.F;
                v60 v60VarB = v60.a;
                if (z2) {
                    v60VarB = v60VarB.b(Integer.valueOf(i3), Integer.valueOf(on0Var2.w), pn0.k.a());
                }
                return v60VarB.b(Integer.valueOf(on0Var.x), Integer.valueOf(on0Var2.x), gb3VarA).b(Integer.valueOf(i3), Integer.valueOf(on0Var2.w), gb3VarA).e();
            case 11:
                return Long.compare(((ns0) obj).c, ((ns0) obj2).c);
            case 12:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    byte b = bArr[i4];
                    byte b2 = bArr2[i4];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 13:
                return h12.j(((o12) obj).b, ((o12) obj2).b);
            case 14:
                return ((qm1) obj).a.compareTo(((qm1) obj2).a);
            case 15:
                j02 j02Var = (j02) obj;
                j02 j02Var2 = (j02) obj2;
                return (j02Var.o - j02Var.n) - (j02Var2.o - j02Var2.n);
            case WaveRetry.MAX_FAILURES /* 16 */:
                c72 c72Var = (c72) obj;
                c72 c72Var2 = (c72) obj2;
                float f = c72Var.R.p.O;
                float f2 = c72Var2.R.p.O;
                return f == f2 ? h12.j(c72Var.u(), c72Var2.u()) : Float.compare(f, f2);
            case 17:
                te4 te4Var = (te4) obj;
                te4 te4Var2 = (te4) obj2;
                long j = te4Var.s;
                long j2 = te4Var2.s;
                if (j - j2 == 0) {
                    return te4Var.compareTo(te4Var2);
                }
                return j < j2 ? -1 : 1;
            case 18:
                Child child = (Child) obj;
                Child child2 = (Child) obj2;
                if (child.isDir() && child2.isDir()) {
                    return (child.getTitle() != null ? child.getTitle() : "").compareToIgnoreCase(child2.getTitle() != null ? child2.getTitle() : "");
                }
                if (child.isDir() || child2.isDir()) {
                    return child.isDir() ? -1 : 1;
                }
                return Integer.compare(child.getTrack() != null ? child.getTrack().intValue() : 0, child2.getTrack() != null ? child2.getTrack().intValue() : 0);
            case 19:
                return ((Number) r94.b.invoke(obj, obj2)).intValue();
            case 20:
                return ((eg4) obj).a - ((eg4) obj2).a;
            case 21:
                return Float.compare(((eg4) obj).c, ((eg4) obj2).c);
            case 22:
                return ((Double) obj).compareTo((Double) obj2);
            case 23:
                return Integer.compare(((s95) obj).a.b, ((s95) obj2).a.b);
            default:
                return Long.compare(((r95) obj).b, ((r95) obj2).b);
        }
    }
}
