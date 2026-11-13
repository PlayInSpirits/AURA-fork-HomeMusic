package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class ow implements t04 {
    public final /* synthetic */ int a;
    public final vs b;

    public ow(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new vs();
                break;
            default:
                this.b = new vs();
                break;
        }
    }

    @Override // defpackage.t04
    public final /* bridge */ /* synthetic */ boolean a(Object obj, db3 db3Var) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // defpackage.t04
    public final q04 b(Object obj, int i, int i2, db3 db3Var) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        int i3 = this.a;
        vs vsVar = this.b;
        switch (i3) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return vsVar.c(createSource, i, i2, db3Var);
            default:
                createSource2 = ImageDecoder.createSource(vw.b((InputStream) obj));
                return vsVar.c(createSource2, i, i2, db3Var);
        }
    }
}
