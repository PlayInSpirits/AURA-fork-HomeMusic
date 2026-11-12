package defpackage;

import android.os.Build;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rr extends ip {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(xb0 xb0Var, int i) {
        super(xb0Var);
        this.b = i;
        xb0Var.getClass();
        switch (i) {
            case 2:
                super(xb0Var);
                this.c = 7;
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                super(xb0Var);
                this.c = 7;
                break;
            case 4:
                super(xb0Var);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    @Override // defpackage.jb0
    public final boolean c(dd5 dd5Var) {
        int i = this.b;
        dd5Var.getClass();
        switch (i) {
            case 0:
                return dd5Var.j.c;
            case 1:
                return dd5Var.j.e;
            case 2:
                return dd5Var.j.a == 2;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                int i2 = dd5Var.j.a;
                if (i2 != 3) {
                    return Build.VERSION.SDK_INT >= 30 && i2 == 6;
                }
                return true;
            default:
                return dd5Var.j.f;
        }
    }

    @Override // defpackage.ip
    public final int d() {
        switch (this.b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                break;
        }
        return this.c;
    }

    @Override // defpackage.ip
    public final boolean e(Object obj) {
        boolean zBooleanValue;
        switch (this.b) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                q53 q53Var = (q53) obj;
                q53Var.getClass();
                int i = Build.VERSION.SDK_INT;
                boolean z = q53Var.a;
                if (i >= 26) {
                    if (z && q53Var.b) {
                        return false;
                    }
                } else if (z) {
                    return false;
                }
                return true;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                q53 q53Var2 = (q53) obj;
                q53Var2.getClass();
                return !q53Var2.a || q53Var2.c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(sr srVar) {
        super(srVar);
        this.b = 1;
        srVar.getClass();
        this.c = 5;
    }
}
