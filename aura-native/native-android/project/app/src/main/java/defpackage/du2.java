package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class du2 implements uw2 {
    public final /* synthetic */ int a;
    public final Context b;

    public du2(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return hw.s((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return hw.s(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return hw.s(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        Long l;
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new tw2(new s73(uri), new cu2(0, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new tw2(new s73(uri2), y61.b(context, uri2, new d34(2, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) db3Var.c(b55.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new tw2(new s73(uri3), y61.b(context, uri3, new zh0(1, context.getContentResolver())));
        }
    }
}
