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
    public static final Parcelable.Creator<Server> CREATOR = new j84(1);
    private final String address;
    private final String clientCert;
    private final boolean isLowSecurity;
    private final String localAddress;
    private final String password;
    private final String serverId;
    private final String serverName;
    private final long timestamp;
    private final String username;

    public Server(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.serverId = str;
        this.serverName = str2;
        this.username = str3;
        this.password = str4;
        this.address = str5;
        this.localAddress = str6;
        this.timestamp = j;
        this.isLowSecurity = z;
        this.clientCert = str7;
    }

    public static /* synthetic */ Server copy$default(Server server, String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = server.serverId;
        }
        if ((i & 2) != 0) {
            str2 = server.serverName;
        }
        if ((i & 4) != 0) {
            str3 = server.username;
        }
        if ((i & 8) != 0) {
            str4 = server.password;
        }
        if ((i & 16) != 0) {
            str5 = server.address;
        }
        if ((i & 32) != 0) {
            str6 = server.localAddress;
        }
        if ((i & 64) != 0) {
            j = server.timestamp;
        }
        if ((i & 128) != 0) {
            z = server.isLowSecurity;
        }
        if ((i & 256) != 0) {
            str7 = server.clientCert;
        }
        long j2 = j;
        String str8 = str5;
        String str9 = str6;
        String str10 = str3;
        String str11 = str4;
        return server.copy(str, str2, str10, str11, str8, str9, j2, z, str7);
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

    public final Server copy(String str, String str2, String str3, String str4, String str5, String str6, long j, boolean z, String str7) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        return new Server(str, str2, str3, str4, str5, str6, j, z, str7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Server)) {
            return false;
        }
        Server server = (Server) obj;
        return h12.c(this.serverId, server.serverId) && h12.c(this.serverName, server.serverName) && h12.c(this.username, server.username) && h12.c(this.password, server.password) && h12.c(this.address, server.address) && h12.c(this.localAddress, server.localAddress) && this.timestamp == server.timestamp && this.isLowSecurity == server.isLowSecurity && h12.c(this.clientCert, server.clientCert);
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
        int iE = f34.e(this.address, f34.e(this.password, f34.e(this.username, f34.e(this.serverName, this.serverId.hashCode() * 31, 31), 31), 31), 31);
        String str = this.localAddress;
        int iC = xa3.c(xa3.b((iE + (str == null ? 0 : str.hashCode())) * 31, 31, this.timestamp), 31, this.isLowSecurity);
        String str2 = this.clientCert;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isLowSecurity() {
        return this.isLowSecurity;
    }

    public String toString() {
        String str = this.serverId;
        String str2 = this.serverName;
        String str3 = this.username;
        String str4 = this.password;
        String str5 = this.address;
        String str6 = this.localAddress;
        long j = this.timestamp;
        boolean z = this.isLowSecurity;
        String str7 = this.clientCert;
        StringBuilder sbU = b11.u("Server(serverId=", str, ", serverName=", str2, ", username=");
        f34.n(sbU, str3, ", password=", str4, ", address=");
        f34.n(sbU, str5, ", localAddress=", str6, ", timestamp=");
        sbU.append(j);
        sbU.append(", isLowSecurity=");
        sbU.append(z);
        sbU.append(", clientCert=");
        sbU.append(str7);
        sbU.append(")");
        return sbU.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.serverId);
        parcel.writeString(this.serverName);
        parcel.writeString(this.username);
        parcel.writeString(this.password);
        parcel.writeString(this.address);
        parcel.writeString(this.localAddress);
        parcel.writeLong(this.timestamp);
        parcel.writeInt(this.isLowSecurity ? 1 : 0);
        parcel.writeString(this.clientCert);
    }
}
