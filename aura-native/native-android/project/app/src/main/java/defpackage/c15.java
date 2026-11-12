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
        byte[] bArr = new byte[2000];
        this.s = bArr;
        this.t = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // defpackage.ci0
    public final long b(ii0 ii0Var) throws UdpDataSource$UdpDataSourceException {
        Uri uri = ii0Var.a;
        this.u = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.u.getPort();
        q(ii0Var);
        try {
            this.x = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.x, port);
            if (this.x.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.w = multicastSocket;
                multicastSocket.joinGroup(this.x);
                this.v = this.w;
            } else {
                this.v = new DatagramSocket(inetSocketAddress);
            }
            this.v.setSoTimeout(this.r);
            this.y = true;
            r(ii0Var);
            return -1L;
        } catch (IOException e) {
            throw new UdpDataSource$UdpDataSourceException(e, 2001);
        } catch (SecurityException e2) {
            throw new UdpDataSource$UdpDataSourceException(e2, 2006);
        }
    }

    @Override // defpackage.ci0
    public final void close() {
        this.u = null;
        MulticastSocket multicastSocket = this.w;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.x;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.w = null;
        }
        DatagramSocket datagramSocket = this.v;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.v = null;
        }
        this.x = null;
        this.z = 0;
        if (this.y) {
            this.y = false;
            p();
        }
    }

    @Override // defpackage.ci0
    public final Uri m() {
        return this.u;
    }

    @Override // defpackage.wh0
    public final int read(byte[] bArr, int i, int i2) throws UdpDataSource$UdpDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.z;
        DatagramPacket datagramPacket = this.t;
        if (i3 == 0) {
            try {
                DatagramSocket datagramSocket = this.v;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.z = length;
                o(length);
            } catch (SocketTimeoutException e) {
                throw new UdpDataSource$UdpDataSourceException(e, 2002);
            } catch (IOException e2) {
                throw new UdpDataSource$UdpDataSourceException(e2, 2001);
            }
        }
        int length2 = datagramPacket.getLength();
        int i4 = this.z;
        int iMin = Math.min(i4, i2);
        System.arraycopy(this.s, length2 - i4, bArr, i, iMin);
        this.z -= iMin;
        return iMin;
    }
}
