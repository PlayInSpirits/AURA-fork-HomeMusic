package defpackage;

import java.io.File;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class l15 implements uw2 {
    public static final l15 b = new l15(0);
    public final /* synthetic */ int a;

    public /* synthetic */ l15(int i) {
        this.a = i;
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        switch (this.a) {
            case 0:
                return new tw2(new s73(obj), new pw(1, obj));
            case 1:
                File file = (File) obj;
                return new tw2(new s73(file), new pw(0, file));
            default:
                return null;
        }
    }
}
