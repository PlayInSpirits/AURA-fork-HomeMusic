package defpackage;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ps0 implements if1 {
    public final /* synthetic */ int n;
    public final /* synthetic */ String o;
    public final /* synthetic */ String p;

    public /* synthetic */ ps0(int i, String str, String str2) {
        this.n = i;
        this.o = str;
        this.p = str2;
    }

    @Override // defpackage.if1
    public final Object invoke(Object obj) throws Exception {
        int i = this.n;
        Boolean boolValueOf = null;
        String str = this.p;
        String str2 = this.o;
        x34 x34Var = (x34) obj;
        switch (i) {
            case 0:
                z34 z34VarU = x34Var.U("SELECT COUNT(*) FROM download WHERE album_id = ? AND NULLIF(album_artist, '') IS NULL AND NULLIF(album, '') <> ? AND download_state = 1");
                try {
                    if (str2 == null) {
                        z34VarU.e(1);
                    } else {
                        z34VarU.r(1, str2);
                    }
                    z34VarU.r(2, str);
                    Integer numValueOf = Integer.valueOf(z34VarU.O() ? (int) z34VarU.getLong(0) : 0);
                    z34VarU.close();
                    return numValueOf;
                } catch (Throwable th) {
                    z34VarU.close();
                    throw th;
                }
            case 1:
                z34 z34VarU2 = x34Var.U("UPDATE playlist SET name = ? WHERE id = ?");
                try {
                    if (str2 == null) {
                        z34VarU2.e(1);
                    } else {
                        z34VarU2.r(1, str2);
                    }
                    if (str == null) {
                        z34VarU2.e(2);
                    } else {
                        z34VarU2.r(2, str);
                    }
                    z34VarU2.O();
                    z34VarU2.close();
                    return null;
                } catch (Throwable th2) {
                    z34VarU2.close();
                    throw th2;
                }
            case 2:
                z34 z34VarU3 = x34Var.U("SELECT EXISTS(SELECT 1 FROM synced_playlist WHERE playlistId = ? AND serverId = ?)");
                try {
                    if (str2 == null) {
                        z34VarU3.e(1);
                    } else {
                        z34VarU3.r(1, str2);
                    }
                    z34VarU3.r(2, str);
                    if (z34VarU3.O()) {
                        Integer numValueOf2 = z34VarU3.isNull(0) ? null : Integer.valueOf((int) z34VarU3.getLong(0));
                        if (numValueOf2 != null) {
                            boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                            break;
                        }
                    }
                    z34VarU3.close();
                    return boolValueOf;
                } catch (Throwable th3) {
                    z34VarU3.close();
                    throw th3;
                }
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                z34 z34VarU4 = x34Var.U("DELETE FROM synced_playlist WHERE playlistId = ? AND serverId = ?");
                try {
                    if (str2 == null) {
                        z34VarU4.e(1);
                    } else {
                        z34VarU4.r(1, str2);
                    }
                    if (str == null) {
                        z34VarU4.e(2);
                    } else {
                        z34VarU4.r(2, str);
                    }
                    z34VarU4.O();
                    z34VarU4.close();
                    return null;
                } catch (Throwable th4) {
                    z34VarU4.close();
                    throw th4;
                }
            default:
                z34 z34VarU5 = x34Var.U("INSERT OR IGNORE INTO synced_playlist (playlistId, serverId) VALUES (?, ?)");
                try {
                    if (str2 == null) {
                        z34VarU5.e(1);
                    } else {
                        z34VarU5.r(1, str2);
                    }
                    z34VarU5.r(2, str);
                    z34VarU5.O();
                    z34VarU5.close();
                    return null;
                } catch (Throwable th5) {
                    z34VarU5.close();
                    throw th5;
                }
        }
    }
}
