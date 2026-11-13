.class public final Ldefpackage/w30;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljavax/net/ssl/X509KeyManager;


# instance fields
.field public final synthetic a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/w30;->a:Landroid/content/Context;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final chooseClientAlias([Ljava/lang/String;[Ljava/security/Principal;Ljava/net/Socket;)Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "client_cert"

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-static {p0, p1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    invoke-static {}, Ldefpackage/ud3;->D()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    if-nez p2, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-virtual {p2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-eqz p3, :cond_2

    .line 27
    .line 28
    invoke-virtual {p3}, Ljava/net/Socket;->getInetAddress()Ljava/net/InetAddress;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    if-eqz p3, :cond_2

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/net/InetAddress;->getHostName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    move-object p3, p1

    .line 40
    :goto_0
    invoke-static {p2, p3}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-eqz p2, :cond_3

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_3
    :goto_1
    return-object p1
.end method

.method public final bridge synthetic chooseServerAlias(Ljava/lang/String;[Ljava/security/Principal;Ljava/net/Socket;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getCertificateChain(Ljava/lang/String;)[Ljava/security/cert/X509Certificate;
    .locals 2

    .line 1
    const-string v0, "client_cert"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/w30;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroid/security/KeyChain;->getCertificateChain(Landroid/content/Context;Ljava/lang/String;)[Ljava/security/cert/X509Certificate;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    return-object v1
.end method

.method public final bridge synthetic getClientAliases(Ljava/lang/String;[Ljava/security/Principal;)[Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final getPrivateKey(Ljava/lang/String;)Ljava/security/PrivateKey;
    .locals 2

    .line 1
    const-string v0, "client_cert"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Ldefpackage/b11;->m(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-static {p1, v0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Ldefpackage/w30;->a:Landroid/content/Context;

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroid/security/KeyChain;->getPrivateKey(Landroid/content/Context;Ljava/lang/String;)Ljava/security/PrivateKey;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    return-object v1
.end method

.method public final bridge synthetic getServerAliases(Ljava/lang/String;[Ljava/security/Principal;)[Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
