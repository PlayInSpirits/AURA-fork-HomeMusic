package defpackage;

import android.content.Context;
import com.bumptech.glide.a;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements xr0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vy1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.xr0
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ty1) obj2).a.j((qy1) obj);
                break;
            case 1:
                ((z82) obj2).p.k(obj);
                break;
            case 2:
                a.c((Context) obj2).q((i73) obj);
                break;
            default:
                a.c((Context) obj2).q((i73) obj);
                break;
        }
    }
}
