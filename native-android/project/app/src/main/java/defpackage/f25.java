package defpackage;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import com.eddyizm.tempus.upnp.UpnpException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public final class f25 {
    public static final List c = gb.P("urn:schemas-upnp-org:device:MediaRenderer:1", "urn:schemas-upnp-org:service:AVTransport:1");
    public static final hu2 d = ve5.a("text/xml; charset=utf-8");
    public final o83 a;
    public final rp4 b;

    public f25() {
        n83 n832 = new n83();
        Object object = TimeUnit.SECONDS;
        n832.b(5L, (TimeUnit)((Object)object));
        n832.z = ze5.b(60L, object);
        n832.A = ze5.b(10L, object);
        object = new o83(n832);
        this.a = object;
        this.b = new rp4(new e25(0, this));
    }

    /*
     * Exception decompiling
     */
    public static List a(f25 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [6 : 171->280)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static String d(g25 g252) {
        String string = (String)g252.e.get("urn:schemas-upnp-org:service:AVTransport:1");
        if (string != null) {
            return string;
        }
        throw new UpnpException(501, "no AVTransport on ".concat(g252.b));
    }

    public final void b(g25 object) {
        object.getClass();
        object = f25.d((g25)object);
        for (int i16 = 1; i16 < 3; ++i16) {
            Serializable serializable;
            try {
                kd3 kd32 = new kd3("InstanceID", "0");
                serializable = new kd3("Speed", "1");
                this.h((String)object, "Play", gb.P(kd32, serializable));
                break;
            }
            catch (UpnpException upnpException) {
                int n16 = upnpException.n;
                if ((n16 == 501 || n16 == 701) && i16 != 2) {
                    serializable = new StringBuilder("play refused with ");
                    ((StringBuilder)serializable).append(n16);
                    ((StringBuilder)serializable).append(", asking again in 1000ms");
                    Log.d((String)"UpnpControlPoint", (String)((StringBuilder)serializable).toString());
                    Thread.sleep(1000L);
                    continue;
                }
                throw upnpException;
            }
        }
    }

    public final Map c(g25 g252) {
        g252.getClass();
        return this.h(f25.d(g252), "GetPositionInfo", gb.O(new kd3("InstanceID", "0")));
    }

    public final void e(g25 g252, String string) {
        g252.getClass();
        this.h(f25.d(g252), "Seek", gb.P(new kd3("InstanceID", "0"), new kd3("Unit", "REL_TIME"), new kd3("Target", string)));
    }

    public final void f(g25 g252, String string, String string2) {
        g252.getClass();
        string.getClass();
        this.h(f25.d(g252), "SetAVTransportURI", gb.P(new kd3("InstanceID", "0"), new kd3("CurrentURI", string), new kd3("CurrentURIMetaData", string2)));
    }

    public final void g(g25 g252, String string, String string2) {
        g252.getClass();
        string.getClass();
        this.h(f25.d(g252), "SetNextAVTransportURI", gb.P(new kd3("InstanceID", "0"), new kd3("NextURI", string), new kd3("NextURIMetaData", string2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Map h(String object, String object2, List object3) {
        Throwable throwable2;
        k14 k142;
        block9: {
            object3 = String.format("<?xml version=\"1.0\"?><s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:%s xmlns:u=\"%s\">%s</u:%s></s:Body></s:Envelope>", Arrays.copyOf(new Object[]{object2, "urn:schemas-upnp-org:service:AVTransport:1", q40.B0((Iterable)object3, "", null, null, new o54(22), 30), object2}, 4));
            Object object4 = new nz3();
            ((nz3)object4).d((String)object);
            object = xa3.h("\"urn:schemas-upnp-org:service:AVTransport:1#", (String)object2, "\"");
            ((nz3)object4).c.a("SOAPAction", (String)object);
            tz3.Companion.getClass();
            ((nz3)object4).b("POST", sz3.b((String)object3, d));
            object = new oz3((nz3)object4);
            object3 = this.a;
            object3.getClass();
            k142 = new bv3((o83)object3, (oz3)object).c();
            try {
                object = k142.t;
                object = object != null ? ((n14)object).string() : null;
            }
            catch (Throwable throwable2) {
                break block9;
            }
            object4 = "";
            object3 = object;
            if (object == null) {
                object3 = "";
            }
            if (k142.C) {
                object = ud3.e0((String)object3, (String)object2);
                k142.close();
                return object;
            }
            int n16 = k142.q;
            object = ud3.e0((String)object3, "");
            object2 = (String)object.get("errorCode");
            int n17 = n16;
            if (object2 != null) {
                object2 = xm4.l0((String)object2);
                n17 = n16;
                if (object2 != null) {
                    n17 = (Integer)object2;
                }
            }
            if ((object = (String)object.get("errorDescription")) == null) {
                object = object4;
            }
            object2 = new UpnpException(n17, (String)object);
            throw object2;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            q05.h(k142, throwable2);
            throw throwable3;
        }
    }
}

