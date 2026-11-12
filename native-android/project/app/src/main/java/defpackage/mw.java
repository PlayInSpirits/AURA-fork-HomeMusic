package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class mw implements uw2 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ mw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uw2
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            case 2:
                return true;
            default:
                String str = (String) obj;
                return str.startsWith("http://") || str.startsWith("https://");
        }
    }

    @Override // defpackage.uw2
    public final tw2 b(Object obj, int i, int i2, db3 db3Var) {
        int i3 = this.a;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new tw2(new s73(bArr), new cu2(1, bArr, (pa) obj2));
            case 1:
                return new tw2(new s73(obj), new cu2(obj.toString(), (i80) obj2));
            case 2:
                File file = (File) obj;
                return new tw2(new s73(file), new y61(0, file, (y41) obj2));
            default:
                String str = (String) obj;
                if (str.startsWith("http://") || str.startsWith("https://")) {
                    return new tw2(new s73(str), new zu1((o83) obj2, str));
                }
                return null;
        }
    }
}
