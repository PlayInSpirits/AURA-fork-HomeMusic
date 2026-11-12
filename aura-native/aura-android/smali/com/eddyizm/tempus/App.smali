.class public Lcom/eddyizm/tempus/App;
.super Landroid/app/Application;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static n:Lcom/eddyizm/tempus/App;

.field public static o:Landroid/content/Context;

.field public static p:Lpn4;

.field public static q:Landroid/content/SharedPreferences;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static a()Landroid/content/Context;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 12
    .line 13
    return-object v0
.end method

.method public static b()Lcom/eddyizm/tempus/App;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/App;->n:Lcom/eddyizm/tempus/App;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/eddyizm/tempus/App;

    .line 6
    .line 7
    invoke-direct {v0}, Lcom/eddyizm/tempus/App;-><init>()V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lcom/eddyizm/tempus/App;->n:Lcom/eddyizm/tempus/App;

    .line 11
    .line 12
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/App;->n:Lcom/eddyizm/tempus/App;

    .line 13
    .line 14
    return-object v0
.end method

.method public static c()Landroid/content/SharedPreferences;
    .locals 3

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/App;->q:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 6
    .line 7
    invoke-static {v0}, Lpp3;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sput-object v0, Lcom/eddyizm/tempus/App;->q:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    :cond_0
    sget-object v0, Lcom/eddyizm/tempus/App;->q:Landroid/content/SharedPreferences;

    .line 19
    .line 20
    return-object v0
.end method

