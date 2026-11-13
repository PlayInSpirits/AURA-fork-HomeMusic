.class public final Ldefpackage/rr1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Ldefpackage/rr1;

.field public static final b:Ldefpackage/hu2;

.field public static final c:Ldefpackage/nk1;

.field public static final d:Ldefpackage/si1;

.field public static final e:Ljava/lang/ThreadLocal;

.field public static final f:Ldefpackage/rp4;

.field public static final g:Ldefpackage/rp4;

.field public static final h:Ldefpackage/rp4;

.field public static volatile i:Ljava/lang/String;

.field public static volatile j:J

.field public static volatile k:Ljava/lang/String;

.field public static volatile l:J

.field public static volatile m:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldefpackage/rr1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldefpackage/rr1;->a:Ldefpackage/rr1;

    .line 7
    .line 8
    const-string v0, "application/json; charset=utf-8"

    .line 9
    .line 10
    invoke-static {v0}, Ldefpackage/ve5;->a(Ljava/lang/String;)Ldefpackage/hu2;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 15
    .line 16
    new-instance v0, Ldefpackage/nk1;

    .line 17
    .line 18
    invoke-direct {v0}, Ldefpackage/nk1;-><init>()V

    .line 19
    .line 20
    .line 21
    sput-object v0, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 22
    .line 23
    new-instance v0, Ldefpackage/si1;

    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-direct {v0, v1}, Ldefpackage/si1;-><init>(I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Ldefpackage/rr1;->d:Ldefpackage/si1;

    .line 30
    .line 31
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 32
    .line 33
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 34
    .line 35
    .line 36
    sput-object v0, Ldefpackage/rr1;->e:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    new-instance v0, Ldefpackage/e90;

    .line 39
    .line 40
    const/16 v1, 0x9

    .line 41
    .line 42
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 43
    .line 44
    .line 45
    new-instance v1, Ldefpackage/rp4;

    .line 46
    .line 47
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 48
    .line 49
    .line 50
    sput-object v1, Ldefpackage/rr1;->f:Ldefpackage/rp4;

    .line 51
    .line 52
    new-instance v0, Ldefpackage/e90;

    .line 53
    .line 54
    const/16 v1, 0xa

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 57
    .line 58
    .line 59
    new-instance v1, Ldefpackage/rp4;

    .line 60
    .line 61
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 62
    .line 63
    .line 64
    sput-object v1, Ldefpackage/rr1;->g:Ldefpackage/rp4;

    .line 65
    .line 66
    new-instance v0, Ldefpackage/e90;

    .line 67
    .line 68
    const/16 v1, 0xb

    .line 69
    .line 70
    invoke-direct {v0, v1}, Ldefpackage/e90;-><init>(I)V

    .line 71
    .line 72
    .line 73
    new-instance v1, Ldefpackage/rp4;

    .line 74
    .line 75
    invoke-direct {v1, v0}, Ldefpackage/rp4;-><init>(Ldefpackage/gf1;)V

    .line 76
    .line 77
    .line 78
    sput-object v1, Ldefpackage/rr1;->h:Ldefpackage/rp4;

    .line 79
    .line 80
    sget-object v0, Ldefpackage/z01;->n:Ldefpackage/z01;

    .line 81
    .line 82
    sput-object v0, Ldefpackage/rr1;->m:Ljava/util/Set;

    .line 83
    .line 84
    return-void
.end method

.method public static final A(Ljava/util/Map;)Lcom/eddyizm/tempus/homemusic/WaveOut;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 5
    .line 6
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 19
    .line 20
    invoke-static {p0, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Ldefpackage/nr1;

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    invoke-direct {v0, p0, v1}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Ldefpackage/or1;

    .line 31
    .line 32
    const/4 v1, 0x3

    .line 33
    invoke-direct {p0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 41
    .line 42
    return-object p0
.end method

.method public static B(Ljava/lang/String;Ldefpackage/gf1;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/na;

    .line 5
    .line 6
    sget-object v2, Ldefpackage/b00;->a:Ldefpackage/b00;

    .line 7
    .line 8
    const/4 v6, 0x0

    .line 9
    const/4 v7, 0x3

    .line 10
    const/4 v1, 0x0

    .line 11
    const-class v3, Ldefpackage/b00;

    .line 12
    .line 13
    const-string v4, "currentAccount"

    .line 14
    .line 15
    const-string v5, "currentAccount()Ljava/lang/String;"

    .line 16
    .line 17
    invoke-direct/range {v0 .. v7}, Ldefpackage/na;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Ldefpackage/rs0;

    .line 21
    .line 22
    const/4 v2, 0x5

    .line 23
    invoke-direct {v1, v2, p0}, Ldefpackage/rs0;-><init>(ILjava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ldefpackage/na;->invoke()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v2, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    const/4 v3, 0x0

    .line 35
    const-string v4, "Account changed"

    .line 36
    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-static {}, Ldefpackage/rr1;->h()Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 40
    .line 41
    .line 42
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v5, Ldefpackage/qr1;

    .line 47
    .line 48
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-virtual {v6, v2}, Landroid/webkit/CookieManager;->getCookie(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    if-eqz v6, :cond_1

    .line 57
    .line 58
    invoke-direct {v5, v2, v6}, Ldefpackage/qr1;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v5}, Ldefpackage/rs0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, Ljava/lang/Boolean;

    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v0}, Ldefpackage/na;->invoke()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0, p0}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-eqz p0, :cond_0

    .line 82
    .line 83
    sget-object p0, Ldefpackage/rr1;->e:Ljava/lang/ThreadLocal;

    .line 84
    .line 85
    invoke-virtual {p0, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :try_start_0
    invoke-interface {p1}, Ldefpackage/gf1;->invoke()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 93
    .line 94
    .line 95
    return-object p1

    .line 96
    :catchall_0
    move-exception v0

    .line 97
    move-object p1, v0

    .line 98
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_0
    invoke-static {v4}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    return-object v3

    .line 106
    :cond_1
    const-string p0, "Hub session unavailable"

    .line 107
    .line 108
    invoke-static {p0}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    return-object v3

    .line 112
    :cond_2
    invoke-static {v4}, Ldefpackage/mj0;->i(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-object v3
.end method

.method public static final a(Landroid/content/ContentResolver;Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/HubAssistantTask;
    .locals 7

    .line 1
    new-instance v0, Ldefpackage/uz2;

    .line 2
    .line 3
    invoke-direct {v0}, Ldefpackage/uz2;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Ldefpackage/wz2;->f:Ldefpackage/hu2;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ldefpackage/uz2;->c(Ldefpackage/hu2;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const/4 v1, 0x0

    .line 16
    move v2, v1

    .line 17
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    add-int/lit8 v4, v2, 0x1

    .line 28
    .line 29
    if-ltz v2, :cond_0

    .line 30
    .line 31
    check-cast v3, Landroid/net/Uri;

    .line 32
    .line 33
    sget-object v5, Ldefpackage/yc4;->d:Ljava/util/Map;

    .line 34
    .line 35
    new-instance v5, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v6, "screenshot_"

    .line 38
    .line 39
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v5, "image/png"

    .line 50
    .line 51
    invoke-static {p0, v3, v5, v2}, Ldefpackage/vr1;->A(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/yc4;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v5, v2, Ldefpackage/yc4;->a:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v6, Ldefpackage/rd0;

    .line 58
    .line 59
    iget-object v2, v2, Ldefpackage/yc4;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-direct {v6, p0, v3, v2}, Ldefpackage/rd0;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v2, "images"

    .line 65
    .line 66
    invoke-virtual {v0, v2, v5, v6}, Ldefpackage/uz2;->a(Ljava/lang/String;Ljava/lang/String;Ldefpackage/rd0;)V

    .line 67
    .line 68
    .line 69
    move v2, v4

    .line 70
    goto :goto_0

    .line 71
    :cond_0
    invoke-static {}, Ldefpackage/gb;->c0()V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    throw p0

    .line 76
    :cond_1
    invoke-virtual {v0}, Ldefpackage/uz2;->b()Ldefpackage/wz2;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance p1, Ldefpackage/mr1;

    .line 81
    .line 82
    invoke-direct {p1, p0, v1}, Ldefpackage/mr1;-><init>(Ldefpackage/wz2;I)V

    .line 83
    .line 84
    .line 85
    new-instance p0, Ldefpackage/k2;

    .line 86
    .line 87
    const/16 v0, 0x1b

    .line 88
    .line 89
    invoke-direct {p0, v0, v1}, Ldefpackage/k2;-><init>(IB)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 97
    .line 98
    return-object p0
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Z)Lcom/eddyizm/tempus/homemusic/HubAssistantTask;
    .locals 2

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-static {v0, p1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    new-instance p2, Ldefpackage/kd3;

    .line 16
    .line 17
    const-string v1, "text"

    .line 18
    .line 19
    invoke-direct {p2, v1, p0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p0, Ldefpackage/kd3;

    .line 23
    .line 24
    invoke-direct {p0, v0, p1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    filled-new-array {p2, p0}, [Ldefpackage/kd3;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {p0}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    :goto_0
    sget-object p1, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 36
    .line 37
    sget-object p2, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 38
    .line 39
    invoke-virtual {p2, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    sget-object p1, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 50
    .line 51
    invoke-static {p0, p1}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    new-instance p1, Ldefpackage/nr1;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-direct {p1, p0, p2}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 59
    .line 60
    .line 61
    new-instance p0, Ldefpackage/k2;

    .line 62
    .line 63
    const/16 v0, 0x1d

    .line 64
    .line 65
    invoke-direct {p0, v0, p2}, Ldefpackage/k2;-><init>(IB)V

    .line 66
    .line 67
    .line 68
    invoke-static {p1, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubAssistantTask;

    .line 73
    .line 74
    return-object p0
.end method

.method public static final c()Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, "/healthz"

    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-object v3, Ldefpackage/rr1;->i:Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    sget-wide v4, Ldefpackage/rr1;->j:J

    .line 12
    .line 13
    sub-long v4, v1, v4

    .line 14
    .line 15
    const-wide/32 v6, 0x1d4c0

    .line 16
    .line 17
    .line 18
    cmp-long v4, v4, v6

    .line 19
    .line 20
    if-gez v4, :cond_0

    .line 21
    .line 22
    return-object v3

    .line 23
    :cond_0
    invoke-static {}, Ldefpackage/e35;->Q()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {}, Lcom/eddyizm/tempus/App;->b()Lcom/eddyizm/tempus/App;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/eddyizm/tempus/App;->c()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    const-string v5, "homemusic_hub_local_url"

    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    invoke-interface {v4, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    if-nez v4, :cond_1

    .line 49
    .line 50
    const-string v4, "http://192.168.0.111:8080"

    .line 51
    .line 52
    :cond_1
    invoke-static {v4}, Ldefpackage/e35;->K(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    if-nez v5, :cond_2

    .line 63
    .line 64
    :try_start_0
    sget-object v5, Ldefpackage/rr1;->h:Ldefpackage/rp4;

    .line 65
    .line 66
    invoke-virtual {v5}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    check-cast v5, Ldefpackage/o83;

    .line 71
    .line 72
    new-instance v6, Ldefpackage/nz3;

    .line 73
    .line 74
    invoke-direct {v6}, Ldefpackage/nz3;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v6, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    new-instance v0, Ldefpackage/oz3;

    .line 85
    .line 86
    invoke-direct {v0, v6}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    new-instance v6, Ldefpackage/bv3;

    .line 93
    .line 94
    invoke-direct {v6, v5, v0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    :try_start_1
    iget-boolean v5, v0, Ldefpackage/k14;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 102
    .line 103
    :try_start_2
    invoke-virtual {v0}, Ldefpackage/k14;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :catchall_0
    move-exception v5

    .line 108
    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 109
    :catchall_1
    move-exception v6

    .line 110
    :try_start_4
    invoke-static {v0, v5}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 111
    .line 112
    .line 113
    throw v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 114
    :catch_0
    const/4 v5, 0x0

    .line 115
    :goto_0
    if-eqz v5, :cond_2

    .line 116
    .line 117
    move-object v3, v4

    .line 118
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    sput-object v3, Ldefpackage/rr1;->i:Ljava/lang/String;

    .line 125
    .line 126
    sput-wide v1, Ldefpackage/rr1;->j:J

    .line 127
    .line 128
    return-object v3

    .line 129
    :cond_3
    new-instance v0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 130
    .line 131
    const-string v1, "\u041d\u0435 \u0437\u0430\u0434\u0430\u043d \u0430\u0434\u0440\u0435\u0441 \u0425\u0430\u0431\u0430 \u2014 \u0443\u043a\u0430\u0436\u0438\u0442\u0435 \u0435\u0433\u043e \u0432 \u043d\u0430\u0441\u0442\u0440\u043e\u0439\u043a\u0430\u0445"

    .line 132
    .line 133
    invoke-direct {v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0
.end method

.method public static d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/rr1;->e:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/qr1;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v1, v0, Ldefpackage/qr1;->a:Ljava/lang/String;

    .line 12
    .line 13
    invoke-interface {p0, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, Ldefpackage/oz3;

    .line 18
    .line 19
    invoke-virtual {p0}, Ldefpackage/oz3;->a()Ldefpackage/nz3;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v1, "Cookie"

    .line 24
    .line 25
    iget-object v0, v0, Ldefpackage/qr1;->b:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Ldefpackage/nz3;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Ldefpackage/oz3;

    .line 31
    .line 32
    invoke-direct {v0, p0}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Ldefpackage/rr1;->f:Ldefpackage/rp4;

    .line 36
    .line 37
    invoke-virtual {p0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Ldefpackage/o83;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v1, Ldefpackage/bv3;

    .line 47
    .line 48
    invoke-direct {v1, p0, v0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/k14;->C:Z

    .line 56
    .line 57
    if-eqz v0, :cond_0

    .line 58
    .line 59
    invoke-interface {p1, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    invoke-virtual {p0}, Ldefpackage/k14;->close()V

    .line 64
    .line 65
    .line 66
    return-object p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto :goto_0

    .line 69
    :cond_0
    :try_start_1
    invoke-static {p0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    :goto_0
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 75
    :catchall_1
    move-exception v0

    .line 76
    invoke-static {p0, p1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    throw v0

    .line 80
    :cond_1
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {}, Ldefpackage/rr1;->k()Ldefpackage/o83;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-interface {p0, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Ldefpackage/oz3;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v3, Ldefpackage/bv3;

    .line 101
    .line 102
    invoke-direct {v3, v1, v2}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget v2, v1, Ldefpackage/k14;->q:I

    .line 110
    .line 111
    const/16 v3, 0x191

    .line 112
    .line 113
    if-eq v2, v3, :cond_3

    .line 114
    .line 115
    :try_start_3
    iget-boolean p0, v1, Ldefpackage/k14;->C:Z

    .line 116
    .line 117
    if-eqz p0, :cond_2

    .line 118
    .line 119
    invoke-interface {p1, v1}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 123
    invoke-virtual {v1}, Ldefpackage/k14;->close()V

    .line 124
    .line 125
    .line 126
    return-object p0

    .line 127
    :catchall_2
    move-exception p0

    .line 128
    goto :goto_1

    .line 129
    :cond_2
    :try_start_4
    invoke-static {v1}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 134
    :goto_1
    :try_start_5
    throw p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 135
    :catchall_3
    move-exception p1

    .line 136
    invoke-static {v1, p0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 137
    .line 138
    .line 139
    throw p1

    .line 140
    :cond_3
    invoke-virtual {v1}, Ldefpackage/k14;->close()V

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Ldefpackage/rr1;->o(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 144
    .line 145
    .line 146
    invoke-static {}, Ldefpackage/rr1;->k()Ldefpackage/o83;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-interface {p0, v0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    check-cast p0, Ldefpackage/oz3;

    .line 155
    .line 156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    new-instance v0, Ldefpackage/bv3;

    .line 163
    .line 164
    invoke-direct {v0, v1, p0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    :try_start_6
    iget-boolean v0, p0, Ldefpackage/k14;->C:Z

    .line 172
    .line 173
    if-eqz v0, :cond_4

    .line 174
    .line 175
    invoke-interface {p1, p0}, Ldefpackage/if1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 179
    invoke-virtual {p0}, Ldefpackage/k14;->close()V

    .line 180
    .line 181
    .line 182
    return-object p1

    .line 183
    :catchall_4
    move-exception p1

    .line 184
    goto :goto_2

    .line 185
    :cond_4
    :try_start_7
    invoke-static {p0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 190
    :goto_2
    :try_start_8
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 191
    :catchall_5
    move-exception v0

    .line 192
    invoke-static {p0, p1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 193
    .line 194
    .line 195
    throw v0
.end method

.method public static e()Ljava/util/Set;
    .locals 10

    .line 1
    sget-object v0, Ldefpackage/z01;->n:Ldefpackage/z01;

    .line 2
    .line 3
    const-string v1, "/healthz"

    .line 4
    .line 5
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    sget-object v5, Ldefpackage/rr1;->k:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {v5, v2}, Ldefpackage/h12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    if-eqz v5, :cond_0

    .line 20
    .line 21
    sget-wide v5, Ldefpackage/rr1;->l:J

    .line 22
    .line 23
    sub-long v5, v3, v5

    .line 24
    .line 25
    const-wide/32 v7, 0x493e0

    .line 26
    .line 27
    .line 28
    cmp-long v5, v5, v7

    .line 29
    .line 30
    if-gez v5, :cond_0

    .line 31
    .line 32
    sget-object v0, Ldefpackage/rr1;->m:Ljava/util/Set;

    .line 33
    .line 34
    return-object v0

    .line 35
    :cond_0
    :try_start_0
    sget-object v5, Ldefpackage/rr1;->h:Ldefpackage/rp4;

    .line 36
    .line 37
    invoke-virtual {v5}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    check-cast v5, Ldefpackage/o83;

    .line 42
    .line 43
    new-instance v6, Ldefpackage/nz3;

    .line 44
    .line 45
    invoke-direct {v6}, Ldefpackage/nz3;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v6, v1}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    new-instance v1, Ldefpackage/oz3;

    .line 56
    .line 57
    invoke-direct {v1, v6}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v6, Ldefpackage/bv3;

    .line 64
    .line 65
    invoke-direct {v6, v5, v1}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 69
    .line 70
    .line 71
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    :try_start_1
    iget-boolean v5, v1, Ldefpackage/k14;->C:Z

    .line 73
    .line 74
    if-nez v5, :cond_1

    .line 75
    .line 76
    :goto_0
    move-object v6, v0

    .line 77
    goto :goto_3

    .line 78
    :cond_1
    iget-object v5, v1, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 79
    .line 80
    const/4 v6, 0x0

    .line 81
    if-eqz v5, :cond_2

    .line 82
    .line 83
    invoke-virtual {v5}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v5

    .line 89
    goto :goto_4

    .line 90
    :cond_2
    move-object v5, v6

    .line 91
    :goto_1
    if-nez v5, :cond_3

    .line 92
    .line 93
    const-string v5, ""

    .line 94
    .line 95
    :cond_3
    invoke-static {v5}, Ldefpackage/e35;->N(Ljava/lang/String;)Ldefpackage/h32;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    invoke-virtual {v5}, Ldefpackage/h32;->a()Ldefpackage/j32;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    const-string v7, "capabilities"

    .line 104
    .line 105
    iget-object v5, v5, Ldefpackage/j32;->n:Ldefpackage/nb2;

    .line 106
    .line 107
    invoke-virtual {v5, v7}, Ldefpackage/nb2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Ldefpackage/f32;

    .line 112
    .line 113
    if-eqz v5, :cond_5

    .line 114
    .line 115
    new-instance v6, Ljava/util/ArrayList;

    .line 116
    .line 117
    const/16 v7, 0xa

    .line 118
    .line 119
    invoke-static {v5, v7}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 124
    .line 125
    .line 126
    iget-object v5, v5, Ldefpackage/f32;->n:Ljava/util/ArrayList;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    const/4 v8, 0x0

    .line 133
    :goto_2
    if-ge v8, v7, :cond_4

    .line 134
    .line 135
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v9

    .line 139
    add-int/lit8 v8, v8, 0x1

    .line 140
    .line 141
    check-cast v9, Ldefpackage/h32;

    .line 142
    .line 143
    invoke-virtual {v9}, Ldefpackage/h32;->b()Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_4
    invoke-static {v6}, Ldefpackage/q40;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    :cond_5
    if-nez v6, :cond_6

    .line 156
    .line 157
    goto :goto_0

    .line 158
    :cond_6
    :goto_3
    :try_start_2
    invoke-virtual {v1}, Ldefpackage/k14;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 159
    .line 160
    .line 161
    move-object v0, v6

    .line 162
    goto :goto_5

    .line 163
    :goto_4
    :try_start_3
    throw v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 164
    :catchall_1
    move-exception v6

    .line 165
    :try_start_4
    invoke-static {v1, v5}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 169
    :catch_0
    :goto_5
    sput-object v0, Ldefpackage/rr1;->m:Ljava/util/Set;

    .line 170
    .line 171
    sput-wide v3, Ldefpackage/rr1;->l:J

    .line 172
    .line 173
    sput-object v2, Ldefpackage/rr1;->k:Ljava/lang/String;

    .line 174
    .line 175
    return-object v0
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {p0}, Ldefpackage/rr1;->x(Ljava/lang/String;)Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    new-instance v0, Ldefpackage/kd3;

    .line 6
    .line 7
    const-string v1, "artist"

    .line 8
    .line 9
    invoke-direct {v0, v1, p1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Ldefpackage/kd3;

    .line 13
    .line 14
    const-string v1, "title"

    .line 15
    .line 16
    invoke-direct {p1, v1, p2}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance p2, Ldefpackage/kd3;

    .line 20
    .line 21
    const-string v1, "context"

    .line 22
    .line 23
    invoke-direct {p2, v1, p3}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    new-instance p3, Ldefpackage/kd3;

    .line 27
    .line 28
    const-string v1, "client"

    .line 29
    .line 30
    invoke-direct {p3, v1, p4}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, p1, p2, p3}, [Ldefpackage/kd3;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 42
    .line 43
    invoke-direct {p2, p0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 47
    .line 48
    .line 49
    sget-object p0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 50
    .line 51
    sget-object p1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 52
    .line 53
    invoke-virtual {p1, p2}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    sget-object p0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 64
    .line 65
    invoke-static {p1, p0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    new-instance p1, Ldefpackage/nr1;

    .line 70
    .line 71
    const/4 p2, 0x3

    .line 72
    invoke-direct {p1, p0, p2}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 73
    .line 74
    .line 75
    new-instance p0, Ldefpackage/or1;

    .line 76
    .line 77
    const/16 p2, 0x9

    .line 78
    .line 79
    invoke-direct {p0, p2}, Ldefpackage/or1;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    return-void
.end method

.method public static final g(Ljava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 2
    .line 3
    invoke-static {p0}, Ldefpackage/gb;->O(Ljava/lang/Object;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v1, Ldefpackage/kd3;

    .line 8
    .line 9
    const-string v2, "track_refs"

    .line 10
    .line 11
    invoke-direct {v1, v2, p0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    new-instance v2, Ldefpackage/kd3;

    .line 17
    .line 18
    const-string v3, "star"

    .line 19
    .line 20
    invoke-direct {v2, v3, p0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    filled-new-array {v1, v2}, [Ldefpackage/kd3;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p0}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 32
    .line 33
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 44
    .line 45
    invoke-static {p0, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    new-instance v0, Ldefpackage/nr1;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    invoke-direct {v0, p0, v1}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 53
    .line 54
    .line 55
    new-instance p0, Ldefpackage/or1;

    .line 56
    .line 57
    const/16 v1, 0xc

    .line 58
    .line 59
    invoke-direct {p0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    if-nez p0, :cond_0

    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    invoke-static {}, Ldefpackage/kf2;->k()V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static final h()Lcom/eddyizm/tempus/homemusic/HubMe;
    .locals 4

    .line 1
    const-string v0, "/api/auth/me"

    .line 2
    .line 3
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    :try_start_0
    invoke-static {}, Ldefpackage/rr1;->k()Ldefpackage/o83;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    new-instance v3, Ldefpackage/nz3;

    .line 12
    .line 13
    invoke-direct {v3}, Ldefpackage/nz3;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v3, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Ldefpackage/oz3;

    .line 24
    .line 25
    invoke-direct {v0, v3}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    new-instance v3, Ldefpackage/bv3;

    .line 32
    .line 33
    invoke-direct {v3, v2, v0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 37
    .line 38
    .line 39
    move-result-object v0
    :try_end_0
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    :try_start_1
    iget-boolean v2, v0, Ldefpackage/k14;->C:Z

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    const-class v2, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 45
    .line 46
    invoke-static {v0, v2}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    move-exception v1

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    iget v2, v0, Ldefpackage/k14;->q:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    .line 57
    const/16 v3, 0x191

    .line 58
    .line 59
    if-ne v2, v3, :cond_2

    .line 60
    .line 61
    const/4 v2, 0x0

    .line 62
    :goto_0
    :try_start_2
    invoke-virtual {v0}, Ldefpackage/k14;->close()V
    :try_end_2
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 63
    .line 64
    .line 65
    if-nez v2, :cond_1

    .line 66
    .line 67
    invoke-static {v1}, Ldefpackage/rr1;->o(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_1
    return-object v2

    .line 73
    :cond_2
    :try_start_3
    invoke-static {v0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 78
    :goto_1
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 79
    :catchall_1
    move-exception v2

    .line 80
    :try_start_5
    invoke-static {v0, v1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    throw v2
    :try_end_5
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_5 .. :try_end_5} :catch_1
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_0

    .line 84
    :catch_0
    move-exception v0

    .line 85
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 86
    .line 87
    .line 88
    new-instance v1, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    if-nez v2, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    :cond_3
    const-string v0, "\u0425\u0430\u0431 \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u0435\u043d: "

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-direct {v1, v0}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    throw v1

    .line 114
    :catch_1
    move-exception v0

    .line 115
    throw v0
.end method

.method public static final i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;
    .locals 3

    .line 1
    iget v0, p0, Ldefpackage/k14;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object p0, p0, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object p0, v1

    .line 14
    :goto_0
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, ""

    .line 17
    .line 18
    :cond_1
    invoke-static {p0}, Ldefpackage/e35;->N(Ljava/lang/String;)Ldefpackage/h32;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Ldefpackage/h32;->a()Ldefpackage/j32;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    const-string v2, "detail"

    .line 27
    .line 28
    iget-object p0, p0, Ldefpackage/j32;->n:Ldefpackage/nb2;

    .line 29
    .line 30
    invoke-virtual {p0, v2}, Ldefpackage/nb2;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Ldefpackage/h32;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    instance-of v2, p0, Ldefpackage/k32;

    .line 39
    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Ldefpackage/h32;->b()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    :catch_0
    :cond_2
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-static {v1}, Ldefpackage/qm4;->u0(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_6

    .line 53
    .line 54
    :cond_3
    const/16 p0, 0x191

    .line 55
    .line 56
    if-ne v0, p0, :cond_4

    .line 57
    .line 58
    const-string v1, "\u0425\u0430\u0431 \u043d\u0435 \u043f\u0440\u0438\u043d\u044f\u043b \u043b\u043e\u0433\u0438\u043d \u0438 \u043f\u0430\u0440\u043e\u043b\u044c Navidrome"

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_4
    const/16 p0, 0x19d

    .line 62
    .line 63
    if-ne v0, p0, :cond_5

    .line 64
    .line 65
    const-string v1, "\u0424\u0430\u0439\u043b \u0441\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u043e\u0439"

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_5
    const-string p0, "\u041e\u0448\u0438\u0431\u043a\u0430 \u0425\u0430\u0431\u0430 (HTTP "

    .line 69
    .line 70
    const-string v1, ")"

    .line 71
    .line 72
    invoke-static {v0, p0, v1}, Ldefpackage/b11;->j(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    :cond_6
    :goto_1
    new-instance p0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 77
    .line 78
    invoke-direct {p0, v0, v1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-object p0
.end method

.method public static j(Ljava/util/List;Z)Ljava/util/ArrayList;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p0, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 30
    .line 31
    sget-object v2, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    sget-object v1, Ldefpackage/i32;->n:Ldefpackage/i32;

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance v3, Ldefpackage/p32;

    .line 42
    .line 43
    invoke-direct {v3}, Ldefpackage/p32;-><init>()V

    .line 44
    .line 45
    .line 46
    const-class v4, Lcom/eddyizm/tempus/homemusic/PlayEvent;

    .line 47
    .line 48
    invoke-virtual {v2, v1, v4, v3}, Ldefpackage/nk1;->l(Ljava/lang/Object;Ljava/lang/Class;Ldefpackage/q32;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, v3, Ldefpackage/p32;->y:Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_1

    .line 58
    .line 59
    iget-object v1, v3, Ldefpackage/p32;->A:Ldefpackage/h32;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    const-string v2, "Expected one JSON element but was "

    .line 63
    .line 64
    invoke-static {v1, v2}, Ldefpackage/er1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    :goto_1
    invoke-virtual {v1}, Ldefpackage/h32;->a()Ldefpackage/j32;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    iget-object v2, v1, Ldefpackage/j32;->n:Ldefpackage/nb2;

    .line 73
    .line 74
    const-string v3, "_compensation_chain"

    .line 75
    .line 76
    invoke-virtual {v2, v3}, Ldefpackage/nb2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    check-cast v3, Ldefpackage/h32;

    .line 81
    .line 82
    const-string v3, "_account"

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ldefpackage/nb2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Ldefpackage/h32;

    .line 89
    .line 90
    const-string v3, "_rejected"

    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ldefpackage/nb2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    check-cast v3, Ldefpackage/h32;

    .line 97
    .line 98
    if-nez p1, :cond_2

    .line 99
    .line 100
    const-string v3, "launch_id"

    .line 101
    .line 102
    invoke-virtual {v2, v3}, Ldefpackage/nb2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Ldefpackage/h32;

    .line 107
    .line 108
    const-string v3, "launch_origin"

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Ldefpackage/nb2;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ldefpackage/h32;

    .line 115
    .line 116
    :cond_2
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    return-object v0
.end method

.method public static final k()Ldefpackage/o83;
    .locals 1

    .line 1
    sget-object v0, Ldefpackage/rr1;->g:Ldefpackage/rp4;

    .line 2
    .line 3
    invoke-virtual {v0}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ldefpackage/o83;

    .line 8
    .line 9
    return-object v0
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ldefpackage/kd3;

    .line 5
    .line 6
    const-string v1, "id_token"

    .line 7
    .line 8
    invoke-direct {v0, v1, p0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance p0, Ldefpackage/kd3;

    .line 12
    .line 13
    const-string v1, "code"

    .line 14
    .line 15
    invoke-direct {p0, v1, p1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p1, Ldefpackage/kd3;

    .line 19
    .line 20
    const-string v1, "username"

    .line 21
    .line 22
    invoke-direct {p1, v1, p2}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    filled-new-array {v0, p0, p1}, [Ldefpackage/kd3;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-class p1, Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;

    .line 34
    .line 35
    check-cast p0, Ljava/util/Map;

    .line 36
    .line 37
    const-string p2, "/api/auth/google"

    .line 38
    .line 39
    invoke-static {p0, p2, p1}, Ldefpackage/rr1;->s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubGoogleLogin;

    .line 44
    .line 45
    return-object p0
.end method

.method public static final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-object v0, Ldefpackage/rr1;->i:Ljava/lang/String;

    .line 3
    .line 4
    sput-object v0, Ldefpackage/rr1;->k:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static final n()Lcom/eddyizm/tempus/homemusic/HubAppRelease;
    .locals 4

    .line 1
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ldefpackage/rr1;->f:Ldefpackage/rp4;

    .line 6
    .line 7
    invoke-virtual {v1}, Ldefpackage/rp4;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ldefpackage/o83;

    .line 12
    .line 13
    invoke-virtual {v1}, Ldefpackage/o83;->a()Ldefpackage/n83;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    iput-boolean v2, v1, Ldefpackage/n83;->i:Z

    .line 19
    .line 20
    iput-boolean v2, v1, Ldefpackage/n83;->j:Z

    .line 21
    .line 22
    new-instance v2, Ldefpackage/o83;

    .line 23
    .line 24
    invoke-direct {v2, v1}, Ldefpackage/o83;-><init>(Ldefpackage/n83;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, Ldefpackage/nz3;

    .line 28
    .line 29
    invoke-direct {v1}, Ldefpackage/nz3;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "/app/latest.json"

    .line 33
    .line 34
    invoke-virtual {v0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    new-instance v0, Ldefpackage/oz3;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Ldefpackage/bv3;

    .line 47
    .line 48
    invoke-direct {v1, v2, v0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :try_start_0
    iget v1, v0, Ldefpackage/k14;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    const/16 v2, 0x194

    .line 58
    .line 59
    if-ne v1, v2, :cond_0

    .line 60
    .line 61
    invoke-virtual {v0}, Ldefpackage/k14;->close()V

    .line 62
    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    return-object v0

    .line 66
    :cond_0
    :try_start_1
    iget-boolean v1, v0, Ldefpackage/k14;->C:Z

    .line 67
    .line 68
    if-eqz v1, :cond_1

    .line 69
    .line 70
    const-class v1, Lcom/eddyizm/tempus/homemusic/HubAppRelease;

    .line 71
    .line 72
    invoke-static {v0, v1}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    check-cast v1, Lcom/eddyizm/tempus/homemusic/HubAppRelease;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    invoke-virtual {v0}, Ldefpackage/k14;->close()V

    .line 79
    .line 80
    .line 81
    return-object v1

    .line 82
    :catchall_0
    move-exception v1

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    :try_start_2
    invoke-static {v0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 89
    :goto_0
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 90
    :catchall_1
    move-exception v2

    .line 91
    invoke-static {v0, v1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    throw v2
.end method

.method public static o(Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/HubMe;
    .locals 5

    .line 1
    invoke-static {}, Ldefpackage/ud3;->K()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Ldefpackage/ud3;->y()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    sget-object v2, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 26
    .line 27
    new-instance v3, Ldefpackage/kd3;

    .line 28
    .line 29
    const-string v4, "username"

    .line 30
    .line 31
    invoke-direct {v3, v4, v0}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Ldefpackage/kd3;

    .line 35
    .line 36
    const-string v4, "password"

    .line 37
    .line 38
    invoke-direct {v0, v4, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    filled-new-array {v3, v0}, [Ldefpackage/kd3;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    sget-object v1, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 62
    .line 63
    invoke-static {v0, v1}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {}, Ldefpackage/rr1;->k()Ldefpackage/o83;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, Ldefpackage/nz3;

    .line 72
    .line 73
    invoke-direct {v2}, Ldefpackage/nz3;-><init>()V

    .line 74
    .line 75
    .line 76
    const-string v3, "/api/auth/login"

    .line 77
    .line 78
    invoke-virtual {p0, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    invoke-virtual {v2, p0}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const-string p0, "POST"

    .line 86
    .line 87
    invoke-virtual {v2, p0, v0}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 88
    .line 89
    .line 90
    new-instance p0, Ldefpackage/oz3;

    .line 91
    .line 92
    invoke-direct {p0, v2}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    new-instance v0, Ldefpackage/bv3;

    .line 99
    .line 100
    invoke-direct {v0, v1, p0}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    :try_start_0
    iget-boolean v0, p0, Ldefpackage/k14;->C:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 108
    .line 109
    if-eqz v0, :cond_0

    .line 110
    .line 111
    :try_start_1
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-virtual {v0}, Landroid/webkit/CookieManager;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :catchall_0
    move-exception v0

    .line 120
    :try_start_2
    const-string v1, "HubClient"

    .line 121
    .line 122
    const-string v2, "Cookie flush failed"

    .line 123
    .line 124
    invoke-static {v1, v2, v0}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 125
    .line 126
    .line 127
    :goto_0
    const-class v0, Lcom/eddyizm/tempus/homemusic/HubMe;

    .line 128
    .line 129
    invoke-static {p0, v0}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    check-cast v0, Lcom/eddyizm/tempus/homemusic/HubMe;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 134
    .line 135
    invoke-virtual {p0}, Ldefpackage/k14;->close()V

    .line 136
    .line 137
    .line 138
    return-object v0

    .line 139
    :catchall_1
    move-exception v0

    .line 140
    goto :goto_1

    .line 141
    :cond_0
    :try_start_3
    invoke-static {p0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    :goto_1
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 147
    :catchall_2
    move-exception v1

    .line 148
    invoke-static {p0, v0}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 149
    .line 150
    .line 151
    throw v1

    .line 152
    :cond_1
    new-instance p0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 153
    .line 154
    const-string v0, "\u0421\u043d\u0430\u0447\u0430\u043b\u0430 \u0432\u043e\u0439\u0434\u0438\u0442\u0435 \u0432 \u0430\u043a\u043a\u0430\u0443\u043d\u0442 Navidrome \u2014 \u0425\u0430\u0431 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442 \u0442\u0443 \u0436\u0435 \u0443\u0447\u0451\u0442\u043d\u0443\u044e \u0437\u0430\u043f\u0438\u0441\u044c"

    .line 155
    .line 156
    const/16 v1, 0x191

    .line 157
    .line 158
    invoke-direct {p0, v1, v0}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(ILjava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw p0
.end method

.method public static p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    :goto_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    const-string p0, ""

    .line 14
    .line 15
    :cond_1
    sget-object v0, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 16
    .line 17
    invoke-virtual {v0, p1, p0}, Ldefpackage/nk1;->d(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_2
    new-instance p0, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 25
    .line 26
    const-string p1, "\u041f\u0443\u0441\u0442\u043e\u0439 \u043e\u0442\u0432\u0435\u0442 \u0425\u0430\u0431\u0430"

    .line 27
    .line 28
    invoke-direct {p0, p1}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public static q(Ldefpackage/k14;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 6

    .line 1
    iget-object p0, p0, Ldefpackage/k14;->t:Ldefpackage/n14;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ldefpackage/n14;->string()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p0, v0

    .line 12
    :goto_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    const-string p0, ""

    .line 15
    .line 16
    :cond_1
    invoke-static {p0}, Ldefpackage/e35;->N(Ljava/lang/String;)Ldefpackage/h32;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    instance-of v1, p0, Ldefpackage/f32;

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    check-cast p0, Ldefpackage/f32;

    .line 25
    .line 26
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/16 v1, 0xa

    .line 29
    .line 30
    invoke-static {p0, v1}, Ldefpackage/r40;->k0(Ljava/lang/Iterable;I)I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Ldefpackage/f32;->n:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_1
    if-ge v2, v1, :cond_2

    .line 45
    .line 46
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    check-cast v3, Ldefpackage/h32;

    .line 53
    .line 54
    sget-object v4, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {p1}, Lcom/google/gson/reflect/TypeToken;->get(Ljava/lang/Class;)Lcom/google/gson/reflect/TypeToken;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {v4, v3, v5}, Ldefpackage/nk1;->b(Ldefpackage/h32;Lcom/google/gson/reflect/TypeToken;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {p1}, Ldefpackage/su3;->I(Ljava/lang/Class;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v4, v3}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    return-object v0

    .line 80
    :cond_3
    const-string p1, "Not a JSON Array: "

    .line 81
    .line 82
    invoke-static {p0, p1}, Ldefpackage/er1;->o(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    return-object v0
.end method

.method public static final r(Ljava/util/List;)Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 5
    .line 6
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    const-string v2, "launch_events_v1"

    .line 11
    .line 12
    invoke-interface {v1, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p0, v1}, Ldefpackage/rr1;->j(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "events"

    .line 21
    .line 22
    invoke-static {v1, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 30
    .line 31
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 42
    .line 43
    invoke-static {p0, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance v0, Ldefpackage/nr1;

    .line 48
    .line 49
    const/4 v1, 0x6

    .line 50
    invoke-direct {v0, p0, v1}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 51
    .line 52
    .line 53
    new-instance p0, Ldefpackage/or1;

    .line 54
    .line 55
    const/16 v1, 0x15

    .line 56
    .line 57
    invoke-direct {p0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, Lcom/eddyizm/tempus/homemusic/HubPlayEventsResult;

    .line 65
    .line 66
    return-object p0
.end method

.method public static s(Ljava/util/Map;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Ldefpackage/rr1;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ldefpackage/nz3;

    .line 6
    .line 7
    invoke-direct {v1}, Ldefpackage/nz3;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {v1, p1}, Ldefpackage/nz3;->d(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget-object p1, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 20
    .line 21
    sget-object v0, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object p1, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 34
    .line 35
    invoke-static {p0, p1}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string p1, "POST"

    .line 40
    .line 41
    invoke-virtual {v1, p1, p0}, Ldefpackage/nz3;->b(Ljava/lang/String;Ldefpackage/tz3;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    :try_start_0
    invoke-static {}, Ldefpackage/rr1;->k()Ldefpackage/o83;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance p1, Ldefpackage/oz3;

    .line 49
    .line 50
    invoke-direct {p1, v1}, Ldefpackage/oz3;-><init>(Ldefpackage/nz3;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    new-instance v0, Ldefpackage/bv3;

    .line 57
    .line 58
    invoke-direct {v0, p0, p1}, Ldefpackage/bv3;-><init>(Ldefpackage/o83;Ldefpackage/oz3;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ldefpackage/bv3;->c()Ldefpackage/k14;

    .line 62
    .line 63
    .line 64
    move-result-object p0
    :try_end_0
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    :try_start_1
    iget-boolean p1, p0, Ldefpackage/k14;->C:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 66
    .line 67
    if-eqz p1, :cond_1

    .line 68
    .line 69
    :try_start_2
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/webkit/CookieManager;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_0
    move-exception p1

    .line 78
    :try_start_3
    const-string v0, "HubClient"

    .line 79
    .line 80
    const-string v1, "Cookie flush failed"

    .line 81
    .line 82
    invoke-static {v0, v1, p1}, Landroid/util/Ldefpackage/og;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 83
    .line 84
    .line 85
    :goto_0
    invoke-static {p0, p2}, Ldefpackage/rr1;->p(Ldefpackage/k14;Ljava/lang/Class;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 89
    :try_start_4
    invoke-virtual {p0}, Ldefpackage/k14;->close()V
    :try_end_4
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 90
    .line 91
    .line 92
    return-object p1

    .line 93
    :catchall_1
    move-exception p1

    .line 94
    goto :goto_1

    .line 95
    :cond_1
    :try_start_5
    invoke-static {p0}, Ldefpackage/rr1;->i(Ldefpackage/k14;)Lcom/eddyizm/tempus/homemusic/HubException;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 100
    :goto_1
    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 101
    :catchall_2
    move-exception p2

    .line 102
    :try_start_7
    invoke-static {p0, p1}, Ldefpackage/q05;->h(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    throw p2
    :try_end_7
    .catch Lcom/eddyizm/tempus/homemusic/HubException; {:try_start_7 .. :try_end_7} :catch_1
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_0

    .line 106
    :catch_0
    move-exception p0

    .line 107
    invoke-static {}, Ldefpackage/rr1;->m()V

    .line 108
    .line 109
    .line 110
    new-instance p1, Lcom/eddyizm/tempus/homemusic/HubException;

    .line 111
    .line 112
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    if-nez p2, :cond_2

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p2

    .line 126
    :cond_2
    const-string p0, "\u0425\u0430\u0431 \u043d\u0435\u0434\u043e\u0441\u0442\u0443\u043f\u0435\u043d: "

    .line 127
    .line 128
    invoke-virtual {p0, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-direct {p1, p0}, Lcom/eddyizm/tempus/homemusic/HubException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p1

    .line 136
    :catch_1
    move-exception p0

    .line 137
    throw p0
.end method

.method public static final t(Ljava/lang/String;Ljava/lang/String;)Lcom/eddyizm/tempus/homemusic/SmartAddOut;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 5
    .line 6
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 7
    .line 8
    invoke-static {p1}, Ldefpackage/rr1;->x(Ljava/lang/String;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, p1}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 23
    .line 24
    invoke-static {p1, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Ldefpackage/pr1;

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/pr1;-><init>(Ljava/lang/String;Ldefpackage/we5;I)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Ldefpackage/or1;

    .line 35
    .line 36
    const/16 p1, 0xf

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ldefpackage/or1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Lcom/eddyizm/tempus/homemusic/SmartAddOut;

    .line 46
    .line 47
    return-object p0
.end method

.method public static final u(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 5
    .line 6
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 7
    .line 8
    invoke-static {p1}, Ldefpackage/rr1;->x(Ljava/lang/String;)Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v1, p1}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 23
    .line 24
    invoke-static {p1, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v0, Ldefpackage/pr1;

    .line 29
    .line 30
    const/4 v1, 0x4

    .line 31
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/pr1;-><init>(Ljava/lang/String;Ldefpackage/we5;I)V

    .line 32
    .line 33
    .line 34
    new-instance p0, Ldefpackage/or1;

    .line 35
    .line 36
    const/16 p1, 0x10

    .line 37
    .line 38
    invoke-direct {p0, p1}, Ldefpackage/or1;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static final v(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/SmartNextIn;)Lcom/eddyizm/tempus/homemusic/SmartOut;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;->getPlayed()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "launch_events_v1"

    .line 18
    .line 19
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v1, v2}, Ldefpackage/rr1;->j(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Ldefpackage/kd3;

    .line 28
    .line 29
    const-string v3, "played"

    .line 30
    .line 31
    invoke-direct {v2, v3, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/SmartNextIn;->getAt()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Ldefpackage/kd3;

    .line 39
    .line 40
    const-string v3, "at"

    .line 41
    .line 42
    invoke-direct {v1, v3, p1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v2, v1}, [Ldefpackage/kd3;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 66
    .line 67
    invoke-static {p1, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v0, Ldefpackage/pr1;

    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/pr1;-><init>(Ljava/lang/String;Ldefpackage/we5;I)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Ldefpackage/or1;

    .line 78
    .line 79
    const/4 p1, 0x4

    .line 80
    invoke-direct {p0, p1}, Ldefpackage/or1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 88
    .line 89
    return-object p0
.end method

.method public static final w(Ljava/util/Map;)Lcom/eddyizm/tempus/homemusic/SmartOut;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 5
    .line 6
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 7
    .line 8
    invoke-virtual {v1, p0}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 19
    .line 20
    invoke-static {p0, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Ldefpackage/nr1;

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    invoke-direct {v0, p0, v1}, Ldefpackage/nr1;-><init>(Ldefpackage/we5;I)V

    .line 28
    .line 29
    .line 30
    new-instance p0, Ldefpackage/or1;

    .line 31
    .line 32
    const/16 v1, 0x11

    .line 33
    .line 34
    invoke-direct {p0, v1}, Ldefpackage/or1;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Lcom/eddyizm/tempus/homemusic/SmartOut;

    .line 42
    .line 43
    return-object p0
.end method

.method public static x(Ljava/lang/String;)Ljava/util/Map;
    .locals 1

    .line 1
    invoke-static {p0}, Ldefpackage/ot1;->c(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "hub:"

    .line 8
    .line 9
    invoke-static {p0, v0}, Ldefpackage/qm4;->z0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const-string v0, "ref"

    .line 14
    .line 15
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    const-string v0, "nd_song_id"

    .line 24
    .line 25
    invoke-static {v0, p0}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    return-object p0
.end method

.method public static final y(Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ldefpackage/yc4;->d:Ljava/util/Map;

    .line 5
    .line 6
    const-string v0, "audio/mpeg"

    .line 7
    .line 8
    const-string v1, "audio"

    .line 9
    .line 10
    invoke-static {p0, p1, v0, v1}, Ldefpackage/vr1;->A(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Ldefpackage/yc4;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    new-instance v1, Ldefpackage/uz2;

    .line 15
    .line 16
    invoke-direct {v1}, Ldefpackage/uz2;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v2, Ldefpackage/wz2;->f:Ldefpackage/hu2;

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ldefpackage/uz2;->c(Ldefpackage/hu2;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v0, Ldefpackage/yc4;->a:Ljava/lang/String;

    .line 25
    .line 26
    new-instance v3, Ldefpackage/rd0;

    .line 27
    .line 28
    iget-object v0, v0, Ldefpackage/yc4;->b:Ljava/lang/String;

    .line 29
    .line 30
    invoke-direct {v3, p0, p1, v0}, Ldefpackage/rd0;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const-string p0, "files"

    .line 34
    .line 35
    invoke-virtual {v1, p0, v2, v3}, Ldefpackage/uz2;->a(Ljava/lang/String;Ljava/lang/String;Ldefpackage/rd0;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ldefpackage/uz2;->b()Ldefpackage/wz2;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance p1, Ldefpackage/mr1;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    invoke-direct {p1, p0, v0}, Ldefpackage/mr1;-><init>(Ldefpackage/wz2;I)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Ldefpackage/k2;

    .line 49
    .line 50
    const/16 v0, 0x1c

    .line 51
    .line 52
    const/4 v1, 0x0

    .line 53
    invoke-direct {p0, v0, v1}, Ldefpackage/k2;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, Ljava/util/List;

    .line 61
    .line 62
    return-void
.end method

.method public static final z(Ljava/lang/String;Lcom/eddyizm/tempus/homemusic/WaveNextIn;)Lcom/eddyizm/tempus/homemusic/WaveOut;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Ldefpackage/tz3;->Companion:Ldefpackage/sz3;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->getPlayed()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {}, Ldefpackage/rr1;->e()Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const-string v3, "launch_events_v1"

    .line 18
    .line 19
    invoke-interface {v2, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-static {v1, v2}, Ldefpackage/rr1;->j(Ljava/util/List;Z)Ljava/util/ArrayList;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    new-instance v2, Ldefpackage/kd3;

    .line 28
    .line 29
    const-string v3, "played"

    .line 30
    .line 31
    invoke-direct {v2, v3, v1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/eddyizm/tempus/homemusic/WaveNextIn;->getQueued()Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    new-instance v1, Ldefpackage/kd3;

    .line 39
    .line 40
    const-string v3, "queued"

    .line 41
    .line 42
    invoke-direct {v1, v3, p1}, Ldefpackage/kd3;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    filled-new-array {v2, v1}, [Ldefpackage/kd3;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-static {p1}, Ldefpackage/lg2;->X([Ldefpackage/kd3;)Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    sget-object v1, Ldefpackage/rr1;->c:Ldefpackage/nk1;

    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ldefpackage/nk1;->j(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget-object v0, Ldefpackage/rr1;->b:Ldefpackage/hu2;

    .line 66
    .line 67
    invoke-static {p1, v0}, Ldefpackage/sz3;->b(Ljava/lang/String;Ldefpackage/hu2;)Ldefpackage/we5;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v0, Ldefpackage/pr1;

    .line 72
    .line 73
    const/4 v1, 0x2

    .line 74
    invoke-direct {v0, p0, p1, v1}, Ldefpackage/pr1;-><init>(Ljava/lang/String;Ldefpackage/we5;I)V

    .line 75
    .line 76
    .line 77
    new-instance p0, Ldefpackage/or1;

    .line 78
    .line 79
    const/4 p1, 0x5

    .line 80
    invoke-direct {p0, p1}, Ldefpackage/or1;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0, p0}, Ldefpackage/rr1;->d(Ldefpackage/if1;Ldefpackage/if1;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, Lcom/eddyizm/tempus/homemusic/WaveOut;

    .line 88
    .line 89
    return-object p0
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
