package defpackage;

import android.net.Uri;
import com.eddyizm.tempus.homemusic.WaveRetry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 implements n51 {
    public static final int[] h = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final rm3 i = new rm3(new mj0(2));
    public static final rm3 j = new rm3(new mj0(3));
    public int b;
    public gy3 c;
    public int f;
    public int g;
    public om0 e = new om0(1);
    public boolean d = true;

    @Override // defpackage.n51
    public final void a(om0 om0Var) {
        synchronized (this) {
            this.e = om0Var;
        }
    }

    @Override // defpackage.n51
    public final void b() {
        synchronized (this) {
        }
    }

    @Override // defpackage.n51
    public final synchronized k51[] c() {
        return e(Uri.EMPTY, new HashMap());
    }

    @Override // defpackage.n51
    public final void d(boolean z) {
        synchronized (this) {
            this.d = z;
        }
    }

    @Override // defpackage.n51
    public final synchronized k51[] e(Uri uri, Map map) {
        ArrayList arrayList;
        try {
            int[] iArr = h;
            arrayList = new ArrayList(21);
            List list = (List) map.get("Content-Type");
            int iX = h12.x((list == null || list.isEmpty()) ? null : (String) list.get(0));
            if (iX != -1) {
                f(iX, arrayList);
            }
            int iY = h12.y(uri);
            if (iY != -1 && iY != iX) {
                f(iY, arrayList);
            }
            for (int i2 = 0; i2 < 21; i2++) {
                int i3 = iArr[i2];
                if (i3 != iX && i3 != iY) {
                    f(i3, arrayList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (k51[]) arrayList.toArray(new k51[0]);
    }

    public final void f(int i2, ArrayList arrayList) {
        switch (i2) {
            case 0:
                arrayList.add(new r2());
                break;
            case 1:
                arrayList.add(new t2());
                break;
            case 2:
                arrayList.add(new h6(0));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                arrayList.add(new p9());
                break;
            case 4:
                k51 k51VarE = i.E(0);
                if (k51VarE == null) {
                    arrayList.add(new s71());
                } else {
                    arrayList.add(k51VarE);
                }
                break;
            case 5:
                arrayList.add(new n91());
                break;
            case 6:
                arrayList.add(new ni2(this.e, this.d ? 0 : 2));
                break;
            case 7:
                arrayList.add(new ky2(0));
                break;
            case 8:
                om0 om0Var = this.e;
                int i3 = this.d ? 0 : 32;
                vw1 vw1Var = yw1.o;
                arrayList.add(new oe1(om0Var, i3, null, gy3.r));
                arrayList.add(new sy2(this.e, this.b | (this.d ? 0 : 16)));
                break;
            case 9:
                arrayList.add(new i83());
                break;
            case 10:
                arrayList.add(new ur3());
                break;
            case 11:
                if (this.c == null) {
                    vw1 vw1Var2 = yw1.o;
                    this.c = gy3.r;
                }
                arrayList.add(new qy4(1, !this.d ? 1 : 0, this.e, new iu4(0L), new qn0(this.c, 0)));
                break;
            case 12:
                arrayList.add(new d95());
                break;
            case 14:
                arrayList.add(new cm0(this.f));
                break;
            case 15:
                k51 k51VarE2 = j.E(new Object[0]);
                if (k51VarE2 != null) {
                    arrayList.add(k51VarE2);
                }
                break;
            case WaveRetry.MAX_FAILURES /* 16 */:
                arrayList.add(new co(1 ^ (this.d ? 1 : 0), this.e));
                break;
            case 17:
                arrayList.add(new kt(1));
                break;
            case 18:
                arrayList.add(new go(1));
                break;
            case 19:
                arrayList.add(new kt(0));
                break;
            case 20:
                arrayList.add(new xl1(this.g));
                break;
            case 21:
                arrayList.add(new go(0));
                break;
        }
    }
}
