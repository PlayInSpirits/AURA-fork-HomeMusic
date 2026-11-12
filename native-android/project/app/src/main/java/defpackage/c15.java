package defpackage;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class c15 extends kp {
    public final int r;
    public final byte[] s;
    public final DatagramPacket t;
    public Uri u;
    public DatagramSocket v;
    public MulticastSocket w;
    public InetAddress x;
    public boolean y;
    public int z;

    public c15() {
        super(true);
        this.r = 8000;
        byte[] r1 = new byte[2000];
        this.s = r1;
        this.t = new DatagramPacket(r1, 0, 2000);
    }

    @Override // defpackage.ci0
    public final long b(ii0 r4) {
        Uri r0 = r4.a;
        this.u = r0;
        String r1 = r0.getHost();
        r1.getClass();
        int r2 = this.u.getPort();
        q(r4);
        this.x = InetAddress.getByName(r1);     // Catch: IOException -> L10 SecurityException -> L13
        InetSocketAddress r3 = new InetSocketAddress(this.x, r2);     // Catch: IOException -> L10 SecurityException -> L13
        if (this.x.isMulticastAddress() == false) goto L6;
        MulticastSocket r5 = new MulticastSocket(r3);     // Catch: IOException -> L10 SecurityException -> L13
        this.w = r5;     // Catch: IOException -> L10 SecurityException -> L13
        r5.joinGroup(this.x);     // Catch: IOException -> L10 SecurityException -> L13
        this.v = this.w;     // Catch: IOException -> L10 SecurityException -> L13
    L7:
        this.v.setSoTimeout(this.r);     // Catch: IOException -> L10 SecurityException -> L13
        this.y = true;
        r(r4);
        return -1;
    L6:
        this.v = new DatagramSocket(r3);     // Catch: IOException -> L10 SecurityException -> L13
    L10:
        e = move-exception;
        throw new UdpDataSource$UdpDataSourceException(e, 2001);
    L13:
        e = move-exception;
        throw new UdpDataSource$UdpDataSourceException(e, 2006);
    }

    @Override // defpackage.ci0
    public final void close() {
        this.u = null;
        MulticastSocket r1 = this.w;
        if (r1 != null) goto L14;
    L6:
        DatagramSocket r2 = this.v;
        if (r2 == null) goto L9;
        r2.close();
        this.v = null;
    L9:
        this.x = null;
        this.z = 0;
        if (this.y == false) goto L16;
        this.y = false;
        p();
        return;
    L16:
        return;
    L14:
        InetAddress r3 = this.x;     // Catch: IOException -> L13
        r3.getClass();     // Catch: IOException -> L13
        r1.leaveGroup(r3);     // Catch: IOException -> L13
    L5:
        this.w = null;
        goto L6
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.u;
    }

    @Override // defpackage.wh0
    public final int read(byte[] r3, int r4, int r5) {
        if (r5 != 0) goto L5;
        return 0;
    L5:
        int r0 = this.z;
        DatagramPacket r1 = this.t;
        if (r0 == 0) goto L17;
    L15:
        int r2 = r1.getLength();
        int r6 = this.z;
        int r7 = Math.min(r6, r5);
        System.arraycopy(this.s, r2 - r6, r3, r4, r7);
        this.z -= r7;
        return r7;
    L17:
        DatagramSocket r8 = this.v;     // Catch: IOException -> L9 SocketTimeoutException -> L12
        r8.getClass();     // Catch: IOException -> L9 SocketTimeoutException -> L12
        r8.receive(r1);     // Catch: IOException -> L9 SocketTimeoutException -> L12
        int r9 = r1.getLength();
        this.z = r9;
        o(r9);
        goto L15
    L12:
        e = move-exception;
        throw new UdpDataSource$UdpDataSourceException(e, 2002);
    L9:
        e = move-exception;
        throw new UdpDataSource$UdpDataSourceException(e, 2001);
    }
}
