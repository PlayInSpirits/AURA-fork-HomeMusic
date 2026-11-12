package defpackage;

import android.net.NetworkRequest;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Set;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class vo0 extends rx1 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(s24 s24Var) {
        super(s24Var);
        this.d = 1;
        s24Var.getClass();
    }

    @Override // defpackage.rx1
    public final String e() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public final void l(df1 df1Var, Object obj) throws IOException {
        int i;
        int i2;
        int[] iArrP0;
        int[] iArrP1;
        byte[] byteArray;
        byte[] byteArray2;
        int i3 = 3;
        switch (this.d) {
            case 0:
                to0 to0Var = (to0) obj;
                df1Var.h(1, to0Var.a);
                df1Var.h(2, to0Var.b);
                return;
            case 1:
                fp3 fp3Var = (fp3) obj;
                df1Var.h(1, fp3Var.a);
                df1Var.c(2, fp3Var.b.longValue());
                return;
            case 2:
                zp4 zp4Var = (zp4) obj;
                df1Var.h(1, zp4Var.a);
                df1Var.c(2, zp4Var.b);
                df1Var.c(3, zp4Var.c);
                return;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                wc5 wc5Var = (wc5) obj;
                df1Var.h(1, wc5Var.a);
                df1Var.h(2, wc5Var.b);
                return;
            case 4:
                throw new ClassCastException();
            case 5:
                dd5 dd5Var = (dd5) obj;
                df1Var.h(1, dd5Var.a);
                df1Var.c(2, uc5.X(dd5Var.b));
                df1Var.h(3, dd5Var.c);
                df1Var.h(4, dd5Var.d);
                oh0 oh0Var = dd5Var.e;
                oh0 oh0Var2 = oh0.b;
                df1Var.x(5, bu.E(oh0Var));
                df1Var.x(6, bu.E(dd5Var.f));
                df1Var.c(7, dd5Var.g);
                df1Var.c(8, dd5Var.h);
                df1Var.c(9, dd5Var.i);
                df1Var.c(10, dd5Var.k);
                int i4 = dd5Var.l;
                if (i4 == 0) {
                    throw null;
                }
                int iW = xa3.w(i4);
                if (iW == 0) {
                    i = 0;
                } else {
                    if (iW != 1) {
                        er1.n();
                        return;
                    }
                    i = 1;
                }
                df1Var.c(11, i);
                df1Var.c(12, dd5Var.m);
                df1Var.c(13, dd5Var.n);
                df1Var.c(14, dd5Var.o);
                df1Var.c(15, dd5Var.p);
                df1Var.c(16, dd5Var.q ? 1L : 0L);
                int i5 = dd5Var.r;
                if (i5 == 0) {
                    throw null;
                }
                int iW2 = xa3.w(i5);
                if (iW2 == 0) {
                    i2 = 0;
                } else {
                    if (iW2 != 1) {
                        er1.n();
                        return;
                    }
                    i2 = 1;
                }
                df1Var.c(17, i2);
                df1Var.c(18, dd5Var.s);
                df1Var.c(19, dd5Var.t);
                df1Var.c(20, dd5Var.u);
                df1Var.c(21, dd5Var.v);
                df1Var.c(22, dd5Var.w);
                String str = dd5Var.x;
                if (str == null) {
                    df1Var.e(23);
                } else {
                    df1Var.h(23, str);
                }
                mc0 mc0Var = dd5Var.j;
                int i6 = mc0Var.a;
                if (i6 == 0) {
                    throw null;
                }
                int iW3 = xa3.w(i6);
                if (iW3 == 0) {
                    i3 = 0;
                } else if (iW3 == 1) {
                    i3 = 1;
                } else if (iW3 == 2) {
                    i3 = 2;
                } else if (iW3 != 3) {
                    if (iW3 == 4) {
                        i3 = 4;
                    } else if (Build.VERSION.SDK_INT < 30 || i6 != 6) {
                        nz2.t(b11.y(i6), " to int", "Could not convert ");
                        i3 = 0;
                    } else {
                        i3 = 5;
                    }
                }
                df1Var.c(24, i3);
                o53 o53Var = mc0Var.b;
                o53Var.getClass();
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 28) {
                    byteArray = new byte[0];
                } else {
                    NetworkRequest networkRequest = (NetworkRequest) o53Var.a;
                    if (networkRequest == null) {
                        byteArray = new byte[0];
                    } else {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                            try {
                                if (i7 >= 31) {
                                    iArrP0 = networkRequest.getTransportTypes();
                                    iArrP0.getClass();
                                } else {
                                    int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
                                    ArrayList arrayList = new ArrayList();
                                    for (int i8 = 0; i8 < 9; i8++) {
                                        int i9 = iArr[i8];
                                        if (networkRequest.hasTransport(i9)) {
                                            arrayList.add(Integer.valueOf(i9));
                                        }
                                    }
                                    iArrP0 = q40.P0(arrayList);
                                }
                                if (Build.VERSION.SDK_INT >= 31) {
                                    iArrP1 = networkRequest.getCapabilities();
                                    iArrP1.getClass();
                                } else {
                                    int[] iArr2 = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
                                    ArrayList arrayList2 = new ArrayList();
                                    for (int i10 = 0; i10 < 29; i10++) {
                                        int i11 = iArr2[i10];
                                        if (networkRequest.hasCapability(i11)) {
                                            arrayList2.add(Integer.valueOf(i11));
                                        }
                                    }
                                    iArrP1 = q40.P0(arrayList2);
                                }
                                objectOutputStream.writeInt(iArrP0.length);
                                for (int i12 : iArrP0) {
                                    objectOutputStream.writeInt(i12);
                                }
                                objectOutputStream.writeInt(iArrP1.length);
                                for (int i13 : iArrP1) {
                                    objectOutputStream.writeInt(i13);
                                }
                                objectOutputStream.close();
                                byteArrayOutputStream.close();
                                byteArray = byteArrayOutputStream.toByteArray();
                                byteArray.getClass();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    q05.h(objectOutputStream, th);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                q05.h(byteArrayOutputStream, th3);
                                throw th4;
                            }
                        }
                    }
                }
                df1Var.x(25, byteArray);
                df1Var.c(26, mc0Var.c ? 1L : 0L);
                df1Var.c(27, mc0Var.d ? 1L : 0L);
                df1Var.c(28, mc0Var.e ? 1L : 0L);
                df1Var.c(29, mc0Var.f ? 1L : 0L);
                df1Var.c(30, mc0Var.g);
                df1Var.c(31, mc0Var.h);
                Set<lc0> set = mc0Var.i;
                set.getClass();
                if (set.isEmpty()) {
                    byteArray2 = new byte[0];
                } else {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream2);
                        try {
                            objectOutputStream2.writeInt(set.size());
                            for (lc0 lc0Var : set) {
                                objectOutputStream2.writeUTF(lc0Var.a.toString());
                                objectOutputStream2.writeBoolean(lc0Var.b);
                            }
                            objectOutputStream2.close();
                            byteArrayOutputStream2.close();
                            byteArray2 = byteArrayOutputStream2.toByteArray();
                            byteArray2.getClass();
                        } catch (Throwable th5) {
                            try {
                                throw th5;
                            } catch (Throwable th6) {
                                q05.h(objectOutputStream2, th5);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            q05.h(byteArrayOutputStream2, th7);
                            throw th8;
                        }
                    }
                }
                df1Var.x(32, byteArray2);
                return;
            default:
                gd5 gd5Var = (gd5) obj;
                df1Var.h(1, gd5Var.a);
                df1Var.h(2, gd5Var.b);
                return;
        }
    }

    public final void m(Object obj) {
        df1 df1VarA = a();
        try {
            l(df1VarA, obj);
            df1VarA.o.executeInsert();
        } finally {
            h(df1VarA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vo0(s24 s24Var, int i) {
        super(s24Var);
        this.d = i;
    }
}
