package defpackage;

import com.eddyizm.tempus.model.Favorite;
import com.eddyizm.tempus.model.InternetRadioStationCache;
import com.eddyizm.tempus.model.RecentSearch;
import com.eddyizm.tempus.model.Server;
import com.eddyizm.tempus.subsonic.models.Playlist;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class h61 extends si0 {
    public final /* synthetic */ int g;

    public /* synthetic */ h61(int i) {
        this.g = i;
    }

    @Override // defpackage.si0
    public final void k(z34 z34Var, Object obj) {
        switch (this.g) {
            case 0:
                z34Var.c(1, ((Favorite) obj).getTimestamp());
                break;
            case 1:
                InternetRadioStationCache internetRadioStationCache = (InternetRadioStationCache) obj;
                if (internetRadioStationCache.getId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, internetRadioStationCache.getId());
                }
                if (internetRadioStationCache.getName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, internetRadioStationCache.getName());
                }
                if (internetRadioStationCache.getStreamUrl() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, internetRadioStationCache.getStreamUrl());
                }
                if (internetRadioStationCache.getHomePageUrl() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, internetRadioStationCache.getHomePageUrl());
                }
                if (internetRadioStationCache.getSource() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, internetRadioStationCache.getSource());
                }
                if (internetRadioStationCache.getCoverArtUrl() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, internetRadioStationCache.getCoverArtUrl());
                }
                if (internetRadioStationCache.getId() != null) {
                    z34Var.r(7, internetRadioStationCache.getId());
                } else {
                    z34Var.e(7);
                }
                break;
            case 2:
                Playlist playlist = (Playlist) obj;
                if (playlist.getId() != null) {
                    z34Var.r(1, playlist.getId());
                } else {
                    z34Var.e(1);
                }
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                RecentSearch recentSearch = (RecentSearch) obj;
                if (recentSearch.getSearch() != null) {
                    z34Var.r(1, recentSearch.getSearch());
                } else {
                    z34Var.e(1);
                }
                break;
            case 4:
                Server server = (Server) obj;
                if (server.getServerId() != null) {
                    z34Var.r(1, server.getServerId());
                } else {
                    z34Var.e(1);
                }
                break;
            default:
                Server server2 = (Server) obj;
                if (server2.getServerId() == null) {
                    z34Var.e(1);
                } else {
                    z34Var.r(1, server2.getServerId());
                }
                if (server2.getServerName() == null) {
                    z34Var.e(2);
                } else {
                    z34Var.r(2, server2.getServerName());
                }
                if (server2.getUsername() == null) {
                    z34Var.e(3);
                } else {
                    z34Var.r(3, server2.getUsername());
                }
                if (server2.getPassword() == null) {
                    z34Var.e(4);
                } else {
                    z34Var.r(4, server2.getPassword());
                }
                if (server2.getAddress() == null) {
                    z34Var.e(5);
                } else {
                    z34Var.r(5, server2.getAddress());
                }
                if (server2.getLocalAddress() == null) {
                    z34Var.e(6);
                } else {
                    z34Var.r(6, server2.getLocalAddress());
                }
                z34Var.c(7, server2.getTimestamp());
                z34Var.c(8, server2.isLowSecurity() ? 1L : 0L);
                if (server2.getClientCert() == null) {
                    z34Var.e(9);
                } else {
                    z34Var.r(9, server2.getClientCert());
                }
                if (server2.getServerId() != null) {
                    z34Var.r(10, server2.getServerId());
                } else {
                    z34Var.e(10);
                }
                break;
        }
    }

    @Override // defpackage.si0
    public final String r() {
        switch (this.g) {
            case 0:
                return "DELETE FROM `favorite` WHERE `timestamp` = ?";
            case 1:
                return "UPDATE OR ABORT `internet_radio_station_cache` SET `id` = ?,`name` = ?,`stream_url` = ?,`home_page_url` = ?,`source` = ?,`cover_art_url` = ? WHERE `id` = ?";
            case 2:
                return "DELETE FROM `playlist` WHERE `id` = ?";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "DELETE FROM `recent_search` WHERE `search` = ?";
            case 4:
                return "DELETE FROM `server` WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `server` SET `id` = ?,`server_name` = ?,`username` = ?,`password` = ?,`address` = ?,`local_address` = ?,`timestamp` = ?,`low_security` = ?,`client_cert` = ? WHERE `id` = ?";
        }
    }
}