.method public static d()Lpn4;
    .locals 8

    .line 1
    invoke-static {}, Lud3;->u()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lud3;->K()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {}, Lud3;->B()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "low_security"

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-static {v5, v6}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    new-instance v6, Lc12;

    .line 29
    .line 30
    const/16 v7, 0xa

    .line 31
    .line 32
    invoke-direct {v6, v7}, Lc12;-><init>(I)V

    .line 33
    .line 34
    .line 35
    iput-object v0, v6, Lc12;->o:Ljava/lang/Object;

    .line 36
    .line 37
    iput-object v1, v6, Lc12;->p:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-virtual {v6, v2, v3, v5, v4}, Lc12;->j(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v6, Lc12;->q:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, Li61;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    iget-object v0, v0, Li61;->o:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    invoke-static {v0}, Lud3;->q0(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    iget-object v0, v6, Lc12;->q:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Li61;

    .line 60
    .line 61
    iget-object v0, v0, Li61;->q:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/lang/String;

    .line 64
    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-static {v0}, Lud3;->C0(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    iget-object v0, v6, Lc12;->q:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, Li61;

    .line 73
    .line 74
    iget-object v0, v0, Li61;->p:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/lang/String;

    .line 77
    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-static {v0}, Lud3;->u0(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    new-instance v0, Lpn4;

    .line 84
    .line 85
    invoke-direct {v0, v6}, Lpn4;-><init>(Lc12;)V

    .line 86
    .line 87
    .line 88
    return-object v0
.end method

.method public static e(Ljava/lang/String;)Lpn4;
    .locals 7

    .line 1
    invoke-static {}, Lud3;->K()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Lud3;->y()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {}, Lud3;->J()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {}, Lud3;->B()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v4, "low_security"

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    invoke-static {v4, v5}, Lxa3;->u(Ljava/lang/String;Z)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    new-instance v5, Lc12;

    .line 25
    .line 26
    const/16 v6, 0xa

    .line 27
    .line 28
    invoke-direct {v5, v6}, Lc12;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iput-object p0, v5, Lc12;->o:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object v0, v5, Lc12;->p:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {v5, v1, v2, v4, v3}, Lc12;->j(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    new-instance p0, Lpn4;

    .line 39
    .line 40
    invoke-direct {p0, v5}, Lpn4;-><init>(Lc12;)V

    .line 41
    .line 42
    .line 43
    return-object p0
.end method

.method public static f(Z)Lpn4;
    .locals 1

    .line 1
    sget-object v0, Lcom/eddyizm/tempus/App;->p:Lpn4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    :cond_0
    invoke-static {}, Lcom/eddyizm/tempus/App;->d()Lpn4;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    sput-object p0, Lcom/eddyizm/tempus/App;->p:Lpn4;

    .line 12
    .line 13
    :cond_1
    sget-object p0, Lcom/eddyizm/tempus/App;->p:Lpn4;

    .line 14
    .line 15
    return-object p0
.end method


# virtual methods
.method public final onCreate()V
    .locals 7

    .line 1
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lsg0;->b:Loz;

    .line 5
    .line 6
    new-instance v1, Loz;

    .line 7
    .line 8
    invoke-direct {v1}, Loz;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v2, v0, Loz;->n:Ljava/lang/Integer;

    .line 12
    .line 13
    iput-object v2, v1, Loz;->n:Ljava/lang/Integer;

    .line 14
    .line 15
    iget-object v2, v0, Loz;->o:Ljava/lang/Class;

    .line 16
    .line 17
    iput-object v2, v1, Loz;->o:Ljava/lang/Class;

    .line 18
    .line 19
    iget-object v0, v0, Loz;->p:Ljava/lang/Class;

    .line 20
    .line 21
    iput-object v0, v1, Loz;->p:Ljava/lang/Class;

    .line 22
    .line 23
    const v0, 0x7f0802ec

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    iput-object v0, v1, Loz;->n:Ljava/lang/Integer;

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iput-object v0, v1, Loz;->p:Ljava/lang/Class;

    .line 34
    .line 35
    const-class v2, Lcom/eddyizm/tempus/ui/crash/CrashActivity;

    .line 36
    .line 37
    iput-object v2, v1, Loz;->o:Ljava/lang/Class;

    .line 38
    .line 39
    sput-object v1, Lsg0;->b:Loz;

    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-static {v1}, Lpp3;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const/4 v3, 0x0

    .line 50
    invoke-virtual {v1, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    const-string v2, "theme"

    .line 55
    .line 56
    const-string v4, "default"

    .line 57
    .line 58
    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {v1}, Ljz4;->d(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    new-instance v1, Lcom/eddyizm/tempus/App;

    .line 66
    .line 67
    invoke-direct {v1}, Lcom/eddyizm/tempus/App;-><init>()V

    .line 68
    .line 69
    .line 70
    sput-object v1, Lcom/eddyizm/tempus/App;->n:Lcom/eddyizm/tempus/App;

    .line 71
    .line 72
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sput-object p0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 77
    .line 78
    invoke-static {p0}, Lpp3;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {p0, v1, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    sput-object p0, Lcom/eddyizm/tempus/App;->q:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    sget-object p0, Lcom/eddyizm/tempus/App;->o:Landroid/content/Context;

    .line 89
    .line 90
    sget-object v1, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 91
    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    const-string v1, "Failed setting mTLS"

    .line 96
    .line 97
    const-string v2, "ClientCertManager"

    .line 98
    .line 99
    :try_start_0
    new-instance v4, Lw30;

    .line 100
    .line 101
    invoke-direct {v4, p0}, Lw30;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    const-string p0, "TLS"

    .line 105
    .line 106
    invoke-static {p0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    filled-new-array {v4}, [Lw30;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    check-cast v4, [Ljavax/net/ssl/KeyManager;

    .line 115
    .line 116
    const/4 v5, 0x1

    .line 117
    new-array v5, v5, [Ljavax/net/ssl/X509TrustManager;

    .line 118
    .line 119
    sget-object v6, Lx30;->a:Ljavax/net/ssl/X509TrustManager;

    .line 120
    .line 121
    aput-object v6, v5, v3

    .line 122
    .line 123
    check-cast v5, [Ljavax/net/ssl/TrustManager;

    .line 124
    .line 125
    invoke-virtual {p0, v4, v5, v0}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    .line 129
    .line 130
    .line 131
    move-result-object v0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/KeyManagementException; {:try_start_0 .. :try_end_0} :catch_0

    .line 132
    goto :goto_2

    .line 133
    :catch_0
    move-exception p0

    .line 134
    goto :goto_0

    .line 135
    :catch_1
    move-exception p0

    .line 136
    goto :goto_1

    .line 137
    :goto_0
    invoke-static {v2, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :goto_1
    invoke-static {v2, v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 142
    .line 143
    .line 144
    :goto_2
    sput-object v0, Lx30;->b:Ljavax/net/ssl/SSLSocketFactory;

    .line 145
    .line 146
    if-eqz v0, :cond_0

    .line 147
    .line 148
    invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V

    .line 149
    .line 150
    .line 151
    :cond_0
    return-void
.end method
