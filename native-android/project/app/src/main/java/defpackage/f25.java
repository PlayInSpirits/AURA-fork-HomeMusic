package defpackage;

import android.util.Log;
import com.eddyizm.tempus.upnp.UpnpException;
import java.io.StringReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f25 {
    public static final List c = null;
    public static final hu2 d = null;
    public final o83 a;
    public final rp4 b;

    static {
        c = gb.P(new String[]{"urn:schemas-upnp-org:device:MediaRenderer:1", "urn:schemas-upnp-org:service:AVTransport:1"});
        d = ve5.a("text/xml; charset=utf-8");
    }

    public f25() {
        n83 r0 = new n83();
        TimeUnit r3 = TimeUnit.SECONDS;
        r0.b(5, r3);
        r0.z = ze5.b(60, r3);
        r0.A = ze5.b(10, r3);
        this.a = new o83(r0);
        this.b = new rp4(new e25(0, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r3v12, types: [int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    public static List a(f25 r26) {
        r26.getClass();
        LinkedHashSet r2 = new LinkedHashSet();
        boolean r3 = false;
        DatagramSocket r4 = new DatagramSocket();     // Catch: Exception -> L26
        InetAddress r0 = InetAddress.getByName("239.255.255.250");     // Catch: Throwable -> L8 Exception -> L10
        Iterator r5 = c.iterator();     // Catch: Throwable -> L8 Exception -> L10
    L6:
        if (r5.hasNext() == false) goto L12;
        byte[] r6 = ("M-SEARCH * HTTP/1.1\r\nHOST: 239.255.255.250:1900\r\nMAN: \"ssdp:discover\"\r\nMX: 2\r\nST: " + ((String) r5.next()) + "\r\n\r\n").getBytes(w10.a);     // Catch: Throwable -> L8 Exception -> L10
        r6.getClass();     // Catch: Throwable -> L8 Exception -> L10
        r4.send(new DatagramPacket(r6, r6.length, new InetSocketAddress(r0, 1900)));     // Catch: Throwable -> L8 Exception -> L10
        goto L6
    L12:
        byte[] r7 = new byte[8192];     // Catch: Throwable -> L8 Exception -> L10
        long r8 = System.currentTimeMillis() + 3000;     // Catch: Throwable -> L8 Exception -> L10
    L13:
        if (System.currentTimeMillis() >= r8) goto L21;
        DatagramPacket r14 = new DatagramPacket(r7, 8192);     // Catch: Throwable -> L8 Exception -> L10
        r4.setSoTimeout((int) gb.n(r8 - System.currentTimeMillis(), 1, 3000));     // Catch: Throwable -> L8 Exception -> L138
        r4.receive(r14);     // Catch: Throwable -> L8 Exception -> L138
        byte[] r9 = r14.getData();     // Catch: Throwable -> L8 Exception -> L10
        r9.getClass();     // Catch: Throwable -> L8 Exception -> L10
        String r10 = ud3.Z(new String(r9, 0, r14.getLength(), w10.a));     // Catch: Throwable -> L8 Exception -> L10
        if (r10 == null) goto L13;
        r2.add(r10);     // Catch: Throwable -> L8 Exception -> L10
    L21:
        r4.close();
    L28:
        boolean r1 = r2.isEmpty();
        u01 r11 = u01.n;
        if (r1 == true) goto L197;
        ExecutorService r12 = Executors.newFixedThreadPool(Math.min(r2.size(), 8));
        ArrayList r13 = new ArrayList(r40.k0(r2, 10));     // Catch: Throwable -> L36
        Iterator r15 = r2.iterator();     // Catch: Throwable -> L36
    L34:
        if (r15.hasNext() == false) goto L38;
        r13.add(new ei0(3, (String) r15.next(), r26));     // Catch: Throwable -> L36
        goto L34
    L38:
        List r16 = r12.invokeAll(r13);     // Catch: Throwable -> L36
        r16.getClass();     // Catch: Throwable -> L36
        ArrayList r17 = new ArrayList(r40.k0(r16, 10));     // Catch: Throwable -> L36
        Iterator r18 = r16.iterator();     // Catch: Throwable -> L36
    L39:
        if (r18.hasNext() == false) goto L43;
        r17.add((kd3) ((Future) r18.next()).get());     // Catch: Throwable -> L36
        goto L39
    L43:
        r12.shutdown();
        ArrayList r19 = new ArrayList();
        HashSet r20 = new HashSet();
        int r21 = r17.size();
        int r22 = 0;
    L44:
        if (r22 >= r21) goto L135;
        r22 = r22 + 1;
        kd3 r23 = (kd3) r17.get(r22);
        String r110 = (String) r23.n;
        String r24 = (String) r23.o;
        if (r24 == null) goto L44;
        r110.getClass();
        DocumentBuilderFactory r25 = DocumentBuilderFactory.newInstance();     // Catch: Exception -> L120
        r25.setNamespaceAware(r3);     // Catch: Exception -> L120
        Element r27 = r25.newDocumentBuilder().parse(new InputSource(new StringReader(r24))).getDocumentElement();     // Catch: Exception -> L120
        r27.getClass();
        Element r28 = (Element) q40.x0(su3.p(r27, "URLBase"));
        if (r28 == null) goto L61;
        String r29 = r28.getTextContent();
        if (r29 == null) goto L61;
        String r30 = qm4.K0(r29).toString();
        if (r30 == null) goto L61;
        if (r30.length() > 0) goto L59;
        r30 = null;
    L59:
        if (r30 == null) goto L61;
    L62:
        List r31 = new ArrayList();
        NodeList r32 = r27.getElementsByTagName("device");
        int r111 = r32.getLength();
        ?? r112 = r3;
    L63:
        if (r112 >= r111) goto L119;
        Node r113 = r32.item(r112 == true ? 1 : 0);
        if ((r113 instanceof Element) == false) goto L67;
        Element r114 = (Element) r113;
    L68:
        if (r114 != null) goto L70;
        NodeList r210 = r32;
        u01 r115 = r11;
        ArrayList r116 = r17;
        boolean r117 = r3;
        int r211 = r21;
        r31 = r31;
        int r33 = r111;
        r112 = r112 == true ? 1 : 0;
    L118:
        int r118 = r112 + 1;
        r31 = r31;
        r111 = r33;
        r3 = r117;
        r11 = r115;
        r17 = r116;
        r21 = r211;
        r32 = r210;
        r112 = r118;
        goto L63
    L70:
        HashMap r119 = new HashMap();
        ArrayList r120 = su3.p(r114, "serviceList");
        ArrayList r34 = new ArrayList();
        r210 = r32;
        int r35 = r120.size();
        r115 = r11;
        int r36 = 0;
    L71:
        if (r36 >= r35) goto L85;
        Object r121 = r120.get(r36);
        int r37 = r36 + 1;
        int r212 = r35;
        ArrayList r38 = new ArrayList();
        NodeList r39 = ((Element) r121).getChildNodes();
        ArrayList r122 = r17;
        int r40 = r39.getLength();
        int r213 = r21;
        int r41 = 0;
    L73:
        if (r41 >= r40) goto L84;
        int r214 = r40;
        Node r42 = r39.item(r41);
        NodeList r215 = r39;
        if ((r42 instanceof Element) == false) goto L77;
        Element r43 = (Element) r42;
    L78:
        if (r43 != null) goto L80;
        int r216 = r41;
    L83:
        r41 = r216 + 1;
        r40 = r214;
        r39 = r215;
        goto L73
    L80:
        String r44 = r43.getTagName();
        r44.getClass();
        r216 = r41;
        if (qm4.E0(r44, ':').equals("service") == false) goto L83;
        r38.add(r43);
        goto L83
    L77:
        r43 = null;
        goto L78
    L84:
        v40.n0(r38, r34);
        r17 = r122;
        r35 = r212;
        r36 = r37;
        r21 = r213;
        goto L71
    L85:
        r116 = r17;
        r211 = r21;
        int r45 = r34.size();
        int r46 = 0;
    L86:
        if (r46 >= r45) goto L113;
        Object r47 = r34.get(r46);
        r46 = r46 + 1;
        Element r48 = (Element) r47;
        NodeList r49 = r48.getElementsByTagName("serviceType");
        if (r49.getLength() != 0) goto L90;
        String r50 = null;
    L91:
        if (r50 == null) goto L86;
        String r51 = qm4.K0(r50).toString();
        if (r51 == null) goto L86;
        NodeList r52 = r48.getElementsByTagName("controlURL");
        if (r52.getLength() != 0) goto L98;
        String r53 = null;
    L99:
        if (r53 == null) goto L86;
        String r54 = qm4.K0(r53).toString();
        if (r54 == null) goto L86;
        if (r54.length() > 0) goto L106;
        r54 = null;
    L106:
        if (r54 == null) goto L86;
        String r55 = new URI(r30).resolve(r54).toString();     // Catch: Exception -> L109
    L110:
        if (r55 == null) goto L86;
        r119.put(r51, r55);
    L109:
        r55 = null;
        goto L110
    L98:
        r53 = r52.item(0).getTextContent();
        goto L99
    L90:
        r50 = r49.item(0).getTextContent();
        goto L91
    L113:
        if (r119.isEmpty() == false) goto L115;
        r33 = r111;
        g25 r56 = null;
        r117 = false;
    L116:
        if (r56 == null) goto L118;
        r31.add(r56);
        goto L118
    L115:
        r33 = r111;
        r117 = false;
        r56 = new g25(su3.A(r114, "UDN"), su3.A(r114, "friendlyName"), su3.A(r114, "manufacturer"), su3.A(r114, "modelName"), r119, r110);
        goto L116
    L67:
        r114 = null;
        goto L68
    L119:
        u01 r123 = r11;
        ArrayList r124 = r17;
        boolean r125 = r3;
        int r217 = r21;
    L122:
        Iterator r57 = r31.iterator();
    L124:
        if (r57.hasNext() == false) goto L132;
        g25 r58 = (g25) r57.next();
        String r59 = (String) r58.e.get("urn:schemas-upnp-org:service:AVTransport:1");
        String r60 = r58.a;
        if (r59 == null) goto L124;
        if (r60.length() <= 0) goto L131;
        if (r20.add(r60) == false) goto L124;
    L131:
        r19.add(r58);
        goto L124
    L132:
        r3 = r125;
        r11 = r123;
        r17 = r124;
        r21 = r217;
    L61:
        r30 = r110;
    L120:
        e = move-exception;
        r123 = r11;
        r124 = r17;
        r125 = r3;
        r217 = r21;
        Log.w("UpnpDevice", "unparseable description from ".concat(r110), e);
        r31 = r123;
        goto L122
    L135:
        return r19;
    L36:
        th = move-exception;
        r12.shutdown();
        throw th;
    L197:
        return r11;
    L10:
        e = move-exception;
        Log.w("UpnpControlPoint", "search failed", e);     // Catch: Throwable -> L8
    L8:
        th = move-exception;
        r4.close();
        throw th;
    L26:
        e = move-exception;
        Log.w("UpnpControlPoint", "cannot open a socket to search", e);
        goto L28
    }

    public static String d(g25 r2) {
        String r0 = (String) r2.e.get("urn:schemas-upnp-org:service:AVTransport:1");
        if (r0 == null) goto L6;
        return r0;
    L6:
        throw new UpnpException(501, "no AVTransport on ".concat(r2.b));
    }

    public final void b(g25 r7) {
        r7.getClass();
        String r8 = d(r7);
        int r0 = 1;
    L4:
        if (r0 >= 3) goto L16;
        h(r8, "Play", gb.P(new kd3[]{new kd3("InstanceID", "0"), new kd3("Speed", "1")}));     // Catch: UpnpException -> L7
        return;
    L7:
        e = move-exception;
        int r3 = e.n;
        if (r3 == 501) goto L13;
        if (r3 == 701) goto L13;
    L15:
        throw e;
    L13:
        if (r0 == 2) goto L15;
        Log.d("UpnpControlPoint", "play refused with " + r3 + ", asking again in 1000ms");
        Thread.sleep(1000);
        r0 = r0 + 1;
        goto L4
    }

    public final Map c(g25 r4) {
        r4.getClass();
        return h(d(r4), "GetPositionInfo", gb.O(new kd3("InstanceID", "0")));
    }

    public final void e(g25 r5, String r6) {
        r5.getClass();
        h(d(r5), "Seek", gb.P(new kd3[]{new kd3("InstanceID", "0"), new kd3("Unit", "REL_TIME"), new kd3("Target", r6)}));
    }

    public final void f(g25 r4, String r5, String r6) {
        r4.getClass();
        r5.getClass();
        h(d(r4), "SetAVTransportURI", gb.P(new kd3[]{new kd3("InstanceID", "0"), new kd3("CurrentURI", r5), new kd3("CurrentURIMetaData", r6)}));
    }

    public final void g(g25 r4, String r5, String r6) {
        r4.getClass();
        r5.getClass();
        h(d(r4), "SetNextAVTransportURI", gb.P(new kd3[]{new kd3("InstanceID", "0"), new kd3("NextURI", r5), new kd3("NextURIMetaData", r6)}));
    }

    public final Map h(String r7, String r8, List r9) {
        String r10 = String.format("<?xml version=\"1.0\"?><s:Envelope xmlns:s=\"http://schemas.xmlsoap.org/soap/envelope/\" s:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\"><s:Body><u:%s xmlns:u=\"%s\">%s</u:%s></s:Body></s:Envelope>", Arrays.copyOf(new Object[]{r8, "urn:schemas-upnp-org:service:AVTransport:1", q40.B0(r9, "", null, null, new o54(22), 30), r8}, 4));
        nz3 r0 = new nz3();
        r0.d(r7);
        String r11 = xa3.h("\"urn:schemas-upnp-org:service:AVTransport:1#", r8, "\"");
        r0.c.a("SOAPAction", r11);
        tz3.Companion.getClass();
        r0.b("POST", sz3.b(r10, d));
        oz3 r12 = new oz3(r0);
        o83 r6 = this.a;
        r6.getClass();
        k14 r13 = new bv3(r6, r12).c();
        n14 r14 = r13.t;     // Catch: Throwable -> L7
        if (r14 == null) goto L9;
        String r15 = r14.string();     // Catch: Throwable -> L7
    L10:
        String r16 = "";
        if (r15 != null) goto L14;
        r15 = "";
    L14:
        if (r13.C == true) goto L26;
        int r17 = r13.q;     // Catch: Throwable -> L7
        Map r18 = ud3.e0(r15, "");     // Catch: Throwable -> L7
        String r1 = (String) r18.get("errorCode");     // Catch: Throwable -> L7
        if (r1 == null) goto L20;
        Integer r2 = xm4.l0(r1);     // Catch: Throwable -> L7
        if (r2 == null) goto L20;
        r17 = r2.intValue();     // Catch: Throwable -> L7
    L20:
        String r19 = (String) r18.get("errorDescription");     // Catch: Throwable -> L7
        if (r19 == null) goto L25;
        r16 = r19;
    L25:
        throw new UpnpException(r17, r16);     // Catch: Throwable -> L7
    L26:
        Map r20 = ud3.e0(r15, r8);     // Catch: Throwable -> L7
        r13.close();
        return r20;
    L9:
        r15 = null;
    L7:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        q05.h(r13, th);
        throw th;
    }
}
