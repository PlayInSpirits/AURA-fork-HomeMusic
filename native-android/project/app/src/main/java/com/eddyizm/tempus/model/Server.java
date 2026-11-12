package com.eddyizm.tempus.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b11;
import defpackage.f34;
import defpackage.h12;
import defpackage.j84;
import defpackage.xa3;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class Server implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Server> CREATOR = null;
    private final String address;
    private final String clientCert;
    private final boolean isLowSecurity;
    private final String localAddress;
    private final String password;
    private final String serverId;
    private final String serverName;
    private final long timestamp;
    private final String username;

    static {
        CREATOR = new j84(1);
    }

    public Server(String r1, String r2, String r3, String r4, String r5, String r6, long r7, boolean r9, String r10) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        r5.getClass();
        this.serverId = r1;
        this.serverName = r2;
        this.username = r3;
        this.password = r4;
        this.address = r5;
        this.localAddress = r6;
        this.timestamp = r7;
        this.isLowSecurity = r9;
        this.clientCert = r10;
    }

    public static /* synthetic */ Server copy$default(Server r0, String r1, String r2, String r3, String r4, String r5, String r6, long r7, boolean r9, String r10, int r11, Object r12) {
        if ((r11 & 1) == 0) goto L6;
        r1 = r0.serverId;
    L6:
        if ((r11 & 2) == 0) goto L9;
        r2 = r0.serverName;
    L9:
        if ((r11 & 4) == 0) goto L12;
        r3 = r0.username;
    L12:
        if ((r11 & 8) == 0) goto L15;
        r4 = r0.password;
    L15:
        if ((r11 & 16) == 0) goto L18;
        r5 = r0.address;
    L18:
        if ((r11 & 32) == 0) goto L21;
        r6 = r0.localAddress;
    L21:
        if ((r11 & 64) == 0) goto L24;
        r7 = r0.timestamp;
    L24:
        if ((r11 & 128) == 0) goto L27;
        r9 = r0.isLowSecurity;
    L27:
        if ((r11 & 256) == 0) goto L29;
        r10 = r0.clientCert;
    L29:
        long r13 = r7;
        String r8 = r5;
        String r14 = r6;
        String r15 = r3;
        String r16 = r4;
        String r17 = r1;
        String r18 = r2;
        return r0.copy(r17, r18, r15, r16, r8, r14, r13, r9, r10);
    }

    public final String component1() {
        return this.serverId;
    }

    public final String component2() {
        return this.serverName;
    }

    public final String component3() {
        return this.username;
    }

    public final String component4() {
        return this.password;
    }

    public final String component5() {
        return this.address;
    }

    public final String component6() {
        return this.localAddress;
    }

    public final long component7() {
        return this.timestamp;
    }

    public final boolean component8() {
        return this.isLowSecurity;
    }

    public final String component9() {
        return this.clientCert;
    }

    public final Server copy(String r1, String r2, String r3, String r4, String r5, String r6, long r7, boolean r9, String r10) {
        r1.getClass();
        r2.getClass();
        r3.getClass();
        r4.getClass();
        r5.getClass();
        return new Server(r1, r2, r3, r4, r5, r6, r7, r9, r10);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof Server) == true) goto L8;
        return false;
    L8:
        Server r9 = (Server) r8;
        if (h12.c(this.serverId, r9.serverId) == true) goto L12;
        return false;
    L12:
        if (h12.c(this.serverName, r9.serverName) == true) goto L15;
        return false;
    L15:
        if (h12.c(this.username, r9.username) == true) goto L18;
        return false;
    L18:
        if (h12.c(this.password, r9.password) == true) goto L21;
        return false;
    L21:
        if (h12.c(this.address, r9.address) == true) goto L24;
        return false;
    L24:
        if (h12.c(this.localAddress, r9.localAddress) == true) goto L27;
        return false;
    L27:
        if (this.timestamp == r9.timestamp) goto L30;
        return false;
    L30:
        if (this.isLowSecurity == r9.isLowSecurity) goto L33;
        return false;
    L33:
        if (h12.c(this.clientCert, r9.clientCert) == true) goto L35;
        return false;
    L35:
        return true;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getClientCert() {
        return this.clientCert;
    }

    public final String getLocalAddress() {
        return this.localAddress;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getServerId() {
        return this.serverId;
    }

    public final String getServerName() {
        return this.serverName;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        int r0 = f34.e(this.address, f34.e(this.password, f34.e(this.username, f34.e(this.serverName, this.serverId.hashCode() * 31, 31), 31), 31), 31);
        String r2 = this.localAddress;
        int r3 = 0;
        if (r2 != null) goto L5;
        int r4 = 0;
    L6:
        int r1 = xa3.c(xa3.b((r0 + r4) * 31, 31, this.timestamp), 31, this.isLowSecurity);
        String r6 = this.clientCert;
        if (r6 == null) goto L11;
        r3 = r6.hashCode();
    L11:
        return r1 + r3;
    L5:
        r4 = r2.hashCode();
        goto L6
    }

    public final boolean isLowSecurity() {
        return this.isLowSecurity;
    }

    public String toString() {
        String r0 = this.serverId;
        String r1 = this.serverName;
        String r2 = this.username;
        String r3 = this.password;
        String r4 = this.address;
        String r5 = this.localAddress;
        long r6 = this.timestamp;
        boolean r8 = this.isLowSecurity;
        String r12 = this.clientCert;
        StringBuilder r7 = b11.u("Server(serverId=", r0, ", serverName=", r1, ", username=");
        f34.n(r7, r2, ", password=", r3, ", address=");
        f34.n(r7, r4, ", localAddress=", r5, ", timestamp=");
        r7.append(r6);
        r7.append(", isLowSecurity=");
        r7.append(r8);
        r7.append(", clientCert=");
        r7.append(r12);
        r7.append(")");
        return r7.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        r3.getClass();
        r3.writeString(this.serverId);
        r3.writeString(this.serverName);
        r3.writeString(this.username);
        r3.writeString(this.password);
        r3.writeString(this.address);
        r3.writeString(this.localAddress);
        r3.writeLong(this.timestamp);
        r3.writeInt(this.isLowSecurity ? 1 : 0);
        r3.writeString(this.clientCert);
    }
}
