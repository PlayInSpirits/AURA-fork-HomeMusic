package defpackage;

import android.media.session.MediaSession;
import android.os.Handler;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w52 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ x52 o;
    public final /* synthetic */ MediaSession p;
    public final /* synthetic */ int q;

    public /* synthetic */ w52(x52 x52Var, MediaSession mediaSession, int i, int i2) {
        this.n = i2;
        this.o = x52Var;
        this.p = mediaSession;
        this.q = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        int i = this.n;
        int i2 = this.q;
        MediaSession mediaSession = this.p;
        x52 x52Var = this.o;
        switch (i) {
            case 0:
                if (z52.b == x52Var && z52.a == mediaSession) {
                    Handler handler = u52.a;
                    if (u52.c().b && gb.P(1, -1).contains(Integer.valueOf(i2))) {
                        JSONObject jSONObjectPut = new JSONObject().put("command", "device_volume").put("direction", i2);
                        jSONObjectPut.getClass();
                        u52.p(jSONObjectPut, new k52(4));
                        break;
                    }
                }
                break;
            default:
                if (z52.b == x52Var && z52.a == mediaSession) {
                    Handler handler2 = u52.a;
                    if (u52.c().b) {
                        JSONObject jSONObjectPut2 = new JSONObject().put("command", "device_volume").put("level", gb.m(i2, 0, u52.c().n));
                        jSONObjectPut2.getClass();
                        u52.p(jSONObjectPut2, new k52(3));
                        break;
                    }
                }
                break;
        }
    }
}
