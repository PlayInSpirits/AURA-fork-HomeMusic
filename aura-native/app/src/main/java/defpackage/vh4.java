package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class vh4 extends uk {
    public final Socket m;

    public vh4(Socket socket) {
        this.m = socket;
    }

    @Override // defpackage.uk
    public final void j() {
        Socket socket = this.m;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!wr1.E(e)) {
                throw e;
            }
            p83.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            p83.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
