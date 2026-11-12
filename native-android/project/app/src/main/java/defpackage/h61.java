package defpackage;

import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Playlist;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h61 extends si0 {
    public final /* synthetic */ int g;

    public /* synthetic */ h61(int r1) {
        this.g = r1;
    }

    @Override // defpackage.si0
    public final void k(z34 r8, Object r9) {
        switch(this.g) {
            case 0: goto L81;
            case 1: goto L52;
            case 2: goto L47;
            case 3: goto L42;
            case 4: goto L37;
            default: goto L4;
        };
    L4:
        Server r10 = (Server) r9;
        if (r10.getServerId() != null) goto L7;
        r8.e(1);
    L9:
        if (r10.getServerName() != null) goto L11;
        r8.e(2);
    L13:
        if (r10.getUsername() != null) goto L15;
        r8.e(3);
    L17:
        if (r10.getPassword() != null) goto L19;
        r8.e(4);
    L21:
        if (r10.getAddress() != null) goto L23;
        r8.e(5);
    L25:
        if (r10.getLocalAddress() != null) goto L27;
        r8.e(6);
    L28:
        r8.c(7, r10.getTimestamp());
        r8.c(8, r10.isLowSecurity() ? 1 : 0);
        if (r10.getClientCert() != null) goto L31;
        r8.e(9);
    L33:
        if (r10.getServerId() != null) goto L35;
        r8.e(10);
        return;
    L35:
        r8.r(10, r10.getServerId());
        return;
    L31:
        r8.r(9, r10.getClientCert());
        goto L33
    L27:
        r8.r(6, r10.getLocalAddress());
        goto L28
    L23:
        r8.r(5, r10.getAddress());
        goto L25
    L19:
        r8.r(4, r10.getPassword());
        goto L21
    L15:
        r8.r(3, r10.getUsername());
        goto L17
    L11:
        r8.r(2, r10.getServerName());
        goto L13
    L7:
        r8.r(1, r10.getServerId());
        goto L9
    L37:
        Server r11 = (Server) r9;
        if (r11.getServerId() != null) goto L40;
        r8.e(1);
        return;
    L40:
        r8.r(1, r11.getServerId());
        return;
    L42:
        RecentSearch r12 = (RecentSearch) r9;
        if (r12.getSearch() != null) goto L45;
        r8.e(1);
        return;
    L45:
        r8.r(1, r12.getSearch());
        return;
    L47:
        Playlist r13 = (Playlist) r9;
        if (r13.getId() != null) goto L50;
        r8.e(1);
        return;
    L50:
        r8.r(1, r13.getId());
        return;
    L52:
        InternetRadioStationCache r14 = (InternetRadioStationCache) r9;
        if (r14.getId() != null) goto L55;
        r8.e(1);
    L57:
        if (r14.getName() != null) goto L59;
        r8.e(2);
    L61:
        if (r14.getStreamUrl() != null) goto L63;
        r8.e(3);
    L65:
        if (r14.getHomePageUrl() != null) goto L67;
        r8.e(4);
    L69:
        if (r14.getSource() != null) goto L71;
        r8.e(5);
    L73:
        if (r14.getCoverArtUrl() != null) goto L75;
        r8.e(6);
    L77:
        if (r14.getId() != null) goto L79;
        r8.e(7);
        return;
    L79:
        r8.r(7, r14.getId());
        return;
    L75:
        r8.r(6, r14.getCoverArtUrl());
        goto L77
    L71:
        r8.r(5, r14.getSource());
        goto L73
    L67:
        r8.r(4, r14.getHomePageUrl());
        goto L69
    L63:
        r8.r(3, r14.getStreamUrl());
        goto L65
    L59:
        r8.r(2, r14.getName());
        goto L61
    L55:
        r8.r(1, r14.getId());
        goto L57
    L81:
        r8.c(1, ((Favorite) r9).getTimestamp());
    }

    @Override // defpackage.si0
    public final String r() {
        switch(this.g) {
            case 0: goto L14;
            case 1: goto L12;
            case 2: goto L10;
            case 3: goto L8;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        return "UPDATE OR ABORT `server` SET `id` = ?,`server_name` = ?,`username` = ?,`password` = ?,`address` = ?,`local_address` = ?,`timestamp` = ?,`low_security` = ?,`client_cert` = ? WHERE `id` = ?";
    L6:
        return "DELETE FROM `server` WHERE `id` = ?";
    L8:
        return "DELETE FROM `recent_search` WHERE `search` = ?";
    L10:
        return "DELETE FROM `playlist` WHERE `id` = ?";
    L12:
        return "UPDATE OR ABORT `internet_radio_station_cache` SET `id` = ?,`name` = ?,`stream_url` = ?,`home_page_url` = ?,`source` = ?,`cover_art_url` = ? WHERE `id` = ?";
    L14:
        return "DELETE FROM `favorite` WHERE `timestamp` = ?";
    }
}
