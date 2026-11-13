package defpackage;

import android.content.Context;
import com.eddyizm.tempus.service.MediaService;
import java.util.HashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class n31 implements go4 {
    public final /* synthetic */ int n;
    public final /* synthetic */ MediaService o;

    public /* synthetic */ n31(MediaService mediaService, int i) {
        this.n = i;
        this.o = mediaService;
    }

    @Override // defpackage.go4
    public final Object get() {
        vj0 vj0Var;
        int i = this.n;
        MediaService mediaService = this.o;
        switch (i) {
            case 0:
                return new pm0(mediaService);
            case 1:
                return new dm0(mediaService, new sk0());
            case 2:
                return new pn0(jn0.F0, new rv2(25), mediaService);
            default:
                gy3 gy3Var = vj0.C;
                synchronized (vj0.class) {
                    try {
                        if (vj0.I == null) {
                            Context applicationContext = mediaService.getApplicationContext();
                            HashMap hashMap = new HashMap(8);
                            hashMap.put(0, 1000000L);
                            hashMap.put(2, -9223372036854775807L);
                            hashMap.put(3, -9223372036854775807L);
                            hashMap.put(4, -9223372036854775807L);
                            hashMap.put(5, -9223372036854775807L);
                            hashMap.put(10, -9223372036854775807L);
                            hashMap.put(9, -9223372036854775807L);
                            hashMap.put(7, -9223372036854775807L);
                            vj0.I = new vj0(applicationContext, hashMap);
                        }
                        vj0Var = vj0.I;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return vj0Var;
        }
    }
}
