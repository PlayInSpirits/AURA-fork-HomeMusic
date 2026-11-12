package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vh4 extends uk {
    public final Socket m;

    public vh4(Socket r1) {
        this.m = r1;
    }

    @Override // defpackage.uk
    public final void j() {
        Socket r5 = this.m;
        r5.close();     // Catch: AssertionError -> L5 Exception -> L10
        return;
    L5:
        e = move-exception;
        if (wr1.E(e) == false) goto L9;
        p83.a.log(Level.WARNING, "Failed to close timed out socket " + r5, e);
        return;
    L9:
        throw e;
    L10:
        e = move-exception;
        p83.a.log(Level.WARNING, "Failed to close timed out socket " + r5, e);
    }

    public final IOException k(IOException r2) {
        SocketTimeoutException r1 = new SocketTimeoutException("timeout");
        if (r2 == null) goto L5;
        r1.initCause(r2);
    L5:
        return r1;
    }
}
