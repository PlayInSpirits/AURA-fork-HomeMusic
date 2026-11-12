package defpackage;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class qz3 extends tz3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hu2 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qz3(hu2 hu2Var, Object obj, int i) {
        this.a = i;
        this.b = hu2Var;
        this.c = obj;
    }

    @Override // defpackage.tz3
    public long contentLength() {
        switch (this.a) {
            case 0:
                return ((File) this.c).length();
            case 1:
            default:
                return super.contentLength();
            case 2:
                return ((yw) this.c).d();
        }
    }

    @Override // defpackage.tz3
    public final hu2 contentType() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    @Override // defpackage.tz3
    public boolean isOneShot() {
        switch (this.a) {
            case 1:
                return true;
            default:
                return super.isOneShot();
        }
    }

    @Override // defpackage.tz3
    public final void writeTo(ew ewVar) throws IOException {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        ewVar.getClass();
        switch (i) {
            case 0:
                File file = (File) obj;
                Logger logger = p83.a;
                file.getClass();
                tk tkVar = new tk(i2, new FileInputStream(file), fu4.d);
                try {
                    ewVar.p(tkVar);
                    tkVar.close();
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q05.h(tkVar, th);
                        throw th2;
                    }
                }
            case 1:
                FileInputStream fileInputStream = new FileInputStream((FileDescriptor) obj);
                try {
                    tv tvVarA = ewVar.a();
                    Logger logger2 = p83.a;
                    tvVarA.p(new tk(i2, fileInputStream, new fu4()));
                    fileInputStream.close();
                    return;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        q05.h(fileInputStream, th3);
                        throw th4;
                    }
                }
            default:
                ewVar.A((yw) obj);
                return;
        }
    }
}
