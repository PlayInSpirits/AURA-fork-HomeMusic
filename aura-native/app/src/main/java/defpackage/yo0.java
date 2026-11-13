package defpackage;

import java.util.ArrayList;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public class yo0 implements uo0 {
    public final ba5 d;
    public int f;
    public int g;
    public ba5 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public eq0 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public yo0(ba5 ba5Var) {
        this.d = ba5Var;
    }

    @Override // defpackage.uo0
    public final void a(uo0 uo0Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((yo0) obj).j) {
                return;
            }
        }
        this.c = true;
        ba5 ba5Var = this.a;
        if (ba5Var != null) {
            ba5Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        yo0 yo0Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            yo0 yo0Var2 = (yo0) obj2;
            if (!(yo0Var2 instanceof eq0)) {
                i++;
                yo0Var = yo0Var2;
            }
        }
        if (yo0Var != null && i == 1 && yo0Var.j) {
            eq0 eq0Var = this.i;
            if (eq0Var != null) {
                if (!eq0Var.j) {
                    return;
                } else {
                    this.f = this.h * eq0Var.g;
                }
            }
            d(yo0Var.g + this.f);
        }
        ba5 ba5Var2 = this.a;
        if (ba5Var2 != null) {
            ba5Var2.a(this);
        }
    }

    public final void b(ba5 ba5Var) {
        this.k.add(ba5Var);
        if (this.j) {
            ba5Var.a(ba5Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            uo0 uo0Var = (uo0) obj;
            uo0Var.a(uo0Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
